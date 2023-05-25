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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_STRING", "RULE_XLABEL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extend'", "'ext'", "'constant'", "'cst'", "'axiom'", "'axm'", "'theorem'", "'thm'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21191'", "'\\u2119'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'one'", "'many'", "'opt'", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'axioms'", "'set'", "'%'", "'\\u22C2'", "'record'", "'inherits'", "'field'", "'constraint'", "'extended'"
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


    // $ANTLR start "entryRuleXIndividualCarrierSet"
    // InternalXContext.g:128:1: entryRuleXIndividualCarrierSet : ruleXIndividualCarrierSet EOF ;
    public final void entryRuleXIndividualCarrierSet() throws RecognitionException {
        try {
            // InternalXContext.g:129:1: ( ruleXIndividualCarrierSet EOF )
            // InternalXContext.g:130:1: ruleXIndividualCarrierSet EOF
            {
             before(grammarAccess.getXIndividualCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXIndividualCarrierSet();

            state._fsp--;

             after(grammarAccess.getXIndividualCarrierSetRule()); 
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
    // $ANTLR end "entryRuleXIndividualCarrierSet"


    // $ANTLR start "ruleXIndividualCarrierSet"
    // InternalXContext.g:137:1: ruleXIndividualCarrierSet : ( ( rule__XIndividualCarrierSet__Group__0 ) ) ;
    public final void ruleXIndividualCarrierSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:141:2: ( ( ( rule__XIndividualCarrierSet__Group__0 ) ) )
            // InternalXContext.g:142:2: ( ( rule__XIndividualCarrierSet__Group__0 ) )
            {
            // InternalXContext.g:142:2: ( ( rule__XIndividualCarrierSet__Group__0 ) )
            // InternalXContext.g:143:3: ( rule__XIndividualCarrierSet__Group__0 )
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getGroup()); 
            // InternalXContext.g:144:3: ( rule__XIndividualCarrierSet__Group__0 )
            // InternalXContext.g:144:4: rule__XIndividualCarrierSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualCarrierSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualCarrierSet"


    // $ANTLR start "entryRuleXConstant"
    // InternalXContext.g:153:1: entryRuleXConstant : ruleXConstant EOF ;
    public final void entryRuleXConstant() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXConstant EOF )
            // InternalXContext.g:155:1: ruleXConstant EOF
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
    // InternalXContext.g:162:1: ruleXConstant : ( ( rule__XConstant__Group__0 ) ) ;
    public final void ruleXConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XConstant__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XConstant__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XConstant__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XConstant__Group__0 )
            {
             before(grammarAccess.getXConstantAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XConstant__Group__0 )
            // InternalXContext.g:169:4: rule__XConstant__Group__0
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


    // $ANTLR start "entryRuleXIndividualConstant"
    // InternalXContext.g:178:1: entryRuleXIndividualConstant : ruleXIndividualConstant EOF ;
    public final void entryRuleXIndividualConstant() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXIndividualConstant EOF )
            // InternalXContext.g:180:1: ruleXIndividualConstant EOF
            {
             before(grammarAccess.getXIndividualConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXIndividualConstant();

            state._fsp--;

             after(grammarAccess.getXIndividualConstantRule()); 
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
    // $ANTLR end "entryRuleXIndividualConstant"


    // $ANTLR start "ruleXIndividualConstant"
    // InternalXContext.g:187:1: ruleXIndividualConstant : ( ( rule__XIndividualConstant__Group__0 ) ) ;
    public final void ruleXIndividualConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( rule__XIndividualConstant__Group__0 ) ) )
            // InternalXContext.g:192:2: ( ( rule__XIndividualConstant__Group__0 ) )
            {
            // InternalXContext.g:192:2: ( ( rule__XIndividualConstant__Group__0 ) )
            // InternalXContext.g:193:3: ( rule__XIndividualConstant__Group__0 )
            {
             before(grammarAccess.getXIndividualConstantAccess().getGroup()); 
            // InternalXContext.g:194:3: ( rule__XIndividualConstant__Group__0 )
            // InternalXContext.g:194:4: rule__XIndividualConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualConstant"


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


    // $ANTLR start "entryRuleXIndividualAxiom"
    // InternalXContext.g:228:1: entryRuleXIndividualAxiom : ruleXIndividualAxiom EOF ;
    public final void entryRuleXIndividualAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:229:1: ( ruleXIndividualAxiom EOF )
            // InternalXContext.g:230:1: ruleXIndividualAxiom EOF
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
    // InternalXContext.g:237:1: ruleXIndividualAxiom : ( ( rule__XIndividualAxiom__Group__0 ) ) ;
    public final void ruleXIndividualAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:241:2: ( ( ( rule__XIndividualAxiom__Group__0 ) ) )
            // InternalXContext.g:242:2: ( ( rule__XIndividualAxiom__Group__0 ) )
            {
            // InternalXContext.g:242:2: ( ( rule__XIndividualAxiom__Group__0 ) )
            // InternalXContext.g:243:3: ( rule__XIndividualAxiom__Group__0 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getGroup()); 
            // InternalXContext.g:244:3: ( rule__XIndividualAxiom__Group__0 )
            // InternalXContext.g:244:4: rule__XIndividualAxiom__Group__0
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


    // $ANTLR start "entryRuleXIndividualTheorem"
    // InternalXContext.g:253:1: entryRuleXIndividualTheorem : ruleXIndividualTheorem EOF ;
    public final void entryRuleXIndividualTheorem() throws RecognitionException {
        try {
            // InternalXContext.g:254:1: ( ruleXIndividualTheorem EOF )
            // InternalXContext.g:255:1: ruleXIndividualTheorem EOF
            {
             before(grammarAccess.getXIndividualTheoremRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXIndividualTheorem();

            state._fsp--;

             after(grammarAccess.getXIndividualTheoremRule()); 
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
    // $ANTLR end "entryRuleXIndividualTheorem"


    // $ANTLR start "ruleXIndividualTheorem"
    // InternalXContext.g:262:1: ruleXIndividualTheorem : ( ( rule__XIndividualTheorem__Group__0 ) ) ;
    public final void ruleXIndividualTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:266:2: ( ( ( rule__XIndividualTheorem__Group__0 ) ) )
            // InternalXContext.g:267:2: ( ( rule__XIndividualTheorem__Group__0 ) )
            {
            // InternalXContext.g:267:2: ( ( rule__XIndividualTheorem__Group__0 ) )
            // InternalXContext.g:268:3: ( rule__XIndividualTheorem__Group__0 )
            {
             before(grammarAccess.getXIndividualTheoremAccess().getGroup()); 
            // InternalXContext.g:269:3: ( rule__XIndividualTheorem__Group__0 )
            // InternalXContext.g:269:4: rule__XIndividualTheorem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualTheoremAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXIndividualTheorem"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:278:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXContext.g:279:1: ( ruleXFormula EOF )
            // InternalXContext.g:280:1: ruleXFormula EOF
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
    // InternalXContext.g:287:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:291:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXContext.g:292:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXContext.g:292:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXContext.g:293:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXContext.g:293:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXContext.g:294:4: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:295:4: ( rule__XFormula__Alternatives )
            // InternalXContext.g:295:5: rule__XFormula__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }

            // InternalXContext.g:298:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXContext.g:299:4: ( rule__XFormula__Alternatives )*
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:300:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNTRANSLATED_TOKEN)||(LA1_0>=21 && LA1_0<=118)||LA1_0==129) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXContext.g:300:5: rule__XFormula__Alternatives
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
    // InternalXContext.g:310:1: entryRuleXType : ruleXType EOF ;
    public final void entryRuleXType() throws RecognitionException {
        try {
            // InternalXContext.g:311:1: ( ruleXType EOF )
            // InternalXContext.g:312:1: ruleXType EOF
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
    // InternalXContext.g:319:1: ruleXType : ( ( rule__XType__Group__0 ) ) ;
    public final void ruleXType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:323:2: ( ( ( rule__XType__Group__0 ) ) )
            // InternalXContext.g:324:2: ( ( rule__XType__Group__0 ) )
            {
            // InternalXContext.g:324:2: ( ( rule__XType__Group__0 ) )
            // InternalXContext.g:325:3: ( rule__XType__Group__0 )
            {
             before(grammarAccess.getXTypeAccess().getGroup()); 
            // InternalXContext.g:326:3: ( rule__XType__Group__0 )
            // InternalXContext.g:326:4: rule__XType__Group__0
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
    // InternalXContext.g:335:1: entryRuleXTYPEOPERATOR : ruleXTYPEOPERATOR EOF ;
    public final void entryRuleXTYPEOPERATOR() throws RecognitionException {
        try {
            // InternalXContext.g:336:1: ( ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:337:1: ruleXTYPEOPERATOR EOF
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
    // InternalXContext.g:344:1: ruleXTYPEOPERATOR : ( ( rule__XTYPEOPERATOR__Alternatives ) ) ;
    public final void ruleXTYPEOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:348:2: ( ( ( rule__XTYPEOPERATOR__Alternatives ) ) )
            // InternalXContext.g:349:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            {
            // InternalXContext.g:349:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            // InternalXContext.g:350:3: ( rule__XTYPEOPERATOR__Alternatives )
            {
             before(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 
            // InternalXContext.g:351:3: ( rule__XTYPEOPERATOR__Alternatives )
            // InternalXContext.g:351:4: rule__XTYPEOPERATOR__Alternatives
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
    // InternalXContext.g:360:1: entryRuleXTypePrimitive : ruleXTypePrimitive EOF ;
    public final void entryRuleXTypePrimitive() throws RecognitionException {
        try {
            // InternalXContext.g:361:1: ( ruleXTypePrimitive EOF )
            // InternalXContext.g:362:1: ruleXTypePrimitive EOF
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
    // InternalXContext.g:369:1: ruleXTypePrimitive : ( ( rule__XTypePrimitive__Alternatives ) ) ;
    public final void ruleXTypePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:373:2: ( ( ( rule__XTypePrimitive__Alternatives ) ) )
            // InternalXContext.g:374:2: ( ( rule__XTypePrimitive__Alternatives ) )
            {
            // InternalXContext.g:374:2: ( ( rule__XTypePrimitive__Alternatives ) )
            // InternalXContext.g:375:3: ( rule__XTypePrimitive__Alternatives )
            {
             before(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 
            // InternalXContext.g:376:3: ( rule__XTypePrimitive__Alternatives )
            // InternalXContext.g:376:4: rule__XTypePrimitive__Alternatives
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
    // InternalXContext.g:385:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXContext.g:386:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:387:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXContext.g:394:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:398:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXContext.g:399:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXContext.g:399:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXContext.g:400:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalXContext.g:401:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXContext.g:401:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
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
    // InternalXContext.g:410:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:411:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:412:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXContext.g:419:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:423:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:424:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:424:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXContext.g:425:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:426:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXContext.g:426:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
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
    // InternalXContext.g:435:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:436:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:437:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXContext.g:444:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:448:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:449:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:449:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXContext.g:450:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:451:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXContext.g:451:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
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
    // InternalXContext.g:460:1: entryRuleXRecord : ruleXRecord EOF ;
    public final void entryRuleXRecord() throws RecognitionException {
        try {
            // InternalXContext.g:461:1: ( ruleXRecord EOF )
            // InternalXContext.g:462:1: ruleXRecord EOF
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
    // InternalXContext.g:469:1: ruleXRecord : ( ( rule__XRecord__Group__0 ) ) ;
    public final void ruleXRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:473:2: ( ( ( rule__XRecord__Group__0 ) ) )
            // InternalXContext.g:474:2: ( ( rule__XRecord__Group__0 ) )
            {
            // InternalXContext.g:474:2: ( ( rule__XRecord__Group__0 ) )
            // InternalXContext.g:475:3: ( rule__XRecord__Group__0 )
            {
             before(grammarAccess.getXRecordAccess().getGroup()); 
            // InternalXContext.g:476:3: ( rule__XRecord__Group__0 )
            // InternalXContext.g:476:4: rule__XRecord__Group__0
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
    // InternalXContext.g:485:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalXContext.g:486:1: ( ruleFieldType EOF )
            // InternalXContext.g:487:1: ruleFieldType EOF
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
    // InternalXContext.g:494:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:498:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalXContext.g:499:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalXContext.g:499:2: ( ( rule__FieldType__Alternatives ) )
            // InternalXContext.g:500:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalXContext.g:501:3: ( rule__FieldType__Alternatives )
            // InternalXContext.g:501:4: rule__FieldType__Alternatives
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
    // InternalXContext.g:510:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXContext.g:511:1: ( ruleField EOF )
            // InternalXContext.g:512:1: ruleField EOF
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
    // InternalXContext.g:519:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:523:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXContext.g:524:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXContext.g:524:2: ( ( rule__Field__Group__0 ) )
            // InternalXContext.g:525:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalXContext.g:526:3: ( rule__Field__Group__0 )
            // InternalXContext.g:526:4: rule__Field__Group__0
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
    // InternalXContext.g:535:1: entryRuleXConstraint : ruleXConstraint EOF ;
    public final void entryRuleXConstraint() throws RecognitionException {
        try {
            // InternalXContext.g:536:1: ( ruleXConstraint EOF )
            // InternalXContext.g:537:1: ruleXConstraint EOF
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
    // InternalXContext.g:544:1: ruleXConstraint : ( ( rule__XConstraint__Group__0 ) ) ;
    public final void ruleXConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:548:2: ( ( ( rule__XConstraint__Group__0 ) ) )
            // InternalXContext.g:549:2: ( ( rule__XConstraint__Group__0 ) )
            {
            // InternalXContext.g:549:2: ( ( rule__XConstraint__Group__0 ) )
            // InternalXContext.g:550:3: ( rule__XConstraint__Group__0 )
            {
             before(grammarAccess.getXConstraintAccess().getGroup()); 
            // InternalXContext.g:551:3: ( rule__XConstraint__Group__0 )
            // InternalXContext.g:551:4: rule__XConstraint__Group__0
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
    // InternalXContext.g:560:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:564:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXContext.g:565:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXContext.g:565:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXContext.g:566:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalXContext.g:567:3: ( rule__Multiplicity__Alternatives )
            // InternalXContext.g:567:4: rule__Multiplicity__Alternatives
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


    // $ANTLR start "rule__XContext__Alternatives_4"
    // InternalXContext.g:575:1: rule__XContext__Alternatives_4 : ( ( ( rule__XContext__Group_4_0__0 ) ) | ( ( rule__XContext__Group_4_1__0 ) ) | ( ( rule__XContext__Group_4_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) ) | ( ( rule__XContext__Group_4_4__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_5 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_6 ) ) | ( ( rule__XContext__Group_4_7__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_8 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_9 ) ) );
    public final void rule__XContext__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:579:1: ( ( ( rule__XContext__Group_4_0__0 ) ) | ( ( rule__XContext__Group_4_1__0 ) ) | ( ( rule__XContext__Group_4_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) ) | ( ( rule__XContext__Group_4_4__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_5 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_6 ) ) | ( ( rule__XContext__Group_4_7__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_8 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_9 ) ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalXContext.g:580:2: ( ( rule__XContext__Group_4_0__0 ) )
                    {
                    // InternalXContext.g:580:2: ( ( rule__XContext__Group_4_0__0 ) )
                    // InternalXContext.g:581:3: ( rule__XContext__Group_4_0__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_0()); 
                    // InternalXContext.g:582:3: ( rule__XContext__Group_4_0__0 )
                    // InternalXContext.g:582:4: rule__XContext__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:586:2: ( ( rule__XContext__Group_4_1__0 ) )
                    {
                    // InternalXContext.g:586:2: ( ( rule__XContext__Group_4_1__0 ) )
                    // InternalXContext.g:587:3: ( rule__XContext__Group_4_1__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_1()); 
                    // InternalXContext.g:588:3: ( rule__XContext__Group_4_1__0 )
                    // InternalXContext.g:588:4: rule__XContext__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:592:2: ( ( rule__XContext__Group_4_2__0 ) )
                    {
                    // InternalXContext.g:592:2: ( ( rule__XContext__Group_4_2__0 ) )
                    // InternalXContext.g:593:3: ( rule__XContext__Group_4_2__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_2()); 
                    // InternalXContext.g:594:3: ( rule__XContext__Group_4_2__0 )
                    // InternalXContext.g:594:4: rule__XContext__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:598:2: ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) )
                    {
                    // InternalXContext.g:598:2: ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) )
                    // InternalXContext.g:599:3: ( rule__XContext__OrderedChildrenAssignment_4_3 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_3()); 
                    // InternalXContext.g:600:3: ( rule__XContext__OrderedChildrenAssignment_4_3 )
                    // InternalXContext.g:600:4: rule__XContext__OrderedChildrenAssignment_4_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:604:2: ( ( rule__XContext__Group_4_4__0 ) )
                    {
                    // InternalXContext.g:604:2: ( ( rule__XContext__Group_4_4__0 ) )
                    // InternalXContext.g:605:3: ( rule__XContext__Group_4_4__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_4()); 
                    // InternalXContext.g:606:3: ( rule__XContext__Group_4_4__0 )
                    // InternalXContext.g:606:4: rule__XContext__Group_4_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:610:2: ( ( rule__XContext__OrderedChildrenAssignment_4_5 ) )
                    {
                    // InternalXContext.g:610:2: ( ( rule__XContext__OrderedChildrenAssignment_4_5 ) )
                    // InternalXContext.g:611:3: ( rule__XContext__OrderedChildrenAssignment_4_5 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_5()); 
                    // InternalXContext.g:612:3: ( rule__XContext__OrderedChildrenAssignment_4_5 )
                    // InternalXContext.g:612:4: rule__XContext__OrderedChildrenAssignment_4_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:616:2: ( ( rule__XContext__OrderedChildrenAssignment_4_6 ) )
                    {
                    // InternalXContext.g:616:2: ( ( rule__XContext__OrderedChildrenAssignment_4_6 ) )
                    // InternalXContext.g:617:3: ( rule__XContext__OrderedChildrenAssignment_4_6 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_6()); 
                    // InternalXContext.g:618:3: ( rule__XContext__OrderedChildrenAssignment_4_6 )
                    // InternalXContext.g:618:4: rule__XContext__OrderedChildrenAssignment_4_6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:622:2: ( ( rule__XContext__Group_4_7__0 ) )
                    {
                    // InternalXContext.g:622:2: ( ( rule__XContext__Group_4_7__0 ) )
                    // InternalXContext.g:623:3: ( rule__XContext__Group_4_7__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_7()); 
                    // InternalXContext.g:624:3: ( rule__XContext__Group_4_7__0 )
                    // InternalXContext.g:624:4: rule__XContext__Group_4_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__Group_4_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:628:2: ( ( rule__XContext__OrderedChildrenAssignment_4_8 ) )
                    {
                    // InternalXContext.g:628:2: ( ( rule__XContext__OrderedChildrenAssignment_4_8 ) )
                    // InternalXContext.g:629:3: ( rule__XContext__OrderedChildrenAssignment_4_8 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_8()); 
                    // InternalXContext.g:630:3: ( rule__XContext__OrderedChildrenAssignment_4_8 )
                    // InternalXContext.g:630:4: rule__XContext__OrderedChildrenAssignment_4_8
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:634:2: ( ( rule__XContext__OrderedChildrenAssignment_4_9 ) )
                    {
                    // InternalXContext.g:634:2: ( ( rule__XContext__OrderedChildrenAssignment_4_9 ) )
                    // InternalXContext.g:635:3: ( rule__XContext__OrderedChildrenAssignment_4_9 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_9()); 
                    // InternalXContext.g:636:3: ( rule__XContext__OrderedChildrenAssignment_4_9 )
                    // InternalXContext.g:636:4: rule__XContext__OrderedChildrenAssignment_4_9
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_9()); 

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
    // $ANTLR end "rule__XContext__Alternatives_4"


    // $ANTLR start "rule__XContext__Alternatives_4_1_0"
    // InternalXContext.g:644:1: rule__XContext__Alternatives_4_1_0 : ( ( 'extend' ) | ( 'ext' ) );
    public final void rule__XContext__Alternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:648:1: ( ( 'extend' ) | ( 'ext' ) )
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
                    // InternalXContext.g:649:2: ( 'extend' )
                    {
                    // InternalXContext.g:649:2: ( 'extend' )
                    // InternalXContext.g:650:3: 'extend'
                    {
                     before(grammarAccess.getXContextAccess().getExtendKeyword_4_1_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getExtendKeyword_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:655:2: ( 'ext' )
                    {
                    // InternalXContext.g:655:2: ( 'ext' )
                    // InternalXContext.g:656:3: 'ext'
                    {
                     before(grammarAccess.getXContextAccess().getExtKeyword_4_1_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXContextAccess().getExtKeyword_4_1_0_1()); 

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
    // $ANTLR end "rule__XContext__Alternatives_4_1_0"


    // $ANTLR start "rule__XIndividualConstant__Alternatives_2"
    // InternalXContext.g:665:1: rule__XIndividualConstant__Alternatives_2 : ( ( 'constant' ) | ( 'cst' ) );
    public final void rule__XIndividualConstant__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:669:1: ( ( 'constant' ) | ( 'cst' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXContext.g:670:2: ( 'constant' )
                    {
                    // InternalXContext.g:670:2: ( 'constant' )
                    // InternalXContext.g:671:3: 'constant'
                    {
                     before(grammarAccess.getXIndividualConstantAccess().getConstantKeyword_2_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualConstantAccess().getConstantKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:676:2: ( 'cst' )
                    {
                    // InternalXContext.g:676:2: ( 'cst' )
                    // InternalXContext.g:677:3: 'cst'
                    {
                     before(grammarAccess.getXIndividualConstantAccess().getCstKeyword_2_1()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualConstantAccess().getCstKeyword_2_1()); 

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
    // $ANTLR end "rule__XIndividualConstant__Alternatives_2"


    // $ANTLR start "rule__XIndividualAxiom__Alternatives_2"
    // InternalXContext.g:686:1: rule__XIndividualAxiom__Alternatives_2 : ( ( 'axiom' ) | ( 'axm' ) );
    public final void rule__XIndividualAxiom__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:690:1: ( ( 'axiom' ) | ( 'axm' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXContext.g:691:2: ( 'axiom' )
                    {
                    // InternalXContext.g:691:2: ( 'axiom' )
                    // InternalXContext.g:692:3: 'axiom'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_0()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getAxiomKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:697:2: ( 'axm' )
                    {
                    // InternalXContext.g:697:2: ( 'axm' )
                    // InternalXContext.g:698:3: 'axm'
                    {
                     before(grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualAxiomAccess().getAxmKeyword_2_1()); 

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


    // $ANTLR start "rule__XIndividualTheorem__TheoremAlternatives_2_0"
    // InternalXContext.g:707:1: rule__XIndividualTheorem__TheoremAlternatives_2_0 : ( ( 'theorem' ) | ( 'thm' ) );
    public final void rule__XIndividualTheorem__TheoremAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:711:1: ( ( 'theorem' ) | ( 'thm' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXContext.g:712:2: ( 'theorem' )
                    {
                    // InternalXContext.g:712:2: ( 'theorem' )
                    // InternalXContext.g:713:3: 'theorem'
                    {
                     before(grammarAccess.getXIndividualTheoremAccess().getTheoremTheoremKeyword_2_0_0()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualTheoremAccess().getTheoremTheoremKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:718:2: ( 'thm' )
                    {
                    // InternalXContext.g:718:2: ( 'thm' )
                    // InternalXContext.g:719:3: 'thm'
                    {
                     before(grammarAccess.getXIndividualTheoremAccess().getTheoremThmKeyword_2_0_1()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXIndividualTheoremAccess().getTheoremThmKeyword_2_0_1()); 

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
    // $ANTLR end "rule__XIndividualTheorem__TheoremAlternatives_2_0"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXContext.g:728:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:732:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) )
            int alt7=6;
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
                alt7=1;
                }
                break;
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
            case 86:
                {
                alt7=2;
                }
                break;
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
            case 129:
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
                    // InternalXContext.g:733:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:733:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:734:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXContext.g:739:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXContext.g:739:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXContext.g:740:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXContext.g:745:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXContext.g:745:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXContext.g:746:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXContext.g:751:2: ( RULE_ID )
                    {
                    // InternalXContext.g:751:2: ( RULE_ID )
                    // InternalXContext.g:752:3: RULE_ID
                    {
                     before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:757:2: ( RULE_INT )
                    {
                    // InternalXContext.g:757:2: ( RULE_INT )
                    // InternalXContext.g:758:3: RULE_INT
                    {
                     before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:763:2: ( RULE_UNTRANSLATED_TOKEN )
                    {
                    // InternalXContext.g:763:2: ( RULE_UNTRANSLATED_TOKEN )
                    // InternalXContext.g:764:3: RULE_UNTRANSLATED_TOKEN
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
    // InternalXContext.g:773:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:777:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            case 28:
                {
                alt8=8;
                }
                break;
            case 29:
                {
                alt8=9;
                }
                break;
            case 30:
                {
                alt8=10;
                }
                break;
            case 31:
                {
                alt8=11;
                }
                break;
            case 32:
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
                    // InternalXContext.g:778:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:778:2: ( '\\u2194' )
                    // InternalXContext.g:779:3: '\\u2194'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:784:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:784:2: ( '\\uE100' )
                    // InternalXContext.g:785:3: '\\uE100'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:790:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:790:2: ( '\\uE101' )
                    // InternalXContext.g:791:3: '\\uE101'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,23,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:796:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:796:2: ( '\\uE102' )
                    // InternalXContext.g:797:3: '\\uE102'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,24,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:802:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:802:2: ( '\\u21F8' )
                    // InternalXContext.g:803:3: '\\u21F8'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,25,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:808:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:808:2: ( '\\u2192' )
                    // InternalXContext.g:809:3: '\\u2192'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    match(input,26,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:814:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:814:2: ( '\\u2914' )
                    // InternalXContext.g:815:3: '\\u2914'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,27,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:820:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:820:2: ( '\\u21A3' )
                    // InternalXContext.g:821:3: '\\u21A3'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,28,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:826:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:826:2: ( '\\u2900' )
                    // InternalXContext.g:827:3: '\\u2900'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,29,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:832:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:832:2: ( '\\u21A0' )
                    // InternalXContext.g:833:3: '\\u21A0'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,30,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:838:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:838:2: ( '\\u2916' )
                    // InternalXContext.g:839:3: '\\u2916'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,31,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:844:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:844:2: ( '\\u00D7' )
                    // InternalXContext.g:845:3: '\\u00D7'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
                    match(input,32,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:854:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:858:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 56:
                {
                alt9=6;
                }
                break;
            case 55:
                {
                alt9=7;
                }
                break;
            case 54:
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
                    // InternalXContext.g:859:2: ( RULE_ID )
                    {
                    // InternalXContext.g:859:2: ( RULE_ID )
                    // InternalXContext.g:860:3: RULE_ID
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:865:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:865:2: ( 'BOOL' )
                    // InternalXContext.g:866:3: 'BOOL'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    match(input,33,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:871:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:871:2: ( '\\u21151' )
                    // InternalXContext.g:872:3: '\\u21151'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    match(input,34,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:877:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:877:2: ( '\\u2115' )
                    // InternalXContext.g:878:3: '\\u2115'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    match(input,35,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:883:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:883:2: ( '\\u2124' )
                    // InternalXContext.g:884:3: '\\u2124'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    match(input,36,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:889:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXContext.g:889:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXContext.g:890:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    // InternalXContext.g:891:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXContext.g:891:4: rule__XTypePrimitive__Group_5__0
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
                    // InternalXContext.g:895:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXContext.g:895:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXContext.g:896:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    // InternalXContext.g:897:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXContext.g:897:4: rule__XTypePrimitive__Group_6__0
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
                    // InternalXContext.g:901:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXContext.g:901:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXContext.g:902:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    // InternalXContext.g:903:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXContext.g:903:4: rule__XTypePrimitive__Group_7__0
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
    // InternalXContext.g:911:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:915:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt10=23;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            case 40:
                {
                alt10=5;
                }
                break;
            case 41:
                {
                alt10=6;
                }
                break;
            case 42:
                {
                alt10=7;
                }
                break;
            case 43:
                {
                alt10=8;
                }
                break;
            case 44:
                {
                alt10=9;
                }
                break;
            case 45:
                {
                alt10=10;
                }
                break;
            case 46:
                {
                alt10=11;
                }
                break;
            case 47:
                {
                alt10=12;
                }
                break;
            case 48:
                {
                alt10=13;
                }
                break;
            case 49:
                {
                alt10=14;
                }
                break;
            case 50:
                {
                alt10=15;
                }
                break;
            case 51:
                {
                alt10=16;
                }
                break;
            case 52:
                {
                alt10=17;
                }
                break;
            case 53:
                {
                alt10=18;
                }
                break;
            case 34:
                {
                alt10=19;
                }
                break;
            case 35:
                {
                alt10=20;
                }
                break;
            case 54:
                {
                alt10=21;
                }
                break;
            case 55:
                {
                alt10=22;
                }
                break;
            case 36:
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
                    // InternalXContext.g:916:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:916:2: ( 'BOOL' )
                    // InternalXContext.g:917:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,33,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:922:2: ( 'FALSE' )
                    {
                    // InternalXContext.g:922:2: ( 'FALSE' )
                    // InternalXContext.g:923:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,37,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:928:2: ( 'TRUE' )
                    {
                    // InternalXContext.g:928:2: ( 'TRUE' )
                    // InternalXContext.g:929:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,38,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:934:2: ( 'bool' )
                    {
                    // InternalXContext.g:934:2: ( 'bool' )
                    // InternalXContext.g:935:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,39,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:940:2: ( 'card' )
                    {
                    // InternalXContext.g:940:2: ( 'card' )
                    // InternalXContext.g:941:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,40,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:946:2: ( 'dom' )
                    {
                    // InternalXContext.g:946:2: ( 'dom' )
                    // InternalXContext.g:947:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,41,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:952:2: ( 'finite' )
                    {
                    // InternalXContext.g:952:2: ( 'finite' )
                    // InternalXContext.g:953:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,42,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:958:2: ( 'id' )
                    {
                    // InternalXContext.g:958:2: ( 'id' )
                    // InternalXContext.g:959:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,43,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:964:2: ( 'inter' )
                    {
                    // InternalXContext.g:964:2: ( 'inter' )
                    // InternalXContext.g:965:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,44,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:970:2: ( 'max' )
                    {
                    // InternalXContext.g:970:2: ( 'max' )
                    // InternalXContext.g:971:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,45,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:976:2: ( 'min' )
                    {
                    // InternalXContext.g:976:2: ( 'min' )
                    // InternalXContext.g:977:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,46,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:982:2: ( 'mod' )
                    {
                    // InternalXContext.g:982:2: ( 'mod' )
                    // InternalXContext.g:983:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,47,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:988:2: ( 'pred' )
                    {
                    // InternalXContext.g:988:2: ( 'pred' )
                    // InternalXContext.g:989:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,48,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:994:2: ( 'prj1' )
                    {
                    // InternalXContext.g:994:2: ( 'prj1' )
                    // InternalXContext.g:995:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,49,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1000:2: ( 'prj2' )
                    {
                    // InternalXContext.g:1000:2: ( 'prj2' )
                    // InternalXContext.g:1001:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,50,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1006:2: ( 'ran' )
                    {
                    // InternalXContext.g:1006:2: ( 'ran' )
                    // InternalXContext.g:1007:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,51,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1012:2: ( 'succ' )
                    {
                    // InternalXContext.g:1012:2: ( 'succ' )
                    // InternalXContext.g:1013:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,52,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1018:2: ( 'union' )
                    {
                    // InternalXContext.g:1018:2: ( 'union' )
                    // InternalXContext.g:1019:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,53,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1024:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:1024:2: ( '\\u21151' )
                    // InternalXContext.g:1025:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,34,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1030:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:1030:2: ( '\\u2115' )
                    // InternalXContext.g:1031:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,35,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1036:2: ( '\\u21191' )
                    {
                    // InternalXContext.g:1036:2: ( '\\u21191' )
                    // InternalXContext.g:1037:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,54,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1042:2: ( '\\u2119' )
                    {
                    // InternalXContext.g:1042:2: ( '\\u2119' )
                    // InternalXContext.g:1043:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,55,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1048:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:1048:2: ( '\\u2124' )
                    // InternalXContext.g:1049:3: '\\u2124'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    match(input,36,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:1058:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1062:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt11=31;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 58:
                {
                alt11=3;
                }
                break;
            case 59:
                {
                alt11=4;
                }
                break;
            case 60:
                {
                alt11=5;
                }
                break;
            case 61:
                {
                alt11=6;
                }
                break;
            case 62:
                {
                alt11=7;
                }
                break;
            case 63:
                {
                alt11=8;
                }
                break;
            case 64:
                {
                alt11=9;
                }
                break;
            case 65:
                {
                alt11=10;
                }
                break;
            case 66:
                {
                alt11=11;
                }
                break;
            case 67:
                {
                alt11=12;
                }
                break;
            case 68:
                {
                alt11=13;
                }
                break;
            case 69:
                {
                alt11=14;
                }
                break;
            case 70:
                {
                alt11=15;
                }
                break;
            case 71:
                {
                alt11=16;
                }
                break;
            case 72:
                {
                alt11=17;
                }
                break;
            case 73:
                {
                alt11=18;
                }
                break;
            case 74:
                {
                alt11=19;
                }
                break;
            case 75:
                {
                alt11=20;
                }
                break;
            case 76:
                {
                alt11=21;
                }
                break;
            case 77:
                {
                alt11=22;
                }
                break;
            case 78:
                {
                alt11=23;
                }
                break;
            case 79:
                {
                alt11=24;
                }
                break;
            case 80:
                {
                alt11=25;
                }
                break;
            case 81:
                {
                alt11=26;
                }
                break;
            case 82:
                {
                alt11=27;
                }
                break;
            case 83:
                {
                alt11=28;
                }
                break;
            case 84:
                {
                alt11=29;
                }
                break;
            case 85:
                {
                alt11=30;
                }
                break;
            case 86:
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
                    // InternalXContext.g:1063:2: ( '(' )
                    {
                    // InternalXContext.g:1063:2: ( '(' )
                    // InternalXContext.g:1064:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,56,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1069:2: ( ')' )
                    {
                    // InternalXContext.g:1069:2: ( ')' )
                    // InternalXContext.g:1070:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,57,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1075:2: ( '\\u21D4' )
                    {
                    // InternalXContext.g:1075:2: ( '\\u21D4' )
                    // InternalXContext.g:1076:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,58,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:1081:2: ( '\\u21D2' )
                    {
                    // InternalXContext.g:1081:2: ( '\\u21D2' )
                    // InternalXContext.g:1082:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,59,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:1087:2: ( '\\u2227' )
                    {
                    // InternalXContext.g:1087:2: ( '\\u2227' )
                    // InternalXContext.g:1088:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,60,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:1093:2: ( '&' )
                    {
                    // InternalXContext.g:1093:2: ( '&' )
                    // InternalXContext.g:1094:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,61,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1099:2: ( '\\u2228' )
                    {
                    // InternalXContext.g:1099:2: ( '\\u2228' )
                    // InternalXContext.g:1100:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,62,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1105:2: ( '\\u00AC' )
                    {
                    // InternalXContext.g:1105:2: ( '\\u00AC' )
                    // InternalXContext.g:1106:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,63,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:1111:2: ( '\\u22A4' )
                    {
                    // InternalXContext.g:1111:2: ( '\\u22A4' )
                    // InternalXContext.g:1112:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,64,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:1117:2: ( '\\u22A5' )
                    {
                    // InternalXContext.g:1117:2: ( '\\u22A5' )
                    // InternalXContext.g:1118:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,65,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:1123:2: ( '\\u2200' )
                    {
                    // InternalXContext.g:1123:2: ( '\\u2200' )
                    // InternalXContext.g:1124:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,66,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:1129:2: ( '!' )
                    {
                    // InternalXContext.g:1129:2: ( '!' )
                    // InternalXContext.g:1130:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,67,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:1135:2: ( '\\u2203' )
                    {
                    // InternalXContext.g:1135:2: ( '\\u2203' )
                    // InternalXContext.g:1136:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,68,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:1141:2: ( '#' )
                    {
                    // InternalXContext.g:1141:2: ( '#' )
                    // InternalXContext.g:1142:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,69,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1147:2: ( ',' )
                    {
                    // InternalXContext.g:1147:2: ( ',' )
                    // InternalXContext.g:1148:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,70,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1153:2: ( '\\u00B7' )
                    {
                    // InternalXContext.g:1153:2: ( '\\u00B7' )
                    // InternalXContext.g:1154:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,71,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1159:2: ( '.' )
                    {
                    // InternalXContext.g:1159:2: ( '.' )
                    // InternalXContext.g:1160:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,72,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1165:2: ( '=' )
                    {
                    // InternalXContext.g:1165:2: ( '=' )
                    // InternalXContext.g:1166:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,73,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1171:2: ( '\\u2260' )
                    {
                    // InternalXContext.g:1171:2: ( '\\u2260' )
                    // InternalXContext.g:1172:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,74,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1177:2: ( '\\u2264' )
                    {
                    // InternalXContext.g:1177:2: ( '\\u2264' )
                    // InternalXContext.g:1178:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,75,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1183:2: ( '<' )
                    {
                    // InternalXContext.g:1183:2: ( '<' )
                    // InternalXContext.g:1184:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,76,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1189:2: ( '\\u2265' )
                    {
                    // InternalXContext.g:1189:2: ( '\\u2265' )
                    // InternalXContext.g:1190:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,77,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1195:2: ( '>' )
                    {
                    // InternalXContext.g:1195:2: ( '>' )
                    // InternalXContext.g:1196:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,78,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1201:2: ( '\\u2208' )
                    {
                    // InternalXContext.g:1201:2: ( '\\u2208' )
                    // InternalXContext.g:1202:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,79,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1207:2: ( ':' )
                    {
                    // InternalXContext.g:1207:2: ( ':' )
                    // InternalXContext.g:1208:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,80,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1213:2: ( '\\u2209' )
                    {
                    // InternalXContext.g:1213:2: ( '\\u2209' )
                    // InternalXContext.g:1214:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,81,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1219:2: ( '\\u2282' )
                    {
                    // InternalXContext.g:1219:2: ( '\\u2282' )
                    // InternalXContext.g:1220:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,82,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1225:2: ( '\\u2284' )
                    {
                    // InternalXContext.g:1225:2: ( '\\u2284' )
                    // InternalXContext.g:1226:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,83,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1231:2: ( '\\u2286' )
                    {
                    // InternalXContext.g:1231:2: ( '\\u2286' )
                    // InternalXContext.g:1232:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,84,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1237:2: ( '\\u2288' )
                    {
                    // InternalXContext.g:1237:2: ( '\\u2288' )
                    // InternalXContext.g:1238:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,85,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1243:2: ( 'partition' )
                    {
                    // InternalXContext.g:1243:2: ( 'partition' )
                    // InternalXContext.g:1244:3: 'partition'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    match(input,86,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:1253:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1257:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt12=45;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 22:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            case 25:
                {
                alt12=5;
                }
                break;
            case 26:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 28:
                {
                alt12=8;
                }
                break;
            case 29:
                {
                alt12=9;
                }
                break;
            case 30:
                {
                alt12=10;
                }
                break;
            case 31:
                {
                alt12=11;
                }
                break;
            case 87:
                {
                alt12=12;
                }
                break;
            case 88:
                {
                alt12=13;
                }
                break;
            case 89:
                {
                alt12=14;
                }
                break;
            case 90:
                {
                alt12=15;
                }
                break;
            case 91:
                {
                alt12=16;
                }
                break;
            case 92:
                {
                alt12=17;
                }
                break;
            case 93:
                {
                alt12=18;
                }
                break;
            case 32:
                {
                alt12=19;
                }
                break;
            case 94:
                {
                alt12=20;
                }
                break;
            case 95:
                {
                alt12=21;
                }
                break;
            case 96:
                {
                alt12=22;
                }
                break;
            case 97:
                {
                alt12=23;
                }
                break;
            case 98:
                {
                alt12=24;
                }
                break;
            case 99:
                {
                alt12=25;
                }
                break;
            case 100:
                {
                alt12=26;
                }
                break;
            case 101:
                {
                alt12=27;
                }
                break;
            case 102:
                {
                alt12=28;
                }
                break;
            case 103:
                {
                alt12=29;
                }
                break;
            case 104:
                {
                alt12=30;
                }
                break;
            case 105:
                {
                alt12=31;
                }
                break;
            case 106:
                {
                alt12=32;
                }
                break;
            case 129:
                {
                alt12=33;
                }
                break;
            case 107:
                {
                alt12=34;
                }
                break;
            case 108:
                {
                alt12=35;
                }
                break;
            case 109:
                {
                alt12=36;
                }
                break;
            case 110:
                {
                alt12=37;
                }
                break;
            case 111:
                {
                alt12=38;
                }
                break;
            case 112:
                {
                alt12=39;
                }
                break;
            case 113:
                {
                alt12=40;
                }
                break;
            case 114:
                {
                alt12=41;
                }
                break;
            case 115:
                {
                alt12=42;
                }
                break;
            case 116:
                {
                alt12=43;
                }
                break;
            case 117:
                {
                alt12=44;
                }
                break;
            case 118:
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
                    // InternalXContext.g:1258:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:1258:2: ( '\\u2194' )
                    // InternalXContext.g:1259:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1264:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:1264:2: ( '\\uE100' )
                    // InternalXContext.g:1265:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1270:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:1270:2: ( '\\uE101' )
                    // InternalXContext.g:1271:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,23,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:1276:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:1276:2: ( '\\uE102' )
                    // InternalXContext.g:1277:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,24,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:1282:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:1282:2: ( '\\u21F8' )
                    // InternalXContext.g:1283:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,25,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:1288:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:1288:2: ( '\\u2192' )
                    // InternalXContext.g:1289:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,26,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1294:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:1294:2: ( '\\u2914' )
                    // InternalXContext.g:1295:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,27,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1300:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:1300:2: ( '\\u21A3' )
                    // InternalXContext.g:1301:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,28,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:1306:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:1306:2: ( '\\u2900' )
                    // InternalXContext.g:1307:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,29,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:1312:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:1312:2: ( '\\u21A0' )
                    // InternalXContext.g:1313:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,30,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:1318:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:1318:2: ( '\\u2916' )
                    // InternalXContext.g:1319:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,31,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:1324:2: ( '{' )
                    {
                    // InternalXContext.g:1324:2: ( '{' )
                    // InternalXContext.g:1325:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,87,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:1330:2: ( '}' )
                    {
                    // InternalXContext.g:1330:2: ( '}' )
                    // InternalXContext.g:1331:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,88,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:1336:2: ( '\\u21A6' )
                    {
                    // InternalXContext.g:1336:2: ( '\\u21A6' )
                    // InternalXContext.g:1337:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,89,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1342:2: ( '\\u2205' )
                    {
                    // InternalXContext.g:1342:2: ( '\\u2205' )
                    // InternalXContext.g:1343:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,90,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1348:2: ( '\\u2229' )
                    {
                    // InternalXContext.g:1348:2: ( '\\u2229' )
                    // InternalXContext.g:1349:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,91,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1354:2: ( '\\u222A' )
                    {
                    // InternalXContext.g:1354:2: ( '\\u222A' )
                    // InternalXContext.g:1355:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,92,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1360:2: ( '\\u2216' )
                    {
                    // InternalXContext.g:1360:2: ( '\\u2216' )
                    // InternalXContext.g:1361:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,93,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1366:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:1366:2: ( '\\u00D7' )
                    // InternalXContext.g:1367:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,32,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1372:2: ( '[' )
                    {
                    // InternalXContext.g:1372:2: ( '[' )
                    // InternalXContext.g:1373:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,94,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1378:2: ( ']' )
                    {
                    // InternalXContext.g:1378:2: ( ']' )
                    // InternalXContext.g:1379:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,95,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1384:2: ( '\\uE103' )
                    {
                    // InternalXContext.g:1384:2: ( '\\uE103' )
                    // InternalXContext.g:1385:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,96,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1390:2: ( '\\u2218' )
                    {
                    // InternalXContext.g:1390:2: ( '\\u2218' )
                    // InternalXContext.g:1391:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,97,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1396:2: ( ';' )
                    {
                    // InternalXContext.g:1396:2: ( ';' )
                    // InternalXContext.g:1397:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,98,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1402:2: ( '\\u2297' )
                    {
                    // InternalXContext.g:1402:2: ( '\\u2297' )
                    // InternalXContext.g:1403:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,99,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1408:2: ( '\\u2225' )
                    {
                    // InternalXContext.g:1408:2: ( '\\u2225' )
                    // InternalXContext.g:1409:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,100,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1414:2: ( '\\u223C' )
                    {
                    // InternalXContext.g:1414:2: ( '\\u223C' )
                    // InternalXContext.g:1415:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,101,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1420:2: ( '\\u25C1' )
                    {
                    // InternalXContext.g:1420:2: ( '\\u25C1' )
                    // InternalXContext.g:1421:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,102,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1426:2: ( '\\u2A64' )
                    {
                    // InternalXContext.g:1426:2: ( '\\u2A64' )
                    // InternalXContext.g:1427:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,103,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1432:2: ( '\\u25B7' )
                    {
                    // InternalXContext.g:1432:2: ( '\\u25B7' )
                    // InternalXContext.g:1433:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,104,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1438:2: ( '\\u2A65' )
                    {
                    // InternalXContext.g:1438:2: ( '\\u2A65' )
                    // InternalXContext.g:1439:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,105,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalXContext.g:1444:2: ( '\\u03BB' )
                    {
                    // InternalXContext.g:1444:2: ( '\\u03BB' )
                    // InternalXContext.g:1445:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,106,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalXContext.g:1450:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXContext.g:1450:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXContext.g:1451:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalXContext.g:1452:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXContext.g:1452:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXContext.g:1456:2: ( '\\u22C3' )
                    {
                    // InternalXContext.g:1456:2: ( '\\u22C3' )
                    // InternalXContext.g:1457:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,107,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalXContext.g:1462:2: ( '\\u2223' )
                    {
                    // InternalXContext.g:1462:2: ( '\\u2223' )
                    // InternalXContext.g:1463:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,108,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalXContext.g:1468:2: ( '\\u2025' )
                    {
                    // InternalXContext.g:1468:2: ( '\\u2025' )
                    // InternalXContext.g:1469:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,109,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalXContext.g:1474:2: ( '+' )
                    {
                    // InternalXContext.g:1474:2: ( '+' )
                    // InternalXContext.g:1475:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,110,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalXContext.g:1480:2: ( '\\u2212' )
                    {
                    // InternalXContext.g:1480:2: ( '\\u2212' )
                    // InternalXContext.g:1481:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,111,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalXContext.g:1486:2: ( '-' )
                    {
                    // InternalXContext.g:1486:2: ( '-' )
                    // InternalXContext.g:1487:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,112,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalXContext.g:1492:2: ( '\\u2217' )
                    {
                    // InternalXContext.g:1492:2: ( '\\u2217' )
                    // InternalXContext.g:1493:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,113,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalXContext.g:1498:2: ( '*' )
                    {
                    // InternalXContext.g:1498:2: ( '*' )
                    // InternalXContext.g:1499:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,114,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalXContext.g:1504:2: ( '\\u00F7' )
                    {
                    // InternalXContext.g:1504:2: ( '\\u00F7' )
                    // InternalXContext.g:1505:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,115,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalXContext.g:1510:2: ( '/' )
                    {
                    // InternalXContext.g:1510:2: ( '/' )
                    // InternalXContext.g:1511:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,116,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalXContext.g:1516:2: ( '^' )
                    {
                    // InternalXContext.g:1516:2: ( '^' )
                    // InternalXContext.g:1517:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,117,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalXContext.g:1522:2: ( '\\\\' )
                    {
                    // InternalXContext.g:1522:2: ( '\\\\' )
                    // InternalXContext.g:1523:3: '\\\\'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    match(input,118,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:1532:1: rule__XRecord__Alternatives_5 : ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) );
    public final void rule__XRecord__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1536:1: ( ( ( rule__XRecord__Group_5_0__0 ) ) | ( ( rule__XRecord__Group_5_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==133) ) {
                alt13=1;
            }
            else if ( (LA13_0==134) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXContext.g:1537:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    {
                    // InternalXContext.g:1537:2: ( ( rule__XRecord__Group_5_0__0 ) )
                    // InternalXContext.g:1538:3: ( rule__XRecord__Group_5_0__0 )
                    {
                     before(grammarAccess.getXRecordAccess().getGroup_5_0()); 
                    // InternalXContext.g:1539:3: ( rule__XRecord__Group_5_0__0 )
                    // InternalXContext.g:1539:4: rule__XRecord__Group_5_0__0
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
                    // InternalXContext.g:1543:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    {
                    // InternalXContext.g:1543:2: ( ( rule__XRecord__Group_5_1__0 ) )
                    // InternalXContext.g:1544:3: ( rule__XRecord__Group_5_1__0 )
                    {
                     before(grammarAccess.getXRecordAccess().getGroup_5_1()); 
                    // InternalXContext.g:1545:3: ( rule__XRecord__Group_5_1__0 )
                    // InternalXContext.g:1545:4: rule__XRecord__Group_5_1__0
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
    // InternalXContext.g:1553:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1557:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=33 && LA14_0<=55)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXContext.g:1558:2: ( RULE_ID )
                    {
                    // InternalXContext.g:1558:2: ( RULE_ID )
                    // InternalXContext.g:1559:3: RULE_ID
                    {
                     before(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1564:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:1564:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:1565:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
    // InternalXContext.g:1574:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1578:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt15=1;
                }
                break;
            case 120:
                {
                alt15=2;
                }
                break;
            case 121:
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
                    // InternalXContext.g:1579:2: ( ( 'one' ) )
                    {
                    // InternalXContext.g:1579:2: ( ( 'one' ) )
                    // InternalXContext.g:1580:3: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    // InternalXContext.g:1581:3: ( 'one' )
                    // InternalXContext.g:1581:4: 'one'
                    {
                    match(input,119,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1585:2: ( ( 'many' ) )
                    {
                    // InternalXContext.g:1585:2: ( ( 'many' ) )
                    // InternalXContext.g:1586:3: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    // InternalXContext.g:1587:3: ( 'many' )
                    // InternalXContext.g:1587:4: 'many'
                    {
                    match(input,120,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1591:2: ( ( 'opt' ) )
                    {
                    // InternalXContext.g:1591:2: ( ( 'opt' ) )
                    // InternalXContext.g:1592:3: ( 'opt' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    // InternalXContext.g:1593:3: ( 'opt' )
                    // InternalXContext.g:1593:4: 'opt'
                    {
                    match(input,121,FollowSets000.FOLLOW_2); 

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
    // InternalXContext.g:1601:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1605:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:1606:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:1613:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1617:1: ( ( () ) )
            // InternalXContext.g:1618:1: ( () )
            {
            // InternalXContext.g:1618:1: ( () )
            // InternalXContext.g:1619:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:1620:2: ()
            // InternalXContext.g:1620:3: 
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
    // InternalXContext.g:1628:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1632:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:1633:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:1640:1: rule__XContext__Group__1__Impl : ( ( rule__XContext__CommentAssignment_1 )? ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1644:1: ( ( ( rule__XContext__CommentAssignment_1 )? ) )
            // InternalXContext.g:1645:1: ( ( rule__XContext__CommentAssignment_1 )? )
            {
            // InternalXContext.g:1645:1: ( ( rule__XContext__CommentAssignment_1 )? )
            // InternalXContext.g:1646:2: ( rule__XContext__CommentAssignment_1 )?
            {
             before(grammarAccess.getXContextAccess().getCommentAssignment_1()); 
            // InternalXContext.g:1647:2: ( rule__XContext__CommentAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXContext.g:1647:3: rule__XContext__CommentAssignment_1
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
    // InternalXContext.g:1655:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1659:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:1660:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:1667:1: rule__XContext__Group__2__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1671:1: ( ( 'context' ) )
            // InternalXContext.g:1672:1: ( 'context' )
            {
            // InternalXContext.g:1672:1: ( 'context' )
            // InternalXContext.g:1673:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_2()); 
            match(input,122,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:1682:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1686:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:1687:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:1694:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__NameAssignment_3 ) ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1698:1: ( ( ( rule__XContext__NameAssignment_3 ) ) )
            // InternalXContext.g:1699:1: ( ( rule__XContext__NameAssignment_3 ) )
            {
            // InternalXContext.g:1699:1: ( ( rule__XContext__NameAssignment_3 ) )
            // InternalXContext.g:1700:2: ( rule__XContext__NameAssignment_3 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_3()); 
            // InternalXContext.g:1701:2: ( rule__XContext__NameAssignment_3 )
            // InternalXContext.g:1701:3: rule__XContext__NameAssignment_3
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
    // InternalXContext.g:1709:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1713:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:1714:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:1721:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Alternatives_4 )* ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1725:1: ( ( ( rule__XContext__Alternatives_4 )* ) )
            // InternalXContext.g:1726:1: ( ( rule__XContext__Alternatives_4 )* )
            {
            // InternalXContext.g:1726:1: ( ( rule__XContext__Alternatives_4 )* )
            // InternalXContext.g:1727:2: ( rule__XContext__Alternatives_4 )*
            {
             before(grammarAccess.getXContextAccess().getAlternatives_4()); 
            // InternalXContext.g:1728:2: ( rule__XContext__Alternatives_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING||(LA17_0>=13 && LA17_0<=20)||(LA17_0>=124 && LA17_0<=128)||LA17_0==131||LA17_0==135) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXContext.g:1728:3: rule__XContext__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__XContext__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalXContext.g:1736:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1740:1: ( rule__XContext__Group__5__Impl )
            // InternalXContext.g:1741:2: rule__XContext__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group__5__Impl();

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
    // InternalXContext.g:1747:1: rule__XContext__Group__5__Impl : ( ( 'end' )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1751:1: ( ( ( 'end' )? ) )
            // InternalXContext.g:1752:1: ( ( 'end' )? )
            {
            // InternalXContext.g:1752:1: ( ( 'end' )? )
            // InternalXContext.g:1753:2: ( 'end' )?
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_5()); 
            // InternalXContext.g:1754:2: ( 'end' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==123) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXContext.g:1754:3: 'end'
                    {
                    match(input,123,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getEndKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__Group_4_0__0"
    // InternalXContext.g:1763:1: rule__XContext__Group_4_0__0 : rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1 ;
    public final void rule__XContext__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1767:1: ( rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1 )
            // InternalXContext.g:1768:2: rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XContext__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_0__1();

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
    // $ANTLR end "rule__XContext__Group_4_0__0"


    // $ANTLR start "rule__XContext__Group_4_0__0__Impl"
    // InternalXContext.g:1775:1: rule__XContext__Group_4_0__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1779:1: ( ( 'extends' ) )
            // InternalXContext.g:1780:1: ( 'extends' )
            {
            // InternalXContext.g:1780:1: ( 'extends' )
            // InternalXContext.g:1781:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_4_0_0()); 
            match(input,124,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getExtendsKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_0__0__Impl"


    // $ANTLR start "rule__XContext__Group_4_0__1"
    // InternalXContext.g:1790:1: rule__XContext__Group_4_0__1 : rule__XContext__Group_4_0__1__Impl ;
    public final void rule__XContext__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1794:1: ( rule__XContext__Group_4_0__1__Impl )
            // InternalXContext.g:1795:2: rule__XContext__Group_4_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4_0__1"


    // $ANTLR start "rule__XContext__Group_4_0__1__Impl"
    // InternalXContext.g:1801:1: rule__XContext__Group_4_0__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_4_0_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_0_1 )* ) ) ;
    public final void rule__XContext__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1805:1: ( ( ( ( rule__XContext__ExtendsAssignment_4_0_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_0_1 )* ) ) )
            // InternalXContext.g:1806:1: ( ( ( rule__XContext__ExtendsAssignment_4_0_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_0_1 )* ) )
            {
            // InternalXContext.g:1806:1: ( ( ( rule__XContext__ExtendsAssignment_4_0_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_0_1 )* ) )
            // InternalXContext.g:1807:2: ( ( rule__XContext__ExtendsAssignment_4_0_1 ) ) ( ( rule__XContext__ExtendsAssignment_4_0_1 )* )
            {
            // InternalXContext.g:1807:2: ( ( rule__XContext__ExtendsAssignment_4_0_1 ) )
            // InternalXContext.g:1808:3: ( rule__XContext__ExtendsAssignment_4_0_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_0_1()); 
            // InternalXContext.g:1809:3: ( rule__XContext__ExtendsAssignment_4_0_1 )
            // InternalXContext.g:1809:4: rule__XContext__ExtendsAssignment_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__XContext__ExtendsAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_0_1()); 

            }

            // InternalXContext.g:1812:2: ( ( rule__XContext__ExtendsAssignment_4_0_1 )* )
            // InternalXContext.g:1813:3: ( rule__XContext__ExtendsAssignment_4_0_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_0_1()); 
            // InternalXContext.g:1814:3: ( rule__XContext__ExtendsAssignment_4_0_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXContext.g:1814:4: rule__XContext__ExtendsAssignment_4_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__XContext__ExtendsAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_0__1__Impl"


    // $ANTLR start "rule__XContext__Group_4_1__0"
    // InternalXContext.g:1824:1: rule__XContext__Group_4_1__0 : rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1 ;
    public final void rule__XContext__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1828:1: ( rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1 )
            // InternalXContext.g:1829:2: rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XContext__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_1__1();

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
    // $ANTLR end "rule__XContext__Group_4_1__0"


    // $ANTLR start "rule__XContext__Group_4_1__0__Impl"
    // InternalXContext.g:1836:1: rule__XContext__Group_4_1__0__Impl : ( ( rule__XContext__Alternatives_4_1_0 ) ) ;
    public final void rule__XContext__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1840:1: ( ( ( rule__XContext__Alternatives_4_1_0 ) ) )
            // InternalXContext.g:1841:1: ( ( rule__XContext__Alternatives_4_1_0 ) )
            {
            // InternalXContext.g:1841:1: ( ( rule__XContext__Alternatives_4_1_0 ) )
            // InternalXContext.g:1842:2: ( rule__XContext__Alternatives_4_1_0 )
            {
             before(grammarAccess.getXContextAccess().getAlternatives_4_1_0()); 
            // InternalXContext.g:1843:2: ( rule__XContext__Alternatives_4_1_0 )
            // InternalXContext.g:1843:3: rule__XContext__Alternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Alternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_1__0__Impl"


    // $ANTLR start "rule__XContext__Group_4_1__1"
    // InternalXContext.g:1851:1: rule__XContext__Group_4_1__1 : rule__XContext__Group_4_1__1__Impl ;
    public final void rule__XContext__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1855:1: ( rule__XContext__Group_4_1__1__Impl )
            // InternalXContext.g:1856:2: rule__XContext__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4_1__1"


    // $ANTLR start "rule__XContext__Group_4_1__1__Impl"
    // InternalXContext.g:1862:1: rule__XContext__Group_4_1__1__Impl : ( ( rule__XContext__ExtendsAssignment_4_1_1 ) ) ;
    public final void rule__XContext__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1866:1: ( ( ( rule__XContext__ExtendsAssignment_4_1_1 ) ) )
            // InternalXContext.g:1867:1: ( ( rule__XContext__ExtendsAssignment_4_1_1 ) )
            {
            // InternalXContext.g:1867:1: ( ( rule__XContext__ExtendsAssignment_4_1_1 ) )
            // InternalXContext.g:1868:2: ( rule__XContext__ExtendsAssignment_4_1_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_4_1_1()); 
            // InternalXContext.g:1869:2: ( rule__XContext__ExtendsAssignment_4_1_1 )
            // InternalXContext.g:1869:3: rule__XContext__ExtendsAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__ExtendsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_1__1__Impl"


    // $ANTLR start "rule__XContext__Group_4_2__0"
    // InternalXContext.g:1878:1: rule__XContext__Group_4_2__0 : rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1 ;
    public final void rule__XContext__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1882:1: ( rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1 )
            // InternalXContext.g:1883:2: rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XContext__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_2__1();

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
    // $ANTLR end "rule__XContext__Group_4_2__0"


    // $ANTLR start "rule__XContext__Group_4_2__0__Impl"
    // InternalXContext.g:1890:1: rule__XContext__Group_4_2__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1894:1: ( ( 'sets' ) )
            // InternalXContext.g:1895:1: ( 'sets' )
            {
            // InternalXContext.g:1895:1: ( 'sets' )
            // InternalXContext.g:1896:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_4_2_0()); 
            match(input,125,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getSetsKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_2__0__Impl"


    // $ANTLR start "rule__XContext__Group_4_2__1"
    // InternalXContext.g:1905:1: rule__XContext__Group_4_2__1 : rule__XContext__Group_4_2__1__Impl ;
    public final void rule__XContext__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1909:1: ( rule__XContext__Group_4_2__1__Impl )
            // InternalXContext.g:1910:2: rule__XContext__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4_2__1"


    // $ANTLR start "rule__XContext__Group_4_2__1__Impl"
    // InternalXContext.g:1916:1: rule__XContext__Group_4_2__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* ) ) ;
    public final void rule__XContext__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1920:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* ) ) )
            // InternalXContext.g:1921:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* ) )
            {
            // InternalXContext.g:1921:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* ) )
            // InternalXContext.g:1922:2: ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* )
            {
            // InternalXContext.g:1922:2: ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) )
            // InternalXContext.g:1923:3: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 
            // InternalXContext.g:1924:3: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )
            // InternalXContext.g:1924:4: rule__XContext__OrderedChildrenAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XContext__OrderedChildrenAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 

            }

            // InternalXContext.g:1927:2: ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 )* )
            // InternalXContext.g:1928:3: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 
            // InternalXContext.g:1929:3: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )*
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
            	    // InternalXContext.g:1929:4: rule__XContext__OrderedChildrenAssignment_4_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__XContext__OrderedChildrenAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_2__1__Impl"


    // $ANTLR start "rule__XContext__Group_4_4__0"
    // InternalXContext.g:1939:1: rule__XContext__Group_4_4__0 : rule__XContext__Group_4_4__0__Impl rule__XContext__Group_4_4__1 ;
    public final void rule__XContext__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1943:1: ( rule__XContext__Group_4_4__0__Impl rule__XContext__Group_4_4__1 )
            // InternalXContext.g:1944:2: rule__XContext__Group_4_4__0__Impl rule__XContext__Group_4_4__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__XContext__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_4__1();

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
    // $ANTLR end "rule__XContext__Group_4_4__0"


    // $ANTLR start "rule__XContext__Group_4_4__0__Impl"
    // InternalXContext.g:1951:1: rule__XContext__Group_4_4__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1955:1: ( ( 'constants' ) )
            // InternalXContext.g:1956:1: ( 'constants' )
            {
            // InternalXContext.g:1956:1: ( 'constants' )
            // InternalXContext.g:1957:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_4_4_0()); 
            match(input,126,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantsKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_4__0__Impl"


    // $ANTLR start "rule__XContext__Group_4_4__1"
    // InternalXContext.g:1966:1: rule__XContext__Group_4_4__1 : rule__XContext__Group_4_4__1__Impl ;
    public final void rule__XContext__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1970:1: ( rule__XContext__Group_4_4__1__Impl )
            // InternalXContext.g:1971:2: rule__XContext__Group_4_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_4__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4_4__1"


    // $ANTLR start "rule__XContext__Group_4_4__1__Impl"
    // InternalXContext.g:1977:1: rule__XContext__Group_4_4__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* ) ) ;
    public final void rule__XContext__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1981:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* ) ) )
            // InternalXContext.g:1982:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* ) )
            {
            // InternalXContext.g:1982:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* ) )
            // InternalXContext.g:1983:2: ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* )
            {
            // InternalXContext.g:1983:2: ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 ) )
            // InternalXContext.g:1984:3: ( rule__XContext__OrderedChildrenAssignment_4_4_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4_1()); 
            // InternalXContext.g:1985:3: ( rule__XContext__OrderedChildrenAssignment_4_4_1 )
            // InternalXContext.g:1985:4: rule__XContext__OrderedChildrenAssignment_4_4_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XContext__OrderedChildrenAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4_1()); 

            }

            // InternalXContext.g:1988:2: ( ( rule__XContext__OrderedChildrenAssignment_4_4_1 )* )
            // InternalXContext.g:1989:3: ( rule__XContext__OrderedChildrenAssignment_4_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4_1()); 
            // InternalXContext.g:1990:3: ( rule__XContext__OrderedChildrenAssignment_4_4_1 )*
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
            	    // InternalXContext.g:1990:4: rule__XContext__OrderedChildrenAssignment_4_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__XContext__OrderedChildrenAssignment_4_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_4__1__Impl"


    // $ANTLR start "rule__XContext__Group_4_7__0"
    // InternalXContext.g:2000:1: rule__XContext__Group_4_7__0 : rule__XContext__Group_4_7__0__Impl rule__XContext__Group_4_7__1 ;
    public final void rule__XContext__Group_4_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2004:1: ( rule__XContext__Group_4_7__0__Impl rule__XContext__Group_4_7__1 )
            // InternalXContext.g:2005:2: rule__XContext__Group_4_7__0__Impl rule__XContext__Group_4_7__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__XContext__Group_4_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_7__1();

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
    // $ANTLR end "rule__XContext__Group_4_7__0"


    // $ANTLR start "rule__XContext__Group_4_7__0__Impl"
    // InternalXContext.g:2012:1: rule__XContext__Group_4_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_4_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2016:1: ( ( 'axioms' ) )
            // InternalXContext.g:2017:1: ( 'axioms' )
            {
            // InternalXContext.g:2017:1: ( 'axioms' )
            // InternalXContext.g:2018:2: 'axioms'
            {
             before(grammarAccess.getXContextAccess().getAxiomsKeyword_4_7_0()); 
            match(input,127,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getAxiomsKeyword_4_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_7__0__Impl"


    // $ANTLR start "rule__XContext__Group_4_7__1"
    // InternalXContext.g:2027:1: rule__XContext__Group_4_7__1 : rule__XContext__Group_4_7__1__Impl ;
    public final void rule__XContext__Group_4_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2031:1: ( rule__XContext__Group_4_7__1__Impl )
            // InternalXContext.g:2032:2: rule__XContext__Group_4_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XContext__Group_4_7__1__Impl();

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
    // $ANTLR end "rule__XContext__Group_4_7__1"


    // $ANTLR start "rule__XContext__Group_4_7__1__Impl"
    // InternalXContext.g:2038:1: rule__XContext__Group_4_7__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* ) ) ;
    public final void rule__XContext__Group_4_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2042:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* ) ) )
            // InternalXContext.g:2043:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* ) )
            {
            // InternalXContext.g:2043:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* ) )
            // InternalXContext.g:2044:2: ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* )
            {
            // InternalXContext.g:2044:2: ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 ) )
            // InternalXContext.g:2045:3: ( rule__XContext__OrderedChildrenAssignment_4_7_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_7_1()); 
            // InternalXContext.g:2046:3: ( rule__XContext__OrderedChildrenAssignment_4_7_1 )
            // InternalXContext.g:2046:4: rule__XContext__OrderedChildrenAssignment_4_7_1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__XContext__OrderedChildrenAssignment_4_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_7_1()); 

            }

            // InternalXContext.g:2049:2: ( ( rule__XContext__OrderedChildrenAssignment_4_7_1 )* )
            // InternalXContext.g:2050:3: ( rule__XContext__OrderedChildrenAssignment_4_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_7_1()); 
            // InternalXContext.g:2051:3: ( rule__XContext__OrderedChildrenAssignment_4_7_1 )*
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
            	    // InternalXContext.g:2051:4: rule__XContext__OrderedChildrenAssignment_4_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__XContext__OrderedChildrenAssignment_4_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_4_7__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXContext.g:2061:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2065:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:2066:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXContext.g:2073:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2077:1: ( ( RULE_ID ) )
            // InternalXContext.g:2078:1: ( RULE_ID )
            {
            // InternalXContext.g:2078:1: ( RULE_ID )
            // InternalXContext.g:2079:2: RULE_ID
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
    // InternalXContext.g:2088:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2092:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:2093:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:2099:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2103:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:2104:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:2104:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:2105:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:2106:2: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==72) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXContext.g:2106:3: rule__QualifiedName__Group_1__0
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
    // InternalXContext.g:2115:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2119:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:2120:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:2127:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2131:1: ( ( '.' ) )
            // InternalXContext.g:2132:1: ( '.' )
            {
            // InternalXContext.g:2132:1: ( '.' )
            // InternalXContext.g:2133:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,72,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:2142:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2146:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:2147:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:2153:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2157:1: ( ( RULE_ID ) )
            // InternalXContext.g:2158:1: ( RULE_ID )
            {
            // InternalXContext.g:2158:1: ( RULE_ID )
            // InternalXContext.g:2159:2: RULE_ID
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
    // InternalXContext.g:2169:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2173:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:2174:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
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
    // InternalXContext.g:2181:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2185:1: ( ( () ) )
            // InternalXContext.g:2186:1: ( () )
            {
            // InternalXContext.g:2186:1: ( () )
            // InternalXContext.g:2187:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:2188:2: ()
            // InternalXContext.g:2188:3: 
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
    // InternalXContext.g:2196:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2200:1: ( rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2 )
            // InternalXContext.g:2201:2: rule__XCarrierSet__Group__1__Impl rule__XCarrierSet__Group__2
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
    // InternalXContext.g:2208:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__CommentAssignment_1 )? ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2212:1: ( ( ( rule__XCarrierSet__CommentAssignment_1 )? ) )
            // InternalXContext.g:2213:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2213:1: ( ( rule__XCarrierSet__CommentAssignment_1 )? )
            // InternalXContext.g:2214:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            {
             before(grammarAccess.getXCarrierSetAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2215:2: ( rule__XCarrierSet__CommentAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXContext.g:2215:3: rule__XCarrierSet__CommentAssignment_1
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
    // InternalXContext.g:2223:1: rule__XCarrierSet__Group__2 : rule__XCarrierSet__Group__2__Impl ;
    public final void rule__XCarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2227:1: ( rule__XCarrierSet__Group__2__Impl )
            // InternalXContext.g:2228:2: rule__XCarrierSet__Group__2__Impl
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
    // InternalXContext.g:2234:1: rule__XCarrierSet__Group__2__Impl : ( ( rule__XCarrierSet__NameAssignment_2 ) ) ;
    public final void rule__XCarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2238:1: ( ( ( rule__XCarrierSet__NameAssignment_2 ) ) )
            // InternalXContext.g:2239:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            {
            // InternalXContext.g:2239:1: ( ( rule__XCarrierSet__NameAssignment_2 ) )
            // InternalXContext.g:2240:2: ( rule__XCarrierSet__NameAssignment_2 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_2()); 
            // InternalXContext.g:2241:2: ( rule__XCarrierSet__NameAssignment_2 )
            // InternalXContext.g:2241:3: rule__XCarrierSet__NameAssignment_2
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


    // $ANTLR start "rule__XIndividualCarrierSet__Group__0"
    // InternalXContext.g:2250:1: rule__XIndividualCarrierSet__Group__0 : rule__XIndividualCarrierSet__Group__0__Impl rule__XIndividualCarrierSet__Group__1 ;
    public final void rule__XIndividualCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2254:1: ( rule__XIndividualCarrierSet__Group__0__Impl rule__XIndividualCarrierSet__Group__1 )
            // InternalXContext.g:2255:2: rule__XIndividualCarrierSet__Group__0__Impl rule__XIndividualCarrierSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__XIndividualCarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__Group__1();

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
    // $ANTLR end "rule__XIndividualCarrierSet__Group__0"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__0__Impl"
    // InternalXContext.g:2262:1: rule__XIndividualCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2266:1: ( ( () ) )
            // InternalXContext.g:2267:1: ( () )
            {
            // InternalXContext.g:2267:1: ( () )
            // InternalXContext.g:2268:2: ()
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:2269:2: ()
            // InternalXContext.g:2269:3: 
            {
            }

             after(grammarAccess.getXIndividualCarrierSetAccess().getCarrierSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__Group__0__Impl"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__1"
    // InternalXContext.g:2277:1: rule__XIndividualCarrierSet__Group__1 : rule__XIndividualCarrierSet__Group__1__Impl rule__XIndividualCarrierSet__Group__2 ;
    public final void rule__XIndividualCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2281:1: ( rule__XIndividualCarrierSet__Group__1__Impl rule__XIndividualCarrierSet__Group__2 )
            // InternalXContext.g:2282:2: rule__XIndividualCarrierSet__Group__1__Impl rule__XIndividualCarrierSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__XIndividualCarrierSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__Group__2();

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
    // $ANTLR end "rule__XIndividualCarrierSet__Group__1"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__1__Impl"
    // InternalXContext.g:2289:1: rule__XIndividualCarrierSet__Group__1__Impl : ( ( rule__XIndividualCarrierSet__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2293:1: ( ( ( rule__XIndividualCarrierSet__CommentAssignment_1 )? ) )
            // InternalXContext.g:2294:1: ( ( rule__XIndividualCarrierSet__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2294:1: ( ( rule__XIndividualCarrierSet__CommentAssignment_1 )? )
            // InternalXContext.g:2295:2: ( rule__XIndividualCarrierSet__CommentAssignment_1 )?
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2296:2: ( rule__XIndividualCarrierSet__CommentAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXContext.g:2296:3: rule__XIndividualCarrierSet__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualCarrierSet__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualCarrierSetAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__Group__1__Impl"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__2"
    // InternalXContext.g:2304:1: rule__XIndividualCarrierSet__Group__2 : rule__XIndividualCarrierSet__Group__2__Impl rule__XIndividualCarrierSet__Group__3 ;
    public final void rule__XIndividualCarrierSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2308:1: ( rule__XIndividualCarrierSet__Group__2__Impl rule__XIndividualCarrierSet__Group__3 )
            // InternalXContext.g:2309:2: rule__XIndividualCarrierSet__Group__2__Impl rule__XIndividualCarrierSet__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XIndividualCarrierSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__Group__3();

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
    // $ANTLR end "rule__XIndividualCarrierSet__Group__2"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__2__Impl"
    // InternalXContext.g:2316:1: rule__XIndividualCarrierSet__Group__2__Impl : ( 'set' ) ;
    public final void rule__XIndividualCarrierSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2320:1: ( ( 'set' ) )
            // InternalXContext.g:2321:1: ( 'set' )
            {
            // InternalXContext.g:2321:1: ( 'set' )
            // InternalXContext.g:2322:2: 'set'
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getSetKeyword_2()); 
            match(input,128,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualCarrierSetAccess().getSetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__Group__2__Impl"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__3"
    // InternalXContext.g:2331:1: rule__XIndividualCarrierSet__Group__3 : rule__XIndividualCarrierSet__Group__3__Impl ;
    public final void rule__XIndividualCarrierSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2335:1: ( rule__XIndividualCarrierSet__Group__3__Impl )
            // InternalXContext.g:2336:2: rule__XIndividualCarrierSet__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__Group__3__Impl();

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
    // $ANTLR end "rule__XIndividualCarrierSet__Group__3"


    // $ANTLR start "rule__XIndividualCarrierSet__Group__3__Impl"
    // InternalXContext.g:2342:1: rule__XIndividualCarrierSet__Group__3__Impl : ( ( rule__XIndividualCarrierSet__NameAssignment_3 ) ) ;
    public final void rule__XIndividualCarrierSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2346:1: ( ( ( rule__XIndividualCarrierSet__NameAssignment_3 ) ) )
            // InternalXContext.g:2347:1: ( ( rule__XIndividualCarrierSet__NameAssignment_3 ) )
            {
            // InternalXContext.g:2347:1: ( ( rule__XIndividualCarrierSet__NameAssignment_3 ) )
            // InternalXContext.g:2348:2: ( rule__XIndividualCarrierSet__NameAssignment_3 )
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getNameAssignment_3()); 
            // InternalXContext.g:2349:2: ( rule__XIndividualCarrierSet__NameAssignment_3 )
            // InternalXContext.g:2349:3: rule__XIndividualCarrierSet__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualCarrierSet__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualCarrierSetAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__Group__3__Impl"


    // $ANTLR start "rule__XConstant__Group__0"
    // InternalXContext.g:2358:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2362:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:2363:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
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
    // InternalXContext.g:2370:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2374:1: ( ( () ) )
            // InternalXContext.g:2375:1: ( () )
            {
            // InternalXContext.g:2375:1: ( () )
            // InternalXContext.g:2376:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:2377:2: ()
            // InternalXContext.g:2377:3: 
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
    // InternalXContext.g:2385:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl rule__XConstant__Group__2 ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2389:1: ( rule__XConstant__Group__1__Impl rule__XConstant__Group__2 )
            // InternalXContext.g:2390:2: rule__XConstant__Group__1__Impl rule__XConstant__Group__2
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
    // InternalXContext.g:2397:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__CommentAssignment_1 )? ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2401:1: ( ( ( rule__XConstant__CommentAssignment_1 )? ) )
            // InternalXContext.g:2402:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2402:1: ( ( rule__XConstant__CommentAssignment_1 )? )
            // InternalXContext.g:2403:2: ( rule__XConstant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXConstantAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2404:2: ( rule__XConstant__CommentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXContext.g:2404:3: rule__XConstant__CommentAssignment_1
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
    // InternalXContext.g:2412:1: rule__XConstant__Group__2 : rule__XConstant__Group__2__Impl ;
    public final void rule__XConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2416:1: ( rule__XConstant__Group__2__Impl )
            // InternalXContext.g:2417:2: rule__XConstant__Group__2__Impl
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
    // InternalXContext.g:2423:1: rule__XConstant__Group__2__Impl : ( ( rule__XConstant__NameAssignment_2 ) ) ;
    public final void rule__XConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2427:1: ( ( ( rule__XConstant__NameAssignment_2 ) ) )
            // InternalXContext.g:2428:1: ( ( rule__XConstant__NameAssignment_2 ) )
            {
            // InternalXContext.g:2428:1: ( ( rule__XConstant__NameAssignment_2 ) )
            // InternalXContext.g:2429:2: ( rule__XConstant__NameAssignment_2 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_2()); 
            // InternalXContext.g:2430:2: ( rule__XConstant__NameAssignment_2 )
            // InternalXContext.g:2430:3: rule__XConstant__NameAssignment_2
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


    // $ANTLR start "rule__XIndividualConstant__Group__0"
    // InternalXContext.g:2439:1: rule__XIndividualConstant__Group__0 : rule__XIndividualConstant__Group__0__Impl rule__XIndividualConstant__Group__1 ;
    public final void rule__XIndividualConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2443:1: ( rule__XIndividualConstant__Group__0__Impl rule__XIndividualConstant__Group__1 )
            // InternalXContext.g:2444:2: rule__XIndividualConstant__Group__0__Impl rule__XIndividualConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XIndividualConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__1();

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
    // $ANTLR end "rule__XIndividualConstant__Group__0"


    // $ANTLR start "rule__XIndividualConstant__Group__0__Impl"
    // InternalXContext.g:2451:1: rule__XIndividualConstant__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2455:1: ( ( () ) )
            // InternalXContext.g:2456:1: ( () )
            {
            // InternalXContext.g:2456:1: ( () )
            // InternalXContext.g:2457:2: ()
            {
             before(grammarAccess.getXIndividualConstantAccess().getTypedConstantAction_0()); 
            // InternalXContext.g:2458:2: ()
            // InternalXContext.g:2458:3: 
            {
            }

             after(grammarAccess.getXIndividualConstantAccess().getTypedConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__0__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group__1"
    // InternalXContext.g:2466:1: rule__XIndividualConstant__Group__1 : rule__XIndividualConstant__Group__1__Impl rule__XIndividualConstant__Group__2 ;
    public final void rule__XIndividualConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2470:1: ( rule__XIndividualConstant__Group__1__Impl rule__XIndividualConstant__Group__2 )
            // InternalXContext.g:2471:2: rule__XIndividualConstant__Group__1__Impl rule__XIndividualConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__XIndividualConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__2();

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
    // $ANTLR end "rule__XIndividualConstant__Group__1"


    // $ANTLR start "rule__XIndividualConstant__Group__1__Impl"
    // InternalXContext.g:2478:1: rule__XIndividualConstant__Group__1__Impl : ( ( rule__XIndividualConstant__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2482:1: ( ( ( rule__XIndividualConstant__CommentAssignment_1 )? ) )
            // InternalXContext.g:2483:1: ( ( rule__XIndividualConstant__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2483:1: ( ( rule__XIndividualConstant__CommentAssignment_1 )? )
            // InternalXContext.g:2484:2: ( rule__XIndividualConstant__CommentAssignment_1 )?
            {
             before(grammarAccess.getXIndividualConstantAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2485:2: ( rule__XIndividualConstant__CommentAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXContext.g:2485:3: rule__XIndividualConstant__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualConstant__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualConstantAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__1__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group__2"
    // InternalXContext.g:2493:1: rule__XIndividualConstant__Group__2 : rule__XIndividualConstant__Group__2__Impl rule__XIndividualConstant__Group__3 ;
    public final void rule__XIndividualConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2497:1: ( rule__XIndividualConstant__Group__2__Impl rule__XIndividualConstant__Group__3 )
            // InternalXContext.g:2498:2: rule__XIndividualConstant__Group__2__Impl rule__XIndividualConstant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__XIndividualConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__3();

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
    // $ANTLR end "rule__XIndividualConstant__Group__2"


    // $ANTLR start "rule__XIndividualConstant__Group__2__Impl"
    // InternalXContext.g:2505:1: rule__XIndividualConstant__Group__2__Impl : ( ( rule__XIndividualConstant__Alternatives_2 ) ) ;
    public final void rule__XIndividualConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2509:1: ( ( ( rule__XIndividualConstant__Alternatives_2 ) ) )
            // InternalXContext.g:2510:1: ( ( rule__XIndividualConstant__Alternatives_2 ) )
            {
            // InternalXContext.g:2510:1: ( ( rule__XIndividualConstant__Alternatives_2 ) )
            // InternalXContext.g:2511:2: ( rule__XIndividualConstant__Alternatives_2 )
            {
             before(grammarAccess.getXIndividualConstantAccess().getAlternatives_2()); 
            // InternalXContext.g:2512:2: ( rule__XIndividualConstant__Alternatives_2 )
            // InternalXContext.g:2512:3: rule__XIndividualConstant__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualConstantAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__2__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group__3"
    // InternalXContext.g:2520:1: rule__XIndividualConstant__Group__3 : rule__XIndividualConstant__Group__3__Impl rule__XIndividualConstant__Group__4 ;
    public final void rule__XIndividualConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2524:1: ( rule__XIndividualConstant__Group__3__Impl rule__XIndividualConstant__Group__4 )
            // InternalXContext.g:2525:2: rule__XIndividualConstant__Group__3__Impl rule__XIndividualConstant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XIndividualConstant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__4();

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
    // $ANTLR end "rule__XIndividualConstant__Group__3"


    // $ANTLR start "rule__XIndividualConstant__Group__3__Impl"
    // InternalXContext.g:2532:1: rule__XIndividualConstant__Group__3__Impl : ( ( rule__XIndividualConstant__NameAssignment_3 ) ) ;
    public final void rule__XIndividualConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2536:1: ( ( ( rule__XIndividualConstant__NameAssignment_3 ) ) )
            // InternalXContext.g:2537:1: ( ( rule__XIndividualConstant__NameAssignment_3 ) )
            {
            // InternalXContext.g:2537:1: ( ( rule__XIndividualConstant__NameAssignment_3 ) )
            // InternalXContext.g:2538:2: ( rule__XIndividualConstant__NameAssignment_3 )
            {
             before(grammarAccess.getXIndividualConstantAccess().getNameAssignment_3()); 
            // InternalXContext.g:2539:2: ( rule__XIndividualConstant__NameAssignment_3 )
            // InternalXContext.g:2539:3: rule__XIndividualConstant__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualConstantAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__3__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group__4"
    // InternalXContext.g:2547:1: rule__XIndividualConstant__Group__4 : rule__XIndividualConstant__Group__4__Impl rule__XIndividualConstant__Group__5 ;
    public final void rule__XIndividualConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2551:1: ( rule__XIndividualConstant__Group__4__Impl rule__XIndividualConstant__Group__5 )
            // InternalXContext.g:2552:2: rule__XIndividualConstant__Group__4__Impl rule__XIndividualConstant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XIndividualConstant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__5();

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
    // $ANTLR end "rule__XIndividualConstant__Group__4"


    // $ANTLR start "rule__XIndividualConstant__Group__4__Impl"
    // InternalXContext.g:2559:1: rule__XIndividualConstant__Group__4__Impl : ( ( rule__XIndividualConstant__Group_4__0 )? ) ;
    public final void rule__XIndividualConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2563:1: ( ( ( rule__XIndividualConstant__Group_4__0 )? ) )
            // InternalXContext.g:2564:1: ( ( rule__XIndividualConstant__Group_4__0 )? )
            {
            // InternalXContext.g:2564:1: ( ( rule__XIndividualConstant__Group_4__0 )? )
            // InternalXContext.g:2565:2: ( rule__XIndividualConstant__Group_4__0 )?
            {
             before(grammarAccess.getXIndividualConstantAccess().getGroup_4()); 
            // InternalXContext.g:2566:2: ( rule__XIndividualConstant__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==80) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXContext.g:2566:3: rule__XIndividualConstant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualConstant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualConstantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__4__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group__5"
    // InternalXContext.g:2574:1: rule__XIndividualConstant__Group__5 : rule__XIndividualConstant__Group__5__Impl ;
    public final void rule__XIndividualConstant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2578:1: ( rule__XIndividualConstant__Group__5__Impl )
            // InternalXContext.g:2579:2: rule__XIndividualConstant__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group__5__Impl();

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
    // $ANTLR end "rule__XIndividualConstant__Group__5"


    // $ANTLR start "rule__XIndividualConstant__Group__5__Impl"
    // InternalXContext.g:2585:1: rule__XIndividualConstant__Group__5__Impl : ( ( rule__XIndividualConstant__Group_5__0 )? ) ;
    public final void rule__XIndividualConstant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2589:1: ( ( ( rule__XIndividualConstant__Group_5__0 )? ) )
            // InternalXContext.g:2590:1: ( ( rule__XIndividualConstant__Group_5__0 )? )
            {
            // InternalXContext.g:2590:1: ( ( rule__XIndividualConstant__Group_5__0 )? )
            // InternalXContext.g:2591:2: ( rule__XIndividualConstant__Group_5__0 )?
            {
             before(grammarAccess.getXIndividualConstantAccess().getGroup_5()); 
            // InternalXContext.g:2592:2: ( rule__XIndividualConstant__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==73) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXContext.g:2592:3: rule__XIndividualConstant__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualConstant__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualConstantAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group__5__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group_4__0"
    // InternalXContext.g:2601:1: rule__XIndividualConstant__Group_4__0 : rule__XIndividualConstant__Group_4__0__Impl rule__XIndividualConstant__Group_4__1 ;
    public final void rule__XIndividualConstant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2605:1: ( rule__XIndividualConstant__Group_4__0__Impl rule__XIndividualConstant__Group_4__1 )
            // InternalXContext.g:2606:2: rule__XIndividualConstant__Group_4__0__Impl rule__XIndividualConstant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__XIndividualConstant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group_4__1();

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
    // $ANTLR end "rule__XIndividualConstant__Group_4__0"


    // $ANTLR start "rule__XIndividualConstant__Group_4__0__Impl"
    // InternalXContext.g:2613:1: rule__XIndividualConstant__Group_4__0__Impl : ( ':' ) ;
    public final void rule__XIndividualConstant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2617:1: ( ( ':' ) )
            // InternalXContext.g:2618:1: ( ':' )
            {
            // InternalXContext.g:2618:1: ( ':' )
            // InternalXContext.g:2619:2: ':'
            {
             before(grammarAccess.getXIndividualConstantAccess().getColonKeyword_4_0()); 
            match(input,80,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualConstantAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group_4__0__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group_4__1"
    // InternalXContext.g:2628:1: rule__XIndividualConstant__Group_4__1 : rule__XIndividualConstant__Group_4__1__Impl ;
    public final void rule__XIndividualConstant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2632:1: ( rule__XIndividualConstant__Group_4__1__Impl )
            // InternalXContext.g:2633:2: rule__XIndividualConstant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group_4__1__Impl();

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
    // $ANTLR end "rule__XIndividualConstant__Group_4__1"


    // $ANTLR start "rule__XIndividualConstant__Group_4__1__Impl"
    // InternalXContext.g:2639:1: rule__XIndividualConstant__Group_4__1__Impl : ( ( rule__XIndividualConstant__TypeAssignment_4_1 ) ) ;
    public final void rule__XIndividualConstant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2643:1: ( ( ( rule__XIndividualConstant__TypeAssignment_4_1 ) ) )
            // InternalXContext.g:2644:1: ( ( rule__XIndividualConstant__TypeAssignment_4_1 ) )
            {
            // InternalXContext.g:2644:1: ( ( rule__XIndividualConstant__TypeAssignment_4_1 ) )
            // InternalXContext.g:2645:2: ( rule__XIndividualConstant__TypeAssignment_4_1 )
            {
             before(grammarAccess.getXIndividualConstantAccess().getTypeAssignment_4_1()); 
            // InternalXContext.g:2646:2: ( rule__XIndividualConstant__TypeAssignment_4_1 )
            // InternalXContext.g:2646:3: rule__XIndividualConstant__TypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualConstantAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group_4__1__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group_5__0"
    // InternalXContext.g:2655:1: rule__XIndividualConstant__Group_5__0 : rule__XIndividualConstant__Group_5__0__Impl rule__XIndividualConstant__Group_5__1 ;
    public final void rule__XIndividualConstant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2659:1: ( rule__XIndividualConstant__Group_5__0__Impl rule__XIndividualConstant__Group_5__1 )
            // InternalXContext.g:2660:2: rule__XIndividualConstant__Group_5__0__Impl rule__XIndividualConstant__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__XIndividualConstant__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group_5__1();

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
    // $ANTLR end "rule__XIndividualConstant__Group_5__0"


    // $ANTLR start "rule__XIndividualConstant__Group_5__0__Impl"
    // InternalXContext.g:2667:1: rule__XIndividualConstant__Group_5__0__Impl : ( '=' ) ;
    public final void rule__XIndividualConstant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2671:1: ( ( '=' ) )
            // InternalXContext.g:2672:1: ( '=' )
            {
            // InternalXContext.g:2672:1: ( '=' )
            // InternalXContext.g:2673:2: '='
            {
             before(grammarAccess.getXIndividualConstantAccess().getEqualsSignKeyword_5_0()); 
            match(input,73,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualConstantAccess().getEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group_5__0__Impl"


    // $ANTLR start "rule__XIndividualConstant__Group_5__1"
    // InternalXContext.g:2682:1: rule__XIndividualConstant__Group_5__1 : rule__XIndividualConstant__Group_5__1__Impl ;
    public final void rule__XIndividualConstant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2686:1: ( rule__XIndividualConstant__Group_5__1__Impl )
            // InternalXContext.g:2687:2: rule__XIndividualConstant__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__Group_5__1__Impl();

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
    // $ANTLR end "rule__XIndividualConstant__Group_5__1"


    // $ANTLR start "rule__XIndividualConstant__Group_5__1__Impl"
    // InternalXContext.g:2693:1: rule__XIndividualConstant__Group_5__1__Impl : ( ( rule__XIndividualConstant__ValueAssignment_5_1 ) ) ;
    public final void rule__XIndividualConstant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2697:1: ( ( ( rule__XIndividualConstant__ValueAssignment_5_1 ) ) )
            // InternalXContext.g:2698:1: ( ( rule__XIndividualConstant__ValueAssignment_5_1 ) )
            {
            // InternalXContext.g:2698:1: ( ( rule__XIndividualConstant__ValueAssignment_5_1 ) )
            // InternalXContext.g:2699:2: ( rule__XIndividualConstant__ValueAssignment_5_1 )
            {
             before(grammarAccess.getXIndividualConstantAccess().getValueAssignment_5_1()); 
            // InternalXContext.g:2700:2: ( rule__XIndividualConstant__ValueAssignment_5_1 )
            // InternalXContext.g:2700:3: rule__XIndividualConstant__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualConstant__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualConstantAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__Group_5__1__Impl"


    // $ANTLR start "rule__XAxiom__Group__0"
    // InternalXContext.g:2709:1: rule__XAxiom__Group__0 : rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 ;
    public final void rule__XAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2713:1: ( rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 )
            // InternalXContext.g:2714:2: rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1
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
    // InternalXContext.g:2721:1: rule__XAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2725:1: ( ( () ) )
            // InternalXContext.g:2726:1: ( () )
            {
            // InternalXContext.g:2726:1: ( () )
            // InternalXContext.g:2727:2: ()
            {
             before(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:2728:2: ()
            // InternalXContext.g:2728:3: 
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
    // InternalXContext.g:2736:1: rule__XAxiom__Group__1 : rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 ;
    public final void rule__XAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2740:1: ( rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 )
            // InternalXContext.g:2741:2: rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2
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
    // InternalXContext.g:2748:1: rule__XAxiom__Group__1__Impl : ( ( rule__XAxiom__CommentAssignment_1 )? ) ;
    public final void rule__XAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2752:1: ( ( ( rule__XAxiom__CommentAssignment_1 )? ) )
            // InternalXContext.g:2753:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2753:1: ( ( rule__XAxiom__CommentAssignment_1 )? )
            // InternalXContext.g:2754:2: ( rule__XAxiom__CommentAssignment_1 )?
            {
             before(grammarAccess.getXAxiomAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2755:2: ( rule__XAxiom__CommentAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXContext.g:2755:3: rule__XAxiom__CommentAssignment_1
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
    // InternalXContext.g:2763:1: rule__XAxiom__Group__2 : rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 ;
    public final void rule__XAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2767:1: ( rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 )
            // InternalXContext.g:2768:2: rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalXContext.g:2775:1: rule__XAxiom__Group__2__Impl : ( ( rule__XAxiom__NameAssignment_2 ) ) ;
    public final void rule__XAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2779:1: ( ( ( rule__XAxiom__NameAssignment_2 ) ) )
            // InternalXContext.g:2780:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            {
            // InternalXContext.g:2780:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            // InternalXContext.g:2781:2: ( rule__XAxiom__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomAccess().getNameAssignment_2()); 
            // InternalXContext.g:2782:2: ( rule__XAxiom__NameAssignment_2 )
            // InternalXContext.g:2782:3: rule__XAxiom__NameAssignment_2
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
    // InternalXContext.g:2790:1: rule__XAxiom__Group__3 : rule__XAxiom__Group__3__Impl ;
    public final void rule__XAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2794:1: ( rule__XAxiom__Group__3__Impl )
            // InternalXContext.g:2795:2: rule__XAxiom__Group__3__Impl
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
    // InternalXContext.g:2801:1: rule__XAxiom__Group__3__Impl : ( ( rule__XAxiom__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2805:1: ( ( ( rule__XAxiom__PredicateAssignment_3 ) ) )
            // InternalXContext.g:2806:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:2806:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            // InternalXContext.g:2807:2: ( rule__XAxiom__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:2808:2: ( rule__XAxiom__PredicateAssignment_3 )
            // InternalXContext.g:2808:3: rule__XAxiom__PredicateAssignment_3
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


    // $ANTLR start "rule__XIndividualAxiom__Group__0"
    // InternalXContext.g:2817:1: rule__XIndividualAxiom__Group__0 : rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1 ;
    public final void rule__XIndividualAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2821:1: ( rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1 )
            // InternalXContext.g:2822:2: rule__XIndividualAxiom__Group__0__Impl rule__XIndividualAxiom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalXContext.g:2829:1: rule__XIndividualAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2833:1: ( ( () ) )
            // InternalXContext.g:2834:1: ( () )
            {
            // InternalXContext.g:2834:1: ( () )
            // InternalXContext.g:2835:2: ()
            {
             before(grammarAccess.getXIndividualAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:2836:2: ()
            // InternalXContext.g:2836:3: 
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
    // InternalXContext.g:2844:1: rule__XIndividualAxiom__Group__1 : rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2 ;
    public final void rule__XIndividualAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2848:1: ( rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2 )
            // InternalXContext.g:2849:2: rule__XIndividualAxiom__Group__1__Impl rule__XIndividualAxiom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalXContext.g:2856:1: rule__XIndividualAxiom__Group__1__Impl : ( ( rule__XIndividualAxiom__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2860:1: ( ( ( rule__XIndividualAxiom__CommentAssignment_1 )? ) )
            // InternalXContext.g:2861:1: ( ( rule__XIndividualAxiom__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2861:1: ( ( rule__XIndividualAxiom__CommentAssignment_1 )? )
            // InternalXContext.g:2862:2: ( rule__XIndividualAxiom__CommentAssignment_1 )?
            {
             before(grammarAccess.getXIndividualAxiomAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2863:2: ( rule__XIndividualAxiom__CommentAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXContext.g:2863:3: rule__XIndividualAxiom__CommentAssignment_1
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
    // InternalXContext.g:2871:1: rule__XIndividualAxiom__Group__2 : rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3 ;
    public final void rule__XIndividualAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2875:1: ( rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3 )
            // InternalXContext.g:2876:2: rule__XIndividualAxiom__Group__2__Impl rule__XIndividualAxiom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalXContext.g:2883:1: rule__XIndividualAxiom__Group__2__Impl : ( ( rule__XIndividualAxiom__Alternatives_2 ) ) ;
    public final void rule__XIndividualAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2887:1: ( ( ( rule__XIndividualAxiom__Alternatives_2 ) ) )
            // InternalXContext.g:2888:1: ( ( rule__XIndividualAxiom__Alternatives_2 ) )
            {
            // InternalXContext.g:2888:1: ( ( rule__XIndividualAxiom__Alternatives_2 ) )
            // InternalXContext.g:2889:2: ( rule__XIndividualAxiom__Alternatives_2 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getAlternatives_2()); 
            // InternalXContext.g:2890:2: ( rule__XIndividualAxiom__Alternatives_2 )
            // InternalXContext.g:2890:3: rule__XIndividualAxiom__Alternatives_2
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
    // InternalXContext.g:2898:1: rule__XIndividualAxiom__Group__3 : rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4 ;
    public final void rule__XIndividualAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2902:1: ( rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4 )
            // InternalXContext.g:2903:2: rule__XIndividualAxiom__Group__3__Impl rule__XIndividualAxiom__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalXContext.g:2910:1: rule__XIndividualAxiom__Group__3__Impl : ( ( rule__XIndividualAxiom__NameAssignment_3 ) ) ;
    public final void rule__XIndividualAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2914:1: ( ( ( rule__XIndividualAxiom__NameAssignment_3 ) ) )
            // InternalXContext.g:2915:1: ( ( rule__XIndividualAxiom__NameAssignment_3 ) )
            {
            // InternalXContext.g:2915:1: ( ( rule__XIndividualAxiom__NameAssignment_3 ) )
            // InternalXContext.g:2916:2: ( rule__XIndividualAxiom__NameAssignment_3 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getNameAssignment_3()); 
            // InternalXContext.g:2917:2: ( rule__XIndividualAxiom__NameAssignment_3 )
            // InternalXContext.g:2917:3: rule__XIndividualAxiom__NameAssignment_3
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
    // InternalXContext.g:2925:1: rule__XIndividualAxiom__Group__4 : rule__XIndividualAxiom__Group__4__Impl ;
    public final void rule__XIndividualAxiom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2929:1: ( rule__XIndividualAxiom__Group__4__Impl )
            // InternalXContext.g:2930:2: rule__XIndividualAxiom__Group__4__Impl
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
    // InternalXContext.g:2936:1: rule__XIndividualAxiom__Group__4__Impl : ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualAxiom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2940:1: ( ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) ) )
            // InternalXContext.g:2941:1: ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) )
            {
            // InternalXContext.g:2941:1: ( ( rule__XIndividualAxiom__PredicateAssignment_4 ) )
            // InternalXContext.g:2942:2: ( rule__XIndividualAxiom__PredicateAssignment_4 )
            {
             before(grammarAccess.getXIndividualAxiomAccess().getPredicateAssignment_4()); 
            // InternalXContext.g:2943:2: ( rule__XIndividualAxiom__PredicateAssignment_4 )
            // InternalXContext.g:2943:3: rule__XIndividualAxiom__PredicateAssignment_4
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


    // $ANTLR start "rule__XIndividualTheorem__Group__0"
    // InternalXContext.g:2952:1: rule__XIndividualTheorem__Group__0 : rule__XIndividualTheorem__Group__0__Impl rule__XIndividualTheorem__Group__1 ;
    public final void rule__XIndividualTheorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2956:1: ( rule__XIndividualTheorem__Group__0__Impl rule__XIndividualTheorem__Group__1 )
            // InternalXContext.g:2957:2: rule__XIndividualTheorem__Group__0__Impl rule__XIndividualTheorem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XIndividualTheorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__1();

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
    // $ANTLR end "rule__XIndividualTheorem__Group__0"


    // $ANTLR start "rule__XIndividualTheorem__Group__0__Impl"
    // InternalXContext.g:2964:1: rule__XIndividualTheorem__Group__0__Impl : ( () ) ;
    public final void rule__XIndividualTheorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2968:1: ( ( () ) )
            // InternalXContext.g:2969:1: ( () )
            {
            // InternalXContext.g:2969:1: ( () )
            // InternalXContext.g:2970:2: ()
            {
             before(grammarAccess.getXIndividualTheoremAccess().getAxiomAction_0()); 
            // InternalXContext.g:2971:2: ()
            // InternalXContext.g:2971:3: 
            {
            }

             after(grammarAccess.getXIndividualTheoremAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__Group__0__Impl"


    // $ANTLR start "rule__XIndividualTheorem__Group__1"
    // InternalXContext.g:2979:1: rule__XIndividualTheorem__Group__1 : rule__XIndividualTheorem__Group__1__Impl rule__XIndividualTheorem__Group__2 ;
    public final void rule__XIndividualTheorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2983:1: ( rule__XIndividualTheorem__Group__1__Impl rule__XIndividualTheorem__Group__2 )
            // InternalXContext.g:2984:2: rule__XIndividualTheorem__Group__1__Impl rule__XIndividualTheorem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XIndividualTheorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__2();

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
    // $ANTLR end "rule__XIndividualTheorem__Group__1"


    // $ANTLR start "rule__XIndividualTheorem__Group__1__Impl"
    // InternalXContext.g:2991:1: rule__XIndividualTheorem__Group__1__Impl : ( ( rule__XIndividualTheorem__CommentAssignment_1 )? ) ;
    public final void rule__XIndividualTheorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2995:1: ( ( ( rule__XIndividualTheorem__CommentAssignment_1 )? ) )
            // InternalXContext.g:2996:1: ( ( rule__XIndividualTheorem__CommentAssignment_1 )? )
            {
            // InternalXContext.g:2996:1: ( ( rule__XIndividualTheorem__CommentAssignment_1 )? )
            // InternalXContext.g:2997:2: ( rule__XIndividualTheorem__CommentAssignment_1 )?
            {
             before(grammarAccess.getXIndividualTheoremAccess().getCommentAssignment_1()); 
            // InternalXContext.g:2998:2: ( rule__XIndividualTheorem__CommentAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXContext.g:2998:3: rule__XIndividualTheorem__CommentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XIndividualTheorem__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXIndividualTheoremAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__Group__1__Impl"


    // $ANTLR start "rule__XIndividualTheorem__Group__2"
    // InternalXContext.g:3006:1: rule__XIndividualTheorem__Group__2 : rule__XIndividualTheorem__Group__2__Impl rule__XIndividualTheorem__Group__3 ;
    public final void rule__XIndividualTheorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3010:1: ( rule__XIndividualTheorem__Group__2__Impl rule__XIndividualTheorem__Group__3 )
            // InternalXContext.g:3011:2: rule__XIndividualTheorem__Group__2__Impl rule__XIndividualTheorem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__XIndividualTheorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__3();

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
    // $ANTLR end "rule__XIndividualTheorem__Group__2"


    // $ANTLR start "rule__XIndividualTheorem__Group__2__Impl"
    // InternalXContext.g:3018:1: rule__XIndividualTheorem__Group__2__Impl : ( ( rule__XIndividualTheorem__TheoremAssignment_2 ) ) ;
    public final void rule__XIndividualTheorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3022:1: ( ( ( rule__XIndividualTheorem__TheoremAssignment_2 ) ) )
            // InternalXContext.g:3023:1: ( ( rule__XIndividualTheorem__TheoremAssignment_2 ) )
            {
            // InternalXContext.g:3023:1: ( ( rule__XIndividualTheorem__TheoremAssignment_2 ) )
            // InternalXContext.g:3024:2: ( rule__XIndividualTheorem__TheoremAssignment_2 )
            {
             before(grammarAccess.getXIndividualTheoremAccess().getTheoremAssignment_2()); 
            // InternalXContext.g:3025:2: ( rule__XIndividualTheorem__TheoremAssignment_2 )
            // InternalXContext.g:3025:3: rule__XIndividualTheorem__TheoremAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__TheoremAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualTheoremAccess().getTheoremAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__Group__2__Impl"


    // $ANTLR start "rule__XIndividualTheorem__Group__3"
    // InternalXContext.g:3033:1: rule__XIndividualTheorem__Group__3 : rule__XIndividualTheorem__Group__3__Impl rule__XIndividualTheorem__Group__4 ;
    public final void rule__XIndividualTheorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3037:1: ( rule__XIndividualTheorem__Group__3__Impl rule__XIndividualTheorem__Group__4 )
            // InternalXContext.g:3038:2: rule__XIndividualTheorem__Group__3__Impl rule__XIndividualTheorem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__XIndividualTheorem__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__4();

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
    // $ANTLR end "rule__XIndividualTheorem__Group__3"


    // $ANTLR start "rule__XIndividualTheorem__Group__3__Impl"
    // InternalXContext.g:3045:1: rule__XIndividualTheorem__Group__3__Impl : ( ( rule__XIndividualTheorem__NameAssignment_3 ) ) ;
    public final void rule__XIndividualTheorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3049:1: ( ( ( rule__XIndividualTheorem__NameAssignment_3 ) ) )
            // InternalXContext.g:3050:1: ( ( rule__XIndividualTheorem__NameAssignment_3 ) )
            {
            // InternalXContext.g:3050:1: ( ( rule__XIndividualTheorem__NameAssignment_3 ) )
            // InternalXContext.g:3051:2: ( rule__XIndividualTheorem__NameAssignment_3 )
            {
             before(grammarAccess.getXIndividualTheoremAccess().getNameAssignment_3()); 
            // InternalXContext.g:3052:2: ( rule__XIndividualTheorem__NameAssignment_3 )
            // InternalXContext.g:3052:3: rule__XIndividualTheorem__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualTheoremAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__Group__3__Impl"


    // $ANTLR start "rule__XIndividualTheorem__Group__4"
    // InternalXContext.g:3060:1: rule__XIndividualTheorem__Group__4 : rule__XIndividualTheorem__Group__4__Impl ;
    public final void rule__XIndividualTheorem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3064:1: ( rule__XIndividualTheorem__Group__4__Impl )
            // InternalXContext.g:3065:2: rule__XIndividualTheorem__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__Group__4__Impl();

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
    // $ANTLR end "rule__XIndividualTheorem__Group__4"


    // $ANTLR start "rule__XIndividualTheorem__Group__4__Impl"
    // InternalXContext.g:3071:1: rule__XIndividualTheorem__Group__4__Impl : ( ( rule__XIndividualTheorem__PredicateAssignment_4 ) ) ;
    public final void rule__XIndividualTheorem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3075:1: ( ( ( rule__XIndividualTheorem__PredicateAssignment_4 ) ) )
            // InternalXContext.g:3076:1: ( ( rule__XIndividualTheorem__PredicateAssignment_4 ) )
            {
            // InternalXContext.g:3076:1: ( ( rule__XIndividualTheorem__PredicateAssignment_4 ) )
            // InternalXContext.g:3077:2: ( rule__XIndividualTheorem__PredicateAssignment_4 )
            {
             before(grammarAccess.getXIndividualTheoremAccess().getPredicateAssignment_4()); 
            // InternalXContext.g:3078:2: ( rule__XIndividualTheorem__PredicateAssignment_4 )
            // InternalXContext.g:3078:3: rule__XIndividualTheorem__PredicateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__PredicateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualTheoremAccess().getPredicateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__Group__4__Impl"


    // $ANTLR start "rule__XType__Group__0"
    // InternalXContext.g:3087:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3091:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXContext.g:3092:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalXContext.g:3099:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3103:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:3104:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:3104:1: ( ruleXTypePrimitive )
            // InternalXContext.g:3105:2: ruleXTypePrimitive
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
    // InternalXContext.g:3114:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3118:1: ( rule__XType__Group__1__Impl )
            // InternalXContext.g:3119:2: rule__XType__Group__1__Impl
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
    // InternalXContext.g:3125:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3129:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXContext.g:3130:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXContext.g:3130:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXContext.g:3131:2: ( rule__XType__Group_1__0 )*
            {
             before(grammarAccess.getXTypeAccess().getGroup_1()); 
            // InternalXContext.g:3132:2: ( rule__XType__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=21 && LA33_0<=32)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalXContext.g:3132:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__XType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalXContext.g:3141:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3145:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXContext.g:3146:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalXContext.g:3153:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3157:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXContext.g:3158:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXContext.g:3158:1: ( ruleXTYPEOPERATOR )
            // InternalXContext.g:3159:2: ruleXTYPEOPERATOR
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
    // InternalXContext.g:3168:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3172:1: ( rule__XType__Group_1__1__Impl )
            // InternalXContext.g:3173:2: rule__XType__Group_1__1__Impl
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
    // InternalXContext.g:3179:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3183:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:3184:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:3184:1: ( ruleXTypePrimitive )
            // InternalXContext.g:3185:2: ruleXTypePrimitive
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
    // InternalXContext.g:3195:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3199:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXContext.g:3200:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalXContext.g:3207:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3211:1: ( ( '(' ) )
            // InternalXContext.g:3212:1: ( '(' )
            {
            // InternalXContext.g:3212:1: ( '(' )
            // InternalXContext.g:3213:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3222:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3226:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXContext.g:3227:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalXContext.g:3234:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3238:1: ( ( ruleXType ) )
            // InternalXContext.g:3239:1: ( ruleXType )
            {
            // InternalXContext.g:3239:1: ( ruleXType )
            // InternalXContext.g:3240:2: ruleXType
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
    // InternalXContext.g:3249:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3253:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXContext.g:3254:2: rule__XTypePrimitive__Group_5__2__Impl
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
    // InternalXContext.g:3260:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3264:1: ( ( ')' ) )
            // InternalXContext.g:3265:1: ( ')' )
            {
            // InternalXContext.g:3265:1: ( ')' )
            // InternalXContext.g:3266:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3276:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3280:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXContext.g:3281:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalXContext.g:3288:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3292:1: ( ( '\\u2119' ) )
            // InternalXContext.g:3293:1: ( '\\u2119' )
            {
            // InternalXContext.g:3293:1: ( '\\u2119' )
            // InternalXContext.g:3294:2: '\\u2119'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            match(input,55,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3303:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3307:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXContext.g:3308:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalXContext.g:3315:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3319:1: ( ( '(' ) )
            // InternalXContext.g:3320:1: ( '(' )
            {
            // InternalXContext.g:3320:1: ( '(' )
            // InternalXContext.g:3321:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3330:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3334:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXContext.g:3335:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalXContext.g:3342:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3346:1: ( ( ruleXType ) )
            // InternalXContext.g:3347:1: ( ruleXType )
            {
            // InternalXContext.g:3347:1: ( ruleXType )
            // InternalXContext.g:3348:2: ruleXType
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
    // InternalXContext.g:3357:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3361:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXContext.g:3362:2: rule__XTypePrimitive__Group_6__3__Impl
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
    // InternalXContext.g:3368:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3372:1: ( ( ')' ) )
            // InternalXContext.g:3373:1: ( ')' )
            {
            // InternalXContext.g:3373:1: ( ')' )
            // InternalXContext.g:3374:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3384:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3388:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXContext.g:3389:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalXContext.g:3396:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3400:1: ( ( '\\u21191' ) )
            // InternalXContext.g:3401:1: ( '\\u21191' )
            {
            // InternalXContext.g:3401:1: ( '\\u21191' )
            // InternalXContext.g:3402:2: '\\u21191'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3411:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3415:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXContext.g:3416:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalXContext.g:3423:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3427:1: ( ( '(' ) )
            // InternalXContext.g:3428:1: ( '(' )
            {
            // InternalXContext.g:3428:1: ( '(' )
            // InternalXContext.g:3429:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3438:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3442:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXContext.g:3443:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalXContext.g:3450:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3454:1: ( ( ruleXType ) )
            // InternalXContext.g:3455:1: ( ruleXType )
            {
            // InternalXContext.g:3455:1: ( ruleXType )
            // InternalXContext.g:3456:2: ruleXType
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
    // InternalXContext.g:3465:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3469:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXContext.g:3470:2: rule__XTypePrimitive__Group_7__3__Impl
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
    // InternalXContext.g:3476:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3480:1: ( ( ')' ) )
            // InternalXContext.g:3481:1: ( ')' )
            {
            // InternalXContext.g:3481:1: ( ')' )
            // InternalXContext.g:3482:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3492:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3496:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXContext.g:3497:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalXContext.g:3504:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3508:1: ( ( '%' ) )
            // InternalXContext.g:3509:1: ( '%' )
            {
            // InternalXContext.g:3509:1: ( '%' )
            // InternalXContext.g:3510:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,129,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3519:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3523:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXContext.g:3524:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXContext.g:3530:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3534:1: ( ( '\\u22C2' ) )
            // InternalXContext.g:3535:1: ( '\\u22C2' )
            {
            // InternalXContext.g:3535:1: ( '\\u22C2' )
            // InternalXContext.g:3536:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,130,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3546:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3550:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXContext.g:3551:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalXContext.g:3558:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3562:1: ( ( () ) )
            // InternalXContext.g:3563:1: ( () )
            {
            // InternalXContext.g:3563:1: ( () )
            // InternalXContext.g:3564:2: ()
            {
             before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            // InternalXContext.g:3565:2: ()
            // InternalXContext.g:3565:3: 
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
    // InternalXContext.g:3573:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3577:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXContext.g:3578:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalXContext.g:3585:1: rule__XRecord__Group__1__Impl : ( ( rule__XRecord__ExtendedAssignment_1 )? ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3589:1: ( ( ( rule__XRecord__ExtendedAssignment_1 )? ) )
            // InternalXContext.g:3590:1: ( ( rule__XRecord__ExtendedAssignment_1 )? )
            {
            // InternalXContext.g:3590:1: ( ( rule__XRecord__ExtendedAssignment_1 )? )
            // InternalXContext.g:3591:2: ( rule__XRecord__ExtendedAssignment_1 )?
            {
             before(grammarAccess.getXRecordAccess().getExtendedAssignment_1()); 
            // InternalXContext.g:3592:2: ( rule__XRecord__ExtendedAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==135) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXContext.g:3592:3: rule__XRecord__ExtendedAssignment_1
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
    // InternalXContext.g:3600:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3604:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXContext.g:3605:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
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
    // InternalXContext.g:3612:1: rule__XRecord__Group__2__Impl : ( 'record' ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3616:1: ( ( 'record' ) )
            // InternalXContext.g:3617:1: ( 'record' )
            {
            // InternalXContext.g:3617:1: ( 'record' )
            // InternalXContext.g:3618:2: 'record'
            {
             before(grammarAccess.getXRecordAccess().getRecordKeyword_2()); 
            match(input,131,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3627:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3631:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXContext.g:3632:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalXContext.g:3639:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__NameAssignment_3 ) ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3643:1: ( ( ( rule__XRecord__NameAssignment_3 ) ) )
            // InternalXContext.g:3644:1: ( ( rule__XRecord__NameAssignment_3 ) )
            {
            // InternalXContext.g:3644:1: ( ( rule__XRecord__NameAssignment_3 ) )
            // InternalXContext.g:3645:2: ( rule__XRecord__NameAssignment_3 )
            {
             before(grammarAccess.getXRecordAccess().getNameAssignment_3()); 
            // InternalXContext.g:3646:2: ( rule__XRecord__NameAssignment_3 )
            // InternalXContext.g:3646:3: rule__XRecord__NameAssignment_3
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
    // InternalXContext.g:3654:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl rule__XRecord__Group__5 ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3658:1: ( rule__XRecord__Group__4__Impl rule__XRecord__Group__5 )
            // InternalXContext.g:3659:2: rule__XRecord__Group__4__Impl rule__XRecord__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalXContext.g:3666:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__Group_4__0 )? ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3670:1: ( ( ( rule__XRecord__Group_4__0 )? ) )
            // InternalXContext.g:3671:1: ( ( rule__XRecord__Group_4__0 )? )
            {
            // InternalXContext.g:3671:1: ( ( rule__XRecord__Group_4__0 )? )
            // InternalXContext.g:3672:2: ( rule__XRecord__Group_4__0 )?
            {
             before(grammarAccess.getXRecordAccess().getGroup_4()); 
            // InternalXContext.g:3673:2: ( rule__XRecord__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==132) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXContext.g:3673:3: rule__XRecord__Group_4__0
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
    // InternalXContext.g:3681:1: rule__XRecord__Group__5 : rule__XRecord__Group__5__Impl rule__XRecord__Group__6 ;
    public final void rule__XRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3685:1: ( rule__XRecord__Group__5__Impl rule__XRecord__Group__6 )
            // InternalXContext.g:3686:2: rule__XRecord__Group__5__Impl rule__XRecord__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalXContext.g:3693:1: rule__XRecord__Group__5__Impl : ( ( rule__XRecord__Alternatives_5 )* ) ;
    public final void rule__XRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3697:1: ( ( ( rule__XRecord__Alternatives_5 )* ) )
            // InternalXContext.g:3698:1: ( ( rule__XRecord__Alternatives_5 )* )
            {
            // InternalXContext.g:3698:1: ( ( rule__XRecord__Alternatives_5 )* )
            // InternalXContext.g:3699:2: ( rule__XRecord__Alternatives_5 )*
            {
             before(grammarAccess.getXRecordAccess().getAlternatives_5()); 
            // InternalXContext.g:3700:2: ( rule__XRecord__Alternatives_5 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=133 && LA36_0<=134)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXContext.g:3700:3: rule__XRecord__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    rule__XRecord__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalXContext.g:3708:1: rule__XRecord__Group__6 : rule__XRecord__Group__6__Impl ;
    public final void rule__XRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3712:1: ( rule__XRecord__Group__6__Impl )
            // InternalXContext.g:3713:2: rule__XRecord__Group__6__Impl
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
    // InternalXContext.g:3719:1: rule__XRecord__Group__6__Impl : ( 'end' ) ;
    public final void rule__XRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3723:1: ( ( 'end' ) )
            // InternalXContext.g:3724:1: ( 'end' )
            {
            // InternalXContext.g:3724:1: ( 'end' )
            // InternalXContext.g:3725:2: 'end'
            {
             before(grammarAccess.getXRecordAccess().getEndKeyword_6()); 
            match(input,123,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3735:1: rule__XRecord__Group_4__0 : rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 ;
    public final void rule__XRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3739:1: ( rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 )
            // InternalXContext.g:3740:2: rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1
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
    // InternalXContext.g:3747:1: rule__XRecord__Group_4__0__Impl : ( 'inherits' ) ;
    public final void rule__XRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3751:1: ( ( 'inherits' ) )
            // InternalXContext.g:3752:1: ( 'inherits' )
            {
            // InternalXContext.g:3752:1: ( 'inherits' )
            // InternalXContext.g:3753:2: 'inherits'
            {
             before(grammarAccess.getXRecordAccess().getInheritsKeyword_4_0()); 
            match(input,132,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3762:1: rule__XRecord__Group_4__1 : rule__XRecord__Group_4__1__Impl ;
    public final void rule__XRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3766:1: ( rule__XRecord__Group_4__1__Impl )
            // InternalXContext.g:3767:2: rule__XRecord__Group_4__1__Impl
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
    // InternalXContext.g:3773:1: rule__XRecord__Group_4__1__Impl : ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) ;
    public final void rule__XRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3777:1: ( ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) ) )
            // InternalXContext.g:3778:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            {
            // InternalXContext.g:3778:1: ( ( rule__XRecord__InheritsNamesAssignment_4_1 ) )
            // InternalXContext.g:3779:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            {
             before(grammarAccess.getXRecordAccess().getInheritsNamesAssignment_4_1()); 
            // InternalXContext.g:3780:2: ( rule__XRecord__InheritsNamesAssignment_4_1 )
            // InternalXContext.g:3780:3: rule__XRecord__InheritsNamesAssignment_4_1
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
    // InternalXContext.g:3789:1: rule__XRecord__Group_5_0__0 : rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 ;
    public final void rule__XRecord__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3793:1: ( rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1 )
            // InternalXContext.g:3794:2: rule__XRecord__Group_5_0__0__Impl rule__XRecord__Group_5_0__1
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
    // InternalXContext.g:3801:1: rule__XRecord__Group_5_0__0__Impl : ( 'field' ) ;
    public final void rule__XRecord__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3805:1: ( ( 'field' ) )
            // InternalXContext.g:3806:1: ( 'field' )
            {
            // InternalXContext.g:3806:1: ( 'field' )
            // InternalXContext.g:3807:2: 'field'
            {
             before(grammarAccess.getXRecordAccess().getFieldKeyword_5_0_0()); 
            match(input,133,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3816:1: rule__XRecord__Group_5_0__1 : rule__XRecord__Group_5_0__1__Impl ;
    public final void rule__XRecord__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3820:1: ( rule__XRecord__Group_5_0__1__Impl )
            // InternalXContext.g:3821:2: rule__XRecord__Group_5_0__1__Impl
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
    // InternalXContext.g:3827:1: rule__XRecord__Group_5_0__1__Impl : ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) ;
    public final void rule__XRecord__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3831:1: ( ( ( rule__XRecord__FieldsAssignment_5_0_1 ) ) )
            // InternalXContext.g:3832:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            {
            // InternalXContext.g:3832:1: ( ( rule__XRecord__FieldsAssignment_5_0_1 ) )
            // InternalXContext.g:3833:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            {
             before(grammarAccess.getXRecordAccess().getFieldsAssignment_5_0_1()); 
            // InternalXContext.g:3834:2: ( rule__XRecord__FieldsAssignment_5_0_1 )
            // InternalXContext.g:3834:3: rule__XRecord__FieldsAssignment_5_0_1
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
    // InternalXContext.g:3843:1: rule__XRecord__Group_5_1__0 : rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 ;
    public final void rule__XRecord__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3847:1: ( rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1 )
            // InternalXContext.g:3848:2: rule__XRecord__Group_5_1__0__Impl rule__XRecord__Group_5_1__1
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
    // InternalXContext.g:3855:1: rule__XRecord__Group_5_1__0__Impl : ( 'constraint' ) ;
    public final void rule__XRecord__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3859:1: ( ( 'constraint' ) )
            // InternalXContext.g:3860:1: ( 'constraint' )
            {
            // InternalXContext.g:3860:1: ( 'constraint' )
            // InternalXContext.g:3861:2: 'constraint'
            {
             before(grammarAccess.getXRecordAccess().getConstraintKeyword_5_1_0()); 
            match(input,134,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:3870:1: rule__XRecord__Group_5_1__1 : rule__XRecord__Group_5_1__1__Impl ;
    public final void rule__XRecord__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3874:1: ( rule__XRecord__Group_5_1__1__Impl )
            // InternalXContext.g:3875:2: rule__XRecord__Group_5_1__1__Impl
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
    // InternalXContext.g:3881:1: rule__XRecord__Group_5_1__1__Impl : ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) ;
    public final void rule__XRecord__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3885:1: ( ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) ) )
            // InternalXContext.g:3886:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            {
            // InternalXContext.g:3886:1: ( ( rule__XRecord__ConstraintsAssignment_5_1_1 ) )
            // InternalXContext.g:3887:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            {
             before(grammarAccess.getXRecordAccess().getConstraintsAssignment_5_1_1()); 
            // InternalXContext.g:3888:2: ( rule__XRecord__ConstraintsAssignment_5_1_1 )
            // InternalXContext.g:3888:3: rule__XRecord__ConstraintsAssignment_5_1_1
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
    // InternalXContext.g:3897:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3901:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXContext.g:3902:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalXContext.g:3909:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3913:1: ( ( () ) )
            // InternalXContext.g:3914:1: ( () )
            {
            // InternalXContext.g:3914:1: ( () )
            // InternalXContext.g:3915:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalXContext.g:3916:2: ()
            // InternalXContext.g:3916:3: 
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
    // InternalXContext.g:3924:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3928:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXContext.g:3929:2: rule__Field__Group__1__Impl rule__Field__Group__2
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
    // InternalXContext.g:3936:1: rule__Field__Group__1__Impl : ( ( rule__Field__CommentAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3940:1: ( ( ( rule__Field__CommentAssignment_1 )? ) )
            // InternalXContext.g:3941:1: ( ( rule__Field__CommentAssignment_1 )? )
            {
            // InternalXContext.g:3941:1: ( ( rule__Field__CommentAssignment_1 )? )
            // InternalXContext.g:3942:2: ( rule__Field__CommentAssignment_1 )?
            {
             before(grammarAccess.getFieldAccess().getCommentAssignment_1()); 
            // InternalXContext.g:3943:2: ( rule__Field__CommentAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXContext.g:3943:3: rule__Field__CommentAssignment_1
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
    // InternalXContext.g:3951:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3955:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXContext.g:3956:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalXContext.g:3963:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3967:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalXContext.g:3968:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalXContext.g:3968:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalXContext.g:3969:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalXContext.g:3970:2: ( rule__Field__NameAssignment_2 )
            // InternalXContext.g:3970:3: rule__Field__NameAssignment_2
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
    // InternalXContext.g:3978:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3982:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalXContext.g:3983:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalXContext.g:3990:1: rule__Field__Group__3__Impl : ( ':' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3994:1: ( ( ':' ) )
            // InternalXContext.g:3995:1: ( ':' )
            {
            // InternalXContext.g:3995:1: ( ':' )
            // InternalXContext.g:3996:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_3()); 
            match(input,80,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:4005:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4009:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalXContext.g:4010:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalXContext.g:4017:1: rule__Field__Group__4__Impl : ( ( rule__Field__MultiplicityAssignment_4 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4021:1: ( ( ( rule__Field__MultiplicityAssignment_4 )? ) )
            // InternalXContext.g:4022:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            {
            // InternalXContext.g:4022:1: ( ( rule__Field__MultiplicityAssignment_4 )? )
            // InternalXContext.g:4023:2: ( rule__Field__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getFieldAccess().getMultiplicityAssignment_4()); 
            // InternalXContext.g:4024:2: ( rule__Field__MultiplicityAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=119 && LA38_0<=121)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXContext.g:4024:3: rule__Field__MultiplicityAssignment_4
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
    // InternalXContext.g:4032:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4036:1: ( rule__Field__Group__5__Impl )
            // InternalXContext.g:4037:2: rule__Field__Group__5__Impl
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
    // InternalXContext.g:4043:1: rule__Field__Group__5__Impl : ( ( rule__Field__TypeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4047:1: ( ( ( rule__Field__TypeAssignment_5 ) ) )
            // InternalXContext.g:4048:1: ( ( rule__Field__TypeAssignment_5 ) )
            {
            // InternalXContext.g:4048:1: ( ( rule__Field__TypeAssignment_5 ) )
            // InternalXContext.g:4049:2: ( rule__Field__TypeAssignment_5 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_5()); 
            // InternalXContext.g:4050:2: ( rule__Field__TypeAssignment_5 )
            // InternalXContext.g:4050:3: rule__Field__TypeAssignment_5
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
    // InternalXContext.g:4059:1: rule__XConstraint__Group__0 : rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 ;
    public final void rule__XConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4063:1: ( rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1 )
            // InternalXContext.g:4064:2: rule__XConstraint__Group__0__Impl rule__XConstraint__Group__1
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
    // InternalXContext.g:4071:1: rule__XConstraint__Group__0__Impl : ( () ) ;
    public final void rule__XConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4075:1: ( ( () ) )
            // InternalXContext.g:4076:1: ( () )
            {
            // InternalXContext.g:4076:1: ( () )
            // InternalXContext.g:4077:2: ()
            {
             before(grammarAccess.getXConstraintAccess().getConstraintAction_0()); 
            // InternalXContext.g:4078:2: ()
            // InternalXContext.g:4078:3: 
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
    // InternalXContext.g:4086:1: rule__XConstraint__Group__1 : rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 ;
    public final void rule__XConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4090:1: ( rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2 )
            // InternalXContext.g:4091:2: rule__XConstraint__Group__1__Impl rule__XConstraint__Group__2
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
    // InternalXContext.g:4098:1: rule__XConstraint__Group__1__Impl : ( ( rule__XConstraint__CommentAssignment_1 )? ) ;
    public final void rule__XConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4102:1: ( ( ( rule__XConstraint__CommentAssignment_1 )? ) )
            // InternalXContext.g:4103:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            {
            // InternalXContext.g:4103:1: ( ( rule__XConstraint__CommentAssignment_1 )? )
            // InternalXContext.g:4104:2: ( rule__XConstraint__CommentAssignment_1 )?
            {
             before(grammarAccess.getXConstraintAccess().getCommentAssignment_1()); 
            // InternalXContext.g:4105:2: ( rule__XConstraint__CommentAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXContext.g:4105:3: rule__XConstraint__CommentAssignment_1
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
    // InternalXContext.g:4113:1: rule__XConstraint__Group__2 : rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 ;
    public final void rule__XConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4117:1: ( rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3 )
            // InternalXContext.g:4118:2: rule__XConstraint__Group__2__Impl rule__XConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalXContext.g:4125:1: rule__XConstraint__Group__2__Impl : ( ( rule__XConstraint__NameAssignment_2 ) ) ;
    public final void rule__XConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4129:1: ( ( ( rule__XConstraint__NameAssignment_2 ) ) )
            // InternalXContext.g:4130:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            {
            // InternalXContext.g:4130:1: ( ( rule__XConstraint__NameAssignment_2 ) )
            // InternalXContext.g:4131:2: ( rule__XConstraint__NameAssignment_2 )
            {
             before(grammarAccess.getXConstraintAccess().getNameAssignment_2()); 
            // InternalXContext.g:4132:2: ( rule__XConstraint__NameAssignment_2 )
            // InternalXContext.g:4132:3: rule__XConstraint__NameAssignment_2
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
    // InternalXContext.g:4140:1: rule__XConstraint__Group__3 : rule__XConstraint__Group__3__Impl ;
    public final void rule__XConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4144:1: ( rule__XConstraint__Group__3__Impl )
            // InternalXContext.g:4145:2: rule__XConstraint__Group__3__Impl
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
    // InternalXContext.g:4151:1: rule__XConstraint__Group__3__Impl : ( ( rule__XConstraint__PredicateAssignment_3 ) ) ;
    public final void rule__XConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4155:1: ( ( ( rule__XConstraint__PredicateAssignment_3 ) ) )
            // InternalXContext.g:4156:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:4156:1: ( ( rule__XConstraint__PredicateAssignment_3 ) )
            // InternalXContext.g:4157:2: ( rule__XConstraint__PredicateAssignment_3 )
            {
             before(grammarAccess.getXConstraintAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:4158:2: ( rule__XConstraint__PredicateAssignment_3 )
            // InternalXContext.g:4158:3: rule__XConstraint__PredicateAssignment_3
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
    // InternalXContext.g:4167:1: rule__XContext__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XContext__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4171:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4172:2: ( RULE_STRING )
            {
            // InternalXContext.g:4172:2: ( RULE_STRING )
            // InternalXContext.g:4173:3: RULE_STRING
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
    // InternalXContext.g:4182:1: rule__XContext__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4186:1: ( ( RULE_ID ) )
            // InternalXContext.g:4187:2: ( RULE_ID )
            {
            // InternalXContext.g:4187:2: ( RULE_ID )
            // InternalXContext.g:4188:3: RULE_ID
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


    // $ANTLR start "rule__XContext__ExtendsAssignment_4_0_1"
    // InternalXContext.g:4197:1: rule__XContext__ExtendsAssignment_4_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4201:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:4202:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:4202:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:4203:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_0_1_0()); 
            // InternalXContext.g:4204:3: ( ruleQualifiedName )
            // InternalXContext.g:4205:4: ruleQualifiedName
            {
             before(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_0_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtendsAssignment_4_0_1"


    // $ANTLR start "rule__XContext__ExtendsAssignment_4_1_1"
    // InternalXContext.g:4216:1: rule__XContext__ExtendsAssignment_4_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4220:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:4221:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:4221:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:4222:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_1_0()); 
            // InternalXContext.g:4223:3: ( ruleQualifiedName )
            // InternalXContext.g:4224:4: ruleQualifiedName
            {
             before(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getXContextAccess().getExtendsContextCrossReference_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtendsAssignment_4_1_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_2_1"
    // InternalXContext.g:4235:1: rule__XContext__OrderedChildrenAssignment_4_2_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4239:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:4240:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:4240:2: ( ruleXCarrierSet )
            // InternalXContext.g:4241:3: ruleXCarrierSet
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_2_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_3"
    // InternalXContext.g:4250:1: rule__XContext__OrderedChildrenAssignment_4_3 : ( ruleXIndividualCarrierSet ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4254:1: ( ( ruleXIndividualCarrierSet ) )
            // InternalXContext.g:4255:2: ( ruleXIndividualCarrierSet )
            {
            // InternalXContext.g:4255:2: ( ruleXIndividualCarrierSet )
            // InternalXContext.g:4256:3: ruleXIndividualCarrierSet
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualCarrierSetParserRuleCall_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXIndividualCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualCarrierSetParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_3"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_4_1"
    // InternalXContext.g:4265:1: rule__XContext__OrderedChildrenAssignment_4_4_1 : ( ruleXConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4269:1: ( ( ruleXConstant ) )
            // InternalXContext.g:4270:2: ( ruleXConstant )
            {
            // InternalXContext.g:4270:2: ( ruleXConstant )
            // InternalXContext.g:4271:3: ruleXConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_4_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_4_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_5"
    // InternalXContext.g:4280:1: rule__XContext__OrderedChildrenAssignment_4_5 : ( ruleXIndividualConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4284:1: ( ( ruleXIndividualConstant ) )
            // InternalXContext.g:4285:2: ( ruleXIndividualConstant )
            {
            // InternalXContext.g:4285:2: ( ruleXIndividualConstant )
            // InternalXContext.g:4286:3: ruleXIndividualConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualConstantParserRuleCall_4_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXIndividualConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualConstantParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_5"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_6"
    // InternalXContext.g:4295:1: rule__XContext__OrderedChildrenAssignment_4_6 : ( ruleXRecord ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4299:1: ( ( ruleXRecord ) )
            // InternalXContext.g:4300:2: ( ruleXRecord )
            {
            // InternalXContext.g:4300:2: ( ruleXRecord )
            // InternalXContext.g:4301:3: ruleXRecord
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_4_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXRecord();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_4_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_6"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_7_1"
    // InternalXContext.g:4310:1: rule__XContext__OrderedChildrenAssignment_4_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4314:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:4315:2: ( ruleXAxiom )
            {
            // InternalXContext.g:4315:2: ( ruleXAxiom )
            // InternalXContext.g:4316:3: ruleXAxiom
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_4_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXAxiomParserRuleCall_4_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_7_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_8"
    // InternalXContext.g:4325:1: rule__XContext__OrderedChildrenAssignment_4_8 : ( ruleXIndividualAxiom ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4329:1: ( ( ruleXIndividualAxiom ) )
            // InternalXContext.g:4330:2: ( ruleXIndividualAxiom )
            {
            // InternalXContext.g:4330:2: ( ruleXIndividualAxiom )
            // InternalXContext.g:4331:3: ruleXIndividualAxiom
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_4_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXIndividualAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualAxiomParserRuleCall_4_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_8"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_9"
    // InternalXContext.g:4340:1: rule__XContext__OrderedChildrenAssignment_4_9 : ( ruleXIndividualTheorem ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4344:1: ( ( ruleXIndividualTheorem ) )
            // InternalXContext.g:4345:2: ( ruleXIndividualTheorem )
            {
            // InternalXContext.g:4345:2: ( ruleXIndividualTheorem )
            // InternalXContext.g:4346:3: ruleXIndividualTheorem
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualTheoremParserRuleCall_4_9_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXIndividualTheorem();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXIndividualTheoremParserRuleCall_4_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_9"


    // $ANTLR start "rule__XCarrierSet__CommentAssignment_1"
    // InternalXContext.g:4355:1: rule__XCarrierSet__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XCarrierSet__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4359:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4360:2: ( RULE_STRING )
            {
            // InternalXContext.g:4360:2: ( RULE_STRING )
            // InternalXContext.g:4361:3: RULE_STRING
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
    // InternalXContext.g:4370:1: rule__XCarrierSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4374:1: ( ( RULE_ID ) )
            // InternalXContext.g:4375:2: ( RULE_ID )
            {
            // InternalXContext.g:4375:2: ( RULE_ID )
            // InternalXContext.g:4376:3: RULE_ID
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


    // $ANTLR start "rule__XIndividualCarrierSet__CommentAssignment_1"
    // InternalXContext.g:4385:1: rule__XIndividualCarrierSet__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualCarrierSet__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4389:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4390:2: ( RULE_STRING )
            {
            // InternalXContext.g:4390:2: ( RULE_STRING )
            // InternalXContext.g:4391:3: RULE_STRING
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualCarrierSetAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualCarrierSet__NameAssignment_3"
    // InternalXContext.g:4400:1: rule__XIndividualCarrierSet__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XIndividualCarrierSet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4404:1: ( ( RULE_ID ) )
            // InternalXContext.g:4405:2: ( RULE_ID )
            {
            // InternalXContext.g:4405:2: ( RULE_ID )
            // InternalXContext.g:4406:3: RULE_ID
            {
             before(grammarAccess.getXIndividualCarrierSetAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualCarrierSetAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualCarrierSet__NameAssignment_3"


    // $ANTLR start "rule__XConstant__CommentAssignment_1"
    // InternalXContext.g:4415:1: rule__XConstant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4419:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4420:2: ( RULE_STRING )
            {
            // InternalXContext.g:4420:2: ( RULE_STRING )
            // InternalXContext.g:4421:3: RULE_STRING
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
    // InternalXContext.g:4430:1: rule__XConstant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4434:1: ( ( RULE_ID ) )
            // InternalXContext.g:4435:2: ( RULE_ID )
            {
            // InternalXContext.g:4435:2: ( RULE_ID )
            // InternalXContext.g:4436:3: RULE_ID
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


    // $ANTLR start "rule__XIndividualConstant__CommentAssignment_1"
    // InternalXContext.g:4445:1: rule__XIndividualConstant__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualConstant__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4449:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4450:2: ( RULE_STRING )
            {
            // InternalXContext.g:4450:2: ( RULE_STRING )
            // InternalXContext.g:4451:3: RULE_STRING
            {
             before(grammarAccess.getXIndividualConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualConstantAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualConstant__NameAssignment_3"
    // InternalXContext.g:4460:1: rule__XIndividualConstant__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XIndividualConstant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4464:1: ( ( RULE_ID ) )
            // InternalXContext.g:4465:2: ( RULE_ID )
            {
            // InternalXContext.g:4465:2: ( RULE_ID )
            // InternalXContext.g:4466:3: RULE_ID
            {
             before(grammarAccess.getXIndividualConstantAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualConstantAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__NameAssignment_3"


    // $ANTLR start "rule__XIndividualConstant__TypeAssignment_4_1"
    // InternalXContext.g:4475:1: rule__XIndividualConstant__TypeAssignment_4_1 : ( ruleXType ) ;
    public final void rule__XIndividualConstant__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4479:1: ( ( ruleXType ) )
            // InternalXContext.g:4480:2: ( ruleXType )
            {
            // InternalXContext.g:4480:2: ( ruleXType )
            // InternalXContext.g:4481:3: ruleXType
            {
             before(grammarAccess.getXIndividualConstantAccess().getTypeXTypeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXIndividualConstantAccess().getTypeXTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__TypeAssignment_4_1"


    // $ANTLR start "rule__XIndividualConstant__ValueAssignment_5_1"
    // InternalXContext.g:4490:1: rule__XIndividualConstant__ValueAssignment_5_1 : ( ruleXFormula ) ;
    public final void rule__XIndividualConstant__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4494:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4495:2: ( ruleXFormula )
            {
            // InternalXContext.g:4495:2: ( ruleXFormula )
            // InternalXContext.g:4496:3: ruleXFormula
            {
             before(grammarAccess.getXIndividualConstantAccess().getValueXFormulaParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXIndividualConstantAccess().getValueXFormulaParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualConstant__ValueAssignment_5_1"


    // $ANTLR start "rule__XAxiom__CommentAssignment_1"
    // InternalXContext.g:4505:1: rule__XAxiom__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XAxiom__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4509:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4510:2: ( RULE_STRING )
            {
            // InternalXContext.g:4510:2: ( RULE_STRING )
            // InternalXContext.g:4511:3: RULE_STRING
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
    // InternalXContext.g:4520:1: rule__XAxiom__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4524:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4525:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4525:2: ( RULE_XLABEL )
            // InternalXContext.g:4526:3: RULE_XLABEL
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
    // InternalXContext.g:4535:1: rule__XAxiom__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAxiom__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4539:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4540:2: ( ruleXFormula )
            {
            // InternalXContext.g:4540:2: ( ruleXFormula )
            // InternalXContext.g:4541:3: ruleXFormula
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


    // $ANTLR start "rule__XIndividualAxiom__CommentAssignment_1"
    // InternalXContext.g:4550:1: rule__XIndividualAxiom__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualAxiom__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4554:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4555:2: ( RULE_STRING )
            {
            // InternalXContext.g:4555:2: ( RULE_STRING )
            // InternalXContext.g:4556:3: RULE_STRING
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


    // $ANTLR start "rule__XIndividualAxiom__NameAssignment_3"
    // InternalXContext.g:4565:1: rule__XIndividualAxiom__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualAxiom__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4569:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4570:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4570:2: ( RULE_XLABEL )
            // InternalXContext.g:4571:3: RULE_XLABEL
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
    // InternalXContext.g:4580:1: rule__XIndividualAxiom__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualAxiom__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4584:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4585:2: ( ruleXFormula )
            {
            // InternalXContext.g:4585:2: ( ruleXFormula )
            // InternalXContext.g:4586:3: ruleXFormula
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


    // $ANTLR start "rule__XIndividualTheorem__CommentAssignment_1"
    // InternalXContext.g:4595:1: rule__XIndividualTheorem__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XIndividualTheorem__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4599:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4600:2: ( RULE_STRING )
            {
            // InternalXContext.g:4600:2: ( RULE_STRING )
            // InternalXContext.g:4601:3: RULE_STRING
            {
             before(grammarAccess.getXIndividualTheoremAccess().getCommentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualTheoremAccess().getCommentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__CommentAssignment_1"


    // $ANTLR start "rule__XIndividualTheorem__TheoremAssignment_2"
    // InternalXContext.g:4610:1: rule__XIndividualTheorem__TheoremAssignment_2 : ( ( rule__XIndividualTheorem__TheoremAlternatives_2_0 ) ) ;
    public final void rule__XIndividualTheorem__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4614:1: ( ( ( rule__XIndividualTheorem__TheoremAlternatives_2_0 ) ) )
            // InternalXContext.g:4615:2: ( ( rule__XIndividualTheorem__TheoremAlternatives_2_0 ) )
            {
            // InternalXContext.g:4615:2: ( ( rule__XIndividualTheorem__TheoremAlternatives_2_0 ) )
            // InternalXContext.g:4616:3: ( rule__XIndividualTheorem__TheoremAlternatives_2_0 )
            {
             before(grammarAccess.getXIndividualTheoremAccess().getTheoremAlternatives_2_0()); 
            // InternalXContext.g:4617:3: ( rule__XIndividualTheorem__TheoremAlternatives_2_0 )
            // InternalXContext.g:4617:4: rule__XIndividualTheorem__TheoremAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XIndividualTheorem__TheoremAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getXIndividualTheoremAccess().getTheoremAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__TheoremAssignment_2"


    // $ANTLR start "rule__XIndividualTheorem__NameAssignment_3"
    // InternalXContext.g:4625:1: rule__XIndividualTheorem__NameAssignment_3 : ( RULE_XLABEL ) ;
    public final void rule__XIndividualTheorem__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4629:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4630:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4630:2: ( RULE_XLABEL )
            // InternalXContext.g:4631:3: RULE_XLABEL
            {
             before(grammarAccess.getXIndividualTheoremAccess().getNameXLABELTerminalRuleCall_3_0()); 
            match(input,RULE_XLABEL,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getXIndividualTheoremAccess().getNameXLABELTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__NameAssignment_3"


    // $ANTLR start "rule__XIndividualTheorem__PredicateAssignment_4"
    // InternalXContext.g:4640:1: rule__XIndividualTheorem__PredicateAssignment_4 : ( ruleXFormula ) ;
    public final void rule__XIndividualTheorem__PredicateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4644:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4645:2: ( ruleXFormula )
            {
            // InternalXContext.g:4645:2: ( ruleXFormula )
            // InternalXContext.g:4646:3: ruleXFormula
            {
             before(grammarAccess.getXIndividualTheoremAccess().getPredicateXFormulaParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXIndividualTheoremAccess().getPredicateXFormulaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XIndividualTheorem__PredicateAssignment_4"


    // $ANTLR start "rule__XRecord__ExtendedAssignment_1"
    // InternalXContext.g:4655:1: rule__XRecord__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__XRecord__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4659:1: ( ( ( 'extended' ) ) )
            // InternalXContext.g:4660:2: ( ( 'extended' ) )
            {
            // InternalXContext.g:4660:2: ( ( 'extended' ) )
            // InternalXContext.g:4661:3: ( 'extended' )
            {
             before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 
            // InternalXContext.g:4662:3: ( 'extended' )
            // InternalXContext.g:4663:4: 'extended'
            {
             before(grammarAccess.getXRecordAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,135,FollowSets000.FOLLOW_2); 
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
    // InternalXContext.g:4674:1: rule__XRecord__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4678:1: ( ( RULE_ID ) )
            // InternalXContext.g:4679:2: ( RULE_ID )
            {
            // InternalXContext.g:4679:2: ( RULE_ID )
            // InternalXContext.g:4680:3: RULE_ID
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
    // InternalXContext.g:4689:1: rule__XRecord__InheritsNamesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__XRecord__InheritsNamesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4693:1: ( ( RULE_ID ) )
            // InternalXContext.g:4694:2: ( RULE_ID )
            {
            // InternalXContext.g:4694:2: ( RULE_ID )
            // InternalXContext.g:4695:3: RULE_ID
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
    // InternalXContext.g:4704:1: rule__XRecord__FieldsAssignment_5_0_1 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4708:1: ( ( ruleField ) )
            // InternalXContext.g:4709:2: ( ruleField )
            {
            // InternalXContext.g:4709:2: ( ruleField )
            // InternalXContext.g:4710:3: ruleField
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
    // InternalXContext.g:4719:1: rule__XRecord__ConstraintsAssignment_5_1_1 : ( ruleXConstraint ) ;
    public final void rule__XRecord__ConstraintsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4723:1: ( ( ruleXConstraint ) )
            // InternalXContext.g:4724:2: ( ruleXConstraint )
            {
            // InternalXContext.g:4724:2: ( ruleXConstraint )
            // InternalXContext.g:4725:3: ruleXConstraint
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
    // InternalXContext.g:4734:1: rule__Field__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Field__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4738:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4739:2: ( RULE_STRING )
            {
            // InternalXContext.g:4739:2: ( RULE_STRING )
            // InternalXContext.g:4740:3: RULE_STRING
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
    // InternalXContext.g:4749:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4753:1: ( ( RULE_ID ) )
            // InternalXContext.g:4754:2: ( RULE_ID )
            {
            // InternalXContext.g:4754:2: ( RULE_ID )
            // InternalXContext.g:4755:3: RULE_ID
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
    // InternalXContext.g:4764:1: rule__Field__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4768:1: ( ( ruleMultiplicity ) )
            // InternalXContext.g:4769:2: ( ruleMultiplicity )
            {
            // InternalXContext.g:4769:2: ( ruleMultiplicity )
            // InternalXContext.g:4770:3: ruleMultiplicity
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
    // InternalXContext.g:4779:1: rule__Field__TypeAssignment_5 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4783:1: ( ( ruleFieldType ) )
            // InternalXContext.g:4784:2: ( ruleFieldType )
            {
            // InternalXContext.g:4784:2: ( ruleFieldType )
            // InternalXContext.g:4785:3: ruleFieldType
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
    // InternalXContext.g:4794:1: rule__XConstraint__CommentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__XConstraint__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4798:1: ( ( RULE_STRING ) )
            // InternalXContext.g:4799:2: ( RULE_STRING )
            {
            // InternalXContext.g:4799:2: ( RULE_STRING )
            // InternalXContext.g:4800:3: RULE_STRING
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
    // InternalXContext.g:4809:1: rule__XConstraint__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XConstraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4813:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:4814:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:4814:2: ( RULE_XLABEL )
            // InternalXContext.g:4815:3: RULE_XLABEL
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
    // InternalXContext.g:4824:1: rule__XConstraint__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XConstraint__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:4828:1: ( ( ruleXFormula ) )
            // InternalXContext.g:4829:2: ( ruleXFormula )
            {
            // InternalXContext.g:4829:2: ( ruleXFormula )
            // InternalXContext.g:4830:3: ruleXFormula
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\7\3\uffff\1\17\7\uffff";
    static final String dfa_3s = "\1\u0087\3\uffff\1\u0080\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\5\uffff\2\2\2\7\2\12\2\13\147\uffff\1\1\1\3\1\6\1\11\1\5\2\uffff\1\10\3\uffff\1\10",
            "",
            "",
            "",
            "\2\7\2\12\2\13\153\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "575:1: rule__XContext__Alternatives_4 : ( ( ( rule__XContext__Group_4_0__0 ) ) | ( ( rule__XContext__Group_4_1__0 ) ) | ( ( rule__XContext__Group_4_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) ) | ( ( rule__XContext__Group_4_4__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_5 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_6 ) ) | ( ( rule__XContext__Group_4_7__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_8 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_9 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFE00072L,0x007FFFFFFFFFFFFFL,0x0000000000000002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L,0x0400000000000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FE080L,0xF800000000000000L,0x0000000000000089L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FE082L,0xF000000000000000L,0x0000000000000089L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000092L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000182L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000018080L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010200L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01C0001E00000010L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFFFFFFFFFFE00070L,0x007FFFFFFFFFFFFFL,0x0000000000000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000060080L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001FE080L,0xF000000000000000L,0x0000000000000089L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001FFE00000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001FFE00002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000088L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000070L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00FFFFFE00000010L,0x0380000000000000L});
    }


}