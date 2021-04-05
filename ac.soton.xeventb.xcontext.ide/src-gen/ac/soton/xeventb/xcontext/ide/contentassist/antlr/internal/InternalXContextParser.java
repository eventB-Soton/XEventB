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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_UNTRANSLATED_TOKEN", "RULE_XLABEL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'axiom'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'\\u00D7'", "'BOOL'", "'\\u21151'", "'\\u2115'", "'\\u2124'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21191'", "'\\u2119'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'one'", "'many'", "'opt'", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'constant'", "'%'", "'\\u22C2'", "'record'", "'inherits'", "'theorem'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int RULE_STRING=8;
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
            pushFollow(FOLLOW_1);
            ruleXContext();

            state._fsp--;

             after(grammarAccess.getXContextRule()); 
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
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleXCarrierSet"
    // InternalXContext.g:103:1: entryRuleXCarrierSet : ruleXCarrierSet EOF ;
    public final void entryRuleXCarrierSet() throws RecognitionException {
        try {
            // InternalXContext.g:104:1: ( ruleXCarrierSet EOF )
            // InternalXContext.g:105:1: ruleXCarrierSet EOF
            {
             before(grammarAccess.getXCarrierSetRule()); 
            pushFollow(FOLLOW_1);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXCarrierSetRule()); 
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
            pushFollow(FOLLOW_2);
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
            pushFollow(FOLLOW_1);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXConstantRule()); 
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
            pushFollow(FOLLOW_2);
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
            pushFollow(FOLLOW_1);
            ruleXTypedConstant();

            state._fsp--;

             after(grammarAccess.getXTypedConstantRule()); 
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
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleXSingleAxiom"
    // InternalXContext.g:178:1: entryRuleXSingleAxiom : ruleXSingleAxiom EOF ;
    public final void entryRuleXSingleAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXSingleAxiom EOF )
            // InternalXContext.g:180:1: ruleXSingleAxiom EOF
            {
             before(grammarAccess.getXSingleAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleXSingleAxiom();

            state._fsp--;

             after(grammarAccess.getXSingleAxiomRule()); 
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
    // $ANTLR end "entryRuleXSingleAxiom"


    // $ANTLR start "ruleXSingleAxiom"
    // InternalXContext.g:187:1: ruleXSingleAxiom : ( ( rule__XSingleAxiom__Group__0 ) ) ;
    public final void ruleXSingleAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( rule__XSingleAxiom__Group__0 ) ) )
            // InternalXContext.g:192:2: ( ( rule__XSingleAxiom__Group__0 ) )
            {
            // InternalXContext.g:192:2: ( ( rule__XSingleAxiom__Group__0 ) )
            // InternalXContext.g:193:3: ( rule__XSingleAxiom__Group__0 )
            {
             before(grammarAccess.getXSingleAxiomAccess().getGroup()); 
            // InternalXContext.g:194:3: ( rule__XSingleAxiom__Group__0 )
            // InternalXContext.g:194:4: rule__XSingleAxiom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXSingleAxiomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXSingleAxiom"


    // $ANTLR start "entryRuleXFormula"
    // InternalXContext.g:203:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXContext.g:204:1: ( ruleXFormula EOF )
            // InternalXContext.g:205:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalXContext.g:212:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:216:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXContext.g:217:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXContext.g:217:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXContext.g:218:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXContext.g:218:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXContext.g:219:4: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:220:4: ( rule__XFormula__Alternatives )
            // InternalXContext.g:220:5: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }

            // InternalXContext.g:223:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXContext.g:224:4: ( rule__XFormula__Alternatives )*
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:225:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNTRANSLATED_TOKEN)||(LA1_0>=14 && LA1_0<=111)||LA1_0==121) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXContext.g:225:5: rule__XFormula__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalXContext.g:235:1: entryRuleXType : ruleXType EOF ;
    public final void entryRuleXType() throws RecognitionException {
        try {
            // InternalXContext.g:236:1: ( ruleXType EOF )
            // InternalXContext.g:237:1: ruleXType EOF
            {
             before(grammarAccess.getXTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypeRule()); 
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
    // $ANTLR end "entryRuleXType"


    // $ANTLR start "ruleXType"
    // InternalXContext.g:244:1: ruleXType : ( ( rule__XType__Group__0 ) ) ;
    public final void ruleXType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:248:2: ( ( ( rule__XType__Group__0 ) ) )
            // InternalXContext.g:249:2: ( ( rule__XType__Group__0 ) )
            {
            // InternalXContext.g:249:2: ( ( rule__XType__Group__0 ) )
            // InternalXContext.g:250:3: ( rule__XType__Group__0 )
            {
             before(grammarAccess.getXTypeAccess().getGroup()); 
            // InternalXContext.g:251:3: ( rule__XType__Group__0 )
            // InternalXContext.g:251:4: rule__XType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:260:1: entryRuleXTYPEOPERATOR : ruleXTYPEOPERATOR EOF ;
    public final void entryRuleXTYPEOPERATOR() throws RecognitionException {
        try {
            // InternalXContext.g:261:1: ( ruleXTYPEOPERATOR EOF )
            // InternalXContext.g:262:1: ruleXTYPEOPERATOR EOF
            {
             before(grammarAccess.getXTYPEOPERATORRule()); 
            pushFollow(FOLLOW_1);
            ruleXTYPEOPERATOR();

            state._fsp--;

             after(grammarAccess.getXTYPEOPERATORRule()); 
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
    // $ANTLR end "entryRuleXTYPEOPERATOR"


    // $ANTLR start "ruleXTYPEOPERATOR"
    // InternalXContext.g:269:1: ruleXTYPEOPERATOR : ( ( rule__XTYPEOPERATOR__Alternatives ) ) ;
    public final void ruleXTYPEOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:273:2: ( ( ( rule__XTYPEOPERATOR__Alternatives ) ) )
            // InternalXContext.g:274:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            {
            // InternalXContext.g:274:2: ( ( rule__XTYPEOPERATOR__Alternatives ) )
            // InternalXContext.g:275:3: ( rule__XTYPEOPERATOR__Alternatives )
            {
             before(grammarAccess.getXTYPEOPERATORAccess().getAlternatives()); 
            // InternalXContext.g:276:3: ( rule__XTYPEOPERATOR__Alternatives )
            // InternalXContext.g:276:4: rule__XTYPEOPERATOR__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:285:1: entryRuleXTypePrimitive : ruleXTypePrimitive EOF ;
    public final void entryRuleXTypePrimitive() throws RecognitionException {
        try {
            // InternalXContext.g:286:1: ( ruleXTypePrimitive EOF )
            // InternalXContext.g:287:1: ruleXTypePrimitive EOF
            {
             before(grammarAccess.getXTypePrimitiveRule()); 
            pushFollow(FOLLOW_1);
            ruleXTypePrimitive();

            state._fsp--;

             after(grammarAccess.getXTypePrimitiveRule()); 
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
    // $ANTLR end "entryRuleXTypePrimitive"


    // $ANTLR start "ruleXTypePrimitive"
    // InternalXContext.g:294:1: ruleXTypePrimitive : ( ( rule__XTypePrimitive__Alternatives ) ) ;
    public final void ruleXTypePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:298:2: ( ( ( rule__XTypePrimitive__Alternatives ) ) )
            // InternalXContext.g:299:2: ( ( rule__XTypePrimitive__Alternatives ) )
            {
            // InternalXContext.g:299:2: ( ( rule__XTypePrimitive__Alternatives ) )
            // InternalXContext.g:300:3: ( rule__XTypePrimitive__Alternatives )
            {
             before(grammarAccess.getXTypePrimitiveAccess().getAlternatives()); 
            // InternalXContext.g:301:3: ( rule__XTypePrimitive__Alternatives )
            // InternalXContext.g:301:4: rule__XTypePrimitive__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:310:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXContext.g:311:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:312:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXContext.g:319:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:323:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXContext.g:324:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXContext.g:324:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXContext.g:325:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalXContext.g:326:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXContext.g:326:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
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
    // InternalXContext.g:335:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:336:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:337:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXContext.g:344:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:348:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:349:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:349:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXContext.g:350:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:351:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXContext.g:351:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
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
    // InternalXContext.g:360:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:361:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:362:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXContext.g:369:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:373:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:374:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:374:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXContext.g:375:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:376:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXContext.g:376:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
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


    // $ANTLR start "entryRuleXRecord"
    // InternalXContext.g:385:1: entryRuleXRecord : ruleXRecord EOF ;
    public final void entryRuleXRecord() throws RecognitionException {
        try {
            // InternalXContext.g:386:1: ( ruleXRecord EOF )
            // InternalXContext.g:387:1: ruleXRecord EOF
            {
             before(grammarAccess.getXRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleXRecord();

            state._fsp--;

             after(grammarAccess.getXRecordRule()); 
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
    // $ANTLR end "entryRuleXRecord"


    // $ANTLR start "ruleXRecord"
    // InternalXContext.g:394:1: ruleXRecord : ( ( rule__XRecord__Group__0 ) ) ;
    public final void ruleXRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:398:2: ( ( ( rule__XRecord__Group__0 ) ) )
            // InternalXContext.g:399:2: ( ( rule__XRecord__Group__0 ) )
            {
            // InternalXContext.g:399:2: ( ( rule__XRecord__Group__0 ) )
            // InternalXContext.g:400:3: ( rule__XRecord__Group__0 )
            {
             before(grammarAccess.getXRecordAccess().getGroup()); 
            // InternalXContext.g:401:3: ( rule__XRecord__Group__0 )
            // InternalXContext.g:401:4: rule__XRecord__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:410:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalXContext.g:411:1: ( ruleFieldType EOF )
            // InternalXContext.g:412:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalXContext.g:419:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:423:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalXContext.g:424:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalXContext.g:424:2: ( ( rule__FieldType__Alternatives ) )
            // InternalXContext.g:425:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalXContext.g:426:3: ( rule__FieldType__Alternatives )
            // InternalXContext.g:426:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:435:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXContext.g:436:1: ( ruleField EOF )
            // InternalXContext.g:437:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalXContext.g:444:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:448:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXContext.g:449:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXContext.g:449:2: ( ( rule__Field__Group__0 ) )
            // InternalXContext.g:450:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalXContext.g:451:3: ( rule__Field__Group__0 )
            // InternalXContext.g:451:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleMultiplicity"
    // InternalXContext.g:460:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:464:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXContext.g:465:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXContext.g:465:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXContext.g:466:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalXContext.g:467:3: ( rule__Multiplicity__Alternatives )
            // InternalXContext.g:467:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:475:1: rule__XContext__Alternatives_4 : ( ( ( rule__XContext__Group_4_0__0 ) ) | ( ( rule__XContext__Group_4_1__0 ) ) | ( ( rule__XContext__Group_4_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_4 ) ) );
    public final void rule__XContext__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:479:1: ( ( ( rule__XContext__Group_4_0__0 ) ) | ( ( rule__XContext__Group_4_1__0 ) ) | ( ( rule__XContext__Group_4_2__0 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) ) | ( ( rule__XContext__OrderedChildrenAssignment_4_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt2=1;
                }
                break;
            case 119:
                {
                alt2=2;
                }
                break;
            case 120:
                {
                alt2=3;
                }
                break;
            case 123:
                {
                alt2=4;
                }
                break;
            case 13:
            case 125:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXContext.g:480:2: ( ( rule__XContext__Group_4_0__0 ) )
                    {
                    // InternalXContext.g:480:2: ( ( rule__XContext__Group_4_0__0 ) )
                    // InternalXContext.g:481:3: ( rule__XContext__Group_4_0__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_0()); 
                    // InternalXContext.g:482:3: ( rule__XContext__Group_4_0__0 )
                    // InternalXContext.g:482:4: rule__XContext__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:486:2: ( ( rule__XContext__Group_4_1__0 ) )
                    {
                    // InternalXContext.g:486:2: ( ( rule__XContext__Group_4_1__0 ) )
                    // InternalXContext.g:487:3: ( rule__XContext__Group_4_1__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_1()); 
                    // InternalXContext.g:488:3: ( rule__XContext__Group_4_1__0 )
                    // InternalXContext.g:488:4: rule__XContext__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:492:2: ( ( rule__XContext__Group_4_2__0 ) )
                    {
                    // InternalXContext.g:492:2: ( ( rule__XContext__Group_4_2__0 ) )
                    // InternalXContext.g:493:3: ( rule__XContext__Group_4_2__0 )
                    {
                     before(grammarAccess.getXContextAccess().getGroup_4_2()); 
                    // InternalXContext.g:494:3: ( rule__XContext__Group_4_2__0 )
                    // InternalXContext.g:494:4: rule__XContext__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:498:2: ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) )
                    {
                    // InternalXContext.g:498:2: ( ( rule__XContext__OrderedChildrenAssignment_4_3 ) )
                    // InternalXContext.g:499:3: ( rule__XContext__OrderedChildrenAssignment_4_3 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_3()); 
                    // InternalXContext.g:500:3: ( rule__XContext__OrderedChildrenAssignment_4_3 )
                    // InternalXContext.g:500:4: rule__XContext__OrderedChildrenAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:504:2: ( ( rule__XContext__OrderedChildrenAssignment_4_4 ) )
                    {
                    // InternalXContext.g:504:2: ( ( rule__XContext__OrderedChildrenAssignment_4_4 ) )
                    // InternalXContext.g:505:3: ( rule__XContext__OrderedChildrenAssignment_4_4 )
                    {
                     before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4()); 
                    // InternalXContext.g:506:3: ( rule__XContext__OrderedChildrenAssignment_4_4 )
                    // InternalXContext.g:506:4: rule__XContext__OrderedChildrenAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__OrderedChildrenAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_4()); 

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


    // $ANTLR start "rule__XSingleAxiom__Alternatives_1"
    // InternalXContext.g:514:1: rule__XSingleAxiom__Alternatives_1 : ( ( ( rule__XSingleAxiom__TheoremAssignment_1_0 ) ) | ( 'axiom' ) );
    public final void rule__XSingleAxiom__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:518:1: ( ( ( rule__XSingleAxiom__TheoremAssignment_1_0 ) ) | ( 'axiom' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==125) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXContext.g:519:2: ( ( rule__XSingleAxiom__TheoremAssignment_1_0 ) )
                    {
                    // InternalXContext.g:519:2: ( ( rule__XSingleAxiom__TheoremAssignment_1_0 ) )
                    // InternalXContext.g:520:3: ( rule__XSingleAxiom__TheoremAssignment_1_0 )
                    {
                     before(grammarAccess.getXSingleAxiomAccess().getTheoremAssignment_1_0()); 
                    // InternalXContext.g:521:3: ( rule__XSingleAxiom__TheoremAssignment_1_0 )
                    // InternalXContext.g:521:4: rule__XSingleAxiom__TheoremAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XSingleAxiom__TheoremAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXSingleAxiomAccess().getTheoremAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:525:2: ( 'axiom' )
                    {
                    // InternalXContext.g:525:2: ( 'axiom' )
                    // InternalXContext.g:526:3: 'axiom'
                    {
                     before(grammarAccess.getXSingleAxiomAccess().getAxiomKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getXSingleAxiomAccess().getAxiomKeyword_1_1()); 

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
    // $ANTLR end "rule__XSingleAxiom__Alternatives_1"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXContext.g:535:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:539:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) | ( RULE_UNTRANSLATED_TOKEN ) )
            int alt4=6;
            switch ( input.LA(1) ) {
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
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt4=1;
                }
                break;
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
                {
                alt4=2;
                }
                break;
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
            case 121:
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
            case RULE_UNTRANSLATED_TOKEN:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXContext.g:540:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:540:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:541:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_IDENTIFIER_KEYWORD();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:546:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXContext.g:546:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXContext.g:547:3: ruleEVENTB_PREDICATE_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_PREDICATE_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_PREDICATE_SYMBOLSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:552:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXContext.g:552:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXContext.g:553:3: ruleEVENTB_EXPRESSION_SYMBOLS
                    {
                     before(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEVENTB_EXPRESSION_SYMBOLS();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getEVENTB_EXPRESSION_SYMBOLSParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:558:2: ( RULE_ID )
                    {
                    // InternalXContext.g:558:2: ( RULE_ID )
                    // InternalXContext.g:559:3: RULE_ID
                    {
                     before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:564:2: ( RULE_INT )
                    {
                    // InternalXContext.g:564:2: ( RULE_INT )
                    // InternalXContext.g:565:3: RULE_INT
                    {
                     before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:570:2: ( RULE_UNTRANSLATED_TOKEN )
                    {
                    // InternalXContext.g:570:2: ( RULE_UNTRANSLATED_TOKEN )
                    // InternalXContext.g:571:3: RULE_UNTRANSLATED_TOKEN
                    {
                     before(grammarAccess.getXFormulaAccess().getUNTRANSLATED_TOKENTerminalRuleCall_5()); 
                    match(input,RULE_UNTRANSLATED_TOKEN,FOLLOW_2); 
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
    // InternalXContext.g:580:1: rule__XTYPEOPERATOR__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) );
    public final void rule__XTYPEOPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:584:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '\\u00D7' ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            case 20:
                {
                alt5=7;
                }
                break;
            case 21:
                {
                alt5=8;
                }
                break;
            case 22:
                {
                alt5=9;
                }
                break;
            case 23:
                {
                alt5=10;
                }
                break;
            case 24:
                {
                alt5=11;
                }
                break;
            case 25:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXContext.g:585:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:585:2: ( '\\u2194' )
                    // InternalXContext.g:586:3: '\\u2194'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:591:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:591:2: ( '\\uE100' )
                    // InternalXContext.g:592:3: '\\uE100'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:597:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:597:2: ( '\\uE101' )
                    // InternalXContext.g:598:3: '\\uE101'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:603:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:603:2: ( '\\uE102' )
                    // InternalXContext.g:604:3: '\\uE102'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:609:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:609:2: ( '\\u21F8' )
                    // InternalXContext.g:610:3: '\\u21F8'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:615:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:615:2: ( '\\u2192' )
                    // InternalXContext.g:616:3: '\\u2192'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:621:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:621:2: ( '\\u2914' )
                    // InternalXContext.g:622:3: '\\u2914'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:627:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:627:2: ( '\\u21A3' )
                    // InternalXContext.g:628:3: '\\u21A3'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:633:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:633:2: ( '\\u2900' )
                    // InternalXContext.g:634:3: '\\u2900'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:639:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:639:2: ( '\\u21A0' )
                    // InternalXContext.g:640:3: '\\u21A0'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:645:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:645:2: ( '\\u2916' )
                    // InternalXContext.g:646:3: '\\u2916'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getXTYPEOPERATORAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:651:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:651:2: ( '\\u00D7' )
                    // InternalXContext.g:652:3: '\\u00D7'
                    {
                     before(grammarAccess.getXTYPEOPERATORAccess().getMultiplicationSignKeyword_11()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalXContext.g:661:1: rule__XTypePrimitive__Alternatives : ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) );
    public final void rule__XTypePrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:665:1: ( ( RULE_ID ) | ( 'BOOL' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u2124' ) | ( ( rule__XTypePrimitive__Group_5__0 ) ) | ( ( rule__XTypePrimitive__Group_6__0 ) ) | ( ( rule__XTypePrimitive__Group_7__0 ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 49:
                {
                alt6=6;
                }
                break;
            case 48:
                {
                alt6=7;
                }
                break;
            case 47:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXContext.g:666:2: ( RULE_ID )
                    {
                    // InternalXContext.g:666:2: ( RULE_ID )
                    // InternalXContext.g:667:3: RULE_ID
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:672:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:672:2: ( 'BOOL' )
                    // InternalXContext.g:673:3: 'BOOL'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getBOOLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:678:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:678:2: ( '\\u21151' )
                    // InternalXContext.g:679:3: '\\u21151'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:684:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:684:2: ( '\\u2115' )
                    // InternalXContext.g:685:3: '\\u2115'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalNKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:690:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:690:2: ( '\\u2124' )
                    // InternalXContext.g:691:3: '\\u2124'
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalZKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:696:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    {
                    // InternalXContext.g:696:2: ( ( rule__XTypePrimitive__Group_5__0 ) )
                    // InternalXContext.g:697:3: ( rule__XTypePrimitive__Group_5__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 
                    // InternalXContext.g:698:3: ( rule__XTypePrimitive__Group_5__0 )
                    // InternalXContext.g:698:4: rule__XTypePrimitive__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypePrimitive__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXTypePrimitiveAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:702:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    {
                    // InternalXContext.g:702:2: ( ( rule__XTypePrimitive__Group_6__0 ) )
                    // InternalXContext.g:703:3: ( rule__XTypePrimitive__Group_6__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 
                    // InternalXContext.g:704:3: ( rule__XTypePrimitive__Group_6__0 )
                    // InternalXContext.g:704:4: rule__XTypePrimitive__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypePrimitive__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXTypePrimitiveAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:708:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    {
                    // InternalXContext.g:708:2: ( ( rule__XTypePrimitive__Group_7__0 ) )
                    // InternalXContext.g:709:3: ( rule__XTypePrimitive__Group_7__0 )
                    {
                     before(grammarAccess.getXTypePrimitiveAccess().getGroup_7()); 
                    // InternalXContext.g:710:3: ( rule__XTypePrimitive__Group_7__0 )
                    // InternalXContext.g:710:4: rule__XTypePrimitive__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalXContext.g:718:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:722:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt7=23;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            case 34:
                {
                alt7=6;
                }
                break;
            case 35:
                {
                alt7=7;
                }
                break;
            case 36:
                {
                alt7=8;
                }
                break;
            case 37:
                {
                alt7=9;
                }
                break;
            case 38:
                {
                alt7=10;
                }
                break;
            case 39:
                {
                alt7=11;
                }
                break;
            case 40:
                {
                alt7=12;
                }
                break;
            case 41:
                {
                alt7=13;
                }
                break;
            case 42:
                {
                alt7=14;
                }
                break;
            case 43:
                {
                alt7=15;
                }
                break;
            case 44:
                {
                alt7=16;
                }
                break;
            case 45:
                {
                alt7=17;
                }
                break;
            case 46:
                {
                alt7=18;
                }
                break;
            case 27:
                {
                alt7=19;
                }
                break;
            case 28:
                {
                alt7=20;
                }
                break;
            case 47:
                {
                alt7=21;
                }
                break;
            case 48:
                {
                alt7=22;
                }
                break;
            case 29:
                {
                alt7=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXContext.g:723:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:723:2: ( 'BOOL' )
                    // InternalXContext.g:724:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:729:2: ( 'FALSE' )
                    {
                    // InternalXContext.g:729:2: ( 'FALSE' )
                    // InternalXContext.g:730:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:735:2: ( 'TRUE' )
                    {
                    // InternalXContext.g:735:2: ( 'TRUE' )
                    // InternalXContext.g:736:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:741:2: ( 'bool' )
                    {
                    // InternalXContext.g:741:2: ( 'bool' )
                    // InternalXContext.g:742:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:747:2: ( 'card' )
                    {
                    // InternalXContext.g:747:2: ( 'card' )
                    // InternalXContext.g:748:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:753:2: ( 'dom' )
                    {
                    // InternalXContext.g:753:2: ( 'dom' )
                    // InternalXContext.g:754:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:759:2: ( 'finite' )
                    {
                    // InternalXContext.g:759:2: ( 'finite' )
                    // InternalXContext.g:760:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:765:2: ( 'id' )
                    {
                    // InternalXContext.g:765:2: ( 'id' )
                    // InternalXContext.g:766:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:771:2: ( 'inter' )
                    {
                    // InternalXContext.g:771:2: ( 'inter' )
                    // InternalXContext.g:772:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:777:2: ( 'max' )
                    {
                    // InternalXContext.g:777:2: ( 'max' )
                    // InternalXContext.g:778:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:783:2: ( 'min' )
                    {
                    // InternalXContext.g:783:2: ( 'min' )
                    // InternalXContext.g:784:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:789:2: ( 'mod' )
                    {
                    // InternalXContext.g:789:2: ( 'mod' )
                    // InternalXContext.g:790:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:795:2: ( 'pred' )
                    {
                    // InternalXContext.g:795:2: ( 'pred' )
                    // InternalXContext.g:796:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:801:2: ( 'prj1' )
                    {
                    // InternalXContext.g:801:2: ( 'prj1' )
                    // InternalXContext.g:802:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:807:2: ( 'prj2' )
                    {
                    // InternalXContext.g:807:2: ( 'prj2' )
                    // InternalXContext.g:808:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:813:2: ( 'ran' )
                    {
                    // InternalXContext.g:813:2: ( 'ran' )
                    // InternalXContext.g:814:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:819:2: ( 'succ' )
                    {
                    // InternalXContext.g:819:2: ( 'succ' )
                    // InternalXContext.g:820:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:825:2: ( 'union' )
                    {
                    // InternalXContext.g:825:2: ( 'union' )
                    // InternalXContext.g:826:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:831:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:831:2: ( '\\u21151' )
                    // InternalXContext.g:832:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:837:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:837:2: ( '\\u2115' )
                    // InternalXContext.g:838:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:843:2: ( '\\u21191' )
                    {
                    // InternalXContext.g:843:2: ( '\\u21191' )
                    // InternalXContext.g:844:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:849:2: ( '\\u2119' )
                    {
                    // InternalXContext.g:849:2: ( '\\u2119' )
                    // InternalXContext.g:850:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:855:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:855:2: ( '\\u2124' )
                    // InternalXContext.g:856:3: '\\u2124'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalZKeyword_22()); 
                    match(input,29,FOLLOW_2); 
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
    // InternalXContext.g:865:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:869:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt8=31;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt8=1;
                }
                break;
            case 50:
                {
                alt8=2;
                }
                break;
            case 51:
                {
                alt8=3;
                }
                break;
            case 52:
                {
                alt8=4;
                }
                break;
            case 53:
                {
                alt8=5;
                }
                break;
            case 54:
                {
                alt8=6;
                }
                break;
            case 55:
                {
                alt8=7;
                }
                break;
            case 56:
                {
                alt8=8;
                }
                break;
            case 57:
                {
                alt8=9;
                }
                break;
            case 58:
                {
                alt8=10;
                }
                break;
            case 59:
                {
                alt8=11;
                }
                break;
            case 60:
                {
                alt8=12;
                }
                break;
            case 61:
                {
                alt8=13;
                }
                break;
            case 62:
                {
                alt8=14;
                }
                break;
            case 63:
                {
                alt8=15;
                }
                break;
            case 64:
                {
                alt8=16;
                }
                break;
            case 65:
                {
                alt8=17;
                }
                break;
            case 66:
                {
                alt8=18;
                }
                break;
            case 67:
                {
                alt8=19;
                }
                break;
            case 68:
                {
                alt8=20;
                }
                break;
            case 69:
                {
                alt8=21;
                }
                break;
            case 70:
                {
                alt8=22;
                }
                break;
            case 71:
                {
                alt8=23;
                }
                break;
            case 72:
                {
                alt8=24;
                }
                break;
            case 73:
                {
                alt8=25;
                }
                break;
            case 74:
                {
                alt8=26;
                }
                break;
            case 75:
                {
                alt8=27;
                }
                break;
            case 76:
                {
                alt8=28;
                }
                break;
            case 77:
                {
                alt8=29;
                }
                break;
            case 78:
                {
                alt8=30;
                }
                break;
            case 79:
                {
                alt8=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXContext.g:870:2: ( '(' )
                    {
                    // InternalXContext.g:870:2: ( '(' )
                    // InternalXContext.g:871:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:876:2: ( ')' )
                    {
                    // InternalXContext.g:876:2: ( ')' )
                    // InternalXContext.g:877:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:882:2: ( '\\u21D4' )
                    {
                    // InternalXContext.g:882:2: ( '\\u21D4' )
                    // InternalXContext.g:883:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:888:2: ( '\\u21D2' )
                    {
                    // InternalXContext.g:888:2: ( '\\u21D2' )
                    // InternalXContext.g:889:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:894:2: ( '\\u2227' )
                    {
                    // InternalXContext.g:894:2: ( '\\u2227' )
                    // InternalXContext.g:895:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:900:2: ( '&' )
                    {
                    // InternalXContext.g:900:2: ( '&' )
                    // InternalXContext.g:901:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:906:2: ( '\\u2228' )
                    {
                    // InternalXContext.g:906:2: ( '\\u2228' )
                    // InternalXContext.g:907:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:912:2: ( '\\u00AC' )
                    {
                    // InternalXContext.g:912:2: ( '\\u00AC' )
                    // InternalXContext.g:913:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:918:2: ( '\\u22A4' )
                    {
                    // InternalXContext.g:918:2: ( '\\u22A4' )
                    // InternalXContext.g:919:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:924:2: ( '\\u22A5' )
                    {
                    // InternalXContext.g:924:2: ( '\\u22A5' )
                    // InternalXContext.g:925:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:930:2: ( '\\u2200' )
                    {
                    // InternalXContext.g:930:2: ( '\\u2200' )
                    // InternalXContext.g:931:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:936:2: ( '!' )
                    {
                    // InternalXContext.g:936:2: ( '!' )
                    // InternalXContext.g:937:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:942:2: ( '\\u2203' )
                    {
                    // InternalXContext.g:942:2: ( '\\u2203' )
                    // InternalXContext.g:943:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:948:2: ( '#' )
                    {
                    // InternalXContext.g:948:2: ( '#' )
                    // InternalXContext.g:949:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:954:2: ( ',' )
                    {
                    // InternalXContext.g:954:2: ( ',' )
                    // InternalXContext.g:955:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:960:2: ( '\\u00B7' )
                    {
                    // InternalXContext.g:960:2: ( '\\u00B7' )
                    // InternalXContext.g:961:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:966:2: ( '.' )
                    {
                    // InternalXContext.g:966:2: ( '.' )
                    // InternalXContext.g:967:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:972:2: ( '=' )
                    {
                    // InternalXContext.g:972:2: ( '=' )
                    // InternalXContext.g:973:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:978:2: ( '\\u2260' )
                    {
                    // InternalXContext.g:978:2: ( '\\u2260' )
                    // InternalXContext.g:979:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:984:2: ( '\\u2264' )
                    {
                    // InternalXContext.g:984:2: ( '\\u2264' )
                    // InternalXContext.g:985:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:990:2: ( '<' )
                    {
                    // InternalXContext.g:990:2: ( '<' )
                    // InternalXContext.g:991:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:996:2: ( '\\u2265' )
                    {
                    // InternalXContext.g:996:2: ( '\\u2265' )
                    // InternalXContext.g:997:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1002:2: ( '>' )
                    {
                    // InternalXContext.g:1002:2: ( '>' )
                    // InternalXContext.g:1003:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1008:2: ( '\\u2208' )
                    {
                    // InternalXContext.g:1008:2: ( '\\u2208' )
                    // InternalXContext.g:1009:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1014:2: ( ':' )
                    {
                    // InternalXContext.g:1014:2: ( ':' )
                    // InternalXContext.g:1015:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1020:2: ( '\\u2209' )
                    {
                    // InternalXContext.g:1020:2: ( '\\u2209' )
                    // InternalXContext.g:1021:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1026:2: ( '\\u2282' )
                    {
                    // InternalXContext.g:1026:2: ( '\\u2282' )
                    // InternalXContext.g:1027:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1032:2: ( '\\u2284' )
                    {
                    // InternalXContext.g:1032:2: ( '\\u2284' )
                    // InternalXContext.g:1033:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1038:2: ( '\\u2286' )
                    {
                    // InternalXContext.g:1038:2: ( '\\u2286' )
                    // InternalXContext.g:1039:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,77,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1044:2: ( '\\u2288' )
                    {
                    // InternalXContext.g:1044:2: ( '\\u2288' )
                    // InternalXContext.g:1045:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,78,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1050:2: ( 'partition' )
                    {
                    // InternalXContext.g:1050:2: ( 'partition' )
                    // InternalXContext.g:1051:3: 'partition'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getPartitionKeyword_30()); 
                    match(input,79,FOLLOW_2); 
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
    // InternalXContext.g:1060:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1064:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt9=45;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            case 19:
                {
                alt9=6;
                }
                break;
            case 20:
                {
                alt9=7;
                }
                break;
            case 21:
                {
                alt9=8;
                }
                break;
            case 22:
                {
                alt9=9;
                }
                break;
            case 23:
                {
                alt9=10;
                }
                break;
            case 24:
                {
                alt9=11;
                }
                break;
            case 80:
                {
                alt9=12;
                }
                break;
            case 81:
                {
                alt9=13;
                }
                break;
            case 82:
                {
                alt9=14;
                }
                break;
            case 83:
                {
                alt9=15;
                }
                break;
            case 84:
                {
                alt9=16;
                }
                break;
            case 85:
                {
                alt9=17;
                }
                break;
            case 86:
                {
                alt9=18;
                }
                break;
            case 25:
                {
                alt9=19;
                }
                break;
            case 87:
                {
                alt9=20;
                }
                break;
            case 88:
                {
                alt9=21;
                }
                break;
            case 89:
                {
                alt9=22;
                }
                break;
            case 90:
                {
                alt9=23;
                }
                break;
            case 91:
                {
                alt9=24;
                }
                break;
            case 92:
                {
                alt9=25;
                }
                break;
            case 93:
                {
                alt9=26;
                }
                break;
            case 94:
                {
                alt9=27;
                }
                break;
            case 95:
                {
                alt9=28;
                }
                break;
            case 96:
                {
                alt9=29;
                }
                break;
            case 97:
                {
                alt9=30;
                }
                break;
            case 98:
                {
                alt9=31;
                }
                break;
            case 99:
                {
                alt9=32;
                }
                break;
            case 121:
                {
                alt9=33;
                }
                break;
            case 100:
                {
                alt9=34;
                }
                break;
            case 101:
                {
                alt9=35;
                }
                break;
            case 102:
                {
                alt9=36;
                }
                break;
            case 103:
                {
                alt9=37;
                }
                break;
            case 104:
                {
                alt9=38;
                }
                break;
            case 105:
                {
                alt9=39;
                }
                break;
            case 106:
                {
                alt9=40;
                }
                break;
            case 107:
                {
                alt9=41;
                }
                break;
            case 108:
                {
                alt9=42;
                }
                break;
            case 109:
                {
                alt9=43;
                }
                break;
            case 110:
                {
                alt9=44;
                }
                break;
            case 111:
                {
                alt9=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXContext.g:1065:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:1065:2: ( '\\u2194' )
                    // InternalXContext.g:1066:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1071:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:1071:2: ( '\\uE100' )
                    // InternalXContext.g:1072:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1077:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:1077:2: ( '\\uE101' )
                    // InternalXContext.g:1078:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:1083:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:1083:2: ( '\\uE102' )
                    // InternalXContext.g:1084:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:1089:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:1089:2: ( '\\u21F8' )
                    // InternalXContext.g:1090:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:1095:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:1095:2: ( '\\u2192' )
                    // InternalXContext.g:1096:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:1101:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:1101:2: ( '\\u2914' )
                    // InternalXContext.g:1102:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:1107:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:1107:2: ( '\\u21A3' )
                    // InternalXContext.g:1108:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:1113:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:1113:2: ( '\\u2900' )
                    // InternalXContext.g:1114:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:1119:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:1119:2: ( '\\u21A0' )
                    // InternalXContext.g:1120:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:1125:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:1125:2: ( '\\u2916' )
                    // InternalXContext.g:1126:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:1131:2: ( '{' )
                    {
                    // InternalXContext.g:1131:2: ( '{' )
                    // InternalXContext.g:1132:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,80,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:1137:2: ( '}' )
                    {
                    // InternalXContext.g:1137:2: ( '}' )
                    // InternalXContext.g:1138:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,81,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:1143:2: ( '\\u21A6' )
                    {
                    // InternalXContext.g:1143:2: ( '\\u21A6' )
                    // InternalXContext.g:1144:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,82,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:1149:2: ( '\\u2205' )
                    {
                    // InternalXContext.g:1149:2: ( '\\u2205' )
                    // InternalXContext.g:1150:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,83,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:1155:2: ( '\\u2229' )
                    {
                    // InternalXContext.g:1155:2: ( '\\u2229' )
                    // InternalXContext.g:1156:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,84,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:1161:2: ( '\\u222A' )
                    {
                    // InternalXContext.g:1161:2: ( '\\u222A' )
                    // InternalXContext.g:1162:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,85,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:1167:2: ( '\\u2216' )
                    {
                    // InternalXContext.g:1167:2: ( '\\u2216' )
                    // InternalXContext.g:1168:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,86,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:1173:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:1173:2: ( '\\u00D7' )
                    // InternalXContext.g:1174:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:1179:2: ( '[' )
                    {
                    // InternalXContext.g:1179:2: ( '[' )
                    // InternalXContext.g:1180:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,87,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:1185:2: ( ']' )
                    {
                    // InternalXContext.g:1185:2: ( ']' )
                    // InternalXContext.g:1186:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,88,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:1191:2: ( '\\uE103' )
                    {
                    // InternalXContext.g:1191:2: ( '\\uE103' )
                    // InternalXContext.g:1192:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,89,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:1197:2: ( '\\u2218' )
                    {
                    // InternalXContext.g:1197:2: ( '\\u2218' )
                    // InternalXContext.g:1198:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,90,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:1203:2: ( ';' )
                    {
                    // InternalXContext.g:1203:2: ( ';' )
                    // InternalXContext.g:1204:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,91,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:1209:2: ( '\\u2297' )
                    {
                    // InternalXContext.g:1209:2: ( '\\u2297' )
                    // InternalXContext.g:1210:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,92,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:1215:2: ( '\\u2225' )
                    {
                    // InternalXContext.g:1215:2: ( '\\u2225' )
                    // InternalXContext.g:1216:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,93,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:1221:2: ( '\\u223C' )
                    {
                    // InternalXContext.g:1221:2: ( '\\u223C' )
                    // InternalXContext.g:1222:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,94,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:1227:2: ( '\\u25C1' )
                    {
                    // InternalXContext.g:1227:2: ( '\\u25C1' )
                    // InternalXContext.g:1228:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,95,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:1233:2: ( '\\u2A64' )
                    {
                    // InternalXContext.g:1233:2: ( '\\u2A64' )
                    // InternalXContext.g:1234:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,96,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:1239:2: ( '\\u25B7' )
                    {
                    // InternalXContext.g:1239:2: ( '\\u25B7' )
                    // InternalXContext.g:1240:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,97,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:1245:2: ( '\\u2A65' )
                    {
                    // InternalXContext.g:1245:2: ( '\\u2A65' )
                    // InternalXContext.g:1246:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,98,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalXContext.g:1251:2: ( '\\u03BB' )
                    {
                    // InternalXContext.g:1251:2: ( '\\u03BB' )
                    // InternalXContext.g:1252:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,99,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalXContext.g:1257:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXContext.g:1257:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXContext.g:1258:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalXContext.g:1259:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXContext.g:1259:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXContext.g:1263:2: ( '\\u22C3' )
                    {
                    // InternalXContext.g:1263:2: ( '\\u22C3' )
                    // InternalXContext.g:1264:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,100,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalXContext.g:1269:2: ( '\\u2223' )
                    {
                    // InternalXContext.g:1269:2: ( '\\u2223' )
                    // InternalXContext.g:1270:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,101,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalXContext.g:1275:2: ( '\\u2025' )
                    {
                    // InternalXContext.g:1275:2: ( '\\u2025' )
                    // InternalXContext.g:1276:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,102,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalXContext.g:1281:2: ( '+' )
                    {
                    // InternalXContext.g:1281:2: ( '+' )
                    // InternalXContext.g:1282:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,103,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalXContext.g:1287:2: ( '\\u2212' )
                    {
                    // InternalXContext.g:1287:2: ( '\\u2212' )
                    // InternalXContext.g:1288:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,104,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalXContext.g:1293:2: ( '-' )
                    {
                    // InternalXContext.g:1293:2: ( '-' )
                    // InternalXContext.g:1294:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,105,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalXContext.g:1299:2: ( '\\u2217' )
                    {
                    // InternalXContext.g:1299:2: ( '\\u2217' )
                    // InternalXContext.g:1300:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,106,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalXContext.g:1305:2: ( '*' )
                    {
                    // InternalXContext.g:1305:2: ( '*' )
                    // InternalXContext.g:1306:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,107,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalXContext.g:1311:2: ( '\\u00F7' )
                    {
                    // InternalXContext.g:1311:2: ( '\\u00F7' )
                    // InternalXContext.g:1312:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,108,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalXContext.g:1317:2: ( '/' )
                    {
                    // InternalXContext.g:1317:2: ( '/' )
                    // InternalXContext.g:1318:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,109,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalXContext.g:1323:2: ( '^' )
                    {
                    // InternalXContext.g:1323:2: ( '^' )
                    // InternalXContext.g:1324:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,110,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalXContext.g:1329:2: ( '\\\\' )
                    {
                    // InternalXContext.g:1329:2: ( '\\\\' )
                    // InternalXContext.g:1330:3: '\\\\'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getBackslashKeyword_44()); 
                    match(input,111,FOLLOW_2); 
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


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalXContext.g:1339:1: rule__FieldType__Alternatives : ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1343:1: ( ( RULE_ID ) | ( ruleEVENTB_IDENTIFIER_KEYWORD ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=26 && LA10_0<=48)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:1344:2: ( RULE_ID )
                    {
                    // InternalXContext.g:1344:2: ( RULE_ID )
                    // InternalXContext.g:1345:3: RULE_ID
                    {
                     before(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFieldTypeAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1350:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:1350:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:1351:3: ruleEVENTB_IDENTIFIER_KEYWORD
                    {
                     before(grammarAccess.getFieldTypeAccess().getEVENTB_IDENTIFIER_KEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1360:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1364:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt11=1;
                }
                break;
            case 113:
                {
                alt11=2;
                }
                break;
            case 114:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXContext.g:1365:2: ( ( 'one' ) )
                    {
                    // InternalXContext.g:1365:2: ( ( 'one' ) )
                    // InternalXContext.g:1366:3: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    // InternalXContext.g:1367:3: ( 'one' )
                    // InternalXContext.g:1367:4: 'one'
                    {
                    match(input,112,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1371:2: ( ( 'many' ) )
                    {
                    // InternalXContext.g:1371:2: ( ( 'many' ) )
                    // InternalXContext.g:1372:3: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    // InternalXContext.g:1373:3: ( 'many' )
                    // InternalXContext.g:1373:4: 'many'
                    {
                    match(input,113,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1377:2: ( ( 'opt' ) )
                    {
                    // InternalXContext.g:1377:2: ( ( 'opt' ) )
                    // InternalXContext.g:1378:3: ( 'opt' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    // InternalXContext.g:1379:3: ( 'opt' )
                    // InternalXContext.g:1379:4: 'opt'
                    {
                    match(input,114,FOLLOW_2); 

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
    // InternalXContext.g:1387:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1391:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:1392:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1399:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1403:1: ( ( () ) )
            // InternalXContext.g:1404:1: ( () )
            {
            // InternalXContext.g:1404:1: ( () )
            // InternalXContext.g:1405:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:1406:2: ()
            // InternalXContext.g:1406:3: 
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
    // InternalXContext.g:1414:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1418:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:1419:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1426:1: rule__XContext__Group__1__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1430:1: ( ( 'context' ) )
            // InternalXContext.g:1431:1: ( 'context' )
            {
            // InternalXContext.g:1431:1: ( 'context' )
            // InternalXContext.g:1432:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_1()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getContextKeyword_1()); 

            }


            }

        }
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
    // InternalXContext.g:1441:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1445:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:1446:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1453:1: rule__XContext__Group__2__Impl : ( ( rule__XContext__NameAssignment_2 ) ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1457:1: ( ( ( rule__XContext__NameAssignment_2 ) ) )
            // InternalXContext.g:1458:1: ( ( rule__XContext__NameAssignment_2 ) )
            {
            // InternalXContext.g:1458:1: ( ( rule__XContext__NameAssignment_2 ) )
            // InternalXContext.g:1459:2: ( rule__XContext__NameAssignment_2 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_2()); 
            // InternalXContext.g:1460:2: ( rule__XContext__NameAssignment_2 )
            // InternalXContext.g:1460:3: rule__XContext__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XContext__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:1468:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1472:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:1473:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1480:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__Group_3__0 )? ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1484:1: ( ( ( rule__XContext__Group_3__0 )? ) )
            // InternalXContext.g:1485:1: ( ( rule__XContext__Group_3__0 )? )
            {
            // InternalXContext.g:1485:1: ( ( rule__XContext__Group_3__0 )? )
            // InternalXContext.g:1486:2: ( rule__XContext__Group_3__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_3()); 
            // InternalXContext.g:1487:2: ( rule__XContext__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==117) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXContext.g:1487:3: rule__XContext__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXContext.g:1495:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1499:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:1500:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1507:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Alternatives_4 )* ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1511:1: ( ( ( rule__XContext__Alternatives_4 )* ) )
            // InternalXContext.g:1512:1: ( ( rule__XContext__Alternatives_4 )* )
            {
            // InternalXContext.g:1512:1: ( ( rule__XContext__Alternatives_4 )* )
            // InternalXContext.g:1513:2: ( rule__XContext__Alternatives_4 )*
            {
             before(grammarAccess.getXContextAccess().getAlternatives_4()); 
            // InternalXContext.g:1514:2: ( rule__XContext__Alternatives_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13||(LA13_0>=118 && LA13_0<=120)||LA13_0==123||LA13_0==125) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:1514:3: rule__XContext__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XContext__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalXContext.g:1522:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1526:1: ( rule__XContext__Group__5__Impl )
            // InternalXContext.g:1527:2: rule__XContext__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1533:1: rule__XContext__Group__5__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1537:1: ( ( 'end' ) )
            // InternalXContext.g:1538:1: ( 'end' )
            {
            // InternalXContext.g:1538:1: ( 'end' )
            // InternalXContext.g:1539:2: 'end'
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_5()); 
            match(input,116,FOLLOW_2); 
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


    // $ANTLR start "rule__XContext__Group_3__0"
    // InternalXContext.g:1549:1: rule__XContext__Group_3__0 : rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1 ;
    public final void rule__XContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1553:1: ( rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1 )
            // InternalXContext.g:1554:2: rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_3__0"


    // $ANTLR start "rule__XContext__Group_3__0__Impl"
    // InternalXContext.g:1561:1: rule__XContext__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1565:1: ( ( 'extends' ) )
            // InternalXContext.g:1566:1: ( 'extends' )
            {
            // InternalXContext.g:1566:1: ( 'extends' )
            // InternalXContext.g:1567:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_3_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_3__0__Impl"


    // $ANTLR start "rule__XContext__Group_3__1"
    // InternalXContext.g:1576:1: rule__XContext__Group_3__1 : rule__XContext__Group_3__1__Impl ;
    public final void rule__XContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1580:1: ( rule__XContext__Group_3__1__Impl )
            // InternalXContext.g:1581:2: rule__XContext__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_3__1"


    // $ANTLR start "rule__XContext__Group_3__1__Impl"
    // InternalXContext.g:1587:1: rule__XContext__Group_3__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) ) ;
    public final void rule__XContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1591:1: ( ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) ) )
            // InternalXContext.g:1592:1: ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) )
            {
            // InternalXContext.g:1592:1: ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) )
            // InternalXContext.g:1593:2: ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* )
            {
            // InternalXContext.g:1593:2: ( ( rule__XContext__ExtendsAssignment_3_1 ) )
            // InternalXContext.g:1594:3: ( rule__XContext__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 
            // InternalXContext.g:1595:3: ( rule__XContext__ExtendsAssignment_3_1 )
            // InternalXContext.g:1595:4: rule__XContext__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 

            }

            // InternalXContext.g:1598:2: ( ( rule__XContext__ExtendsAssignment_3_1 )* )
            // InternalXContext.g:1599:3: ( rule__XContext__ExtendsAssignment_3_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 
            // InternalXContext.g:1600:3: ( rule__XContext__ExtendsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXContext.g:1600:4: rule__XContext__ExtendsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__ExtendsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_3__1__Impl"


    // $ANTLR start "rule__XContext__Group_4_0__0"
    // InternalXContext.g:1610:1: rule__XContext__Group_4_0__0 : rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1 ;
    public final void rule__XContext__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1614:1: ( rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1 )
            // InternalXContext.g:1615:2: rule__XContext__Group_4_0__0__Impl rule__XContext__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1622:1: rule__XContext__Group_4_0__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1626:1: ( ( 'sets' ) )
            // InternalXContext.g:1627:1: ( 'sets' )
            {
            // InternalXContext.g:1627:1: ( 'sets' )
            // InternalXContext.g:1628:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_4_0_0()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getSetsKeyword_4_0_0()); 

            }


            }

        }
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
    // InternalXContext.g:1637:1: rule__XContext__Group_4_0__1 : rule__XContext__Group_4_0__1__Impl ;
    public final void rule__XContext__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1641:1: ( rule__XContext__Group_4_0__1__Impl )
            // InternalXContext.g:1642:2: rule__XContext__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1648:1: rule__XContext__Group_4_0__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* ) ) ;
    public final void rule__XContext__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1652:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* ) ) )
            // InternalXContext.g:1653:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* ) )
            {
            // InternalXContext.g:1653:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* ) )
            // InternalXContext.g:1654:2: ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* )
            {
            // InternalXContext.g:1654:2: ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 ) )
            // InternalXContext.g:1655:3: ( rule__XContext__OrderedChildrenAssignment_4_0_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_0_1()); 
            // InternalXContext.g:1656:3: ( rule__XContext__OrderedChildrenAssignment_4_0_1 )
            // InternalXContext.g:1656:4: rule__XContext__OrderedChildrenAssignment_4_0_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__OrderedChildrenAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_0_1()); 

            }

            // InternalXContext.g:1659:2: ( ( rule__XContext__OrderedChildrenAssignment_4_0_1 )* )
            // InternalXContext.g:1660:3: ( rule__XContext__OrderedChildrenAssignment_4_0_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_0_1()); 
            // InternalXContext.g:1661:3: ( rule__XContext__OrderedChildrenAssignment_4_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXContext.g:1661:4: rule__XContext__OrderedChildrenAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__OrderedChildrenAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_0_1()); 

            }


            }


            }

        }
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
    // InternalXContext.g:1671:1: rule__XContext__Group_4_1__0 : rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1 ;
    public final void rule__XContext__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1675:1: ( rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1 )
            // InternalXContext.g:1676:2: rule__XContext__Group_4_1__0__Impl rule__XContext__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1683:1: rule__XContext__Group_4_1__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1687:1: ( ( 'constants' ) )
            // InternalXContext.g:1688:1: ( 'constants' )
            {
            // InternalXContext.g:1688:1: ( 'constants' )
            // InternalXContext.g:1689:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_4_1_0()); 
            match(input,119,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantsKeyword_4_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:1698:1: rule__XContext__Group_4_1__1 : rule__XContext__Group_4_1__1__Impl ;
    public final void rule__XContext__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1702:1: ( rule__XContext__Group_4_1__1__Impl )
            // InternalXContext.g:1703:2: rule__XContext__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1709:1: rule__XContext__Group_4_1__1__Impl : ( ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* ) ) ;
    public final void rule__XContext__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1713:1: ( ( ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* ) ) )
            // InternalXContext.g:1714:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* ) )
            {
            // InternalXContext.g:1714:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* ) )
            // InternalXContext.g:1715:2: ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) ) ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* )
            {
            // InternalXContext.g:1715:2: ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 ) )
            // InternalXContext.g:1716:3: ( rule__XContext__OrderedChildrenAssignment_4_1_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_1_1()); 
            // InternalXContext.g:1717:3: ( rule__XContext__OrderedChildrenAssignment_4_1_1 )
            // InternalXContext.g:1717:4: rule__XContext__OrderedChildrenAssignment_4_1_1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__OrderedChildrenAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_1_1()); 

            }

            // InternalXContext.g:1720:2: ( ( rule__XContext__OrderedChildrenAssignment_4_1_1 )* )
            // InternalXContext.g:1721:3: ( rule__XContext__OrderedChildrenAssignment_4_1_1 )*
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_1_1()); 
            // InternalXContext.g:1722:3: ( rule__XContext__OrderedChildrenAssignment_4_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXContext.g:1722:4: rule__XContext__OrderedChildrenAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XContext__OrderedChildrenAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_1_1()); 

            }


            }


            }

        }
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
    // InternalXContext.g:1732:1: rule__XContext__Group_4_2__0 : rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1 ;
    public final void rule__XContext__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1736:1: ( rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1 )
            // InternalXContext.g:1737:2: rule__XContext__Group_4_2__0__Impl rule__XContext__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1744:1: rule__XContext__Group_4_2__0__Impl : ( 'constant' ) ;
    public final void rule__XContext__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1748:1: ( ( 'constant' ) )
            // InternalXContext.g:1749:1: ( 'constant' )
            {
            // InternalXContext.g:1749:1: ( 'constant' )
            // InternalXContext.g:1750:2: 'constant'
            {
             before(grammarAccess.getXContextAccess().getConstantKeyword_4_2_0()); 
            match(input,120,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantKeyword_4_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:1759:1: rule__XContext__Group_4_2__1 : rule__XContext__Group_4_2__1__Impl ;
    public final void rule__XContext__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1763:1: ( rule__XContext__Group_4_2__1__Impl )
            // InternalXContext.g:1764:2: rule__XContext__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1770:1: rule__XContext__Group_4_2__1__Impl : ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) ;
    public final void rule__XContext__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1774:1: ( ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) ) )
            // InternalXContext.g:1775:1: ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) )
            {
            // InternalXContext.g:1775:1: ( ( rule__XContext__OrderedChildrenAssignment_4_2_1 ) )
            // InternalXContext.g:1776:2: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 
            // InternalXContext.g:1777:2: ( rule__XContext__OrderedChildrenAssignment_4_2_1 )
            // InternalXContext.g:1777:3: rule__XContext__OrderedChildrenAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XContext__OrderedChildrenAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getOrderedChildrenAssignment_4_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXContext.g:1786:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1790:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:1791:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalXContext.g:1798:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1802:1: ( ( RULE_ID ) )
            // InternalXContext.g:1803:1: ( RULE_ID )
            {
            // InternalXContext.g:1803:1: ( RULE_ID )
            // InternalXContext.g:1804:2: RULE_ID
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
    // InternalXContext.g:1813:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1817:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:1818:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:1824:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1828:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:1829:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:1829:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:1830:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:1831:2: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==65) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXContext.g:1831:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalXContext.g:1840:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1844:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:1845:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:1852:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1856:1: ( ( '.' ) )
            // InternalXContext.g:1857:1: ( '.' )
            {
            // InternalXContext.g:1857:1: ( '.' )
            // InternalXContext.g:1858:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalXContext.g:1867:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1871:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:1872:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:1878:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1882:1: ( ( RULE_ID ) )
            // InternalXContext.g:1883:1: ( RULE_ID )
            {
            // InternalXContext.g:1883:1: ( RULE_ID )
            // InternalXContext.g:1884:2: RULE_ID
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


    // $ANTLR start "rule__XCarrierSet__Group__0"
    // InternalXContext.g:1894:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1898:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:1899:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XCarrierSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1906:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1910:1: ( ( () ) )
            // InternalXContext.g:1911:1: ( () )
            {
            // InternalXContext.g:1911:1: ( () )
            // InternalXContext.g:1912:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1913:2: ()
            // InternalXContext.g:1913:3: 
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
    // InternalXContext.g:1921:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1925:1: ( rule__XCarrierSet__Group__1__Impl )
            // InternalXContext.g:1926:2: rule__XCarrierSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:1932:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1936:1: ( ( ( rule__XCarrierSet__NameAssignment_1 ) ) )
            // InternalXContext.g:1937:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            {
            // InternalXContext.g:1937:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            // InternalXContext.g:1938:2: ( rule__XCarrierSet__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_1()); 
            // InternalXContext.g:1939:2: ( rule__XCarrierSet__NameAssignment_1 )
            // InternalXContext.g:1939:3: rule__XCarrierSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCarrierSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCarrierSetAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XConstant__Group__0"
    // InternalXContext.g:1948:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1952:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:1953:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1960:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1964:1: ( ( () ) )
            // InternalXContext.g:1965:1: ( () )
            {
            // InternalXContext.g:1965:1: ( () )
            // InternalXContext.g:1966:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:1967:2: ()
            // InternalXContext.g:1967:3: 
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
    // InternalXContext.g:1975:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1979:1: ( rule__XConstant__Group__1__Impl )
            // InternalXContext.g:1980:2: rule__XConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:1986:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__NameAssignment_1 ) ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1990:1: ( ( ( rule__XConstant__NameAssignment_1 ) ) )
            // InternalXContext.g:1991:1: ( ( rule__XConstant__NameAssignment_1 ) )
            {
            // InternalXContext.g:1991:1: ( ( rule__XConstant__NameAssignment_1 ) )
            // InternalXContext.g:1992:2: ( rule__XConstant__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_1()); 
            // InternalXContext.g:1993:2: ( rule__XConstant__NameAssignment_1 )
            // InternalXContext.g:1993:3: rule__XConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXConstantAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XTypedConstant__Group__0"
    // InternalXContext.g:2002:1: rule__XTypedConstant__Group__0 : rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1 ;
    public final void rule__XTypedConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2006:1: ( rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1 )
            // InternalXContext.g:2007:2: rule__XTypedConstant__Group__0__Impl rule__XTypedConstant__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XTypedConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2014:1: rule__XTypedConstant__Group__0__Impl : ( () ) ;
    public final void rule__XTypedConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2018:1: ( ( () ) )
            // InternalXContext.g:2019:1: ( () )
            {
            // InternalXContext.g:2019:1: ( () )
            // InternalXContext.g:2020:2: ()
            {
             before(grammarAccess.getXTypedConstantAccess().getTypedConstantAction_0()); 
            // InternalXContext.g:2021:2: ()
            // InternalXContext.g:2021:3: 
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
    // InternalXContext.g:2029:1: rule__XTypedConstant__Group__1 : rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2 ;
    public final void rule__XTypedConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2033:1: ( rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2 )
            // InternalXContext.g:2034:2: rule__XTypedConstant__Group__1__Impl rule__XTypedConstant__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XTypedConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2041:1: rule__XTypedConstant__Group__1__Impl : ( ( rule__XTypedConstant__NameAssignment_1 ) ) ;
    public final void rule__XTypedConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2045:1: ( ( ( rule__XTypedConstant__NameAssignment_1 ) ) )
            // InternalXContext.g:2046:1: ( ( rule__XTypedConstant__NameAssignment_1 ) )
            {
            // InternalXContext.g:2046:1: ( ( rule__XTypedConstant__NameAssignment_1 ) )
            // InternalXContext.g:2047:2: ( rule__XTypedConstant__NameAssignment_1 )
            {
             before(grammarAccess.getXTypedConstantAccess().getNameAssignment_1()); 
            // InternalXContext.g:2048:2: ( rule__XTypedConstant__NameAssignment_1 )
            // InternalXContext.g:2048:3: rule__XTypedConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XTypedConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:2056:1: rule__XTypedConstant__Group__2 : rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3 ;
    public final void rule__XTypedConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2060:1: ( rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3 )
            // InternalXContext.g:2061:2: rule__XTypedConstant__Group__2__Impl rule__XTypedConstant__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__XTypedConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2068:1: rule__XTypedConstant__Group__2__Impl : ( ( rule__XTypedConstant__Group_2__0 )? ) ;
    public final void rule__XTypedConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2072:1: ( ( ( rule__XTypedConstant__Group_2__0 )? ) )
            // InternalXContext.g:2073:1: ( ( rule__XTypedConstant__Group_2__0 )? )
            {
            // InternalXContext.g:2073:1: ( ( rule__XTypedConstant__Group_2__0 )? )
            // InternalXContext.g:2074:2: ( rule__XTypedConstant__Group_2__0 )?
            {
             before(grammarAccess.getXTypedConstantAccess().getGroup_2()); 
            // InternalXContext.g:2075:2: ( rule__XTypedConstant__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==73) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXContext.g:2075:3: rule__XTypedConstant__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XTypedConstant__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXTypedConstantAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalXContext.g:2083:1: rule__XTypedConstant__Group__3 : rule__XTypedConstant__Group__3__Impl ;
    public final void rule__XTypedConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2087:1: ( rule__XTypedConstant__Group__3__Impl )
            // InternalXContext.g:2088:2: rule__XTypedConstant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XTypedConstant__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2094:1: rule__XTypedConstant__Group__3__Impl : ( ( rule__XTypedConstant__Group_3__0 )? ) ;
    public final void rule__XTypedConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2098:1: ( ( ( rule__XTypedConstant__Group_3__0 )? ) )
            // InternalXContext.g:2099:1: ( ( rule__XTypedConstant__Group_3__0 )? )
            {
            // InternalXContext.g:2099:1: ( ( rule__XTypedConstant__Group_3__0 )? )
            // InternalXContext.g:2100:2: ( rule__XTypedConstant__Group_3__0 )?
            {
             before(grammarAccess.getXTypedConstantAccess().getGroup_3()); 
            // InternalXContext.g:2101:2: ( rule__XTypedConstant__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==66) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXContext.g:2101:3: rule__XTypedConstant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__XTypedConstant__Group_2__0"
    // InternalXContext.g:2110:1: rule__XTypedConstant__Group_2__0 : rule__XTypedConstant__Group_2__0__Impl rule__XTypedConstant__Group_2__1 ;
    public final void rule__XTypedConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2114:1: ( rule__XTypedConstant__Group_2__0__Impl rule__XTypedConstant__Group_2__1 )
            // InternalXContext.g:2115:2: rule__XTypedConstant__Group_2__0__Impl rule__XTypedConstant__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__XTypedConstant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XTypedConstant__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_2__0"


    // $ANTLR start "rule__XTypedConstant__Group_2__0__Impl"
    // InternalXContext.g:2122:1: rule__XTypedConstant__Group_2__0__Impl : ( ':' ) ;
    public final void rule__XTypedConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2126:1: ( ( ':' ) )
            // InternalXContext.g:2127:1: ( ':' )
            {
            // InternalXContext.g:2127:1: ( ':' )
            // InternalXContext.g:2128:2: ':'
            {
             before(grammarAccess.getXTypedConstantAccess().getColonKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_2__0__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_2__1"
    // InternalXContext.g:2137:1: rule__XTypedConstant__Group_2__1 : rule__XTypedConstant__Group_2__1__Impl ;
    public final void rule__XTypedConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2141:1: ( rule__XTypedConstant__Group_2__1__Impl )
            // InternalXContext.g:2142:2: rule__XTypedConstant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XTypedConstant__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_2__1"


    // $ANTLR start "rule__XTypedConstant__Group_2__1__Impl"
    // InternalXContext.g:2148:1: rule__XTypedConstant__Group_2__1__Impl : ( ( rule__XTypedConstant__TypeAssignment_2_1 ) ) ;
    public final void rule__XTypedConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2152:1: ( ( ( rule__XTypedConstant__TypeAssignment_2_1 ) ) )
            // InternalXContext.g:2153:1: ( ( rule__XTypedConstant__TypeAssignment_2_1 ) )
            {
            // InternalXContext.g:2153:1: ( ( rule__XTypedConstant__TypeAssignment_2_1 ) )
            // InternalXContext.g:2154:2: ( rule__XTypedConstant__TypeAssignment_2_1 )
            {
             before(grammarAccess.getXTypedConstantAccess().getTypeAssignment_2_1()); 
            // InternalXContext.g:2155:2: ( rule__XTypedConstant__TypeAssignment_2_1 )
            // InternalXContext.g:2155:3: rule__XTypedConstant__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__XTypedConstant__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__Group_2__1__Impl"


    // $ANTLR start "rule__XTypedConstant__Group_3__0"
    // InternalXContext.g:2164:1: rule__XTypedConstant__Group_3__0 : rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1 ;
    public final void rule__XTypedConstant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2168:1: ( rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1 )
            // InternalXContext.g:2169:2: rule__XTypedConstant__Group_3__0__Impl rule__XTypedConstant__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__XTypedConstant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2176:1: rule__XTypedConstant__Group_3__0__Impl : ( '=' ) ;
    public final void rule__XTypedConstant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2180:1: ( ( '=' ) )
            // InternalXContext.g:2181:1: ( '=' )
            {
            // InternalXContext.g:2181:1: ( '=' )
            // InternalXContext.g:2182:2: '='
            {
             before(grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
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
    // InternalXContext.g:2191:1: rule__XTypedConstant__Group_3__1 : rule__XTypedConstant__Group_3__1__Impl ;
    public final void rule__XTypedConstant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2195:1: ( rule__XTypedConstant__Group_3__1__Impl )
            // InternalXContext.g:2196:2: rule__XTypedConstant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2202:1: rule__XTypedConstant__Group_3__1__Impl : ( ( rule__XTypedConstant__ValueAssignment_3_1 ) ) ;
    public final void rule__XTypedConstant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2206:1: ( ( ( rule__XTypedConstant__ValueAssignment_3_1 ) ) )
            // InternalXContext.g:2207:1: ( ( rule__XTypedConstant__ValueAssignment_3_1 ) )
            {
            // InternalXContext.g:2207:1: ( ( rule__XTypedConstant__ValueAssignment_3_1 ) )
            // InternalXContext.g:2208:2: ( rule__XTypedConstant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getXTypedConstantAccess().getValueAssignment_3_1()); 
            // InternalXContext.g:2209:2: ( rule__XTypedConstant__ValueAssignment_3_1 )
            // InternalXContext.g:2209:3: rule__XTypedConstant__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XTypedConstant__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXTypedConstantAccess().getValueAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XSingleAxiom__Group__0"
    // InternalXContext.g:2218:1: rule__XSingleAxiom__Group__0 : rule__XSingleAxiom__Group__0__Impl rule__XSingleAxiom__Group__1 ;
    public final void rule__XSingleAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2222:1: ( rule__XSingleAxiom__Group__0__Impl rule__XSingleAxiom__Group__1 )
            // InternalXContext.g:2223:2: rule__XSingleAxiom__Group__0__Impl rule__XSingleAxiom__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__XSingleAxiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__0"


    // $ANTLR start "rule__XSingleAxiom__Group__0__Impl"
    // InternalXContext.g:2230:1: rule__XSingleAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XSingleAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2234:1: ( ( () ) )
            // InternalXContext.g:2235:1: ( () )
            {
            // InternalXContext.g:2235:1: ( () )
            // InternalXContext.g:2236:2: ()
            {
             before(grammarAccess.getXSingleAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:2237:2: ()
            // InternalXContext.g:2237:3: 
            {
            }

             after(grammarAccess.getXSingleAxiomAccess().getAxiomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__0__Impl"


    // $ANTLR start "rule__XSingleAxiom__Group__1"
    // InternalXContext.g:2245:1: rule__XSingleAxiom__Group__1 : rule__XSingleAxiom__Group__1__Impl rule__XSingleAxiom__Group__2 ;
    public final void rule__XSingleAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2249:1: ( rule__XSingleAxiom__Group__1__Impl rule__XSingleAxiom__Group__2 )
            // InternalXContext.g:2250:2: rule__XSingleAxiom__Group__1__Impl rule__XSingleAxiom__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XSingleAxiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__1"


    // $ANTLR start "rule__XSingleAxiom__Group__1__Impl"
    // InternalXContext.g:2257:1: rule__XSingleAxiom__Group__1__Impl : ( ( rule__XSingleAxiom__Alternatives_1 ) ) ;
    public final void rule__XSingleAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2261:1: ( ( ( rule__XSingleAxiom__Alternatives_1 ) ) )
            // InternalXContext.g:2262:1: ( ( rule__XSingleAxiom__Alternatives_1 ) )
            {
            // InternalXContext.g:2262:1: ( ( rule__XSingleAxiom__Alternatives_1 ) )
            // InternalXContext.g:2263:2: ( rule__XSingleAxiom__Alternatives_1 )
            {
             before(grammarAccess.getXSingleAxiomAccess().getAlternatives_1()); 
            // InternalXContext.g:2264:2: ( rule__XSingleAxiom__Alternatives_1 )
            // InternalXContext.g:2264:3: rule__XSingleAxiom__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXSingleAxiomAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__1__Impl"


    // $ANTLR start "rule__XSingleAxiom__Group__2"
    // InternalXContext.g:2272:1: rule__XSingleAxiom__Group__2 : rule__XSingleAxiom__Group__2__Impl rule__XSingleAxiom__Group__3 ;
    public final void rule__XSingleAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2276:1: ( rule__XSingleAxiom__Group__2__Impl rule__XSingleAxiom__Group__3 )
            // InternalXContext.g:2277:2: rule__XSingleAxiom__Group__2__Impl rule__XSingleAxiom__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__XSingleAxiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__2"


    // $ANTLR start "rule__XSingleAxiom__Group__2__Impl"
    // InternalXContext.g:2284:1: rule__XSingleAxiom__Group__2__Impl : ( ( rule__XSingleAxiom__NameAssignment_2 ) ) ;
    public final void rule__XSingleAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2288:1: ( ( ( rule__XSingleAxiom__NameAssignment_2 ) ) )
            // InternalXContext.g:2289:1: ( ( rule__XSingleAxiom__NameAssignment_2 ) )
            {
            // InternalXContext.g:2289:1: ( ( rule__XSingleAxiom__NameAssignment_2 ) )
            // InternalXContext.g:2290:2: ( rule__XSingleAxiom__NameAssignment_2 )
            {
             before(grammarAccess.getXSingleAxiomAccess().getNameAssignment_2()); 
            // InternalXContext.g:2291:2: ( rule__XSingleAxiom__NameAssignment_2 )
            // InternalXContext.g:2291:3: rule__XSingleAxiom__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXSingleAxiomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__2__Impl"


    // $ANTLR start "rule__XSingleAxiom__Group__3"
    // InternalXContext.g:2299:1: rule__XSingleAxiom__Group__3 : rule__XSingleAxiom__Group__3__Impl ;
    public final void rule__XSingleAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2303:1: ( rule__XSingleAxiom__Group__3__Impl )
            // InternalXContext.g:2304:2: rule__XSingleAxiom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__3"


    // $ANTLR start "rule__XSingleAxiom__Group__3__Impl"
    // InternalXContext.g:2310:1: rule__XSingleAxiom__Group__3__Impl : ( ( rule__XSingleAxiom__PredicateAssignment_3 ) ) ;
    public final void rule__XSingleAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2314:1: ( ( ( rule__XSingleAxiom__PredicateAssignment_3 ) ) )
            // InternalXContext.g:2315:1: ( ( rule__XSingleAxiom__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:2315:1: ( ( rule__XSingleAxiom__PredicateAssignment_3 ) )
            // InternalXContext.g:2316:2: ( rule__XSingleAxiom__PredicateAssignment_3 )
            {
             before(grammarAccess.getXSingleAxiomAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:2317:2: ( rule__XSingleAxiom__PredicateAssignment_3 )
            // InternalXContext.g:2317:3: rule__XSingleAxiom__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XSingleAxiom__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXSingleAxiomAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__Group__3__Impl"


    // $ANTLR start "rule__XType__Group__0"
    // InternalXContext.g:2326:1: rule__XType__Group__0 : rule__XType__Group__0__Impl rule__XType__Group__1 ;
    public final void rule__XType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2330:1: ( rule__XType__Group__0__Impl rule__XType__Group__1 )
            // InternalXContext.g:2331:2: rule__XType__Group__0__Impl rule__XType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__XType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2338:1: rule__XType__Group__0__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2342:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:2343:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:2343:1: ( ruleXTypePrimitive )
            // InternalXContext.g:2344:2: ruleXTypePrimitive
            {
             before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2353:1: rule__XType__Group__1 : rule__XType__Group__1__Impl ;
    public final void rule__XType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2357:1: ( rule__XType__Group__1__Impl )
            // InternalXContext.g:2358:2: rule__XType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2364:1: rule__XType__Group__1__Impl : ( ( rule__XType__Group_1__0 )* ) ;
    public final void rule__XType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2368:1: ( ( ( rule__XType__Group_1__0 )* ) )
            // InternalXContext.g:2369:1: ( ( rule__XType__Group_1__0 )* )
            {
            // InternalXContext.g:2369:1: ( ( rule__XType__Group_1__0 )* )
            // InternalXContext.g:2370:2: ( rule__XType__Group_1__0 )*
            {
             before(grammarAccess.getXTypeAccess().getGroup_1()); 
            // InternalXContext.g:2371:2: ( rule__XType__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=14 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXContext.g:2371:3: rule__XType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__XType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalXContext.g:2380:1: rule__XType__Group_1__0 : rule__XType__Group_1__0__Impl rule__XType__Group_1__1 ;
    public final void rule__XType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2384:1: ( rule__XType__Group_1__0__Impl rule__XType__Group_1__1 )
            // InternalXContext.g:2385:2: rule__XType__Group_1__0__Impl rule__XType__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__XType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2392:1: rule__XType__Group_1__0__Impl : ( ruleXTYPEOPERATOR ) ;
    public final void rule__XType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2396:1: ( ( ruleXTYPEOPERATOR ) )
            // InternalXContext.g:2397:1: ( ruleXTYPEOPERATOR )
            {
            // InternalXContext.g:2397:1: ( ruleXTYPEOPERATOR )
            // InternalXContext.g:2398:2: ruleXTYPEOPERATOR
            {
             before(grammarAccess.getXTypeAccess().getXTYPEOPERATORParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2407:1: rule__XType__Group_1__1 : rule__XType__Group_1__1__Impl ;
    public final void rule__XType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2411:1: ( rule__XType__Group_1__1__Impl )
            // InternalXContext.g:2412:2: rule__XType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2418:1: rule__XType__Group_1__1__Impl : ( ruleXTypePrimitive ) ;
    public final void rule__XType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2422:1: ( ( ruleXTypePrimitive ) )
            // InternalXContext.g:2423:1: ( ruleXTypePrimitive )
            {
            // InternalXContext.g:2423:1: ( ruleXTypePrimitive )
            // InternalXContext.g:2424:2: ruleXTypePrimitive
            {
             before(grammarAccess.getXTypeAccess().getXTypePrimitiveParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2434:1: rule__XTypePrimitive__Group_5__0 : rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 ;
    public final void rule__XTypePrimitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2438:1: ( rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1 )
            // InternalXContext.g:2439:2: rule__XTypePrimitive__Group_5__0__Impl rule__XTypePrimitive__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__XTypePrimitive__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2446:1: rule__XTypePrimitive__Group_5__0__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2450:1: ( ( '(' ) )
            // InternalXContext.g:2451:1: ( '(' )
            {
            // InternalXContext.g:2451:1: ( '(' )
            // InternalXContext.g:2452:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalXContext.g:2461:1: rule__XTypePrimitive__Group_5__1 : rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 ;
    public final void rule__XTypePrimitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2465:1: ( rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2 )
            // InternalXContext.g:2466:2: rule__XTypePrimitive__Group_5__1__Impl rule__XTypePrimitive__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__XTypePrimitive__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2473:1: rule__XTypePrimitive__Group_5__1__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2477:1: ( ( ruleXType ) )
            // InternalXContext.g:2478:1: ( ruleXType )
            {
            // InternalXContext.g:2478:1: ( ruleXType )
            // InternalXContext.g:2479:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2488:1: rule__XTypePrimitive__Group_5__2 : rule__XTypePrimitive__Group_5__2__Impl ;
    public final void rule__XTypePrimitive__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2492:1: ( rule__XTypePrimitive__Group_5__2__Impl )
            // InternalXContext.g:2493:2: rule__XTypePrimitive__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2499:1: rule__XTypePrimitive__Group_5__2__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2503:1: ( ( ')' ) )
            // InternalXContext.g:2504:1: ( ')' )
            {
            // InternalXContext.g:2504:1: ( ')' )
            // InternalXContext.g:2505:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_5_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalXContext.g:2515:1: rule__XTypePrimitive__Group_6__0 : rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 ;
    public final void rule__XTypePrimitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2519:1: ( rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1 )
            // InternalXContext.g:2520:2: rule__XTypePrimitive__Group_6__0__Impl rule__XTypePrimitive__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__XTypePrimitive__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2527:1: rule__XTypePrimitive__Group_6__0__Impl : ( '\\u2119' ) ;
    public final void rule__XTypePrimitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2531:1: ( ( '\\u2119' ) )
            // InternalXContext.g:2532:1: ( '\\u2119' )
            {
            // InternalXContext.g:2532:1: ( '\\u2119' )
            // InternalXContext.g:2533:2: '\\u2119'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalXContext.g:2542:1: rule__XTypePrimitive__Group_6__1 : rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 ;
    public final void rule__XTypePrimitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2546:1: ( rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2 )
            // InternalXContext.g:2547:2: rule__XTypePrimitive__Group_6__1__Impl rule__XTypePrimitive__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__XTypePrimitive__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2554:1: rule__XTypePrimitive__Group_6__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2558:1: ( ( '(' ) )
            // InternalXContext.g:2559:1: ( '(' )
            {
            // InternalXContext.g:2559:1: ( '(' )
            // InternalXContext.g:2560:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalXContext.g:2569:1: rule__XTypePrimitive__Group_6__2 : rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 ;
    public final void rule__XTypePrimitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2573:1: ( rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3 )
            // InternalXContext.g:2574:2: rule__XTypePrimitive__Group_6__2__Impl rule__XTypePrimitive__Group_6__3
            {
            pushFollow(FOLLOW_18);
            rule__XTypePrimitive__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2581:1: rule__XTypePrimitive__Group_6__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2585:1: ( ( ruleXType ) )
            // InternalXContext.g:2586:1: ( ruleXType )
            {
            // InternalXContext.g:2586:1: ( ruleXType )
            // InternalXContext.g:2587:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_6_2()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2596:1: rule__XTypePrimitive__Group_6__3 : rule__XTypePrimitive__Group_6__3__Impl ;
    public final void rule__XTypePrimitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2600:1: ( rule__XTypePrimitive__Group_6__3__Impl )
            // InternalXContext.g:2601:2: rule__XTypePrimitive__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2607:1: rule__XTypePrimitive__Group_6__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2611:1: ( ( ')' ) )
            // InternalXContext.g:2612:1: ( ')' )
            {
            // InternalXContext.g:2612:1: ( ')' )
            // InternalXContext.g:2613:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_6_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalXContext.g:2623:1: rule__XTypePrimitive__Group_7__0 : rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 ;
    public final void rule__XTypePrimitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2627:1: ( rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1 )
            // InternalXContext.g:2628:2: rule__XTypePrimitive__Group_7__0__Impl rule__XTypePrimitive__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__XTypePrimitive__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2635:1: rule__XTypePrimitive__Group_7__0__Impl : ( '\\u21191' ) ;
    public final void rule__XTypePrimitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2639:1: ( ( '\\u21191' ) )
            // InternalXContext.g:2640:1: ( '\\u21191' )
            {
            // InternalXContext.g:2640:1: ( '\\u21191' )
            // InternalXContext.g:2641:2: '\\u21191'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getDoubleStruckCapitalPDigitOneKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalXContext.g:2650:1: rule__XTypePrimitive__Group_7__1 : rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 ;
    public final void rule__XTypePrimitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2654:1: ( rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2 )
            // InternalXContext.g:2655:2: rule__XTypePrimitive__Group_7__1__Impl rule__XTypePrimitive__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__XTypePrimitive__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2662:1: rule__XTypePrimitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__XTypePrimitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2666:1: ( ( '(' ) )
            // InternalXContext.g:2667:1: ( '(' )
            {
            // InternalXContext.g:2667:1: ( '(' )
            // InternalXContext.g:2668:2: '('
            {
             before(grammarAccess.getXTypePrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalXContext.g:2677:1: rule__XTypePrimitive__Group_7__2 : rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 ;
    public final void rule__XTypePrimitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2681:1: ( rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3 )
            // InternalXContext.g:2682:2: rule__XTypePrimitive__Group_7__2__Impl rule__XTypePrimitive__Group_7__3
            {
            pushFollow(FOLLOW_18);
            rule__XTypePrimitive__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2689:1: rule__XTypePrimitive__Group_7__2__Impl : ( ruleXType ) ;
    public final void rule__XTypePrimitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2693:1: ( ( ruleXType ) )
            // InternalXContext.g:2694:1: ( ruleXType )
            {
            // InternalXContext.g:2694:1: ( ruleXType )
            // InternalXContext.g:2695:2: ruleXType
            {
             before(grammarAccess.getXTypePrimitiveAccess().getXTypeParserRuleCall_7_2()); 
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2704:1: rule__XTypePrimitive__Group_7__3 : rule__XTypePrimitive__Group_7__3__Impl ;
    public final void rule__XTypePrimitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2708:1: ( rule__XTypePrimitive__Group_7__3__Impl )
            // InternalXContext.g:2709:2: rule__XTypePrimitive__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2715:1: rule__XTypePrimitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__XTypePrimitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2719:1: ( ( ')' ) )
            // InternalXContext.g:2720:1: ( ')' )
            {
            // InternalXContext.g:2720:1: ( ')' )
            // InternalXContext.g:2721:2: ')'
            {
             before(grammarAccess.getXTypePrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalXContext.g:2731:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2735:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXContext.g:2736:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXContext.g:2743:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2747:1: ( ( '%' ) )
            // InternalXContext.g:2748:1: ( '%' )
            {
            // InternalXContext.g:2748:1: ( '%' )
            // InternalXContext.g:2749:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,121,FOLLOW_2); 
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
    // InternalXContext.g:2758:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2762:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXContext.g:2763:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXContext.g:2769:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2773:1: ( ( '\\u22C2' ) )
            // InternalXContext.g:2774:1: ( '\\u22C2' )
            {
            // InternalXContext.g:2774:1: ( '\\u22C2' )
            // InternalXContext.g:2775:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,122,FOLLOW_2); 
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
    // InternalXContext.g:2785:1: rule__XRecord__Group__0 : rule__XRecord__Group__0__Impl rule__XRecord__Group__1 ;
    public final void rule__XRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2789:1: ( rule__XRecord__Group__0__Impl rule__XRecord__Group__1 )
            // InternalXContext.g:2790:2: rule__XRecord__Group__0__Impl rule__XRecord__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__XRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2797:1: rule__XRecord__Group__0__Impl : ( () ) ;
    public final void rule__XRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2801:1: ( ( () ) )
            // InternalXContext.g:2802:1: ( () )
            {
            // InternalXContext.g:2802:1: ( () )
            // InternalXContext.g:2803:2: ()
            {
             before(grammarAccess.getXRecordAccess().getRecordAction_0()); 
            // InternalXContext.g:2804:2: ()
            // InternalXContext.g:2804:3: 
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
    // InternalXContext.g:2812:1: rule__XRecord__Group__1 : rule__XRecord__Group__1__Impl rule__XRecord__Group__2 ;
    public final void rule__XRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2816:1: ( rule__XRecord__Group__1__Impl rule__XRecord__Group__2 )
            // InternalXContext.g:2817:2: rule__XRecord__Group__1__Impl rule__XRecord__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2824:1: rule__XRecord__Group__1__Impl : ( 'record' ) ;
    public final void rule__XRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2828:1: ( ( 'record' ) )
            // InternalXContext.g:2829:1: ( 'record' )
            {
            // InternalXContext.g:2829:1: ( 'record' )
            // InternalXContext.g:2830:2: 'record'
            {
             before(grammarAccess.getXRecordAccess().getRecordKeyword_1()); 
            match(input,123,FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getRecordKeyword_1()); 

            }


            }

        }
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
    // InternalXContext.g:2839:1: rule__XRecord__Group__2 : rule__XRecord__Group__2__Impl rule__XRecord__Group__3 ;
    public final void rule__XRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2843:1: ( rule__XRecord__Group__2__Impl rule__XRecord__Group__3 )
            // InternalXContext.g:2844:2: rule__XRecord__Group__2__Impl rule__XRecord__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__XRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2851:1: rule__XRecord__Group__2__Impl : ( ( rule__XRecord__NameAssignment_2 ) ) ;
    public final void rule__XRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2855:1: ( ( ( rule__XRecord__NameAssignment_2 ) ) )
            // InternalXContext.g:2856:1: ( ( rule__XRecord__NameAssignment_2 ) )
            {
            // InternalXContext.g:2856:1: ( ( rule__XRecord__NameAssignment_2 ) )
            // InternalXContext.g:2857:2: ( rule__XRecord__NameAssignment_2 )
            {
             before(grammarAccess.getXRecordAccess().getNameAssignment_2()); 
            // InternalXContext.g:2858:2: ( rule__XRecord__NameAssignment_2 )
            // InternalXContext.g:2858:3: rule__XRecord__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:2866:1: rule__XRecord__Group__3 : rule__XRecord__Group__3__Impl rule__XRecord__Group__4 ;
    public final void rule__XRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2870:1: ( rule__XRecord__Group__3__Impl rule__XRecord__Group__4 )
            // InternalXContext.g:2871:2: rule__XRecord__Group__3__Impl rule__XRecord__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__XRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2878:1: rule__XRecord__Group__3__Impl : ( ( rule__XRecord__Group_3__0 )? ) ;
    public final void rule__XRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2882:1: ( ( ( rule__XRecord__Group_3__0 )? ) )
            // InternalXContext.g:2883:1: ( ( rule__XRecord__Group_3__0 )? )
            {
            // InternalXContext.g:2883:1: ( ( rule__XRecord__Group_3__0 )? )
            // InternalXContext.g:2884:2: ( rule__XRecord__Group_3__0 )?
            {
             before(grammarAccess.getXRecordAccess().getGroup_3()); 
            // InternalXContext.g:2885:2: ( rule__XRecord__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==124) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXContext.g:2885:3: rule__XRecord__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XRecord__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXRecordAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXContext.g:2893:1: rule__XRecord__Group__4 : rule__XRecord__Group__4__Impl ;
    public final void rule__XRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2897:1: ( rule__XRecord__Group__4__Impl )
            // InternalXContext.g:2898:2: rule__XRecord__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2904:1: rule__XRecord__Group__4__Impl : ( ( rule__XRecord__Group_4__0 )? ) ;
    public final void rule__XRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2908:1: ( ( ( rule__XRecord__Group_4__0 )? ) )
            // InternalXContext.g:2909:1: ( ( rule__XRecord__Group_4__0 )? )
            {
            // InternalXContext.g:2909:1: ( ( rule__XRecord__Group_4__0 )? )
            // InternalXContext.g:2910:2: ( rule__XRecord__Group_4__0 )?
            {
             before(grammarAccess.getXRecordAccess().getGroup_4()); 
            // InternalXContext.g:2911:2: ( rule__XRecord__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXContext.g:2911:3: rule__XRecord__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__XRecord__Group_3__0"
    // InternalXContext.g:2920:1: rule__XRecord__Group_3__0 : rule__XRecord__Group_3__0__Impl rule__XRecord__Group_3__1 ;
    public final void rule__XRecord__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2924:1: ( rule__XRecord__Group_3__0__Impl rule__XRecord__Group_3__1 )
            // InternalXContext.g:2925:2: rule__XRecord__Group_3__0__Impl rule__XRecord__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRecord__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_3__0"


    // $ANTLR start "rule__XRecord__Group_3__0__Impl"
    // InternalXContext.g:2932:1: rule__XRecord__Group_3__0__Impl : ( 'inherits' ) ;
    public final void rule__XRecord__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2936:1: ( ( 'inherits' ) )
            // InternalXContext.g:2937:1: ( 'inherits' )
            {
            // InternalXContext.g:2937:1: ( 'inherits' )
            // InternalXContext.g:2938:2: 'inherits'
            {
             before(grammarAccess.getXRecordAccess().getInheritsKeyword_3_0()); 
            match(input,124,FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getInheritsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_3__0__Impl"


    // $ANTLR start "rule__XRecord__Group_3__1"
    // InternalXContext.g:2947:1: rule__XRecord__Group_3__1 : rule__XRecord__Group_3__1__Impl ;
    public final void rule__XRecord__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2951:1: ( rule__XRecord__Group_3__1__Impl )
            // InternalXContext.g:2952:2: rule__XRecord__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_3__1"


    // $ANTLR start "rule__XRecord__Group_3__1__Impl"
    // InternalXContext.g:2958:1: rule__XRecord__Group_3__1__Impl : ( ( rule__XRecord__SubsetsAssignment_3_1 ) ) ;
    public final void rule__XRecord__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2962:1: ( ( ( rule__XRecord__SubsetsAssignment_3_1 ) ) )
            // InternalXContext.g:2963:1: ( ( rule__XRecord__SubsetsAssignment_3_1 ) )
            {
            // InternalXContext.g:2963:1: ( ( rule__XRecord__SubsetsAssignment_3_1 ) )
            // InternalXContext.g:2964:2: ( rule__XRecord__SubsetsAssignment_3_1 )
            {
             before(grammarAccess.getXRecordAccess().getSubsetsAssignment_3_1()); 
            // InternalXContext.g:2965:2: ( rule__XRecord__SubsetsAssignment_3_1 )
            // InternalXContext.g:2965:3: rule__XRecord__SubsetsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__SubsetsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getSubsetsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__Group_3__1__Impl"


    // $ANTLR start "rule__XRecord__Group_4__0"
    // InternalXContext.g:2974:1: rule__XRecord__Group_4__0 : rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 ;
    public final void rule__XRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2978:1: ( rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1 )
            // InternalXContext.g:2979:2: rule__XRecord__Group_4__0__Impl rule__XRecord__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__XRecord__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:2986:1: rule__XRecord__Group_4__0__Impl : ( ( rule__XRecord__FieldsAssignment_4_0 ) ) ;
    public final void rule__XRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2990:1: ( ( ( rule__XRecord__FieldsAssignment_4_0 ) ) )
            // InternalXContext.g:2991:1: ( ( rule__XRecord__FieldsAssignment_4_0 ) )
            {
            // InternalXContext.g:2991:1: ( ( rule__XRecord__FieldsAssignment_4_0 ) )
            // InternalXContext.g:2992:2: ( rule__XRecord__FieldsAssignment_4_0 )
            {
             before(grammarAccess.getXRecordAccess().getFieldsAssignment_4_0()); 
            // InternalXContext.g:2993:2: ( rule__XRecord__FieldsAssignment_4_0 )
            // InternalXContext.g:2993:3: rule__XRecord__FieldsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__XRecord__FieldsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getXRecordAccess().getFieldsAssignment_4_0()); 

            }


            }

        }
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
    // InternalXContext.g:3001:1: rule__XRecord__Group_4__1 : rule__XRecord__Group_4__1__Impl ;
    public final void rule__XRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3005:1: ( rule__XRecord__Group_4__1__Impl )
            // InternalXContext.g:3006:2: rule__XRecord__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:3012:1: rule__XRecord__Group_4__1__Impl : ( ( rule__XRecord__FieldsAssignment_4_1 )* ) ;
    public final void rule__XRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3016:1: ( ( ( rule__XRecord__FieldsAssignment_4_1 )* ) )
            // InternalXContext.g:3017:1: ( ( rule__XRecord__FieldsAssignment_4_1 )* )
            {
            // InternalXContext.g:3017:1: ( ( rule__XRecord__FieldsAssignment_4_1 )* )
            // InternalXContext.g:3018:2: ( rule__XRecord__FieldsAssignment_4_1 )*
            {
             before(grammarAccess.getXRecordAccess().getFieldsAssignment_4_1()); 
            // InternalXContext.g:3019:2: ( rule__XRecord__FieldsAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXContext.g:3019:3: rule__XRecord__FieldsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XRecord__FieldsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getXRecordAccess().getFieldsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalXContext.g:3028:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3032:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXContext.g:3033:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:3040:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3044:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalXContext.g:3045:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalXContext.g:3045:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalXContext.g:3046:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalXContext.g:3047:2: ( rule__Field__NameAssignment_0 )
            // InternalXContext.g:3047:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalXContext.g:3055:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3059:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXContext.g:3060:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:3067:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3071:1: ( ( ':' ) )
            // InternalXContext.g:3072:1: ( ':' )
            {
            // InternalXContext.g:3072:1: ( ':' )
            // InternalXContext.g:3073:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalXContext.g:3082:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3086:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXContext.g:3087:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:3094:1: rule__Field__Group__2__Impl : ( ( rule__Field__MultiplicityAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3098:1: ( ( ( rule__Field__MultiplicityAssignment_2 )? ) )
            // InternalXContext.g:3099:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            {
            // InternalXContext.g:3099:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            // InternalXContext.g:3100:2: ( rule__Field__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getMultiplicityAssignment_2()); 
            // InternalXContext.g:3101:2: ( rule__Field__MultiplicityAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=112 && LA24_0<=114)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXContext.g:3101:3: rule__Field__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__MultiplicityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getMultiplicityAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:3109:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3113:1: ( rule__Field__Group__3__Impl )
            // InternalXContext.g:3114:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:3120:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3124:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // InternalXContext.g:3125:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // InternalXContext.g:3125:1: ( ( rule__Field__TypeAssignment_3 ) )
            // InternalXContext.g:3126:2: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // InternalXContext.g:3127:2: ( rule__Field__TypeAssignment_3 )
            // InternalXContext.g:3127:3: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__NameAssignment_2"
    // InternalXContext.g:3136:1: rule__XContext__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3140:1: ( ( RULE_ID ) )
            // InternalXContext.g:3141:2: ( RULE_ID )
            {
            // InternalXContext.g:3141:2: ( RULE_ID )
            // InternalXContext.g:3142:3: RULE_ID
            {
             before(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__NameAssignment_2"


    // $ANTLR start "rule__XContext__ExtendsAssignment_3_1"
    // InternalXContext.g:3151:1: rule__XContext__ExtendsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3155:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:3156:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:3156:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:3157:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_3_1_0()); 
            // InternalXContext.g:3158:3: ( ruleQualifiedName )
            // InternalXContext.g:3159:4: ruleQualifiedName
            {
             before(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtendsContextQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getXContextAccess().getExtendsContextCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtendsAssignment_3_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_0_1"
    // InternalXContext.g:3170:1: rule__XContext__OrderedChildrenAssignment_4_0_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3174:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:3175:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:3175:2: ( ruleXCarrierSet )
            // InternalXContext.g:3176:3: ruleXCarrierSet
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXCarrierSetParserRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_0_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_1_1"
    // InternalXContext.g:3185:1: rule__XContext__OrderedChildrenAssignment_4_1_1 : ( ruleXConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3189:1: ( ( ruleXConstant ) )
            // InternalXContext.g:3190:2: ( ruleXConstant )
            {
            // InternalXContext.g:3190:2: ( ruleXConstant )
            // InternalXContext.g:3191:3: ruleXConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXConstantParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_1_1"


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_2_1"
    // InternalXContext.g:3200:1: rule__XContext__OrderedChildrenAssignment_4_2_1 : ( ruleXTypedConstant ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3204:1: ( ( ruleXTypedConstant ) )
            // InternalXContext.g:3205:2: ( ruleXTypedConstant )
            {
            // InternalXContext.g:3205:2: ( ruleXTypedConstant )
            // InternalXContext.g:3206:3: ruleXTypedConstant
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXTypedConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXTypedConstantParserRuleCall_4_2_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:3215:1: rule__XContext__OrderedChildrenAssignment_4_3 : ( ruleXRecord ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3219:1: ( ( ruleXRecord ) )
            // InternalXContext.g:3220:2: ( ruleXRecord )
            {
            // InternalXContext.g:3220:2: ( ruleXRecord )
            // InternalXContext.g:3221:3: ruleXRecord
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXRecord();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXRecordParserRuleCall_4_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__OrderedChildrenAssignment_4_4"
    // InternalXContext.g:3230:1: rule__XContext__OrderedChildrenAssignment_4_4 : ( ruleXSingleAxiom ) ;
    public final void rule__XContext__OrderedChildrenAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3234:1: ( ( ruleXSingleAxiom ) )
            // InternalXContext.g:3235:2: ( ruleXSingleAxiom )
            {
            // InternalXContext.g:3235:2: ( ruleXSingleAxiom )
            // InternalXContext.g:3236:3: ruleXSingleAxiom
            {
             before(grammarAccess.getXContextAccess().getOrderedChildrenXSingleAxiomParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXSingleAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getOrderedChildrenXSingleAxiomParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__OrderedChildrenAssignment_4_4"


    // $ANTLR start "rule__XCarrierSet__NameAssignment_1"
    // InternalXContext.g:3245:1: rule__XCarrierSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3249:1: ( ( RULE_ID ) )
            // InternalXContext.g:3250:2: ( RULE_ID )
            {
            // InternalXContext.g:3250:2: ( RULE_ID )
            // InternalXContext.g:3251:3: RULE_ID
            {
             before(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCarrierSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCarrierSet__NameAssignment_1"


    // $ANTLR start "rule__XConstant__NameAssignment_1"
    // InternalXContext.g:3260:1: rule__XConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3264:1: ( ( RULE_ID ) )
            // InternalXContext.g:3265:2: ( RULE_ID )
            {
            // InternalXContext.g:3265:2: ( RULE_ID )
            // InternalXContext.g:3266:3: RULE_ID
            {
             before(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XConstant__NameAssignment_1"


    // $ANTLR start "rule__XTypedConstant__NameAssignment_1"
    // InternalXContext.g:3275:1: rule__XTypedConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XTypedConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3279:1: ( ( RULE_ID ) )
            // InternalXContext.g:3280:2: ( RULE_ID )
            {
            // InternalXContext.g:3280:2: ( RULE_ID )
            // InternalXContext.g:3281:3: RULE_ID
            {
             before(grammarAccess.getXTypedConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXTypedConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__NameAssignment_1"


    // $ANTLR start "rule__XTypedConstant__TypeAssignment_2_1"
    // InternalXContext.g:3290:1: rule__XTypedConstant__TypeAssignment_2_1 : ( ruleXType ) ;
    public final void rule__XTypedConstant__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3294:1: ( ( ruleXType ) )
            // InternalXContext.g:3295:2: ( ruleXType )
            {
            // InternalXContext.g:3295:2: ( ruleXType )
            // InternalXContext.g:3296:3: ruleXType
            {
             before(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getXTypedConstantAccess().getTypeXTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__TypeAssignment_2_1"


    // $ANTLR start "rule__XTypedConstant__ValueAssignment_3_1"
    // InternalXContext.g:3305:1: rule__XTypedConstant__ValueAssignment_3_1 : ( ruleXFormula ) ;
    public final void rule__XTypedConstant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3309:1: ( ( ruleXFormula ) )
            // InternalXContext.g:3310:2: ( ruleXFormula )
            {
            // InternalXContext.g:3310:2: ( ruleXFormula )
            // InternalXContext.g:3311:3: ruleXFormula
            {
             before(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXTypedConstantAccess().getValueXFormulaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XTypedConstant__ValueAssignment_3_1"


    // $ANTLR start "rule__XSingleAxiom__TheoremAssignment_1_0"
    // InternalXContext.g:3320:1: rule__XSingleAxiom__TheoremAssignment_1_0 : ( ( 'theorem' ) ) ;
    public final void rule__XSingleAxiom__TheoremAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3324:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:3325:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:3325:2: ( ( 'theorem' ) )
            // InternalXContext.g:3326:3: ( 'theorem' )
            {
             before(grammarAccess.getXSingleAxiomAccess().getTheoremTheoremKeyword_1_0_0()); 
            // InternalXContext.g:3327:3: ( 'theorem' )
            // InternalXContext.g:3328:4: 'theorem'
            {
             before(grammarAccess.getXSingleAxiomAccess().getTheoremTheoremKeyword_1_0_0()); 
            match(input,125,FOLLOW_2); 
             after(grammarAccess.getXSingleAxiomAccess().getTheoremTheoremKeyword_1_0_0()); 

            }

             after(grammarAccess.getXSingleAxiomAccess().getTheoremTheoremKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__TheoremAssignment_1_0"


    // $ANTLR start "rule__XSingleAxiom__NameAssignment_2"
    // InternalXContext.g:3339:1: rule__XSingleAxiom__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XSingleAxiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3343:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:3344:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:3344:2: ( RULE_XLABEL )
            // InternalXContext.g:3345:3: RULE_XLABEL
            {
             before(grammarAccess.getXSingleAxiomAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
             after(grammarAccess.getXSingleAxiomAccess().getNameXLABELTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__NameAssignment_2"


    // $ANTLR start "rule__XSingleAxiom__PredicateAssignment_3"
    // InternalXContext.g:3354:1: rule__XSingleAxiom__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XSingleAxiom__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3358:1: ( ( ruleXFormula ) )
            // InternalXContext.g:3359:2: ( ruleXFormula )
            {
            // InternalXContext.g:3359:2: ( ruleXFormula )
            // InternalXContext.g:3360:3: ruleXFormula
            {
             before(grammarAccess.getXSingleAxiomAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXSingleAxiomAccess().getPredicateXFormulaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XSingleAxiom__PredicateAssignment_3"


    // $ANTLR start "rule__XRecord__NameAssignment_2"
    // InternalXContext.g:3369:1: rule__XRecord__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XRecord__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3373:1: ( ( RULE_ID ) )
            // InternalXContext.g:3374:2: ( RULE_ID )
            {
            // InternalXContext.g:3374:2: ( RULE_ID )
            // InternalXContext.g:3375:3: RULE_ID
            {
             before(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__NameAssignment_2"


    // $ANTLR start "rule__XRecord__SubsetsAssignment_3_1"
    // InternalXContext.g:3384:1: rule__XRecord__SubsetsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__XRecord__SubsetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3388:1: ( ( ( RULE_ID ) ) )
            // InternalXContext.g:3389:2: ( ( RULE_ID ) )
            {
            // InternalXContext.g:3389:2: ( ( RULE_ID ) )
            // InternalXContext.g:3390:3: ( RULE_ID )
            {
             before(grammarAccess.getXRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 
            // InternalXContext.g:3391:3: ( RULE_ID )
            // InternalXContext.g:3392:4: RULE_ID
            {
             before(grammarAccess.getXRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getXRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__SubsetsAssignment_3_1"


    // $ANTLR start "rule__XRecord__FieldsAssignment_4_0"
    // InternalXContext.g:3403:1: rule__XRecord__FieldsAssignment_4_0 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3407:1: ( ( ruleField ) )
            // InternalXContext.g:3408:2: ( ruleField )
            {
            // InternalXContext.g:3408:2: ( ruleField )
            // InternalXContext.g:3409:3: ruleField
            {
             before(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__FieldsAssignment_4_0"


    // $ANTLR start "rule__XRecord__FieldsAssignment_4_1"
    // InternalXContext.g:3418:1: rule__XRecord__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__XRecord__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3422:1: ( ( ruleField ) )
            // InternalXContext.g:3423:2: ( ruleField )
            {
            // InternalXContext.g:3423:2: ( ruleField )
            // InternalXContext.g:3424:3: ruleField
            {
             before(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getXRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRecord__FieldsAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalXContext.g:3433:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3437:1: ( ( RULE_ID ) )
            // InternalXContext.g:3438:2: ( RULE_ID )
            {
            // InternalXContext.g:3438:2: ( RULE_ID )
            // InternalXContext.g:3439:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalXContext.g:3448:1: rule__Field__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3452:1: ( ( ruleMultiplicity ) )
            // InternalXContext.g:3453:2: ( ruleMultiplicity )
            {
            // InternalXContext.g:3453:2: ( ruleMultiplicity )
            // InternalXContext.g:3454:3: ruleMultiplicity
            {
             before(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMultiplicityMultiplicityEnumRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:3463:1: rule__Field__TypeAssignment_3 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:3467:1: ( ( ruleFieldType ) )
            // InternalXContext.g:3468:2: ( ruleFieldType )
            {
            // InternalXContext.g:3468:2: ( ruleFieldType )
            // InternalXContext.g:3469:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_3_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFC072L,0x0200FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L,0x29F0000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L,0x29C0000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000380003C000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFFFFFFC070L,0x0200FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L,0x29C0000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003FFC002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L,0x1000000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001FFFFFC000010L,0x0007000000000000L});

}