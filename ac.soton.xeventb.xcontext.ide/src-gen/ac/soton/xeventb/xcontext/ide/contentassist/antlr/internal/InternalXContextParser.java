package ac.soton.xeventb.xcontext.ide.contentassist.antlr.internal;

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
import ac.soton.xeventb.xcontext.services.XContextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXContextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_STRING", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'constant'", "'cst'", "'theorem'", "'thm'", "'axiom'", "'axm'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21191'", "'\\u2119'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'one'", "'many'", "'opt'", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'%'", "'\\u22C2'", "'record'", "'inherits'", "'field'", "'constraint'", "'extended'"
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
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
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


        public InternalXContextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXContextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXContextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXContext.g"; }


    	private XContextGrammarAccess grammarAccess;

    	public void setGrammarAccess(XContextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleXContext"
    // InternalXContext.g:53:1: entryRuleXContext : ruleXContext EOF ;
    public final void entryRuleXContext() throws RecognitionException {
        try {
            // InternalXContext.g:54:1: ( ruleXContext EOF )
            // InternalXContext.g:55:1: ruleXContext EOF
            {
             before(grammarAccess.getXContextRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXContext();

            state._fsp--;

             after(grammarAccess.getXContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXContext"


    // $ANTLR start "ruleXContext"
    // InternalXContext.g:62:1: ruleXContext : ( ( rule__XContext__Group__0 ) ) ;
    public final void ruleXContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:66:2: ( ( ( rule__XContext__Group__0 ) ) )
            // InternalXContext.g:67:2: ( ( rule__XContext__Group__0 ) )
            {
            // InternalXContext.g:67:2: ( ( rule__XContext__Group__0 ) )
            // InternalXContext.g:68:3: ( rule__XContext__Group__0 )
            {
             before(grammarAccess.getXContextAccess().getGroup()); 
            // InternalXContext.g:69:3: ( rule__XContext__Group__0 )
            // InternalXContext.g:69:4: rule__XContext__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXContext"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXContext.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXContext.g:79:1: ( ruleQualifiedName EOF )
            // InternalXContext.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXContext.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXContext.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXContext.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXContext.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalXContext.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:103:1: entryRuleXCarrierSet : ruleXCarrierSet EOF ;
    public final void entryRuleXCarrierSet() throws RecognitionException {
        try {
            // InternalXContext.g:104:1: ( ruleXCarrierSet EOF )
            // InternalXContext.g:105:1: ruleXCarrierSet EOF
            {
             before(grammarAccess.getXCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXCarrierSetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXCarrierSet"


    // $ANTLR start "ruleXCarrierSet"
    // InternalXContext.g:112:1: ruleXCarrierSet : ( ( rule__XCarrierSet__Group__0 ) ) ;
    public final void ruleXCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:116:2: ( ( ( rule__XCarrierSet__Group__0 ) ) )
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Group__0 ) )
            {
            // InternalXContext.g:117:2: ( ( rule__XCarrierSet__Group__0 ) )
            // InternalXContext.g:118:3: ( rule__XCarrierSet__Group__0 )
            {
             before(grammarAccess.getXCarrierSetAccess().getGroup()); 
            // InternalXContext.g:119:3: ( rule__XCarrierSet__Group__0 )
            // InternalXContext.g:119:4: rule__XCarrierSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XCarrierSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCarrierSet"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:128:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXConstant EOF )
            // InternalXContext.g:130:1: ruleXConstant EOF
            {
             before(grammarAccess.getXConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXConstantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXConstant"


    // $ANTLR start "ruleXConstant"
    // InternalXContext.g:137:1: ruleXConstant : ( ( rule__XConstant__Group__0 ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XConstant__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XConstant__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XConstant__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XConstant__Group__0 )
            {
             before(grammarAccess.getXConstantAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XConstant__Group__0 )
            // InternalXContext.g:144:4: rule__XConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXConstant"


    // $ANTLR start "entryRuleXTypedConstant"
    // InternalXContext.g:153:1: entryRuleXTypedConstant : ruleXTypedConstant EOF ;
    public final void entryRuleXTypedConstant() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXTypedConstant EOF )
            // InternalXContext.g:155:1: ruleXTypedConstant EOF
            {
             before(grammarAccess.getXTypedConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXTypedConstant();

            state._fsp--;

             after(grammarAccess.getXTypedConstantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXTypedConstant"


    // $ANTLR start "ruleXTypedConstant"
    // InternalXContext.g:162:1: ruleXTypedConstant : ( ( rule__XTypedConstant__Group__0 ) ) ;
    public final void ruleXTypedConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XTypedConstant__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XTypedConstant__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XTypedConstant__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XTypedConstant__Group__0 )
            {
             before(grammarAccess.getXTypedConstantAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XTypedConstant__Group__0 )
            // InternalXContext.g:169:4: rule__XTypedConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXTypedConstant"


    // $ANTLR start "entryRuleXIndividualAxiom"
    // InternalXContext.g:178:1: entryRuleXIndividualAxiom : ruleXIndividualAxiom EOF ;
    public final void entryRuleXIndividualAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXIndividualAxiom EOF )
            // InternalXContext.g:180:1: ruleXIndividualAxiom EOF
            {
             before(grammarAccess.getXIndividualAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXIndividualAxiom();

            state._fsp--;

             after(grammarAccess.getXIndividualAxiomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXIndividualAxiom"


    // $ANTLR start "ruleXIndividualAxiom"
    // InternalXContext.g:187:1: ruleXIndividualAxiom : ( ( rule__XIndividualAxiom__Group__0 ) ) ;
    public final void ruleXIndividualAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( rule__XIndividualAxiom__Group__0 ) ) )
            // InternalXContext.g:192:2: ( ( rule__XIndividualAxiom__Group__0 ) )
            {
            // InternalXContext.g:192:2: ( ( rule__XIndividualAxiom__Group__0 ) )
            // InternalXContext.g:193:3: ( rule__XIndividualAxiom__Group__0 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getGroup()); 
            // InternalXContext.g:194:3: ( rule__XIndividualAxiom__Group__0 )
            // InternalXContext.g:194:4: rule__XIndividualAxiom__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualAxiomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualAxiom"


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:203:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:204:1: ( ruleXAxiom EOF )
            // InternalXContext.g:205:1: ruleXAxiom EOF
            {
             before(grammarAccess.getXAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXAxiomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleXAxiom"


    // $ANTLR start "ruleXAxiom"
    // InternalXContext.g:212:1: ruleXAxiom : ( ( rule__XAxiom__Group__0 ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:216:2: ( ( ( rule__XAxiom__Group__0 ) ) )
            // InternalXContext.g:217:2: ( ( rule__XAxiom__Group__0 ) )
            {
            // InternalXContext.g:217:2: ( ( rule__XAxiom__Group__0 ) )
            // InternalXContext.g:218:3: ( rule__XAxiom__Group__0 )
            {
             before(grammarAccess.getXAxiomAccess().getGroup()); 
            // InternalXContext.g:219:3: ( rule__XAxiom__Group__0 )
            // InternalXContext.g:219:4: rule__XAxiom__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXAxiom"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:228:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXContext.g:229:1: ( ruleXFormula EOF )
            // InternalXContext.g:230:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:237:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:241:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXContext.g:242:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXContext.g:242:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXContext.g:243:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXContext.g:243:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXContext.g:244:4: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:245:4: ( rule__XFormula__Alternatives )
            // InternalXContext.g:245:5: rule__XFormula__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }

            // InternalXContext.g:248:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXContext.g:249:4: ( rule__XFormula__Alternatives )*
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:250:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNTRANSLATED_TOKEN)||(LA1_0>=19 && LA1_0<=116)||LA1_0==126) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXContext.g:250:5: rule__XFormula__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__XFormula__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }


            }


            }

        }
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


    // $ANTLR start "entryRuleXType"
    // InternalXContext.g:260:1: entryRuleXType : ruleXType EOF ;
    public final void entryRuleXType() throws RecognitionException {
        try {
            // InternalXContext.g:261:1: ( ruleXType EOF )
            // InternalXContext.g:262:1: ruleXType EOF
            {
             before(grammarAccess.getXTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:269:1: ruleXType : ( ( rule__XType__Group__0 ) ) ;
    public final void ruleXType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:273:2: ( ( ( rule__XType__Group__0 ) ) )
            // InternalXContext.g:274:2: ( ( rule__XType__Group__0 ) )
            {
            // InternalXContext.g:274:2: ( ( rule__XType__Group__0 ) )
            // InternalXContext.g:275:3: ( rule__XType__Group__0 )
            {
             before(grammarAccess.getXTypeAccess().getGroup()); 
            // InternalXContext.g:276:3: ( rule__XType__Group__0 )
            // InternalXContext.g:276:4: rule__XType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXTypeAccess().getGroup()); 

            }


            }

        }
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
    // InternalXContext.g:285:1: entryRuleXTYPEOPERATOR : ruleXTYPEOPERATOR EOF ;
    public final void entryRuleXTYPEOPERATOR() throws RecognitionException {
        try {
            // InternalXContext.g:286:1: ( ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:287:1: ruleXTYPEOPERATOR EOF
            {
             before(grammarAccess.getXTYPEOPERATORRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXTYPEOPERATOR();

            state._fsp--;

             after(grammarAccess.getXTYPEOPERATORRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:294:1: ruleXTYPEOPERATOR : ( ( rule__XTYPEOPERATOR__Alternatives ) ) ;
    public final void ruleXTYPEOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:298:2: ( ( ( rule__XTYPEOPERATOR__Alternatives ) ) )
            // InternalXContext.g:299:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            {
            // InternalXContext.g:299:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            // InternalXContext.g:300:3: ( rule__XTYPEOPERATOR__Alternatives )
            {
             before(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 
            // InternalXContext.g:301:3: ( rule__XTYPEOPERATOR__Alternatives )
            // InternalXContext.g:301:4: rule__XTYPEOPERATOR__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTYPEOPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXContext.g:310:1: entryRuleXTypePrimitive : ruleXTypePrimitive EOF ;
    public final void entryRuleXTypePrimitive() throws RecognitionException {
        try {
            // InternalXContext.g:311:1: ( ruleXTypePrimitive EOF )
            // InternalXContext.g:312:1: ruleXTypePrimitive EOF
            {
             before(grammarAccess.getXTypePrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXTypePrimitive();

            state._fsp--;

             after(grammarAccess.getXTypePrimitiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:319:1: ruleXTypePrimitive : ( ( rule__XTypePrimitive__Alternatives ) ) ;
    public final void ruleXTypePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:323:2: ( ( ( rule__XTypePrimitive__Alternatives ) ) )
            // InternalXContext.g:324:2: ( ( rule__XTypePrimitive__Alternatives ) )
            {
            // InternalXContext.g:324:2: ( ( rule__XTypePrimitive__Alternatives ) )
            // InternalXContext.g:325:3: ( rule__XTypePrimitive__Alternatives )
            {
             before(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 
            // InternalXContext.g:326:3: ( rule__XTypePrimitive__Alternatives )
            // InternalXContext.g:326:4: rule__XTypePrimitive__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXContext.g:335:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXContext.g:336:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:337:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEVENTB_IDENTIFIER_KEYWORD();

            state._fsp--;

             after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:344:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:348:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXContext.g:349:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXContext.g:349:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXContext.g:350:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalXContext.g:351:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXContext.g:351:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:360:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:361:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:362:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEVENTB_PREDICATE_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:369:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:373:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:374:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:374:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXContext.g:375:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:376:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXContext.g:376:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:385:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:386:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:387:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEVENTB_EXPRESSION_SYMBOLS();

            state._fsp--;

             after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:394:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:398:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:399:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:399:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXContext.g:400:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:401:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXContext.g:401:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleXRecord"
    // InternalXContext.g:410:1: entryRuleXRecord : ruleXRecord EOF ;
    public final void entryRuleXRecord() throws RecognitionException {
        try {
            // InternalXContext.g:411:1: ( ruleXRecord EOF )
            // InternalXContext.g:412:1: ruleXRecord EOF
            {
             before(grammarAccess.getXRecordRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXRecord();

            state._fsp--;

             after(grammarAccess.getXRecordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:419:1: ruleXRecord : ( ( rule__XRecord__Group__0 ) ) ;
    public final void ruleXRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:423:2: ( ( ( rule__XRecord__Group__0 ) ) )
            // InternalXContext.g:424:2: ( ( rule__XRecord__Group__0 ) )
            {
            // InternalXContext.g:424:2: ( ( rule__XRecord__Group__0 ) )
            // InternalXContext.g:425:3: ( rule__XRecord__Group__0 )
            {
             before(grammarAccess.getXRecordAccess().getGroup()); 
            // InternalXContext.g:426:3: ( rule__XRecord__Group__0 )
            // InternalXContext.g:426:4: rule__XRecord__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getGroup()); 

            }


            }

        }
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
    // InternalXContext.g:435:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalXContext.g:436:1: ( ruleFieldType EOF )
            // InternalXContext.g:437:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:444:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:448:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalXContext.g:449:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalXContext.g:449:2: ( ( rule__FieldType__Alternatives ) )
            // InternalXContext.g:450:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalXContext.g:451:3: ( rule__FieldType__Alternatives )
            // InternalXContext.g:451:4: rule__FieldType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalXContext.g:460:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXContext.g:461:1: ( ruleField EOF )
            // InternalXContext.g:462:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:469:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:473:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXContext.g:474:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXContext.g:474:2: ( ( rule__Field__Group__0 ) )
            // InternalXContext.g:475:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalXContext.g:476:3: ( rule__Field__Group__0 )
            // InternalXContext.g:476:4: rule__Field__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
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
    // InternalXContext.g:485:1: entryRuleXConstraint : ruleXConstraint EOF ;
    public final void entryRuleXConstraint() throws RecognitionException {
        try {
            // InternalXContext.g:486:1: ( ruleXConstraint EOF )
            // InternalXContext.g:487:1: ruleXConstraint EOF
            {
             before(grammarAccess.getXConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXConstraint();

            state._fsp--;

             after(grammarAccess.getXConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:494:1: ruleXConstraint : ( ( rule__XConstraint__Group__0 ) ) ;
    public final void ruleXConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:498:2: ( ( ( rule__XConstraint__Group__0 ) ) )
            // InternalXContext.g:499:2: ( ( rule__XConstraint__Group__0 ) )
            {
            // InternalXContext.g:499:2: ( ( rule__XConstraint__Group__0 ) )
            // InternalXContext.g:500:3: ( rule__XConstraint__Group__0 )
            {
             before(grammarAccess.getXConstraintAccess().getGroup()); 
            // InternalXContext.g:501:3: ( rule__XConstraint__Group__0 )
            // InternalXContext.g:501:4: rule__XConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXConstraintAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleMultiplicity"
    // InternalXContext.g:510:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:514:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXContext.g:515:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXContext.g:515:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXContext.g:516:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalXContext.g:517:3: ( rule__Multiplicity__Alternatives )
            // InternalXContext.g:517:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__Alternatives_5"
    // InternalXContext.g:525:1: rule__XContext__Alternatives_5 : ( ( ( rule__XContext__Group_5_0__0 ) ) | ( ( rule__XContext__Group_5_1__0 ) ) | ( ( rule__XContext__Group_5_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_5_3 ) ) | ( ( rule__XContext__Group_5_4__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_5_5 ) ) );
    public final void rule__XContext__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:529:1: ( ( ( rule__XContext__Group_5_0__0 ) ) | ( ( rule__XContext__Group_5_1__0 ) ) | ( ( rule__XContext__Group_5_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_5_3 ) ) | ( ( rule__XContext__Group_5_4__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_5_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt2=1;
                }
                break;
            case 124:
                {
                alt2=2;
                }
                break;
            case 13:
            case 14:
                {
                alt2=3;
                }
                break;
            case 128:
            case 132:
                {
                alt2=4;
                }
                break;
            case 125:
                {
                alt2=5;
                }
                break;
            case RULE_STRING:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXContext.g:530:2: ( ( rule__XContext__Group_5_0__0 ) )
                    {
                    // InternalXContext.g:530:2: ( ( rule__XContext__Group_5_0__0 ) )
                    // InternalXContext.g:531:3: ( rule__XContext__Group_5_0__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_5_0()); 
                    // InternalXContext.g:532:3: ( rule__XContext__Group_5_0__0 )
                    // InternalXContext.g:532:4: rule__XContext__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:536:2: ( ( rule__XContext__Group_5_1__0 ) )
                    {
                    // InternalXContext.g:536:2: ( ( rule__XContext__Group_5_1__0 ) )
                    // InternalXContext.g:537:3: ( rule__XContext__Group_5_1__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_5_1()); 
                    // InternalXContext.g:538:3: ( rule__XContext__Group_5_1__0 )
                    // InternalXContext.g:538:4: rule__XContext__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:542:2: ( ( rule__XContext__Group_5_2__0 ) )
                    {
                    // InternalXContext.g:542:2: ( ( rule__XContext__Group_5_2__0 ) )
                    // InternalXContext.g:543:3: ( rule__XContext__Group_5_2__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_5_2()); 
                    // InternalXContext.g:544:3: ( rule__XContext__Group_5_2__0 )
                    // InternalXContext.g:544:4: rule__XContext__Group_5_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_5_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:548:2: ( ( rule__XContext__OrderedChildrenAssignment_5_3 ) )
                    {
                    // InternalXContext.g:548:2: ( ( rule__XContext__OrderedChildrenAssignment_5_3 ) )
                    // InternalXContext.g:549:3: ( rule__XContext__OrderedChildrenAssignment_5_3 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_3()); 
                    // InternalXContext.g:550:3: ( rule__XContext__OrderedChildrenAssignment_5_3 )
                    // InternalXContext.g:550:4: rule__XContext__OrderedChildrenAssignment_5_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_5_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:554:2: ( ( rule__XContext__Group_5_4__0 ) )
                    {
                    // InternalXContext.g:554:2: ( ( rule__XContext__Group_5_4__0 ) )
                    // InternalXContext.g:555:3: ( rule__XContext__Group_5_4__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_5_4()); 
                    // InternalXContext.g:556:3: ( rule__XContext__Group_5_4__0 )
                    // InternalXContext.g:556:4: rule__XContext__Group_5_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_5_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_5_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:560:2: ( ( rule__XContext__OrderedChildrenAssignment_5_5 ) )
                    {
                    // InternalXContext.g:560:2: ( ( rule__XContext__OrderedChildrenAssignment_5_5 ) )
                    // InternalXContext.g:561:3: ( rule__XContext__OrderedChildrenAssignment_5_5 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_5()); 
                    // InternalXContext.g:562:3: ( rule__XContext__OrderedChildrenAssignment_5_5 )
                    // InternalXContext.g:562:4: rule__XContext__OrderedChildrenAssignment_5_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_5_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_5()); 

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
    // $ANTLR end "rule__XContext__Alternatives_5"


    // $ANTLR start "rule__XContext__Alternatives_5_2_0"
    // InternalXContext.g:570:1: rule__XContext__Alternatives_5_2_0 : ( ( 'constant' ) | ( 'cst' ) );
    public final void rule__XContext__Alternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:574:1: ( ( 'constant' ) | ( 'cst' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXContext.g:575:2: ( 'constant' )
                    {
                    // InternalXContext.g:575:2: ( 'constant' )
                    // InternalXContext.g:576:3: 'constant'
                    {
                     before(grammarAccess.getXContextAccess().getConstantKeyword_5_2_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getConstantKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:581:2: ( 'cst' )
                    {
                    // InternalXContext.g:581:2: ( 'cst' )
                    // InternalXContext.g:582:3: 'cst'
                    {
                     before(grammarAccess.getXContextAccess().getCstKeyword_5_2_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getCstKeyword_5_2_0_1()); 

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
    // $ANTLR end "rule__XContext__Alternatives_5_2_0"


    // $ANTLR start "rule__XIndividualAxiom__Alternatives_2"
    // InternalXContext.g:591:1: rule__XIndividualAxiom__Alternatives_2 : ( ( ( rule__XIndividualAxiom__TheoremAssignment_2_0 ) ) | ( ( rule__XIndividualAxiom__Alternatives_2_1 ) ) );
    public final void rule__XIndividualAxiom__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:595:1: ( ( ( rule__XIndividualAxiom__TheoremAssignment_2_0 ) ) | ( ( rule__XIndividualAxiom__Alternatives_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXContext.g:596:2: ( ( rule__XIndividualAxiom__TheoremAssignment_2_0 ) )
                    {
                    // InternalXContext.g:596:2: ( ( rule__XIndividualAxiom__TheoremAssignment_2_0 ) )
                    // InternalXContext.g:597:3: ( rule__XIndividualAxiom__TheoremAssignment_2_0 )
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getTheoremAssignment_2_0()); 
                    // InternalXContext.g:598:3: ( rule__XIndividualAxiom__TheoremAssignment_2_0 )
                    // InternalXContext.g:598:4: rule__XIndividualAxiom__TheoremAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualAxiom__TheoremAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXIndividualAxiomAccess().getTheoremAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:602:2: ( ( rule__XIndividualAxiom__Alternatives_2_1 ) )
                    {
                    // InternalXContext.g:602:2: ( ( rule__XIndividualAxiom__Alternatives_2_1 ) )
                    // InternalXContext.g:603:3: ( rule__XIndividualAxiom__Alternatives_2_1 )
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2_1()); 
                    // InternalXContext.g:604:3: ( rule__XIndividualAxiom__Alternatives_2_1 )
                    // InternalXContext.g:604:4: rule__XIndividualAxiom__Alternatives_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualAxiom__Alternatives_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__XIndividualAxiom__Alternatives_2"


    // $ANTLR start "rule__XIndividualAxiom__TheoremAlternatives_2_0_0"
    // InternalXContext.g:612:1: rule__XIndividualAxiom__TheoremAlternatives_2_0_0 : ( ( 'theorem' ) | ( 'thm' ) );
    public final void rule__XIndividualAxiom__TheoremAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:616:1: ( ( 'theorem' ) | ( 'thm' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:617:2: ( 'theorem' )
                    {
                    // InternalXContext.g:617:2: ( 'theorem' )
                    // InternalXContext.g:618:3: 'theorem'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getTheoremTheoremKeyword_2_0_0_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getTheoremTheoremKeyword_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:623:2: ( 'thm' )
                    {
                    // InternalXContext.g:623:2: ( 'thm' )
                    // InternalXContext.g:624:3: 'thm'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getTheoremThmKeyword_2_0_0_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getTheoremThmKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__XIndividualAxiom__TheoremAlternatives_2_0_0"


    // $ANTLR start "rule__XIndividualAxiom__Alternatives_2_1"
    // InternalXContext.g:633:1: rule__XIndividualAxiom__Alternatives_2_1 : ( ( 'axiom' ) | ( 'axm' ) );
    public final void rule__XIndividualAxiom__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:637:1: ( ( 'axiom' ) | ( 'axm' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:638:2: ( 'axiom' )
                    {
                    // InternalXContext.g:638:2: ( 'axiom' )
                    // InternalXContext.g:639:3: 'axiom'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_1_0()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:644:2: ( 'axm' )
                    {
                    // InternalXContext.g:644:2: ( 'axm' )
                    // InternalXContext.g:645:3: 'axm'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1_1()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1_1()); 

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
    // $ANTLR end "rule__XIndividualAxiom__Alternatives_2_1"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXContext.g:654:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:658:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) )
            int alt7=6;
            switch ( input.LA(1) ) {
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
                {
                alt7=1;
                }
                break;
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
            case 84:
                {
                alt7=2;
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
            case 126:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            case RULE_INT:
                {
                alt7=5;
                }
                break;
            case RULE_UNTRANSLATED_TOKEN:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXContext.g:659:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:659:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:660:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:665:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXContext.g:665:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXContext.g:666:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:671:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXContext.g:671:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXContext.g:672:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:677:2: ( RULE_ID )
                    {
                    // InternalXContext.g:677:2: ( RULE_ID )
                    // InternalXContext.g:678:3: RULE_ID
                    {
                     before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:683:2: ( RULE_INT )
                    {
                    // InternalXContext.g:683:2: ( RULE_INT )
                    // InternalXContext.g:684:3: RULE_INT
                    {
                     before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:689:2: ( RULE_UNTRANSLATED_TOKEN )
                    {
                    // InternalXContext.g:689:2: ( RULE_UNTRANSLATED_TOKEN )
                    // InternalXContext.g:690:3: RULE_UNTRANSLATED_TOKEN
                    {
                     before(grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5()); 
                    match(input,RULE_UNTRANSLATED_TOKEN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__XTYPEOPERATOR__Alternatives"
    // InternalXContext.g:699:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:703:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            case 27:
                {
                alt8=9;
                }
                break;
            case 28:
                {
                alt8=10;
                }
                break;
            case 29:
                {
                alt8=11;
                }
                break;
            case 30:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXContext.g:704:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:704:2: ( '\\u2194' )
                    // InternalXContext.g:705:3: '\\u2194'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:710:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:710:2: ( '\\uE100' )
                    // InternalXContext.g:711:3: '\\uE100'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:716:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:716:2: ( '\\uE101' )
                    // InternalXContext.g:717:3: '\\uE101'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:722:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:722:2: ( '\\uE102' )
                    // InternalXContext.g:723:3: '\\uE102'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:728:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:728:2: ( '\\u21F8' )
                    // InternalXContext.g:729:3: '\\u21F8'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,23,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:734:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:734:2: ( '\\u2192' )
                    // InternalXContext.g:735:3: '\\u2192'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    match(input,24,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:740:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:740:2: ( '\\u2914' )
                    // InternalXContext.g:741:3: '\\u2914'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,25,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:746:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:746:2: ( '\\u21A3' )
                    // InternalXContext.g:747:3: '\\u21A3'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,26,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:752:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:752:2: ( '\\u2900' )
                    // InternalXContext.g:753:3: '\\u2900'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,27,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:758:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:758:2: ( '\\u21A0' )
                    // InternalXContext.g:759:3: '\\u21A0'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,28,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:764:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:764:2: ( '\\u2916' )
                    // InternalXContext.g:765:3: '\\u2916'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,29,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:770:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:770:2: ( '\\u00D7' )
                    // InternalXContext.g:771:3: '\\u00D7'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
                    match(input,30,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 

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
    // InternalXContext.g:780:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:784:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            case 34:
                {
                alt9=5;
                }
                break;
            case 54:
                {
                alt9=6;
                }
                break;
            case 53:
                {
                alt9=7;
                }
                break;
            case 52:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXContext.g:785:2: ( RULE_ID )
                    {
                    // InternalXContext.g:785:2: ( RULE_ID )
                    // InternalXContext.g:786:3: RULE_ID
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:791:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:791:2: ( 'BOOL' )
                    // InternalXContext.g:792:3: 'BOOL'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    match(input,31,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:797:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:797:2: ( '\\u21151' )
                    // InternalXContext.g:798:3: '\\u21151'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    match(input,32,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:803:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:803:2: ( '\\u2115' )
                    // InternalXContext.g:804:3: '\\u2115'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    match(input,33,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:809:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:809:2: ( '\\u2124' )
                    // InternalXContext.g:810:3: '\\u2124'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    match(input,34,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:815:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXContext.g:815:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXContext.g:816:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    // InternalXContext.g:817:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXContext.g:817:4: rule__XTypePrimitive__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypePrimitive__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:821:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXContext.g:821:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXContext.g:822:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    // InternalXContext.g:823:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXContext.g:823:4: rule__XTypePrimitive__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypePrimitive__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:827:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXContext.g:827:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXContext.g:828:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    // InternalXContext.g:829:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXContext.g:829:4: rule__XTypePrimitive__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypePrimitive__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 

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


    // $ANTLR start "rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives"
    // InternalXContext.g:837:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:841:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt10=23;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            case 40:
                {
                alt10=7;
                }
                break;
            case 41:
                {
                alt10=8;
                }
                break;
            case 42:
                {
                alt10=9;
                }
                break;
            case 43:
                {
                alt10=10;
                }
                break;
            case 44:
                {
                alt10=11;
                }
                break;
            case 45:
                {
                alt10=12;
                }
                break;
            case 46:
                {
                alt10=13;
                }
                break;
            case 47:
                {
                alt10=14;
                }
                break;
            case 48:
                {
                alt10=15;
                }
                break;
            case 49:
                {
                alt10=16;
                }
                break;
            case 50:
                {
                alt10=17;
                }
                break;
            case 51:
                {
                alt10=18;
                }
                break;
            case 32:
                {
                alt10=19;
                }
                break;
            case 33:
                {
                alt10=20;
                }
                break;
            case 52:
                {
                alt10=21;
                }
                break;
            case 53:
                {
                alt10=22;
                }
                break;
            case 34:
                {
                alt10=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalXContext.g:842:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:842:2: ( 'BOOL' )
                    // InternalXContext.g:843:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,31,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:848:2: ( 'FALSE' )
                    {
                    // InternalXContext.g:848:2: ( 'FALSE' )
                    // InternalXContext.g:849:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,35,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:854:2: ( 'TRUE' )
                    {
                    // InternalXContext.g:854:2: ( 'TRUE' )
                    // InternalXContext.g:855:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,36,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:860:2: ( 'bool' )
                    {
                    // InternalXContext.g:860:2: ( 'bool' )
                    // InternalXContext.g:861:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,37,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:866:2: ( 'card' )
                    {
                    // InternalXContext.g:866:2: ( 'card' )
                    // InternalXContext.g:867:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,38,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:872:2: ( 'dom' )
                    {
                    // InternalXContext.g:872:2: ( 'dom' )
                    // InternalXContext.g:873:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,39,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:878:2: ( 'finite' )
                    {
                    // InternalXContext.g:878:2: ( 'finite' )
                    // InternalXContext.g:879:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,40,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:884:2: ( 'id' )
                    {
                    // InternalXContext.g:884:2: ( 'id' )
                    // InternalXContext.g:885:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,41,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:890:2: ( 'inter' )
                    {
                    // InternalXContext.g:890:2: ( 'inter' )
                    // InternalXContext.g:891:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,42,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:896:2: ( 'max' )
                    {
                    // InternalXContext.g:896:2: ( 'max' )
                    // InternalXContext.g:897:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,43,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:902:2: ( 'min' )
                    {
                    // InternalXContext.g:902:2: ( 'min' )
                    // InternalXContext.g:903:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,44,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:908:2: ( 'mod' )
                    {
                    // InternalXContext.g:908:2: ( 'mod' )
                    // InternalXContext.g:909:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,45,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:914:2: ( 'pred' )
                    {
                    // InternalXContext.g:914:2: ( 'pred' )
                    // InternalXContext.g:915:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,46,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:920:2: ( 'prj1' )
                    {
                    // InternalXContext.g:920:2: ( 'prj1' )
                    // InternalXContext.g:921:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,47,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:926:2: ( 'prj2' )
                    {
                    // InternalXContext.g:926:2: ( 'prj2' )
                    // InternalXContext.g:927:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,48,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:932:2: ( 'ran' )
                    {
                    // InternalXContext.g:932:2: ( 'ran' )
                    // InternalXContext.g:933:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,49,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:938:2: ( 'succ' )
                    {
                    // InternalXContext.g:938:2: ( 'succ' )
                    // InternalXContext.g:939:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,50,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:944:2: ( 'union' )
                    {
                    // InternalXContext.g:944:2: ( 'union' )
                    // InternalXContext.g:945:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,51,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:950:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:950:2: ( '\\u21151' )
                    // InternalXContext.g:951:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,32,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:956:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:956:2: ( '\\u2115' )
                    // InternalXContext.g:957:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,33,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:962:2: ( '\\u21191' )
                    {
                    // InternalXContext.g:962:2: ( '\\u21191' )
                    // InternalXContext.g:963:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,52,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:968:2: ( '\\u2119' )
                    {
                    // InternalXContext.g:968:2: ( '\\u2119' )
                    // InternalXContext.g:969:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,53,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:974:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:974:2: ( '\\u2124' )
                    // InternalXContext.g:975:3: '\\u2124'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    match(input,34,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:984:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:988:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt11=31;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            case 57:
                {
                alt11=4;
                }
                break;
            case 58:
                {
                alt11=5;
                }
                break;
            case 59:
                {
                alt11=6;
                }
                break;
            case 60:
                {
                alt11=7;
                }
                break;
            case 61:
                {
                alt11=8;
                }
                break;
            case 62:
                {
                alt11=9;
                }
                break;
            case 63:
                {
                alt11=10;
                }
                break;
            case 64:
                {
                alt11=11;
                }
                break;
            case 65:
                {
                alt11=12;
                }
                break;
            case 66:
                {
                alt11=13;
                }
                break;
            case 67:
                {
                alt11=14;
                }
                break;
            case 68:
                {
                alt11=15;
                }
                break;
            case 69:
                {
                alt11=16;
                }
                break;
            case 70:
                {
                alt11=17;
                }
                break;
            case 71:
                {
                alt11=18;
                }
                break;
            case 72:
                {
                alt11=19;
                }
                break;
            case 73:
                {
                alt11=20;
                }
                break;
            case 74:
                {
                alt11=21;
                }
                break;
            case 75:
                {
                alt11=22;
                }
                break;
            case 76:
                {
                alt11=23;
                }
                break;
            case 77:
                {
                alt11=24;
                }
                break;
            case 78:
                {
                alt11=25;
                }
                break;
            case 79:
                {
                alt11=26;
                }
                break;
            case 80:
                {
                alt11=27;
                }
                break;
            case 81:
                {
                alt11=28;
                }
                break;
            case 82:
                {
                alt11=29;
                }
                break;
            case 83:
                {
                alt11=30;
                }
                break;
            case 84:
                {
                alt11=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXContext.g:989:2: ( '(' )
                    {
                    // InternalXContext.g:989:2: ( '(' )
                    // InternalXContext.g:990:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,54,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:995:2: ( ')' )
                    {
                    // InternalXContext.g:995:2: ( ')' )
                    // InternalXContext.g:996:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,55,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1001:2: ( '\\u21D4' )
                    {
                    // InternalXContext.g:1001:2: ( '\\u21D4' )
                    // InternalXContext.g:1002:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,56,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:1007:2: ( '\\u21D2' )
                    {
                    // InternalXContext.g:1007:2: ( '\\u21D2' )
                    // InternalXContext.g:1008:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,57,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:1013:2: ( '\\u2227' )
                    {
                    // InternalXContext.g:1013:2: ( '\\u2227' )
                    // InternalXContext.g:1014:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,58,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:1019:2: ( '&' )
                    {
                    // InternalXContext.g:1019:2: ( '&' )
                    // InternalXContext.g:1020:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,59,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1025:2: ( '\\u2228' )
                    {
                    // InternalXContext.g:1025:2: ( '\\u2228' )
                    // InternalXContext.g:1026:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,60,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1031:2: ( '\\u00AC' )
                    {
                    // InternalXContext.g:1031:2: ( '\\u00AC' )
                    // InternalXContext.g:1032:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,61,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:1037:2: ( '\\u22A4' )
                    {
                    // InternalXContext.g:1037:2: ( '\\u22A4' )
                    // InternalXContext.g:1038:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,62,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:1043:2: ( '\\u22A5' )
                    {
                    // InternalXContext.g:1043:2: ( '\\u22A5' )
                    // InternalXContext.g:1044:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,63,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:1049:2: ( '\\u2200' )
                    {
                    // InternalXContext.g:1049:2: ( '\\u2200' )
                    // InternalXContext.g:1050:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,64,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:1055:2: ( '!' )
                    {
                    // InternalXContext.g:1055:2: ( '!' )
                    // InternalXContext.g:1056:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,65,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:1061:2: ( '\\u2203' )
                    {
                    // InternalXContext.g:1061:2: ( '\\u2203' )
                    // InternalXContext.g:1062:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,66,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:1067:2: ( '#' )
                    {
                    // InternalXContext.g:1067:2: ( '#' )
                    // InternalXContext.g:1068:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,67,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1073:2: ( ',' )
                    {
                    // InternalXContext.g:1073:2: ( ',' )
                    // InternalXContext.g:1074:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,68,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1079:2: ( '\\u00B7' )
                    {
                    // InternalXContext.g:1079:2: ( '\\u00B7' )
                    // InternalXContext.g:1080:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,69,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1085:2: ( '.' )
                    {
                    // InternalXContext.g:1085:2: ( '.' )
                    // InternalXContext.g:1086:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,70,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1091:2: ( '=' )
                    {
                    // InternalXContext.g:1091:2: ( '=' )
                    // InternalXContext.g:1092:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,71,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1097:2: ( '\\u2260' )
                    {
                    // InternalXContext.g:1097:2: ( '\\u2260' )
                    // InternalXContext.g:1098:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,72,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1103:2: ( '\\u2264' )
                    {
                    // InternalXContext.g:1103:2: ( '\\u2264' )
                    // InternalXContext.g:1104:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,73,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1109:2: ( '<' )
                    {
                    // InternalXContext.g:1109:2: ( '<' )
                    // InternalXContext.g:1110:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,74,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1115:2: ( '\\u2265' )
                    {
                    // InternalXContext.g:1115:2: ( '\\u2265' )
                    // InternalXContext.g:1116:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,75,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1121:2: ( '>' )
                    {
                    // InternalXContext.g:1121:2: ( '>' )
                    // InternalXContext.g:1122:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,76,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1127:2: ( '\\u2208' )
                    {
                    // InternalXContext.g:1127:2: ( '\\u2208' )
                    // InternalXContext.g:1128:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,77,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1133:2: ( ':' )
                    {
                    // InternalXContext.g:1133:2: ( ':' )
                    // InternalXContext.g:1134:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,78,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1139:2: ( '\\u2209' )
                    {
                    // InternalXContext.g:1139:2: ( '\\u2209' )
                    // InternalXContext.g:1140:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,79,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1145:2: ( '\\u2282' )
                    {
                    // InternalXContext.g:1145:2: ( '\\u2282' )
                    // InternalXContext.g:1146:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,80,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1151:2: ( '\\u2284' )
                    {
                    // InternalXContext.g:1151:2: ( '\\u2284' )
                    // InternalXContext.g:1152:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,81,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1157:2: ( '\\u2286' )
                    {
                    // InternalXContext.g:1157:2: ( '\\u2286' )
                    // InternalXContext.g:1158:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,82,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1163:2: ( '\\u2288' )
                    {
                    // InternalXContext.g:1163:2: ( '\\u2288' )
                    // InternalXContext.g:1164:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,83,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1169:2: ( 'partition' )
                    {
                    // InternalXContext.g:1169:2: ( 'partition' )
                    // InternalXContext.g:1170:3: 'partition'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    match(input,84,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:1179:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1183:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt12=45;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            case 24:
                {
                alt12=6;
                }
                break;
            case 25:
                {
                alt12=7;
                }
                break;
            case 26:
                {
                alt12=8;
                }
                break;
            case 27:
                {
                alt12=9;
                }
                break;
            case 28:
                {
                alt12=10;
                }
                break;
            case 29:
                {
                alt12=11;
                }
                break;
            case 85:
                {
                alt12=12;
                }
                break;
            case 86:
                {
                alt12=13;
                }
                break;
            case 87:
                {
                alt12=14;
                }
                break;
            case 88:
                {
                alt12=15;
                }
                break;
            case 89:
                {
                alt12=16;
                }
                break;
            case 90:
                {
                alt12=17;
                }
                break;
            case 91:
                {
                alt12=18;
                }
                break;
            case 30:
                {
                alt12=19;
                }
                break;
            case 92:
                {
                alt12=20;
                }
                break;
            case 93:
                {
                alt12=21;
                }
                break;
            case 94:
                {
                alt12=22;
                }
                break;
            case 95:
                {
                alt12=23;
                }
                break;
            case 96:
                {
                alt12=24;
                }
                break;
            case 97:
                {
                alt12=25;
                }
                break;
            case 98:
                {
                alt12=26;
                }
                break;
            case 99:
                {
                alt12=27;
                }
                break;
            case 100:
                {
                alt12=28;
                }
                break;
            case 101:
                {
                alt12=29;
                }
                break;
            case 102:
                {
                alt12=30;
                }
                break;
            case 103:
                {
                alt12=31;
                }
                break;
            case 104:
                {
                alt12=32;
                }
                break;
            case 126:
                {
                alt12=33;
                }
                break;
            case 105:
                {
                alt12=34;
                }
                break;
            case 106:
                {
                alt12=35;
                }
                break;
            case 107:
                {
                alt12=36;
                }
                break;
            case 108:
                {
                alt12=37;
                }
                break;
            case 109:
                {
                alt12=38;
                }
                break;
            case 110:
                {
                alt12=39;
                }
                break;
            case 111:
                {
                alt12=40;
                }
                break;
            case 112:
                {
                alt12=41;
                }
                break;
            case 113:
                {
                alt12=42;
                }
                break;
            case 114:
                {
                alt12=43;
                }
                break;
            case 115:
                {
                alt12=44;
                }
                break;
            case 116:
                {
                alt12=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXContext.g:1184:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:1184:2: ( '\\u2194' )
                    // InternalXContext.g:1185:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1190:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:1190:2: ( '\\uE100' )
                    // InternalXContext.g:1191:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1196:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:1196:2: ( '\\uE101' )
                    // InternalXContext.g:1197:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:1202:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:1202:2: ( '\\uE102' )
                    // InternalXContext.g:1203:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:1208:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:1208:2: ( '\\u21F8' )
                    // InternalXContext.g:1209:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,23,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:1214:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:1214:2: ( '\\u2192' )
                    // InternalXContext.g:1215:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,24,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1220:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:1220:2: ( '\\u2914' )
                    // InternalXContext.g:1221:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,25,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1226:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:1226:2: ( '\\u21A3' )
                    // InternalXContext.g:1227:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,26,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:1232:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:1232:2: ( '\\u2900' )
                    // InternalXContext.g:1233:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,27,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:1238:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:1238:2: ( '\\u21A0' )
                    // InternalXContext.g:1239:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,28,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:1244:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:1244:2: ( '\\u2916' )
                    // InternalXContext.g:1245:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,29,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:1250:2: ( '{' )
                    {
                    // InternalXContext.g:1250:2: ( '{' )
                    // InternalXContext.g:1251:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,85,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:1256:2: ( '}' )
                    {
                    // InternalXContext.g:1256:2: ( '}' )
                    // InternalXContext.g:1257:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,86,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:1262:2: ( '\\u21A6' )
                    {
                    // InternalXContext.g:1262:2: ( '\\u21A6' )
                    // InternalXContext.g:1263:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,87,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1268:2: ( '\\u2205' )
                    {
                    // InternalXContext.g:1268:2: ( '\\u2205' )
                    // InternalXContext.g:1269:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,88,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1274:2: ( '\\u2229' )
                    {
                    // InternalXContext.g:1274:2: ( '\\u2229' )
                    // InternalXContext.g:1275:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,89,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1280:2: ( '\\u222A' )
                    {
                    // InternalXContext.g:1280:2: ( '\\u222A' )
                    // InternalXContext.g:1281:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,90,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1286:2: ( '\\u2216' )
                    {
                    // InternalXContext.g:1286:2: ( '\\u2216' )
                    // InternalXContext.g:1287:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,91,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1292:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:1292:2: ( '\\u00D7' )
                    // InternalXContext.g:1293:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,30,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1298:2: ( '[' )
                    {
                    // InternalXContext.g:1298:2: ( '[' )
                    // InternalXContext.g:1299:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,92,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1304:2: ( ']' )
                    {
                    // InternalXContext.g:1304:2: ( ']' )
                    // InternalXContext.g:1305:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,93,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1310:2: ( '\\uE103' )
                    {
                    // InternalXContext.g:1310:2: ( '\\uE103' )
                    // InternalXContext.g:1311:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,94,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1316:2: ( '\\u2218' )
                    {
                    // InternalXContext.g:1316:2: ( '\\u2218' )
                    // InternalXContext.g:1317:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,95,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1322:2: ( ';' )
                    {
                    // InternalXContext.g:1322:2: ( ';' )
                    // InternalXContext.g:1323:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,96,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1328:2: ( '\\u2297' )
                    {
                    // InternalXContext.g:1328:2: ( '\\u2297' )
                    // InternalXContext.g:1329:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,97,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1334:2: ( '\\u2225' )
                    {
                    // InternalXContext.g:1334:2: ( '\\u2225' )
                    // InternalXContext.g:1335:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,98,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1340:2: ( '\\u223C' )
                    {
                    // InternalXContext.g:1340:2: ( '\\u223C' )
                    // InternalXContext.g:1341:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,99,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1346:2: ( '\\u25C1' )
                    {
                    // InternalXContext.g:1346:2: ( '\\u25C1' )
                    // InternalXContext.g:1347:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,100,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1352:2: ( '\\u2A64' )
                    {
                    // InternalXContext.g:1352:2: ( '\\u2A64' )
                    // InternalXContext.g:1353:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,101,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1358:2: ( '\\u25B7' )
                    {
                    // InternalXContext.g:1358:2: ( '\\u25B7' )
                    // InternalXContext.g:1359:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,102,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1364:2: ( '\\u2A65' )
                    {
                    // InternalXContext.g:1364:2: ( '\\u2A65' )
                    // InternalXContext.g:1365:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,103,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalXContext.g:1370:2: ( '\\u03BB' )
                    {
                    // InternalXContext.g:1370:2: ( '\\u03BB' )
                    // InternalXContext.g:1371:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,104,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalXContext.g:1376:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXContext.g:1376:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXContext.g:1377:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalXContext.g:1378:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXContext.g:1378:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalXContext.g:1382:2: ( '\\u22C3' )
                    {
                    // InternalXContext.g:1382:2: ( '\\u22C3' )
                    // InternalXContext.g:1383:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,105,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalXContext.g:1388:2: ( '\\u2223' )
                    {
                    // InternalXContext.g:1388:2: ( '\\u2223' )
                    // InternalXContext.g:1389:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,106,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalXContext.g:1394:2: ( '\\u2025' )
                    {
                    // InternalXContext.g:1394:2: ( '\\u2025' )
                    // InternalXContext.g:1395:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,107,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalXContext.g:1400:2: ( '+' )
                    {
                    // InternalXContext.g:1400:2: ( '+' )
                    // InternalXContext.g:1401:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,108,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalXContext.g:1406:2: ( '\\u2212' )
                    {
                    // InternalXContext.g:1406:2: ( '\\u2212' )
                    // InternalXContext.g:1407:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,109,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalXContext.g:1412:2: ( '-' )
                    {
                    // InternalXContext.g:1412:2: ( '-' )
                    // InternalXContext.g:1413:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,110,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalXContext.g:1418:2: ( '\\u2217' )
                    {
                    // InternalXContext.g:1418:2: ( '\\u2217' )
                    // InternalXContext.g:1419:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,111,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalXContext.g:1424:2: ( '*' )
                    {
                    // InternalXContext.g:1424:2: ( '*' )
                    // InternalXContext.g:1425:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,112,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalXContext.g:1430:2: ( '\\u00F7' )
                    {
                    // InternalXContext.g:1430:2: ( '\\u00F7' )
                    // InternalXContext.g:1431:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,113,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalXContext.g:1436:2: ( '/' )
                    {
                    // InternalXContext.g:1436:2: ( '/' )
                    // InternalXContext.g:1437:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,114,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalXContext.g:1442:2: ( '^' )
                    {
                    // InternalXContext.g:1442:2: ( '^' )
                    // InternalXContext.g:1443:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,115,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalXContext.g:1448:2: ( '\\\\' )
                    {
                    // InternalXContext.g:1448:2: ( '\\\\' )
                    // InternalXContext.g:1449:3: '\\\\'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    match(input,116,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__XRecord__Alternatives_5"
    // InternalXContext.g:1458:1: rule__XRecord__Alternatives_5 : ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) );
    public final void rule__XRecord__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1462:1: ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==130) ) {
                alt13=1;
            }
            else if ( (LA13_0==131) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:1463:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    {
                    // InternalXContext.g:1463:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    // InternalXContext.g:1464:3: ( rule__XRecord__Group_5_0__0 )
                    {
                     before(grammarAccess.getXRecordAccess().getGroup_5_0()); 
                    // InternalXContext.g:1465:3: ( rule__XRecord__Group_5_0__0 )
                    // InternalXContext.g:1465:4: rule__XRecord__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XRecord__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXRecordAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1469:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    {
                    // InternalXContext.g:1469:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    // InternalXContext.g:1470:3: ( rule__XRecord__Group_5_1__0 )
                    {
                     before(grammarAccess.getXRecordAccess().getGroup_5_1()); 
                    // InternalXContext.g:1471:3: ( rule__XRecord__Group_5_1__0 )
                    // InternalXContext.g:1471:4: rule__XRecord__Group_5_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XRecord__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXRecordAccess().getGroup_5_1()); 

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
    // InternalXContext.g:1479:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1483:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=31 && LA14_0<=53)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:1484:2: ( RULE_ID )
                    {
                    // InternalXContext.g:1484:2: ( RULE_ID )
                    // InternalXContext.g:1485:3: RULE_ID
                    {
                     before(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1490:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:1490:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:1491:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1()); 

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


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalXContext.g:1500:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1504:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt15=1;
                }
                break;
            case 118:
                {
                alt15=2;
                }
                break;
            case 119:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalXContext.g:1505:2: ( ( 'one' ) )
                    {
                    // InternalXContext.g:1505:2: ( ( 'one' ) )
                    // InternalXContext.g:1506:3: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    // InternalXContext.g:1507:3: ( 'one' )
                    // InternalXContext.g:1507:4: 'one'
                    {
                    match(input,117,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1511:2: ( ( 'many' ) )
                    {
                    // InternalXContext.g:1511:2: ( ( 'many' ) )
                    // InternalXContext.g:1512:3: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    // InternalXContext.g:1513:3: ( 'many' )
                    // InternalXContext.g:1513:4: 'many'
                    {
                    match(input,118,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1517:2: ( ( 'opt' ) )
                    {
                    // InternalXContext.g:1517:2: ( ( 'opt' ) )
                    // InternalXContext.g:1518:3: ( 'opt' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    // InternalXContext.g:1519:3: ( 'opt' )
                    // InternalXContext.g:1519:4: 'opt'
                    {
                    match(input,119,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__XContext__Group__0"
    // InternalXContext.g:1527:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1531:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:1532:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__XContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__1();

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
    // $ANTLR end "rule__XContext__Group__0"


    // $ANTLR start "rule__XContext__Group__0__Impl"
    // InternalXContext.g:1539:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1543:1: ( ( () ) )
            // InternalXContext.g:1544:1: ( () )
            {
            // InternalXContext.g:1544:1: ( () )
            // InternalXContext.g:1545:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:1546:2: ()
            // InternalXContext.g:1546:3: 
            {
            }

             after(grammarAccess.getXContextAccess().getContextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__0__Impl"


    // $ANTLR start "rule__XContext__Group__1"
    // InternalXContext.g:1554:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1558:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:1559:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__XContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__2();

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
    // $ANTLR end "rule__XContext__Group__1"


    // $ANTLR start "rule__XContext__Group__1__Impl"
    // InternalXContext.g:1566:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1570:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:1571:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:1571:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:1572:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1573:2: ( rule__XContext__CommentAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:1573:3: rule__XContext__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__1__Impl"


    // $ANTLR start "rule__XContext__Group__2"
    // InternalXContext.g:1581:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1585:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:1586:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__3();

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
    // $ANTLR end "rule__XContext__Group__2"


    // $ANTLR start "rule__XContext__Group__2__Impl"
    // InternalXContext.g:1593:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1597:1: ( ( 'context' ) )
            // InternalXContext.g:1598:1: ( 'context' )
            {
            // InternalXContext.g:1598:1: ( 'context' )
            // InternalXContext.g:1599:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_2()); 
            match(input,120,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getContextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__2__Impl"


    // $ANTLR start "rule__XContext__Group__3"
    // InternalXContext.g:1608:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1612:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:1613:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__XContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__4();

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
    // $ANTLR end "rule__XContext__Group__3"


    // $ANTLR start "rule__XContext__Group__3__Impl"
    // InternalXContext.g:1620:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1624:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:1625:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:1625:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:1626:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:1627:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:1627:3: rule__XContext__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__3__Impl"


    // $ANTLR start "rule__XContext__Group__4"
    // InternalXContext.g:1635:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1639:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:1640:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__XContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__5();

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
    // $ANTLR end "rule__XContext__Group__4"


    // $ANTLR start "rule__XContext__Group__4__Impl"
    // InternalXContext.g:1647:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1651:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:1652:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:1652:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:1653:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:1654:2: ( rule__XContext__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==122) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXContext.g:1654:3: rule__XContext__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__4__Impl"


    // $ANTLR start "rule__XContext__Group__5"
    // InternalXContext.g:1662:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1666:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:1667:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__XContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__6();

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
    // $ANTLR end "rule__XContext__Group__5"


    // $ANTLR start "rule__XContext__Group__5__Impl"
    // InternalXContext.g:1674:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Alternatives_5 )* ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1678:1: ( ( ( rule__XContext__Alternatives_5 )* ) )
            // InternalXContext.g:1679:1: ( ( rule__XContext__Alternatives_5 )* )
            {
            // InternalXContext.g:1679:1: ( ( rule__XContext__Alternatives_5 )* )
            // InternalXContext.g:1680:2: ( rule__XContext__Alternatives_5 )*
            {
             before(grammarAccess.getXContextAccess().getAlternatives_5()); 
            // InternalXContext.g:1681:2: ( rule__XContext__Alternatives_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||(LA18_0>=13 && LA18_0<=18)||(LA18_0>=123 && LA18_0<=125)||LA18_0==128||LA18_0==132) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXContext.g:1681:3: rule__XContext__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__XContext__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__5__Impl"


    // $ANTLR start "rule__XContext__Group__6"
    // InternalXContext.g:1689:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1693:1: ( rule__XContext__Group__6__Impl )
            // InternalXContext.g:1694:2: rule__XContext__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__6__Impl();

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
    // $ANTLR end "rule__XContext__Group__6"


    // $ANTLR start "rule__XContext__Group__6__Impl"
    // InternalXContext.g:1700:1: rule__XContext__Group__6__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1704:1: ( ( 'end' ) )
            // InternalXContext.g:1705:1: ( 'end' )
            {
            // InternalXContext.g:1705:1: ( 'end' )
            // InternalXContext.g:1706:2: 'end'
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_6()); 
            match(input,121,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__6__Impl"


    // $ANTLR start "rule__XContext__Group_4__0"
    // InternalXContext.g:1716:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1720:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:1721:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4__1();

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
    // $ANTLR end "rule__XContext__Group_4__0"


    // $ANTLR start "rule__XContext__Group_4__0__Impl"
    // InternalXContext.g:1728:1: rule__XContext__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1732:1: ( ( 'extends' ) )
            // InternalXContext.g:1733:1: ( 'extends' )
            {
            // InternalXContext.g:1733:1: ( 'extends' )
            // InternalXContext.g:1734:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_4_0()); 
            match(input,122,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4__0__Impl"


    // $ANTLR start "rule__XContext__Group_4__1"
    // InternalXContext.g:1743:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1747:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:1748:2: rule__XContext__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4__1"


    // $ANTLR start "rule__XContext__Group_4__1__Impl"
    // InternalXContext.g:1754:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1758:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) ) )
            // InternalXContext.g:1759:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:1759:1: ( ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* ) )
            // InternalXContext.g:1760:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            {
            // InternalXContext.g:1760:2: ( ( rule__XContext__ExtendsAssignment_4_1 ) )
            // InternalXContext.g:1761:3: ( rule__XContext__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:1762:3: ( rule__XContext__ExtendsAssignment_4_1 )
            // InternalXContext.g:1762:4: rule__XContext__ExtendsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__XContext__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }

            // InternalXContext.g:1765:2: ( ( rule__XContext__ExtendsAssignment_4_1 )* )
            // InternalXContext.g:1766:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 
            // InternalXContext.g:1767:3: ( rule__XContext__ExtendsAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXContext.g:1767:4: rule__XContext__ExtendsAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__XContext__ExtendsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4__1__Impl"


    // $ANTLR start "rule__XContext__Group_5_0__0"
    // InternalXContext.g:1777:1: rule__XContext__Group_5_0__0 : rule__XContext__Group_5_0__0__Impl rule__XContext__Group_5_0__1 ;
    public final void rule__XContext__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1781:1: ( rule__XContext__Group_5_0__0__Impl rule__XContext__Group_5_0__1 )
            // InternalXContext.g:1782:2: rule__XContext__Group_5_0__0__Impl rule__XContext__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XContext__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_0__1();

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
    // $ANTLR end "rule__XContext__Group_5_0__0"


    // $ANTLR start "rule__XContext__Group_5_0__0__Impl"
    // InternalXContext.g:1789:1: rule__XContext__Group_5_0__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1793:1: ( ( 'sets' ) )
            // InternalXContext.g:1794:1: ( 'sets' )
            {
            // InternalXContext.g:1794:1: ( 'sets' )
            // InternalXContext.g:1795:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_5_0_0()); 
            match(input,123,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getSetsKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_0__0__Impl"


    // $ANTLR start "rule__XContext__Group_5_0__1"
    // InternalXContext.g:1804:1: rule__XContext__Group_5_0__1 : rule__XContext__Group_5_0__1__Impl ;
    public final void rule__XContext__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1808:1: ( rule__XContext__Group_5_0__1__Impl )
            // InternalXContext.g:1809:2: rule__XContext__Group_5_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_5_0__1"


    // $ANTLR start "rule__XContext__Group_5_0__1__Impl"
    // InternalXContext.g:1815:1: rule__XContext__Group_5_0__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* ) ) ;
    public final void rule__XContext__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1819:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* ) ) )
            // InternalXContext.g:1820:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* ) )
            {
            // InternalXContext.g:1820:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* ) )
            // InternalXContext.g:1821:2: ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* )
            {
            // InternalXContext.g:1821:2: ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 ) )
            // InternalXContext.g:1822:3: ( rule__XContext__OrderedChildrenAssignment_5_0_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_0_1()); 
            // InternalXContext.g:1823:3: ( rule__XContext__OrderedChildrenAssignment_5_0_1 )
            // InternalXContext.g:1823:4: rule__XContext__OrderedChildrenAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XContext__OrderedChildrenAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_0_1()); 

            }

            // InternalXContext.g:1826:2: ( ( rule__XContext__OrderedChildrenAssignment_5_0_1 )* )
            // InternalXContext.g:1827:3: ( rule__XContext__OrderedChildrenAssignment_5_0_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_0_1()); 
            // InternalXContext.g:1828:3: ( rule__XContext__OrderedChildrenAssignment_5_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXContext.g:1828:4: rule__XContext__OrderedChildrenAssignment_5_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__XContext__OrderedChildrenAssignment_5_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_0__1__Impl"


    // $ANTLR start "rule__XContext__Group_5_1__0"
    // InternalXContext.g:1838:1: rule__XContext__Group_5_1__0 : rule__XContext__Group_5_1__0__Impl rule__XContext__Group_5_1__1 ;
    public final void rule__XContext__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1842:1: ( rule__XContext__Group_5_1__0__Impl rule__XContext__Group_5_1__1 )
            // InternalXContext.g:1843:2: rule__XContext__Group_5_1__0__Impl rule__XContext__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XContext__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_1__1();

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
    // $ANTLR end "rule__XContext__Group_5_1__0"


    // $ANTLR start "rule__XContext__Group_5_1__0__Impl"
    // InternalXContext.g:1850:1: rule__XContext__Group_5_1__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1854:1: ( ( 'constants' ) )
            // InternalXContext.g:1855:1: ( 'constants' )
            {
            // InternalXContext.g:1855:1: ( 'constants' )
            // InternalXContext.g:1856:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_5_1_0()); 
            match(input,124,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantsKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_1__0__Impl"


    // $ANTLR start "rule__XContext__Group_5_1__1"
    // InternalXContext.g:1865:1: rule__XContext__Group_5_1__1 : rule__XContext__Group_5_1__1__Impl ;
    public final void rule__XContext__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1869:1: ( rule__XContext__Group_5_1__1__Impl )
            // InternalXContext.g:1870:2: rule__XContext__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_5_1__1"


    // $ANTLR start "rule__XContext__Group_5_1__1__Impl"
    // InternalXContext.g:1876:1: rule__XContext__Group_5_1__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* ) ) ;
    public final void rule__XContext__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1880:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* ) ) )
            // InternalXContext.g:1881:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* ) )
            {
            // InternalXContext.g:1881:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* ) )
            // InternalXContext.g:1882:2: ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* )
            {
            // InternalXContext.g:1882:2: ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 ) )
            // InternalXContext.g:1883:3: ( rule__XContext__OrderedChildrenAssignment_5_1_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_1_1()); 
            // InternalXContext.g:1884:3: ( rule__XContext__OrderedChildrenAssignment_5_1_1 )
            // InternalXContext.g:1884:4: rule__XContext__OrderedChildrenAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XContext__OrderedChildrenAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_1_1()); 

            }

            // InternalXContext.g:1887:2: ( ( rule__XContext__OrderedChildrenAssignment_5_1_1 )* )
            // InternalXContext.g:1888:3: ( rule__XContext__OrderedChildrenAssignment_5_1_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_1_1()); 
            // InternalXContext.g:1889:3: ( rule__XContext__OrderedChildrenAssignment_5_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXContext.g:1889:4: rule__XContext__OrderedChildrenAssignment_5_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__XContext__OrderedChildrenAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_1__1__Impl"


    // $ANTLR start "rule__XContext__Group_5_2__0"
    // InternalXContext.g:1899:1: rule__XContext__Group_5_2__0 : rule__XContext__Group_5_2__0__Impl rule__XContext__Group_5_2__1 ;
    public final void rule__XContext__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1903:1: ( rule__XContext__Group_5_2__0__Impl rule__XContext__Group_5_2__1 )
            // InternalXContext.g:1904:2: rule__XContext__Group_5_2__0__Impl rule__XContext__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XContext__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_2__1();

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
    // $ANTLR end "rule__XContext__Group_5_2__0"


    // $ANTLR start "rule__XContext__Group_5_2__0__Impl"
    // InternalXContext.g:1911:1: rule__XContext__Group_5_2__0__Impl : ( ( rule__XContext__Alternatives_5_2_0 ) ) ;
    public final void rule__XContext__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1915:1: ( ( ( rule__XContext__Alternatives_5_2_0 ) ) )
            // InternalXContext.g:1916:1: ( ( rule__XContext__Alternatives_5_2_0 ) )
            {
            // InternalXContext.g:1916:1: ( ( rule__XContext__Alternatives_5_2_0 ) )
            // InternalXContext.g:1917:2: ( rule__XContext__Alternatives_5_2_0 )
            {
             before(grammarAccess.getXContextAccess().getAlternatives_5_2_0()); 
            // InternalXContext.g:1918:2: ( rule__XContext__Alternatives_5_2_0 )
            // InternalXContext.g:1918:3: rule__XContext__Alternatives_5_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Alternatives_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAlternatives_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_2__0__Impl"


    // $ANTLR start "rule__XContext__Group_5_2__1"
    // InternalXContext.g:1926:1: rule__XContext__Group_5_2__1 : rule__XContext__Group_5_2__1__Impl ;
    public final void rule__XContext__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1930:1: ( rule__XContext__Group_5_2__1__Impl )
            // InternalXContext.g:1931:2: rule__XContext__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_5_2__1"


    // $ANTLR start "rule__XContext__Group_5_2__1__Impl"
    // InternalXContext.g:1937:1: rule__XContext__Group_5_2__1__Impl : ( ( rule__XContext__OrderedChildrenAssignment_5_2_1 ) ) ;
    public final void rule__XContext__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1941:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_2_1 ) ) )
            // InternalXContext.g:1942:1: ( ( rule__XContext__OrderedChildrenAssignment_5_2_1 ) )
            {
            // InternalXContext.g:1942:1: ( ( rule__XContext__OrderedChildrenAssignment_5_2_1 ) )
            // InternalXContext.g:1943:2: ( rule__XContext__OrderedChildrenAssignment_5_2_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_2_1()); 
            // InternalXContext.g:1944:2: ( rule__XContext__OrderedChildrenAssignment_5_2_1 )
            // InternalXContext.g:1944:3: rule__XContext__OrderedChildrenAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__OrderedChildrenAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_2__1__Impl"


    // $ANTLR start "rule__XContext__Group_5_4__0"
    // InternalXContext.g:1953:1: rule__XContext__Group_5_4__0 : rule__XContext__Group_5_4__0__Impl rule__XContext__Group_5_4__1 ;
    public final void rule__XContext__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1957:1: ( rule__XContext__Group_5_4__0__Impl rule__XContext__Group_5_4__1 )
            // InternalXContext.g:1958:2: rule__XContext__Group_5_4__0__Impl rule__XContext__Group_5_4__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XContext__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_4__1();

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
    // $ANTLR end "rule__XContext__Group_5_4__0"


    // $ANTLR start "rule__XContext__Group_5_4__0__Impl"
    // InternalXContext.g:1965:1: rule__XContext__Group_5_4__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1969:1: ( ( 'axioms' ) )
            // InternalXContext.g:1970:1: ( 'axioms' )
            {
            // InternalXContext.g:1970:1: ( 'axioms' )
            // InternalXContext.g:1971:2: 'axioms'
            {
             before(grammarAccess.getXContextAccess().getAxiomsKeyword_5_4_0()); 
            match(input,125,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getAxiomsKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_4__0__Impl"


    // $ANTLR start "rule__XContext__Group_5_4__1"
    // InternalXContext.g:1980:1: rule__XContext__Group_5_4__1 : rule__XContext__Group_5_4__1__Impl ;
    public final void rule__XContext__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1984:1: ( rule__XContext__Group_5_4__1__Impl )
            // InternalXContext.g:1985:2: rule__XContext__Group_5_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_5_4__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_5_4__1"


    // $ANTLR start "rule__XContext__Group_5_4__1__Impl"
    // InternalXContext.g:1991:1: rule__XContext__Group_5_4__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* ) ) ;
    public final void rule__XContext__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1995:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* ) ) )
            // InternalXContext.g:1996:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* ) )
            {
            // InternalXContext.g:1996:1: ( ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* ) )
            // InternalXContext.g:1997:2: ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* )
            {
            // InternalXContext.g:1997:2: ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 ) )
            // InternalXContext.g:1998:3: ( rule__XContext__OrderedChildrenAssignment_5_4_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_4_1()); 
            // InternalXContext.g:1999:3: ( rule__XContext__OrderedChildrenAssignment_5_4_1 )
            // InternalXContext.g:1999:4: rule__XContext__OrderedChildrenAssignment_5_4_1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__XContext__OrderedChildrenAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_4_1()); 

            }

            // InternalXContext.g:2002:2: ( ( rule__XContext__OrderedChildrenAssignment_5_4_1 )* )
            // InternalXContext.g:2003:3: ( rule__XContext__OrderedChildrenAssignment_5_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_4_1()); 
            // InternalXContext.g:2004:3: ( rule__XContext__OrderedChildrenAssignment_5_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_XLABEL) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==RULE_XLABEL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXContext.g:2004:4: rule__XContext__OrderedChildrenAssignment_5_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__XContext__OrderedChildrenAssignment_5_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_5_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXContext.g:2014:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2018:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:2019:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:2026:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2030:1: ( ( RULE_ID ) )
            // InternalXContext.g:2031:1: ( RULE_ID )
            {
            // InternalXContext.g:2031:1: ( RULE_ID )
            // InternalXContext.g:2032:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:2041:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2045:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:2046:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:2052:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2056:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:2057:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:2057:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:2058:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:2059:2: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==70) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXContext.g:2059:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

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
    // InternalXContext.g:2068:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2072:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:2073:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:2080:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2084:1: ( ( '.' ) )
            // InternalXContext.g:2085:1: ( '.' )
            {
            // InternalXContext.g:2085:1: ( '.' )
            // InternalXContext.g:2086:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,70,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:2095:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2099:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:2100:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:2106:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2110:1: ( ( RULE_ID ) )
            // InternalXContext.g:2111:1: ( RULE_ID )
            {
            // InternalXContext.g:2111:1: ( RULE_ID )
            // InternalXContext.g:2112:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__XCarrierSet__Group__0"
    // InternalXContext.g:2122:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2126:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:2127:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XCarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XCarrierSet__Group__1();

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
    // $ANTLR end "rule__XCarrierSet__Group__0"


    // $ANTLR start "rule__XCarrierSet__Group__0__Impl"
    // InternalXContext.g:2134:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2138:1: ( ( () ) )
            // InternalXContext.g:2139:1: ( () )
            {
            // InternalXContext.g:2139:1: ( () )
            // InternalXContext.g:2140:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:2141:2: ()
            // InternalXContext.g:2141:3: 
            {
            }

             after(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__0__Impl"


    // $ANTLR start "rule__XCarrierSet__Group__1"
    // InternalXContext.g:2149:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2153:1: ( rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 )
            // InternalXContext.g:2154:2: rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XCarrierSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XCarrierSet__Group__2();

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
    // $ANTLR end "rule__XCarrierSet__Group__1"


    // $ANTLR start "rule__XCarrierSet__Group__1__Impl"
    // InternalXContext.g:2161:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__CommentAssignment_1 )? ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2165:1: ( ( ( rule__XCarrierSet__CommentAssignment_1 )? ) )
            // InternalXContext.g:2166:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2166:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            // InternalXContext.g:2167:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            {
             before(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2168:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXContext.g:2168:3: rule__XCarrierSet__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XCarrierSet__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__1__Impl"


    // $ANTLR start "rule__XCarrierSet__Group__2"
    // InternalXContext.g:2176:1: rule__XCarrierSet__Group__2 : rule__XCarrierSet__Group__2__Impl ;
    public final void rule__XCarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2180:1: ( rule__XCarrierSet__Group__2__Impl )
            // InternalXContext.g:2181:2: rule__XCarrierSet__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XCarrierSet__Group__2__Impl();

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
    // $ANTLR end "rule__XCarrierSet__Group__2"


    // $ANTLR start "rule__XCarrierSet__Group__2__Impl"
    // InternalXContext.g:2187:1: rule__XCarrierSet__Group__2__Impl : ( ( rule__XCarrierSet__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2191:1: ( ( ( rule__XCarrierSet__NameAssignment_2 ) ) )
            // InternalXContext.g:2192:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            {
            // InternalXContext.g:2192:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            // InternalXContext.g:2193:2: ( rule__XCarrierSet__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_2()); 
            // InternalXContext.g:2194:2: ( rule__XCarrierSet__NameAssignment_2 )
            // InternalXContext.g:2194:3: rule__XCarrierSet__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XCarrierSet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__Group__2__Impl"


    // $ANTLR start "rule__XConstant__Group__0"
    // InternalXContext.g:2203:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2207:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:2208:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstant__Group__1();

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
    // $ANTLR end "rule__XConstant__Group__0"


    // $ANTLR start "rule__XConstant__Group__0__Impl"
    // InternalXContext.g:2215:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2219:1: ( ( () ) )
            // InternalXContext.g:2220:1: ( () )
            {
            // InternalXContext.g:2220:1: ( () )
            // InternalXContext.g:2221:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:2222:2: ()
            // InternalXContext.g:2222:3: 
            {
            }

             after(grammarAccess.getXConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__0__Impl"


    // $ANTLR start "rule__XConstant__Group__1"
    // InternalXContext.g:2230:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl rule__XConstant__Group__2 ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2234:1: ( rule__XConstant__Group__1__Impl rule__XConstant__Group__2 )
            // InternalXContext.g:2235:2: rule__XConstant__Group__1__Impl rule__XConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstant__Group__2();

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
    // $ANTLR end "rule__XConstant__Group__1"


    // $ANTLR start "rule__XConstant__Group__1__Impl"
    // InternalXContext.g:2242:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__CommentAssignment_1 )? ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2246:1: ( ( ( rule__XConstant__CommentAssignment_1 )? ) )
            // InternalXContext.g:2247:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2247:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            // InternalXContext.g:2248:2: ( rule__XConstant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXConstantAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2249:2: ( rule__XConstant__CommentAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXContext.g:2249:3: rule__XConstant__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XConstant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXConstantAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__1__Impl"


    // $ANTLR start "rule__XConstant__Group__2"
    // InternalXContext.g:2257:1: rule__XConstant__Group__2 : rule__XConstant__Group__2__Impl ;
    public final void rule__XConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2261:1: ( rule__XConstant__Group__2__Impl )
            // InternalXContext.g:2262:2: rule__XConstant__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstant__Group__2__Impl();

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
    // $ANTLR end "rule__XConstant__Group__2"


    // $ANTLR start "rule__XConstant__Group__2__Impl"
    // InternalXContext.g:2268:1: rule__XConstant__Group__2__Impl : ( ( rule__XConstant__NameAssignment_2 ) ) ;
    public final void rule__XConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2272:1: ( ( ( rule__XConstant__NameAssignment_2 ) ) )
            // InternalXContext.g:2273:1: ( ( rule__XConstant__NameAssignment_2 ) )
            {
            // InternalXContext.g:2273:1: ( ( rule__XConstant__NameAssignment_2 ) )
            // InternalXContext.g:2274:2: ( rule__XConstant__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_2()); 
            // InternalXContext.g:2275:2: ( rule__XConstant__NameAssignment_2 )
            // InternalXContext.g:2275:3: rule__XConstant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__Group__2__Impl"


    // $ANTLR start "rule__XTypedConstant__Group__0"
    // InternalXContext.g:2284:1: rule__XTypedConstant__Group__0 : rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1 ;
    public final void rule__XTypedConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2288:1: ( rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1 )
            // InternalXContext.g:2289:2: rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XTypedConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__1();

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
    // $ANTLR end "rule__XTypedConstant__Group__0"


    // $ANTLR start "rule__XTypedConstant__Group__0__Impl"
    // InternalXContext.g:2296:1: rule__XTypedConstant__Group__0__Impl : ( () ) ;
    public final void rule__XTypedConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2300:1: ( ( () ) )
            // InternalXContext.g:2301:1: ( () )
            {
            // InternalXContext.g:2301:1: ( () )
            // InternalXContext.g:2302:2: ()
            {
             before(grammarAccess.getXTypedConstantAccess().getTypedConstantAction_0()); 
            // InternalXContext.g:2303:2: ()
            // InternalXContext.g:2303:3: 
            {
            }

             after(grammarAccess.getXTypedConstantAccess().getTypedConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group__0__Impl"


    // $ANTLR start "rule__XTypedConstant__Group__1"
    // InternalXContext.g:2311:1: rule__XTypedConstant__Group__1 : rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2 ;
    public final void rule__XTypedConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2315:1: ( rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2 )
            // InternalXContext.g:2316:2: rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XTypedConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__2();

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
    // $ANTLR end "rule__XTypedConstant__Group__1"


    // $ANTLR start "rule__XTypedConstant__Group__1__Impl"
    // InternalXContext.g:2323:1: rule__XTypedConstant__Group__1__Impl : ( ( rule__XTypedConstant__CommentAssignment_1 )? ) ;
    public final void rule__XTypedConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2327:1: ( ( ( rule__XTypedConstant__CommentAssignment_1 )? ) )
            // InternalXContext.g:2328:1: ( ( rule__XTypedConstant__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2328:1: ( ( rule__XTypedConstant__CommentAssignment_1 )? )
            // InternalXContext.g:2329:2: ( rule__XTypedConstant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXTypedConstantAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2330:2: ( rule__XTypedConstant__CommentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXContext.g:2330:3: rule__XTypedConstant__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypedConstant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXTypedConstantAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group__1__Impl"


    // $ANTLR start "rule__XTypedConstant__Group__2"
    // InternalXContext.g:2338:1: rule__XTypedConstant__Group__2 : rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3 ;
    public final void rule__XTypedConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2342:1: ( rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3 )
            // InternalXContext.g:2343:2: rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__XTypedConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__3();

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
    // $ANTLR end "rule__XTypedConstant__Group__2"


    // $ANTLR start "rule__XTypedConstant__Group__2__Impl"
    // InternalXContext.g:2350:1: rule__XTypedConstant__Group__2__Impl : ( ( rule__XTypedConstant__NameAssignment_2 ) ) ;
    public final void rule__XTypedConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2354:1: ( ( ( rule__XTypedConstant__NameAssignment_2 ) ) )
            // InternalXContext.g:2355:1: ( ( rule__XTypedConstant__NameAssignment_2 ) )
            {
            // InternalXContext.g:2355:1: ( ( rule__XTypedConstant__NameAssignment_2 ) )
            // InternalXContext.g:2356:2: ( rule__XTypedConstant__NameAssignment_2 )
            {
             before(grammarAccess.getXTypedConstantAccess().getNameAssignment_2()); 
            // InternalXContext.g:2357:2: ( rule__XTypedConstant__NameAssignment_2 )
            // InternalXContext.g:2357:3: rule__XTypedConstant__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group__2__Impl"


    // $ANTLR start "rule__XTypedConstant__Group__3"
    // InternalXContext.g:2365:1: rule__XTypedConstant__Group__3 : rule__XTypedConstant__Group__3__Impl rule__XTypedConstant__Group__4 ;
    public final void rule__XTypedConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2369:1: ( rule__XTypedConstant__Group__3__Impl rule__XTypedConstant__Group__4 )
            // InternalXContext.g:2370:2: rule__XTypedConstant__Group__3__Impl rule__XTypedConstant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__XTypedConstant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__4();

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
    // $ANTLR end "rule__XTypedConstant__Group__3"


    // $ANTLR start "rule__XTypedConstant__Group__3__Impl"
    // InternalXContext.g:2377:1: rule__XTypedConstant__Group__3__Impl : ( ( rule__XTypedConstant__Group_3__0 )? ) ;
    public final void rule__XTypedConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2381:1: ( ( ( rule__XTypedConstant__Group_3__0 )? ) )
            // InternalXContext.g:2382:1: ( ( rule__XTypedConstant__Group_3__0 )? )
            {
            // InternalXContext.g:2382:1: ( ( rule__XTypedConstant__Group_3__0 )? )
            // InternalXContext.g:2383:2: ( rule__XTypedConstant__Group_3__0 )?
            {
             before(grammarAccess.getXTypedConstantAccess().getGroup_3()); 
            // InternalXContext.g:2384:2: ( rule__XTypedConstant__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==78) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXContext.g:2384:3: rule__XTypedConstant__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypedConstant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXTypedConstantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group__3__Impl"


    // $ANTLR start "rule__XTypedConstant__Group__4"
    // InternalXContext.g:2392:1: rule__XTypedConstant__Group__4 : rule__XTypedConstant__Group__4__Impl ;
    public final void rule__XTypedConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2396:1: ( rule__XTypedConstant__Group__4__Impl )
            // InternalXContext.g:2397:2: rule__XTypedConstant__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group__4__Impl();

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
    // $ANTLR end "rule__XTypedConstant__Group__4"


    // $ANTLR start "rule__XTypedConstant__Group__4__Impl"
    // InternalXContext.g:2403:1: rule__XTypedConstant__Group__4__Impl : ( ( rule__XTypedConstant__Group_4__0 )? ) ;
    public final void rule__XTypedConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2407:1: ( ( ( rule__XTypedConstant__Group_4__0 )? ) )
            // InternalXContext.g:2408:1: ( ( rule__XTypedConstant__Group_4__0 )? )
            {
            // InternalXContext.g:2408:1: ( ( rule__XTypedConstant__Group_4__0 )? )
            // InternalXContext.g:2409:2: ( rule__XTypedConstant__Group_4__0 )?
            {
             before(grammarAccess.getXTypedConstantAccess().getGroup_4()); 
            // InternalXContext.g:2410:2: ( rule__XTypedConstant__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXContext.g:2410:3: rule__XTypedConstant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XTypedConstant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXTypedConstantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group__4__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_3__0"
    // InternalXContext.g:2419:1: rule__XTypedConstant__Group_3__0 : rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1 ;
    public final void rule__XTypedConstant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2423:1: ( rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1 )
            // InternalXContext.g:2424:2: rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XTypedConstant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group_3__1();

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
    // $ANTLR end "rule__XTypedConstant__Group_3__0"


    // $ANTLR start "rule__XTypedConstant__Group_3__0__Impl"
    // InternalXContext.g:2431:1: rule__XTypedConstant__Group_3__0__Impl : ( ':' ) ;
    public final void rule__XTypedConstant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2435:1: ( ( ':' ) )
            // InternalXContext.g:2436:1: ( ':' )
            {
            // InternalXContext.g:2436:1: ( ':' )
            // InternalXContext.g:2437:2: ':'
            {
             before(grammarAccess.getXTypedConstantAccess().getColonKeyword_3_0()); 
            match(input,78,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_3__0__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_3__1"
    // InternalXContext.g:2446:1: rule__XTypedConstant__Group_3__1 : rule__XTypedConstant__Group_3__1__Impl ;
    public final void rule__XTypedConstant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2450:1: ( rule__XTypedConstant__Group_3__1__Impl )
            // InternalXContext.g:2451:2: rule__XTypedConstant__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group_3__1__Impl();

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
    // $ANTLR end "rule__XTypedConstant__Group_3__1"


    // $ANTLR start "rule__XTypedConstant__Group_3__1__Impl"
    // InternalXContext.g:2457:1: rule__XTypedConstant__Group_3__1__Impl : ( ( rule__XTypedConstant__TypeAssignment_3_1 ) ) ;
    public final void rule__XTypedConstant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2461:1: ( ( ( rule__XTypedConstant__TypeAssignment_3_1 ) ) )
            // InternalXContext.g:2462:1: ( ( rule__XTypedConstant__TypeAssignment_3_1 ) )
            {
            // InternalXContext.g:2462:1: ( ( rule__XTypedConstant__TypeAssignment_3_1 ) )
            // InternalXContext.g:2463:2: ( rule__XTypedConstant__TypeAssignment_3_1 )
            {
             before(grammarAccess.getXTypedConstantAccess().getTypeAssignment_3_1()); 
            // InternalXContext.g:2464:2: ( rule__XTypedConstant__TypeAssignment_3_1 )
            // InternalXContext.g:2464:3: rule__XTypedConstant__TypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_3__1__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_4__0"
    // InternalXContext.g:2473:1: rule__XTypedConstant__Group_4__0 : rule__XTypedConstant__Group_4__0__Impl rule__XTypedConstant__Group_4__1 ;
    public final void rule__XTypedConstant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2477:1: ( rule__XTypedConstant__Group_4__0__Impl rule__XTypedConstant__Group_4__1 )
            // InternalXContext.g:2478:2: rule__XTypedConstant__Group_4__0__Impl rule__XTypedConstant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XTypedConstant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group_4__1();

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
    // $ANTLR end "rule__XTypedConstant__Group_4__0"


    // $ANTLR start "rule__XTypedConstant__Group_4__0__Impl"
    // InternalXContext.g:2485:1: rule__XTypedConstant__Group_4__0__Impl : ( '=' ) ;
    public final void rule__XTypedConstant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2489:1: ( ( '=' ) )
            // InternalXContext.g:2490:1: ( '=' )
            {
            // InternalXContext.g:2490:1: ( '=' )
            // InternalXContext.g:2491:2: '='
            {
             before(grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_4_0()); 
            match(input,71,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_4__0__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_4__1"
    // InternalXContext.g:2500:1: rule__XTypedConstant__Group_4__1 : rule__XTypedConstant__Group_4__1__Impl ;
    public final void rule__XTypedConstant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2504:1: ( rule__XTypedConstant__Group_4__1__Impl )
            // InternalXContext.g:2505:2: rule__XTypedConstant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__Group_4__1__Impl();

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
    // $ANTLR end "rule__XTypedConstant__Group_4__1"


    // $ANTLR start "rule__XTypedConstant__Group_4__1__Impl"
    // InternalXContext.g:2511:1: rule__XTypedConstant__Group_4__1__Impl : ( ( rule__XTypedConstant__ValueAssignment_4_1 ) ) ;
    public final void rule__XTypedConstant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2515:1: ( ( ( rule__XTypedConstant__ValueAssignment_4_1 ) ) )
            // InternalXContext.g:2516:1: ( ( rule__XTypedConstant__ValueAssignment_4_1 ) )
            {
            // InternalXContext.g:2516:1: ( ( rule__XTypedConstant__ValueAssignment_4_1 ) )
            // InternalXContext.g:2517:2: ( rule__XTypedConstant__ValueAssignment_4_1 )
            {
             before(grammarAccess.getXTypedConstantAccess().getValueAssignment_4_1()); 
            // InternalXContext.g:2518:2: ( rule__XTypedConstant__ValueAssignment_4_1 )
            // InternalXContext.g:2518:3: rule__XTypedConstant__ValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypedConstant__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_4__1__Impl"


    // $ANTLR start "rule__XIndividualAxiom__Group__0"
    // InternalXContext.g:2527:1: rule__XIndividualAxiom__Group__0 : rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1 ;
    public final void rule__XIndividualAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2531:1: ( rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1 )
            // InternalXContext.g:2532:2: rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__XIndividualAxiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__1();

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
    // $ANTLR end "rule__XIndividualAxiom__Group__0"


    // $ANTLR start "rule__XIndividualAxiom__Group__0__Impl"
    // InternalXContext.g:2539:1: rule__XIndividualAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2543:1: ( ( () ) )
            // InternalXContext.g:2544:1: ( () )
            {
            // InternalXContext.g:2544:1: ( () )
            // InternalXContext.g:2545:2: ()
            {
             before(grammarAccess.getXIndividualAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:2546:2: ()
            // InternalXContext.g:2546:3: 
            {
            }

             after(grammarAccess.getXIndividualAxiomAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__Group__0__Impl"


    // $ANTLR start "rule__XIndividualAxiom__Group__1"
    // InternalXContext.g:2554:1: rule__XIndividualAxiom__Group__1 : rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2 ;
    public final void rule__XIndividualAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2558:1: ( rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2 )
            // InternalXContext.g:2559:2: rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__XIndividualAxiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__2();

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
    // $ANTLR end "rule__XIndividualAxiom__Group__1"


    // $ANTLR start "rule__XIndividualAxiom__Group__1__Impl"
    // InternalXContext.g:2566:1: rule__XIndividualAxiom__Group__1__Impl : ( ( rule__XIndividualAxiom__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2570:1: ( ( ( rule__XIndividualAxiom__CommentAssignment_1 )? ) )
            // InternalXContext.g:2571:1: ( ( rule__XIndividualAxiom__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2571:1: ( ( rule__XIndividualAxiom__CommentAssignment_1 )? )
            // InternalXContext.g:2572:2: ( rule__XIndividualAxiom__CommentAssignment_1 )?
            {
             before(grammarAccess.getXIndividualAxiomAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2573:2: ( rule__XIndividualAxiom__CommentAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXContext.g:2573:3: rule__XIndividualAxiom__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualAxiom__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualAxiomAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__Group__1__Impl"


    // $ANTLR start "rule__XIndividualAxiom__Group__2"
    // InternalXContext.g:2581:1: rule__XIndividualAxiom__Group__2 : rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3 ;
    public final void rule__XIndividualAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2585:1: ( rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3 )
            // InternalXContext.g:2586:2: rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__XIndividualAxiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__3();

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
    // $ANTLR end "rule__XIndividualAxiom__Group__2"


    // $ANTLR start "rule__XIndividualAxiom__Group__2__Impl"
    // InternalXContext.g:2593:1: rule__XIndividualAxiom__Group__2__Impl : ( ( rule__XIndividualAxiom__Alternatives_2 ) ) ;
    public final void rule__XIndividualAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2597:1: ( ( ( rule__XIndividualAxiom__Alternatives_2 ) ) )
            // InternalXContext.g:2598:1: ( ( rule__XIndividualAxiom__Alternatives_2 ) )
            {
            // InternalXContext.g:2598:1: ( ( rule__XIndividualAxiom__Alternatives_2 ) )
            // InternalXContext.g:2599:2: ( rule__XIndividualAxiom__Alternatives_2 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2()); 
            // InternalXContext.g:2600:2: ( rule__XIndividualAxiom__Alternatives_2 )
            // InternalXContext.g:2600:3: rule__XIndividualAxiom__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__Group__2__Impl"


    // $ANTLR start "rule__XIndividualAxiom__Group__3"
    // InternalXContext.g:2608:1: rule__XIndividualAxiom__Group__3 : rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4 ;
    public final void rule__XIndividualAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2612:1: ( rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4 )
            // InternalXContext.g:2613:2: rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XIndividualAxiom__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__4();

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
    // $ANTLR end "rule__XIndividualAxiom__Group__3"


    // $ANTLR start "rule__XIndividualAxiom__Group__3__Impl"
    // InternalXContext.g:2620:1: rule__XIndividualAxiom__Group__3__Impl : ( ( rule__XIndividualAxiom__NameAssignment_3 ) ) ;
    public final void rule__XIndividualAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2624:1: ( ( ( rule__XIndividualAxiom__NameAssignment_3 ) ) )
            // InternalXContext.g:2625:1: ( ( rule__XIndividualAxiom__NameAssignment_3 ) )
            {
            // InternalXContext.g:2625:1: ( ( rule__XIndividualAxiom__NameAssignment_3 ) )
            // InternalXContext.g:2626:2: ( rule__XIndividualAxiom__NameAssignment_3 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getNameAssignment_3()); 
            // InternalXContext.g:2627:2: ( rule__XIndividualAxiom__NameAssignment_3 )
            // InternalXContext.g:2627:3: rule__XIndividualAxiom__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualAxiomAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__Group__3__Impl"


    // $ANTLR start "rule__XIndividualAxiom__Group__4"
    // InternalXContext.g:2635:1: rule__XIndividualAxiom__Group__4 : rule__XIndividualAxiom__Group__4__Impl ;
    public final void rule__XIndividualAxiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2639:1: ( rule__XIndividualAxiom__Group__4__Impl )
            // InternalXContext.g:2640:2: rule__XIndividualAxiom__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__Group__4__Impl();

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
    // $ANTLR end "rule__XIndividualAxiom__Group__4"


    // $ANTLR start "rule__XIndividualAxiom__Group__4__Impl"
    // InternalXContext.g:2646:1: rule__XIndividualAxiom__Group__4__Impl : ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualAxiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2650:1: ( ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) ) )
            // InternalXContext.g:2651:1: ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) )
            {
            // InternalXContext.g:2651:1: ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) )
            // InternalXContext.g:2652:2: ( rule__XIndividualAxiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getPredicateAssignment_4()); 
            // InternalXContext.g:2653:2: ( rule__XIndividualAxiom__PredicateAssignment_4 )
            // InternalXContext.g:2653:3: rule__XIndividualAxiom__PredicateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualAxiomAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__Group__4__Impl"


    // $ANTLR start "rule__XAxiom__Group__0"
    // InternalXContext.g:2662:1: rule__XAxiom__Group__0 : rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 ;
    public final void rule__XAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2666:1: ( rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 )
            // InternalXContext.g:2667:2: rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XAxiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__Group__1();

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
    // $ANTLR end "rule__XAxiom__Group__0"


    // $ANTLR start "rule__XAxiom__Group__0__Impl"
    // InternalXContext.g:2674:1: rule__XAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2678:1: ( ( () ) )
            // InternalXContext.g:2679:1: ( () )
            {
            // InternalXContext.g:2679:1: ( () )
            // InternalXContext.g:2680:2: ()
            {
             before(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:2681:2: ()
            // InternalXContext.g:2681:3: 
            {
            }

             after(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__0__Impl"


    // $ANTLR start "rule__XAxiom__Group__1"
    // InternalXContext.g:2689:1: rule__XAxiom__Group__1 : rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 ;
    public final void rule__XAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2693:1: ( rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 )
            // InternalXContext.g:2694:2: rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XAxiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__Group__2();

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
    // $ANTLR end "rule__XAxiom__Group__1"


    // $ANTLR start "rule__XAxiom__Group__1__Impl"
    // InternalXContext.g:2701:1: rule__XAxiom__Group__1__Impl : ( ( rule__XAxiom__CommentAssignment_1 )? ) ;
    public final void rule__XAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2705:1: ( ( ( rule__XAxiom__CommentAssignment_1 )? ) )
            // InternalXContext.g:2706:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2706:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            // InternalXContext.g:2707:2: ( rule__XAxiom__CommentAssignment_1 )?
            {
             before(grammarAccess.getXAxiomAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2708:2: ( rule__XAxiom__CommentAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXContext.g:2708:3: rule__XAxiom__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XAxiom__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__1__Impl"


    // $ANTLR start "rule__XAxiom__Group__2"
    // InternalXContext.g:2716:1: rule__XAxiom__Group__2 : rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 ;
    public final void rule__XAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2720:1: ( rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 )
            // InternalXContext.g:2721:2: rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XAxiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__Group__3();

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
    // $ANTLR end "rule__XAxiom__Group__2"


    // $ANTLR start "rule__XAxiom__Group__2__Impl"
    // InternalXContext.g:2728:1: rule__XAxiom__Group__2__Impl : ( ( rule__XAxiom__NameAssignment_2 ) ) ;
    public final void rule__XAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2732:1: ( ( ( rule__XAxiom__NameAssignment_2 ) ) )
            // InternalXContext.g:2733:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            {
            // InternalXContext.g:2733:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            // InternalXContext.g:2734:2: ( rule__XAxiom__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomAccess().getNameAssignment_2()); 
            // InternalXContext.g:2735:2: ( rule__XAxiom__NameAssignment_2 )
            // InternalXContext.g:2735:3: rule__XAxiom__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__2__Impl"


    // $ANTLR start "rule__XAxiom__Group__3"
    // InternalXContext.g:2743:1: rule__XAxiom__Group__3 : rule__XAxiom__Group__3__Impl ;
    public final void rule__XAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2747:1: ( rule__XAxiom__Group__3__Impl )
            // InternalXContext.g:2748:2: rule__XAxiom__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__Group__3__Impl();

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
    // $ANTLR end "rule__XAxiom__Group__3"


    // $ANTLR start "rule__XAxiom__Group__3__Impl"
    // InternalXContext.g:2754:1: rule__XAxiom__Group__3__Impl : ( ( rule__XAxiom__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2758:1: ( ( ( rule__XAxiom__PredicateAssignment_3 ) ) )
            // InternalXContext.g:2759:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:2759:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            // InternalXContext.g:2760:2: ( rule__XAxiom__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:2761:2: ( rule__XAxiom__PredicateAssignment_3 )
            // InternalXContext.g:2761:3: rule__XAxiom__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XAxiom__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXAxiomAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__Group__3__Impl"


    // $ANTLR start "rule__XType__Group__0"
    // InternalXContext.g:2770:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2774:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXContext.g:2775:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__XType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XType__Group__1();

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
    // $ANTLR end "rule__XType__Group__0"


    // $ANTLR start "rule__XType__Group__0__Impl"
    // InternalXContext.g:2782:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2786:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:2787:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:2787:1: ( ruleXTypePrimitive )
            // InternalXContext.g:2788:2: ruleXTypePrimitive
            {
             before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXTypePrimitive();

            state._fsp--;

             after(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0()); 

            }


            }

        }
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
    // InternalXContext.g:2797:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2801:1: ( rule__XType__Group__1__Impl )
            // InternalXContext.g:2802:2: rule__XType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XType__Group__1__Impl();

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
    // $ANTLR end "rule__XType__Group__1"


    // $ANTLR start "rule__XType__Group__1__Impl"
    // InternalXContext.g:2808:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2812:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXContext.g:2813:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXContext.g:2813:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXContext.g:2814:2: ( rule__XType__Group_1__0 )*
            {
             before(grammarAccess.getXTypeAccess().getGroup_1()); 
            // InternalXContext.g:2815:2: ( rule__XType__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=19 && LA31_0<=30)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalXContext.g:2815:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__XType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getXTypeAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalXContext.g:2824:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2828:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXContext.g:2829:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XType__Group_1__1();

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
    // $ANTLR end "rule__XType__Group_1__0"


    // $ANTLR start "rule__XType__Group_1__0__Impl"
    // InternalXContext.g:2836:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2840:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXContext.g:2841:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXContext.g:2841:1: ( ruleXTYPEOPERATOR )
            // InternalXContext.g:2842:2: ruleXTYPEOPERATOR
            {
             before(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXTYPEOPERATOR();

            state._fsp--;

             after(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:2851:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2855:1: ( rule__XType__Group_1__1__Impl )
            // InternalXContext.g:2856:2: rule__XType__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XType__Group_1__1__Impl();

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
    // $ANTLR end "rule__XType__Group_1__1"


    // $ANTLR start "rule__XType__Group_1__1__Impl"
    // InternalXContext.g:2862:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2866:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:2867:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:2867:1: ( ruleXTypePrimitive )
            // InternalXContext.g:2868:2: ruleXTypePrimitive
            {
             before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXTypePrimitive();

            state._fsp--;

             after(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalXContext.g:2878:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2882:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXContext.g:2883:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XTypePrimitive__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_5__1();

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
    // $ANTLR end "rule__XTypePrimitive__Group_5__0"


    // $ANTLR start "rule__XTypePrimitive__Group_5__0__Impl"
    // InternalXContext.g:2890:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2894:1: ( ( '(' ) )
            // InternalXContext.g:2895:1: ( '(' )
            {
            // InternalXContext.g:2895:1: ( '(' )
            // InternalXContext.g:2896:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
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
    // InternalXContext.g:2905:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2909:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXContext.g:2910:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XTypePrimitive__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_5__2();

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
    // $ANTLR end "rule__XTypePrimitive__Group_5__1"


    // $ANTLR start "rule__XTypePrimitive__Group_5__1__Impl"
    // InternalXContext.g:2917:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2921:1: ( ( ruleXType ) )
            // InternalXContext.g:2922:1: ( ruleXType )
            {
            // InternalXContext.g:2922:1: ( ruleXType )
            // InternalXContext.g:2923:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1()); 

            }


            }

        }
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
    // InternalXContext.g:2932:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2936:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXContext.g:2937:2: rule__XTypePrimitive__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_5__2__Impl();

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
    // $ANTLR end "rule__XTypePrimitive__Group_5__2"


    // $ANTLR start "rule__XTypePrimitive__Group_5__2__Impl"
    // InternalXContext.g:2943:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2947:1: ( ( ')' ) )
            // InternalXContext.g:2948:1: ( ')' )
            {
            // InternalXContext.g:2948:1: ( ')' )
            // InternalXContext.g:2949:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 

            }


            }

        }
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
    // InternalXContext.g:2959:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2963:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXContext.g:2964:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__XTypePrimitive__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_6__1();

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
    // $ANTLR end "rule__XTypePrimitive__Group_6__0"


    // $ANTLR start "rule__XTypePrimitive__Group_6__0__Impl"
    // InternalXContext.g:2971:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2975:1: ( ( '\\u2119' ) )
            // InternalXContext.g:2976:1: ( '\\u2119' )
            {
            // InternalXContext.g:2976:1: ( '\\u2119' )
            // InternalXContext.g:2977:2: '\\u2119'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 

            }


            }

        }
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
    // InternalXContext.g:2986:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2990:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXContext.g:2991:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XTypePrimitive__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_6__2();

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
    // $ANTLR end "rule__XTypePrimitive__Group_6__1"


    // $ANTLR start "rule__XTypePrimitive__Group_6__1__Impl"
    // InternalXContext.g:2998:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3002:1: ( ( '(' ) )
            // InternalXContext.g:3003:1: ( '(' )
            {
            // InternalXContext.g:3003:1: ( '(' )
            // InternalXContext.g:3004:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
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
    // InternalXContext.g:3013:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3017:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXContext.g:3018:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XTypePrimitive__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_6__3();

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
    // $ANTLR end "rule__XTypePrimitive__Group_6__2"


    // $ANTLR start "rule__XTypePrimitive__Group_6__2__Impl"
    // InternalXContext.g:3025:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3029:1: ( ( ruleXType ) )
            // InternalXContext.g:3030:1: ( ruleXType )
            {
            // InternalXContext.g:3030:1: ( ruleXType )
            // InternalXContext.g:3031:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2()); 

            }


            }

        }
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
    // InternalXContext.g:3040:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3044:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXContext.g:3045:2: rule__XTypePrimitive__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_6__3__Impl();

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
    // $ANTLR end "rule__XTypePrimitive__Group_6__3"


    // $ANTLR start "rule__XTypePrimitive__Group_6__3__Impl"
    // InternalXContext.g:3051:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3055:1: ( ( ')' ) )
            // InternalXContext.g:3056:1: ( ')' )
            {
            // InternalXContext.g:3056:1: ( ')' )
            // InternalXContext.g:3057:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
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
    // InternalXContext.g:3067:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3071:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXContext.g:3072:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__XTypePrimitive__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_7__1();

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
    // $ANTLR end "rule__XTypePrimitive__Group_7__0"


    // $ANTLR start "rule__XTypePrimitive__Group_7__0__Impl"
    // InternalXContext.g:3079:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3083:1: ( ( '\\u21191' ) )
            // InternalXContext.g:3084:1: ( '\\u21191' )
            {
            // InternalXContext.g:3084:1: ( '\\u21191' )
            // InternalXContext.g:3085:2: '\\u21191'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 

            }


            }

        }
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
    // InternalXContext.g:3094:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3098:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXContext.g:3099:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XTypePrimitive__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_7__2();

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
    // $ANTLR end "rule__XTypePrimitive__Group_7__1"


    // $ANTLR start "rule__XTypePrimitive__Group_7__1__Impl"
    // InternalXContext.g:3106:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3110:1: ( ( '(' ) )
            // InternalXContext.g:3111:1: ( '(' )
            {
            // InternalXContext.g:3111:1: ( '(' )
            // InternalXContext.g:3112:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
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
    // InternalXContext.g:3121:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3125:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXContext.g:3126:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XTypePrimitive__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_7__3();

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
    // $ANTLR end "rule__XTypePrimitive__Group_7__2"


    // $ANTLR start "rule__XTypePrimitive__Group_7__2__Impl"
    // InternalXContext.g:3133:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3137:1: ( ( ruleXType ) )
            // InternalXContext.g:3138:1: ( ruleXType )
            {
            // InternalXContext.g:3138:1: ( ruleXType )
            // InternalXContext.g:3139:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2()); 

            }


            }

        }
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
    // InternalXContext.g:3148:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3152:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXContext.g:3153:2: rule__XTypePrimitive__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XTypePrimitive__Group_7__3__Impl();

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
    // $ANTLR end "rule__XTypePrimitive__Group_7__3"


    // $ANTLR start "rule__XTypePrimitive__Group_7__3__Impl"
    // InternalXContext.g:3159:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3163:1: ( ( ')' ) )
            // InternalXContext.g:3164:1: ( ')' )
            {
            // InternalXContext.g:3164:1: ( ')' )
            // InternalXContext.g:3165:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalXContext.g:3175:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3179:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXContext.g:3180:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:3187:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3191:1: ( ( '%' ) )
            // InternalXContext.g:3192:1: ( '%' )
            {
            // InternalXContext.g:3192:1: ( '%' )
            // InternalXContext.g:3193:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,126,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3202:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3206:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXContext.g:3207:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXContext.g:3213:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3217:1: ( ( '\\u22C2' ) )
            // InternalXContext.g:3218:1: ( '\\u22C2' )
            {
            // InternalXContext.g:3218:1: ( '\\u22C2' )
            // InternalXContext.g:3219:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,127,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__XRecord__Group__0"
    // InternalXContext.g:3229:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3233:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXContext.g:3234:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__XRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__1();

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
    // $ANTLR end "rule__XRecord__Group__0"


    // $ANTLR start "rule__XRecord__Group__0__Impl"
    // InternalXContext.g:3241:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3245:1: ( ( () ) )
            // InternalXContext.g:3246:1: ( () )
            {
            // InternalXContext.g:3246:1: ( () )
            // InternalXContext.g:3247:2: ()
            {
             before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            // InternalXContext.g:3248:2: ()
            // InternalXContext.g:3248:3: 
            {
            }

             after(grammarAccess.getXRecordAccess().getRecordAction_0()); 

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
    // InternalXContext.g:3256:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3260:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXContext.g:3261:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__XRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__2();

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
    // $ANTLR end "rule__XRecord__Group__1"


    // $ANTLR start "rule__XRecord__Group__1__Impl"
    // InternalXContext.g:3268:1: rule__XRecord__Group__1__Impl : ( ( rule__XRecord__ExtendedAssignment_1 )? ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3272:1: ( ( ( rule__XRecord__ExtendedAssignment_1 )? ) )
            // InternalXContext.g:3273:1: ( ( rule__XRecord__ExtendedAssignment_1 )? )
            {
            // InternalXContext.g:3273:1: ( ( rule__XRecord__ExtendedAssignment_1 )? )
            // InternalXContext.g:3274:2: ( rule__XRecord__ExtendedAssignment_1 )?
            {
             before(grammarAccess.getXRecordAccess().getExtendedAssignment_1()); 
            // InternalXContext.g:3275:2: ( rule__XRecord__ExtendedAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==132) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXContext.g:3275:3: rule__XRecord__ExtendedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XRecord__ExtendedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXRecordAccess().getExtendedAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:3283:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3287:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXContext.g:3288:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__3();

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
    // $ANTLR end "rule__XRecord__Group__2"


    // $ANTLR start "rule__XRecord__Group__2__Impl"
    // InternalXContext.g:3295:1: rule__XRecord__Group__2__Impl : ( 'record' ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3299:1: ( ( 'record' ) )
            // InternalXContext.g:3300:1: ( 'record' )
            {
            // InternalXContext.g:3300:1: ( 'record' )
            // InternalXContext.g:3301:2: 'record'
            {
             before(grammarAccess.getXRecordAccess().getRecordKeyword_2()); 
            match(input,128,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getRecordKeyword_2()); 

            }


            }

        }
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
    // InternalXContext.g:3310:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3314:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXContext.g:3315:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__XRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__4();

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
    // $ANTLR end "rule__XRecord__Group__3"


    // $ANTLR start "rule__XRecord__Group__3__Impl"
    // InternalXContext.g:3322:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__NameAssignment_3 ) ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3326:1: ( ( ( rule__XRecord__NameAssignment_3 ) ) )
            // InternalXContext.g:3327:1: ( ( rule__XRecord__NameAssignment_3 ) )
            {
            // InternalXContext.g:3327:1: ( ( rule__XRecord__NameAssignment_3 ) )
            // InternalXContext.g:3328:2: ( rule__XRecord__NameAssignment_3 )
            {
             before(grammarAccess.getXRecordAccess().getNameAssignment_3()); 
            // InternalXContext.g:3329:2: ( rule__XRecord__NameAssignment_3 )
            // InternalXContext.g:3329:3: rule__XRecord__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalXContext.g:3337:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl rule__XRecord__Group__5 ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3341:1: ( rule__XRecord__Group__4__Impl rule__XRecord__Group__5 )
            // InternalXContext.g:3342:2: rule__XRecord__Group__4__Impl rule__XRecord__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__XRecord__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__5();

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
    // $ANTLR end "rule__XRecord__Group__4"


    // $ANTLR start "rule__XRecord__Group__4__Impl"
    // InternalXContext.g:3349:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__Group_4__0 )? ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3353:1: ( ( ( rule__XRecord__Group_4__0 )? ) )
            // InternalXContext.g:3354:1: ( ( rule__XRecord__Group_4__0 )? )
            {
            // InternalXContext.g:3354:1: ( ( rule__XRecord__Group_4__0 )? )
            // InternalXContext.g:3355:2: ( rule__XRecord__Group_4__0 )?
            {
             before(grammarAccess.getXRecordAccess().getGroup_4()); 
            // InternalXContext.g:3356:2: ( rule__XRecord__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==129) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXContext.g:3356:3: rule__XRecord__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XRecord__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXRecordAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalXContext.g:3364:1: rule__XRecord__Group__5 : rule__XRecord__Group__5__Impl rule__XRecord__Group__6 ;
    public final void rule__XRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3368:1: ( rule__XRecord__Group__5__Impl rule__XRecord__Group__6 )
            // InternalXContext.g:3369:2: rule__XRecord__Group__5__Impl rule__XRecord__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__XRecord__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__6();

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
    // $ANTLR end "rule__XRecord__Group__5"


    // $ANTLR start "rule__XRecord__Group__5__Impl"
    // InternalXContext.g:3376:1: rule__XRecord__Group__5__Impl : ( ( rule__XRecord__Alternatives_5 )* ) ;
    public final void rule__XRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3380:1: ( ( ( rule__XRecord__Alternatives_5 )* ) )
            // InternalXContext.g:3381:1: ( ( rule__XRecord__Alternatives_5 )* )
            {
            // InternalXContext.g:3381:1: ( ( rule__XRecord__Alternatives_5 )* )
            // InternalXContext.g:3382:2: ( rule__XRecord__Alternatives_5 )*
            {
             before(grammarAccess.getXRecordAccess().getAlternatives_5()); 
            // InternalXContext.g:3383:2: ( rule__XRecord__Alternatives_5 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=130 && LA34_0<=131)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalXContext.g:3383:3: rule__XRecord__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__XRecord__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getXRecordAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalXContext.g:3391:1: rule__XRecord__Group__6 : rule__XRecord__Group__6__Impl ;
    public final void rule__XRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3395:1: ( rule__XRecord__Group__6__Impl )
            // InternalXContext.g:3396:2: rule__XRecord__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group__6__Impl();

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
    // $ANTLR end "rule__XRecord__Group__6"


    // $ANTLR start "rule__XRecord__Group__6__Impl"
    // InternalXContext.g:3402:1: rule__XRecord__Group__6__Impl : ( 'end' ) ;
    public final void rule__XRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3406:1: ( ( 'end' ) )
            // InternalXContext.g:3407:1: ( 'end' )
            {
            // InternalXContext.g:3407:1: ( 'end' )
            // InternalXContext.g:3408:2: 'end'
            {
             before(grammarAccess.getXRecordAccess().getEndKeyword_6()); 
            match(input,121,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getEndKeyword_6()); 

            }


            }

        }
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
    // InternalXContext.g:3418:1: rule__XRecord__Group_4__0 : rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 ;
    public final void rule__XRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3422:1: ( rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 )
            // InternalXContext.g:3423:2: rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XRecord__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_4__1();

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
    // $ANTLR end "rule__XRecord__Group_4__0"


    // $ANTLR start "rule__XRecord__Group_4__0__Impl"
    // InternalXContext.g:3430:1: rule__XRecord__Group_4__0__Impl : ( 'inherits' ) ;
    public final void rule__XRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3434:1: ( ( 'inherits' ) )
            // InternalXContext.g:3435:1: ( 'inherits' )
            {
            // InternalXContext.g:3435:1: ( 'inherits' )
            // InternalXContext.g:3436:2: 'inherits'
            {
             before(grammarAccess.getXRecordAccess().getInheritsKeyword_4_0()); 
            match(input,129,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getInheritsKeyword_4_0()); 

            }


            }

        }
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
    // InternalXContext.g:3445:1: rule__XRecord__Group_4__1 : rule__XRecord__Group_4__1__Impl ;
    public final void rule__XRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3449:1: ( rule__XRecord__Group_4__1__Impl )
            // InternalXContext.g:3450:2: rule__XRecord__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_4__1__Impl();

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
    // $ANTLR end "rule__XRecord__Group_4__1"


    // $ANTLR start "rule__XRecord__Group_4__1__Impl"
    // InternalXContext.g:3456:1: rule__XRecord__Group_4__1__Impl : ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) ;
    public final void rule__XRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3460:1: ( ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) )
            // InternalXContext.g:3461:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            {
            // InternalXContext.g:3461:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            // InternalXContext.g:3462:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            {
             before(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1()); 
            // InternalXContext.g:3463:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            // InternalXContext.g:3463:3: rule__XRecord__InheritsNamesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__InheritsNamesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1()); 

            }


            }

        }
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
    // InternalXContext.g:3472:1: rule__XRecord__Group_5_0__0 : rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 ;
    public final void rule__XRecord__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3476:1: ( rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 )
            // InternalXContext.g:3477:2: rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XRecord__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_5_0__1();

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
    // $ANTLR end "rule__XRecord__Group_5_0__0"


    // $ANTLR start "rule__XRecord__Group_5_0__0__Impl"
    // InternalXContext.g:3484:1: rule__XRecord__Group_5_0__0__Impl : ( 'field' ) ;
    public final void rule__XRecord__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3488:1: ( ( 'field' ) )
            // InternalXContext.g:3489:1: ( 'field' )
            {
            // InternalXContext.g:3489:1: ( 'field' )
            // InternalXContext.g:3490:2: 'field'
            {
             before(grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0()); 
            match(input,130,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0()); 

            }


            }

        }
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
    // InternalXContext.g:3499:1: rule__XRecord__Group_5_0__1 : rule__XRecord__Group_5_0__1__Impl ;
    public final void rule__XRecord__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3503:1: ( rule__XRecord__Group_5_0__1__Impl )
            // InternalXContext.g:3504:2: rule__XRecord__Group_5_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__XRecord__Group_5_0__1"


    // $ANTLR start "rule__XRecord__Group_5_0__1__Impl"
    // InternalXContext.g:3510:1: rule__XRecord__Group_5_0__1__Impl : ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) ;
    public final void rule__XRecord__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3514:1: ( ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) )
            // InternalXContext.g:3515:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            {
            // InternalXContext.g:3515:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            // InternalXContext.g:3516:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            {
             before(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1()); 
            // InternalXContext.g:3517:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            // InternalXContext.g:3517:3: rule__XRecord__FieldsAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__FieldsAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1()); 

            }


            }

        }
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
    // InternalXContext.g:3526:1: rule__XRecord__Group_5_1__0 : rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 ;
    public final void rule__XRecord__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3530:1: ( rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 )
            // InternalXContext.g:3531:2: rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XRecord__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_5_1__1();

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
    // $ANTLR end "rule__XRecord__Group_5_1__0"


    // $ANTLR start "rule__XRecord__Group_5_1__0__Impl"
    // InternalXContext.g:3538:1: rule__XRecord__Group_5_1__0__Impl : ( 'constraint' ) ;
    public final void rule__XRecord__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3542:1: ( ( 'constraint' ) )
            // InternalXContext.g:3543:1: ( 'constraint' )
            {
            // InternalXContext.g:3543:1: ( 'constraint' )
            // InternalXContext.g:3544:2: 'constraint'
            {
             before(grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0()); 
            match(input,131,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:3553:1: rule__XRecord__Group_5_1__1 : rule__XRecord__Group_5_1__1__Impl ;
    public final void rule__XRecord__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3557:1: ( rule__XRecord__Group_5_1__1__Impl )
            // InternalXContext.g:3558:2: rule__XRecord__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__XRecord__Group_5_1__1"


    // $ANTLR start "rule__XRecord__Group_5_1__1__Impl"
    // InternalXContext.g:3564:1: rule__XRecord__Group_5_1__1__Impl : ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) ;
    public final void rule__XRecord__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3568:1: ( ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) )
            // InternalXContext.g:3569:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            {
            // InternalXContext.g:3569:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            // InternalXContext.g:3570:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            {
             before(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1()); 
            // InternalXContext.g:3571:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            // InternalXContext.g:3571:3: rule__XRecord__ConstraintsAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XRecord__ConstraintsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1()); 

            }


            }

        }
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
    // InternalXContext.g:3580:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3584:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXContext.g:3585:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalXContext.g:3592:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3596:1: ( ( () ) )
            // InternalXContext.g:3597:1: ( () )
            {
            // InternalXContext.g:3597:1: ( () )
            // InternalXContext.g:3598:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalXContext.g:3599:2: ()
            // InternalXContext.g:3599:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

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
    // InternalXContext.g:3607:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3611:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXContext.g:3612:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalXContext.g:3619:1: rule__Field__Group__1__Impl : ( ( rule__Field__CommentAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3623:1: ( ( ( rule__Field__CommentAssignment_1 )? ) )
            // InternalXContext.g:3624:1: ( ( rule__Field__CommentAssignment_1 )? )
            {
            // InternalXContext.g:3624:1: ( ( rule__Field__CommentAssignment_1 )? )
            // InternalXContext.g:3625:2: ( rule__Field__CommentAssignment_1 )?
            {
             before(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            // InternalXContext.g:3626:2: ( rule__Field__CommentAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXContext.g:3626:3: rule__Field__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Field__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getCommentAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:3634:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3638:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXContext.g:3639:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalXContext.g:3646:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3650:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalXContext.g:3651:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalXContext.g:3651:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalXContext.g:3652:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalXContext.g:3653:2: ( rule__Field__NameAssignment_2 )
            // InternalXContext.g:3653:3: rule__Field__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:3661:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3665:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalXContext.g:3666:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalXContext.g:3673:1: rule__Field__Group__3__Impl : ( ':' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3677:1: ( ( ':' ) )
            // InternalXContext.g:3678:1: ( ':' )
            {
            // InternalXContext.g:3678:1: ( ':' )
            // InternalXContext.g:3679:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            match(input,78,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalXContext.g:3688:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3692:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalXContext.g:3693:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalXContext.g:3700:1: rule__Field__Group__4__Impl : ( ( rule__Field__MultiplicityAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3704:1: ( ( ( rule__Field__MultiplicityAssignment_4 )? ) )
            // InternalXContext.g:3705:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            {
            // InternalXContext.g:3705:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            // InternalXContext.g:3706:2: ( rule__Field__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            // InternalXContext.g:3707:2: ( rule__Field__MultiplicityAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=117 && LA36_0<=119)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXContext.g:3707:3: rule__Field__MultiplicityAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Field__MultiplicityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 

            }


            }

        }
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
    // InternalXContext.g:3715:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3719:1: ( rule__Field__Group__5__Impl )
            // InternalXContext.g:3720:2: rule__Field__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__Group__5__Impl();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalXContext.g:3726:1: rule__Field__Group__5__Impl : ( ( rule__Field__TypeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3730:1: ( ( ( rule__Field__TypeAssignment_5 ) ) )
            // InternalXContext.g:3731:1: ( ( rule__Field__TypeAssignment_5 ) )
            {
            // InternalXContext.g:3731:1: ( ( rule__Field__TypeAssignment_5 ) )
            // InternalXContext.g:3732:2: ( rule__Field__TypeAssignment_5 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            // InternalXContext.g:3733:2: ( rule__Field__TypeAssignment_5 )
            // InternalXContext.g:3733:3: rule__Field__TypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Field__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_5()); 

            }


            }

        }
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
    // InternalXContext.g:3742:1: rule__XConstraint__Group__0 : rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 ;
    public final void rule__XConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3746:1: ( rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 )
            // InternalXContext.g:3747:2: rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__Group__1();

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
    // $ANTLR end "rule__XConstraint__Group__0"


    // $ANTLR start "rule__XConstraint__Group__0__Impl"
    // InternalXContext.g:3754:1: rule__XConstraint__Group__0__Impl : ( () ) ;
    public final void rule__XConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3758:1: ( ( () ) )
            // InternalXContext.g:3759:1: ( () )
            {
            // InternalXContext.g:3759:1: ( () )
            // InternalXContext.g:3760:2: ()
            {
             before(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            // InternalXContext.g:3761:2: ()
            // InternalXContext.g:3761:3: 
            {
            }

             after(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 

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
    // InternalXContext.g:3769:1: rule__XConstraint__Group__1 : rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 ;
    public final void rule__XConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3773:1: ( rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 )
            // InternalXContext.g:3774:2: rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__Group__2();

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
    // $ANTLR end "rule__XConstraint__Group__1"


    // $ANTLR start "rule__XConstraint__Group__1__Impl"
    // InternalXContext.g:3781:1: rule__XConstraint__Group__1__Impl : ( ( rule__XConstraint__CommentAssignment_1 )? ) ;
    public final void rule__XConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3785:1: ( ( ( rule__XConstraint__CommentAssignment_1 )? ) )
            // InternalXContext.g:3786:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            {
            // InternalXContext.g:3786:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            // InternalXContext.g:3787:2: ( rule__XConstraint__CommentAssignment_1 )?
            {
             before(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            // InternalXContext.g:3788:2: ( rule__XConstraint__CommentAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXContext.g:3788:3: rule__XConstraint__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XConstraint__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:3796:1: rule__XConstraint__Group__2 : rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 ;
    public final void rule__XConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3800:1: ( rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 )
            // InternalXContext.g:3801:2: rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__Group__3();

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
    // $ANTLR end "rule__XConstraint__Group__2"


    // $ANTLR start "rule__XConstraint__Group__2__Impl"
    // InternalXContext.g:3808:1: rule__XConstraint__Group__2__Impl : ( ( rule__XConstraint__NameAssignment_2 ) ) ;
    public final void rule__XConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3812:1: ( ( ( rule__XConstraint__NameAssignment_2 ) ) )
            // InternalXContext.g:3813:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            {
            // InternalXContext.g:3813:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            // InternalXContext.g:3814:2: ( rule__XConstraint__NameAssignment_2 )
            {
             before(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            // InternalXContext.g:3815:2: ( rule__XConstraint__NameAssignment_2 )
            // InternalXContext.g:3815:3: rule__XConstraint__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:3823:1: rule__XConstraint__Group__3 : rule__XConstraint__Group__3__Impl ;
    public final void rule__XConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3827:1: ( rule__XConstraint__Group__3__Impl )
            // InternalXContext.g:3828:2: rule__XConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__Group__3__Impl();

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
    // $ANTLR end "rule__XConstraint__Group__3"


    // $ANTLR start "rule__XConstraint__Group__3__Impl"
    // InternalXContext.g:3834:1: rule__XConstraint__Group__3__Impl : ( ( rule__XConstraint__PredicateAssignment_3 ) ) ;
    public final void rule__XConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3838:1: ( ( ( rule__XConstraint__PredicateAssignment_3 ) ) )
            // InternalXContext.g:3839:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:3839:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            // InternalXContext.g:3840:2: ( rule__XConstraint__PredicateAssignment_3 )
            {
             before(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:3841:2: ( rule__XConstraint__PredicateAssignment_3 )
            // InternalXContext.g:3841:3: rule__XConstraint__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XConstraint__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__CommentAssignment_1"
    // InternalXContext.g:3850:1: rule__XContext__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3854:1: ( ( RULE_STRING ) )
            // InternalXContext.g:3855:2: ( RULE_STRING )
            {
            // InternalXContext.g:3855:2: ( RULE_STRING )
            // InternalXContext.g:3856:3: RULE_STRING
            {
             before(grammarAccess.getXContextAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__CommentAssignment_1"


    // $ANTLR start "rule__XContext__NameAssignment_3"
    // InternalXContext.g:3865:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3869:1: ( ( RULE_ID ) )
            // InternalXContext.g:3870:2: ( RULE_ID )
            {
            // InternalXContext.g:3870:2: ( RULE_ID )
            // InternalXContext.g:3871:3: RULE_ID
            {
             before(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__NameAssignment_3"


    // $ANTLR start "rule__XContext__ExtendsAssignment_4_1"
    // InternalXContext.g:3880:1: rule__XContext__ExtendsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3884:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:3885:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:3885:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:3886:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 
            // InternalXContext.g:3887:3: ( ruleQualifiedName )
            // InternalXContext.g:3888:4: ruleQualifiedName
            {
             before(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtendsAssignment_4_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_0_1"
    // InternalXContext.g:3899:1: rule__XContext__OrderedChildrenAssignment_5_0_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3903:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:3904:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:3904:2: ( ruleXCarrierSet )
            // InternalXContext.g:3905:3: ruleXCarrierSet
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_5_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_0_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_1_1"
    // InternalXContext.g:3914:1: rule__XContext__OrderedChildrenAssignment_5_1_1 : ( ruleXConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3918:1: ( ( ruleXConstant ) )
            // InternalXContext.g:3919:2: ( ruleXConstant )
            {
            // InternalXContext.g:3919:2: ( ruleXConstant )
            // InternalXContext.g:3920:3: ruleXConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_1_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_2_1"
    // InternalXContext.g:3929:1: rule__XContext__OrderedChildrenAssignment_5_2_1 : ( ruleXTypedConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3933:1: ( ( ruleXTypedConstant ) )
            // InternalXContext.g:3934:2: ( ruleXTypedConstant )
            {
            // InternalXContext.g:3934:2: ( ruleXTypedConstant )
            // InternalXContext.g:3935:3: ruleXTypedConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXTypedConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_2_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_3"
    // InternalXContext.g:3944:1: rule__XContext__OrderedChildrenAssignment_5_3 : ( ruleXRecord ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3948:1: ( ( ruleXRecord ) )
            // InternalXContext.g:3949:2: ( ruleXRecord )
            {
            // InternalXContext.g:3949:2: ( ruleXRecord )
            // InternalXContext.g:3950:3: ruleXRecord
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_5_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXRecord();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_3"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_4_1"
    // InternalXContext.g:3959:1: rule__XContext__OrderedChildrenAssignment_5_4_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3963:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:3964:2: ( ruleXAxiom )
            {
            // InternalXContext.g:3964:2: ( ruleXAxiom )
            // InternalXContext.g:3965:3: ruleXAxiom
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_5_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_4_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_5_5"
    // InternalXContext.g:3974:1: rule__XContext__OrderedChildrenAssignment_5_5 : ( ruleXIndividualAxiom ) ;
    public final void rule__XContext__OrderedChildrenAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3978:1: ( ( ruleXIndividualAxiom ) )
            // InternalXContext.g:3979:2: ( ruleXIndividualAxiom )
            {
            // InternalXContext.g:3979:2: ( ruleXIndividualAxiom )
            // InternalXContext.g:3980:3: ruleXIndividualAxiom
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_5_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXIndividualAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_5_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_5_5"


    // $ANTLR start "rule__XCarrierSet__CommentAssignment_1"
    // InternalXContext.g:3989:1: rule__XCarrierSet__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XCarrierSet__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3993:1: ( ( RULE_STRING ) )
            // InternalXContext.g:3994:2: ( RULE_STRING )
            {
            // InternalXContext.g:3994:2: ( RULE_STRING )
            // InternalXContext.g:3995:3: RULE_STRING
            {
             before(grammarAccess.getXCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__CommentAssignment_1"


    // $ANTLR start "rule__XCarrierSet__NameAssignment_2"
    // InternalXContext.g:4004:1: rule__XCarrierSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4008:1: ( ( RULE_ID ) )
            // InternalXContext.g:4009:2: ( RULE_ID )
            {
            // InternalXContext.g:4009:2: ( RULE_ID )
            // InternalXContext.g:4010:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__NameAssignment_2"


    // $ANTLR start "rule__XConstant__CommentAssignment_1"
    // InternalXContext.g:4019:1: rule__XConstant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4023:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4024:2: ( RULE_STRING )
            {
            // InternalXContext.g:4024:2: ( RULE_STRING )
            // InternalXContext.g:4025:3: RULE_STRING
            {
             before(grammarAccess.getXConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__CommentAssignment_1"


    // $ANTLR start "rule__XConstant__NameAssignment_2"
    // InternalXContext.g:4034:1: rule__XConstant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4038:1: ( ( RULE_ID ) )
            // InternalXContext.g:4039:2: ( RULE_ID )
            {
            // InternalXContext.g:4039:2: ( RULE_ID )
            // InternalXContext.g:4040:3: RULE_ID
            {
             before(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__NameAssignment_2"


    // $ANTLR start "rule__XTypedConstant__CommentAssignment_1"
    // InternalXContext.g:4049:1: rule__XTypedConstant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XTypedConstant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4053:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4054:2: ( RULE_STRING )
            {
            // InternalXContext.g:4054:2: ( RULE_STRING )
            // InternalXContext.g:4055:3: RULE_STRING
            {
             before(grammarAccess.getXTypedConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__CommentAssignment_1"


    // $ANTLR start "rule__XTypedConstant__NameAssignment_2"
    // InternalXContext.g:4064:1: rule__XTypedConstant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XTypedConstant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4068:1: ( ( RULE_ID ) )
            // InternalXContext.g:4069:2: ( RULE_ID )
            {
            // InternalXContext.g:4069:2: ( RULE_ID )
            // InternalXContext.g:4070:3: RULE_ID
            {
             before(grammarAccess.getXTypedConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__NameAssignment_2"


    // $ANTLR start "rule__XTypedConstant__TypeAssignment_3_1"
    // InternalXContext.g:4079:1: rule__XTypedConstant__TypeAssignment_3_1 : ( ruleXType ) ;
    public final void rule__XTypedConstant__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4083:1: ( ( ruleXType ) )
            // InternalXContext.g:4084:2: ( ruleXType )
            {
            // InternalXContext.g:4084:2: ( ruleXType )
            // InternalXContext.g:4085:3: ruleXType
            {
             before(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__TypeAssignment_3_1"


    // $ANTLR start "rule__XTypedConstant__ValueAssignment_4_1"
    // InternalXContext.g:4094:1: rule__XTypedConstant__ValueAssignment_4_1 : ( ruleXFormula ) ;
    public final void rule__XTypedConstant__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4098:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4099:2: ( ruleXFormula )
            {
            // InternalXContext.g:4099:2: ( ruleXFormula )
            // InternalXContext.g:4100:3: ruleXFormula
            {
             before(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__ValueAssignment_4_1"


    // $ANTLR start "rule__XIndividualAxiom__CommentAssignment_1"
    // InternalXContext.g:4109:1: rule__XIndividualAxiom__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualAxiom__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4113:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4114:2: ( RULE_STRING )
            {
            // InternalXContext.g:4114:2: ( RULE_STRING )
            // InternalXContext.g:4115:3: RULE_STRING
            {
             before(grammarAccess.getXIndividualAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualAxiom__TheoremAssignment_2_0"
    // InternalXContext.g:4124:1: rule__XIndividualAxiom__TheoremAssignment_2_0 : ( ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 ) ) ;
    public final void rule__XIndividualAxiom__TheoremAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4128:1: ( ( ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 ) ) )
            // InternalXContext.g:4129:2: ( ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 ) )
            {
            // InternalXContext.g:4129:2: ( ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 ) )
            // InternalXContext.g:4130:3: ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getTheoremAlternatives_2_0_0()); 
            // InternalXContext.g:4131:3: ( rule__XIndividualAxiom__TheoremAlternatives_2_0_0 )
            // InternalXContext.g:4131:4: rule__XIndividualAxiom__TheoremAlternatives_2_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualAxiom__TheoremAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualAxiomAccess().getTheoremAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__TheoremAssignment_2_0"


    // $ANTLR start "rule__XIndividualAxiom__NameAssignment_3"
    // InternalXContext.g:4139:1: rule__XIndividualAxiom__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualAxiom__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4143:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4144:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4144:2: ( RULE_XLABEL )
            // InternalXContext.g:4145:3: RULE_XLABEL
            {
             before(grammarAccess.getXIndividualAxiomAccess().getNameXLABELTerminalRuleCall_3_0()); 
            match(input,RULE_XLABEL,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualAxiomAccess().getNameXLABELTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__NameAssignment_3"


    // $ANTLR start "rule__XIndividualAxiom__PredicateAssignment_4"
    // InternalXContext.g:4154:1: rule__XIndividualAxiom__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualAxiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4158:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4159:2: ( ruleXFormula )
            {
            // InternalXContext.g:4159:2: ( ruleXFormula )
            // InternalXContext.g:4160:3: ruleXFormula
            {
             before(grammarAccess.getXIndividualAxiomAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXIndividualAxiomAccess().getPredicateXFormulaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualAxiom__PredicateAssignment_4"


    // $ANTLR start "rule__XAxiom__CommentAssignment_1"
    // InternalXContext.g:4169:1: rule__XAxiom__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XAxiom__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4173:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4174:2: ( RULE_STRING )
            {
            // InternalXContext.g:4174:2: ( RULE_STRING )
            // InternalXContext.g:4175:3: RULE_STRING
            {
             before(grammarAccess.getXAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__CommentAssignment_1"


    // $ANTLR start "rule__XAxiom__NameAssignment_2"
    // InternalXContext.g:4184:1: rule__XAxiom__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4188:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4189:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4189:2: ( RULE_XLABEL )
            // InternalXContext.g:4190:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__NameAssignment_2"


    // $ANTLR start "rule__XAxiom__PredicateAssignment_3"
    // InternalXContext.g:4199:1: rule__XAxiom__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAxiom__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4203:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4204:2: ( ruleXFormula )
            {
            // InternalXContext.g:4204:2: ( ruleXFormula )
            // InternalXContext.g:4205:3: ruleXFormula
            {
             before(grammarAccess.getXAxiomAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXAxiomAccess().getPredicateXFormulaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__PredicateAssignment_3"


    // $ANTLR start "rule__XRecord__ExtendedAssignment_1"
    // InternalXContext.g:4214:1: rule__XRecord__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__XRecord__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4218:1: ( ( ( 'extended' ) ) )
            // InternalXContext.g:4219:2: ( ( 'extended' ) )
            {
            // InternalXContext.g:4219:2: ( ( 'extended' ) )
            // InternalXContext.g:4220:3: ( 'extended' )
            {
             before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 
            // InternalXContext.g:4221:3: ( 'extended' )
            // InternalXContext.g:4222:4: 'extended'
            {
             before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,132,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 

            }

             after(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__ExtendedAssignment_1"


    // $ANTLR start "rule__XRecord__NameAssignment_3"
    // InternalXContext.g:4233:1: rule__XRecord__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4237:1: ( ( RULE_ID ) )
            // InternalXContext.g:4238:2: ( RULE_ID )
            {
            // InternalXContext.g:4238:2: ( RULE_ID )
            // InternalXContext.g:4239:3: RULE_ID
            {
             before(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalXContext.g:4248:1: rule__XRecord__InheritsNamesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__XRecord__InheritsNamesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4252:1: ( ( RULE_ID ) )
            // InternalXContext.g:4253:2: ( RULE_ID )
            {
            // InternalXContext.g:4253:2: ( RULE_ID )
            // InternalXContext.g:4254:3: RULE_ID
            {
             before(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getInheritsNamesIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:4263:1: rule__XRecord__FieldsAssignment_5_0_1 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4267:1: ( ( ruleField ) )
            // InternalXContext.g:4268:2: ( ruleField )
            {
            // InternalXContext.g:4268:2: ( ruleField )
            // InternalXContext.g:4269:3: ruleField
            {
             before(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_5_0_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:4278:1: rule__XRecord__ConstraintsAssignment_5_1_1 : ( ruleXConstraint ) ;
    public final void rule__XRecord__ConstraintsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4282:1: ( ( ruleXConstraint ) )
            // InternalXContext.g:4283:2: ( ruleXConstraint )
            {
            // InternalXContext.g:4283:2: ( ruleXConstraint )
            // InternalXContext.g:4284:3: ruleXConstraint
            {
             before(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXConstraint();

            state._fsp--;

             after(grammarAccess.getXRecordAccess().getConstraintsXConstraintParserRuleCall_5_1_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:4293:1: rule__Field__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4297:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4298:2: ( RULE_STRING )
            {
            // InternalXContext.g:4298:2: ( RULE_STRING )
            // InternalXContext.g:4299:3: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:4308:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4312:1: ( ( RULE_ID ) )
            // InternalXContext.g:4313:2: ( RULE_ID )
            {
            // InternalXContext.g:4313:2: ( RULE_ID )
            // InternalXContext.g:4314:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:4323:1: rule__Field__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4327:1: ( ( ruleMultiplicity ) )
            // InternalXContext.g:4328:2: ( ruleMultiplicity )
            {
            // InternalXContext.g:4328:2: ( ruleMultiplicity )
            // InternalXContext.g:4329:3: ruleMultiplicity
            {
             before(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_4_0()); 

            }


            }

        }
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
    // InternalXContext.g:4338:1: rule__Field__TypeAssignment_5 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4342:1: ( ( ruleFieldType ) )
            // InternalXContext.g:4343:2: ( ruleFieldType )
            {
            // InternalXContext.g:4343:2: ( ruleFieldType )
            // InternalXContext.g:4344:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalXContext.g:4353:1: rule__XConstraint__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstraint__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4357:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4358:2: ( RULE_STRING )
            {
            // InternalXContext.g:4358:2: ( RULE_STRING )
            // InternalXContext.g:4359:3: RULE_STRING
            {
             before(grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXConstraintAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:4368:1: rule__XConstraint__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XConstraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4372:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4373:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4373:2: ( RULE_XLABEL )
            // InternalXContext.g:4374:3: RULE_XLABEL
            {
             before(grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXConstraintAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:4383:1: rule__XConstraint__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XConstraint__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4387:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4388:2: ( ruleXFormula )
            {
            // InternalXContext.g:4388:2: ( ruleXFormula )
            // InternalXContext.g:4389:3: ruleXFormula
            {
             before(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXConstraintAccess().getPredicateXFormulaParserRuleCall_3_0()); 

            }


            }

        }
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFF80072L,0x401FFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L,0x0100000000000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007E080L,0x3E00000000000000L,0x0000000000000011L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007E082L,0x3800000000000000L,0x0000000000000011L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000092L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000182L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0070000780000010L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFFFFFFFFFFF80070L,0x401FFFFFFFFFFFFFL});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000007E080L,0x3800000000000000L,0x0000000000000011L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007FF80000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007FF80002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000011L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x000000000000000EL});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x003FFFFF80000010L,0x00E0000000000000L});
    }


}