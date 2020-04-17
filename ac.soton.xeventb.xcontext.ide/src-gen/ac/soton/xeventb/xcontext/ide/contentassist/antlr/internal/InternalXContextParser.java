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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_XLABEL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'FALSE'", "'TRUE'", "'bool'", "'card'", "'dom'", "'finite'", "'id'", "'inter'", "'max'", "'min'", "'mod'", "'pred'", "'prj1'", "'prj2'", "'ran'", "'succ'", "'union'", "'\\u21151'", "'\\u2115'", "'\\u21191'", "'\\u2119'", "'\\u2124'", "'('", "')'", "'\\u21D4'", "'\\u21D2'", "'\\u2227'", "'&'", "'\\u2228'", "'\\u00AC'", "'\\u22A4'", "'\\u22A5'", "'\\u2200'", "'!'", "'\\u2203'", "'#'", "','", "'\\u00B7'", "'.'", "'='", "'\\u2260'", "'\\u2264'", "'<'", "'\\u2265'", "'>'", "'\\u2208'", "':'", "'\\u2209'", "'\\u2282'", "'\\u2284'", "'\\u2286'", "'\\u2288'", "'partition'", "'\\u2194'", "'\\uE100'", "'\\uE101'", "'\\uE102'", "'\\u21F8'", "'\\u2192'", "'\\u2914'", "'\\u21A3'", "'\\u2900'", "'\\u21A0'", "'\\u2916'", "'{'", "'}'", "'\\u21A6'", "'\\u2205'", "'\\u2229'", "'\\u222A'", "'\\u2216'", "'\\u00D7'", "'['", "']'", "'\\uE103'", "'\\u2218'", "';'", "'\\u2297'", "'\\u2225'", "'\\u223C'", "'\\u25C1'", "'\\u2A64'", "'\\u25B7'", "'\\u2A65'", "'\\u03BB'", "'\\u22C3'", "'\\u2223'", "'\\u2025'", "'+'", "'\\u2212'", "'-'", "'\\u2217'", "'*'", "'\\u00F7'", "'/'", "'^'", "'\\\\'", "'one'", "'many'", "'opt'", "'context'", "'end'", "'extends'", "'sets'", "'constants'", "'records'", "'axioms'", "'%'", "'\\u22C2'", "'record'", "'theorem'"
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
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
    public static final int RULE_XLABEL=6;
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


    // $ANTLR start "entryRuleXAxiom"
    // InternalXContext.g:153:1: entryRuleXAxiom : ruleXAxiom EOF ;
    public final void entryRuleXAxiom() throws RecognitionException {
        try {
            // InternalXContext.g:154:1: ( ruleXAxiom EOF )
            // InternalXContext.g:155:1: ruleXAxiom EOF
            {
             before(grammarAccess.getXAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXAxiomRule()); 
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
    // $ANTLR end "entryRuleXAxiom"


    // $ANTLR start "ruleXAxiom"
    // InternalXContext.g:162:1: ruleXAxiom : ( ( rule__XAxiom__Group__0 ) ) ;
    public final void ruleXAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:166:2: ( ( ( rule__XAxiom__Group__0 ) ) )
            // InternalXContext.g:167:2: ( ( rule__XAxiom__Group__0 ) )
            {
            // InternalXContext.g:167:2: ( ( rule__XAxiom__Group__0 ) )
            // InternalXContext.g:168:3: ( rule__XAxiom__Group__0 )
            {
             before(grammarAccess.getXAxiomAccess().getGroup()); 
            // InternalXContext.g:169:3: ( rule__XAxiom__Group__0 )
            // InternalXContext.g:169:4: rule__XAxiom__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:178:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalXContext.g:179:1: ( ruleXFormula EOF )
            // InternalXContext.g:180:1: ruleXFormula EOF
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
    // InternalXContext.g:187:1: ruleXFormula : ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:191:2: ( ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) ) )
            // InternalXContext.g:192:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            {
            // InternalXContext.g:192:2: ( ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* ) )
            // InternalXContext.g:193:3: ( ( rule__XFormula__Alternatives ) ) ( ( rule__XFormula__Alternatives )* )
            {
            // InternalXContext.g:193:3: ( ( rule__XFormula__Alternatives ) )
            // InternalXContext.g:194:4: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:195:4: ( rule__XFormula__Alternatives )
            // InternalXContext.g:195:5: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }

            // InternalXContext.g:198:3: ( ( rule__XFormula__Alternatives )* )
            // InternalXContext.g:199:4: ( rule__XFormula__Alternatives )*
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalXContext.g:200:4: ( rule__XFormula__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=12 && LA1_0<=109)||LA1_0==120) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXContext.g:200:5: rule__XFormula__Alternatives
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


    // $ANTLR start "entryRuleEVENTB_IDENTIFIER_KEYWORD"
    // InternalXContext.g:210:1: entryRuleEVENTB_IDENTIFIER_KEYWORD : ruleEVENTB_IDENTIFIER_KEYWORD EOF ;
    public final void entryRuleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {
        try {
            // InternalXContext.g:211:1: ( ruleEVENTB_IDENTIFIER_KEYWORD EOF )
            // InternalXContext.g:212:1: ruleEVENTB_IDENTIFIER_KEYWORD EOF
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
    // InternalXContext.g:219:1: ruleEVENTB_IDENTIFIER_KEYWORD : ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) ;
    public final void ruleEVENTB_IDENTIFIER_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:223:2: ( ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) ) )
            // InternalXContext.g:224:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            {
            // InternalXContext.g:224:2: ( ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives ) )
            // InternalXContext.g:225:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            {
             before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getAlternatives()); 
            // InternalXContext.g:226:3: ( rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives )
            // InternalXContext.g:226:4: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives
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
    // InternalXContext.g:235:1: entryRuleEVENTB_PREDICATE_SYMBOLS : ruleEVENTB_PREDICATE_SYMBOLS EOF ;
    public final void entryRuleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:236:1: ( ruleEVENTB_PREDICATE_SYMBOLS EOF )
            // InternalXContext.g:237:1: ruleEVENTB_PREDICATE_SYMBOLS EOF
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
    // InternalXContext.g:244:1: ruleEVENTB_PREDICATE_SYMBOLS : ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_PREDICATE_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:248:2: ( ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:249:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:249:2: ( ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives ) )
            // InternalXContext.g:250:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:251:3: ( rule__EVENTB_PREDICATE_SYMBOLS__Alternatives )
            // InternalXContext.g:251:4: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives
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
    // InternalXContext.g:260:1: entryRuleEVENTB_EXPRESSION_SYMBOLS : ruleEVENTB_EXPRESSION_SYMBOLS EOF ;
    public final void entryRuleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {
        try {
            // InternalXContext.g:261:1: ( ruleEVENTB_EXPRESSION_SYMBOLS EOF )
            // InternalXContext.g:262:1: ruleEVENTB_EXPRESSION_SYMBOLS EOF
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
    // InternalXContext.g:269:1: ruleEVENTB_EXPRESSION_SYMBOLS : ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) ;
    public final void ruleEVENTB_EXPRESSION_SYMBOLS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:273:2: ( ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) ) )
            // InternalXContext.g:274:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            {
            // InternalXContext.g:274:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives ) )
            // InternalXContext.g:275:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAlternatives()); 
            // InternalXContext.g:276:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives )
            // InternalXContext.g:276:4: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives
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


    // $ANTLR start "entryRuleRecord"
    // InternalXContext.g:285:1: entryRuleRecord : ruleRecord EOF ;
    public final void entryRuleRecord() throws RecognitionException {
        try {
            // InternalXContext.g:286:1: ( ruleRecord EOF )
            // InternalXContext.g:287:1: ruleRecord EOF
            {
             before(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleRecord();

            state._fsp--;

             after(grammarAccess.getRecordRule()); 
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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // InternalXContext.g:294:1: ruleRecord : ( ( rule__Record__Group__0 ) ) ;
    public final void ruleRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:298:2: ( ( ( rule__Record__Group__0 ) ) )
            // InternalXContext.g:299:2: ( ( rule__Record__Group__0 ) )
            {
            // InternalXContext.g:299:2: ( ( rule__Record__Group__0 ) )
            // InternalXContext.g:300:3: ( rule__Record__Group__0 )
            {
             before(grammarAccess.getRecordAccess().getGroup()); 
            // InternalXContext.g:301:3: ( rule__Record__Group__0 )
            // InternalXContext.g:301:4: rule__Record__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleField"
    // InternalXContext.g:310:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalXContext.g:311:1: ( ruleField EOF )
            // InternalXContext.g:312:1: ruleField EOF
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
    // InternalXContext.g:319:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:323:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalXContext.g:324:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalXContext.g:324:2: ( ( rule__Field__Group__0 ) )
            // InternalXContext.g:325:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalXContext.g:326:3: ( rule__Field__Group__0 )
            // InternalXContext.g:326:4: rule__Field__Group__0
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
    // InternalXContext.g:335:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:339:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalXContext.g:340:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalXContext.g:340:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalXContext.g:341:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalXContext.g:342:3: ( rule__Multiplicity__Alternatives )
            // InternalXContext.g:342:4: rule__Multiplicity__Alternatives
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


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalXContext.g:350:1: rule__XFormula__Alternatives : ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:354:1: ( ( ruleEVENTB_IDENTIFIER_KEYWORD ) | ( ruleEVENTB_PREDICATE_SYMBOLS ) | ( ruleEVENTB_EXPRESSION_SYMBOLS ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt2=5;
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
                alt2=1;
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
                alt2=2;
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
            case 120:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
                {
                alt2=4;
                }
                break;
            case RULE_INT:
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
                    // InternalXContext.g:355:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    {
                    // InternalXContext.g:355:2: ( ruleEVENTB_IDENTIFIER_KEYWORD )
                    // InternalXContext.g:356:3: ruleEVENTB_IDENTIFIER_KEYWORD
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
                    // InternalXContext.g:361:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    {
                    // InternalXContext.g:361:2: ( ruleEVENTB_PREDICATE_SYMBOLS )
                    // InternalXContext.g:362:3: ruleEVENTB_PREDICATE_SYMBOLS
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
                    // InternalXContext.g:367:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    {
                    // InternalXContext.g:367:2: ( ruleEVENTB_EXPRESSION_SYMBOLS )
                    // InternalXContext.g:368:3: ruleEVENTB_EXPRESSION_SYMBOLS
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
                    // InternalXContext.g:373:2: ( RULE_ID )
                    {
                    // InternalXContext.g:373:2: ( RULE_ID )
                    // InternalXContext.g:374:3: RULE_ID
                    {
                     before(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getIDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:379:2: ( RULE_INT )
                    {
                    // InternalXContext.g:379:2: ( RULE_INT )
                    // InternalXContext.g:380:3: RULE_INT
                    {
                     before(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getXFormulaAccess().getINTTerminalRuleCall_4()); 

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
    // InternalXContext.g:389:1: rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives : ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) );
    public final void rule__EVENTB_IDENTIFIER_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:393:1: ( ( 'BOOL' ) | ( 'FALSE' ) | ( 'TRUE' ) | ( 'bool' ) | ( 'card' ) | ( 'dom' ) | ( 'finite' ) | ( 'id' ) | ( 'inter' ) | ( 'max' ) | ( 'min' ) | ( 'mod' ) | ( 'pred' ) | ( 'prj1' ) | ( 'prj2' ) | ( 'ran' ) | ( 'succ' ) | ( 'union' ) | ( '\\u21151' ) | ( '\\u2115' ) | ( '\\u21191' ) | ( '\\u2119' ) | ( '\\u2124' ) )
            int alt3=23;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 22:
                {
                alt3=11;
                }
                break;
            case 23:
                {
                alt3=12;
                }
                break;
            case 24:
                {
                alt3=13;
                }
                break;
            case 25:
                {
                alt3=14;
                }
                break;
            case 26:
                {
                alt3=15;
                }
                break;
            case 27:
                {
                alt3=16;
                }
                break;
            case 28:
                {
                alt3=17;
                }
                break;
            case 29:
                {
                alt3=18;
                }
                break;
            case 30:
                {
                alt3=19;
                }
                break;
            case 31:
                {
                alt3=20;
                }
                break;
            case 32:
                {
                alt3=21;
                }
                break;
            case 33:
                {
                alt3=22;
                }
                break;
            case 34:
                {
                alt3=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXContext.g:394:2: ( 'BOOL' )
                    {
                    // InternalXContext.g:394:2: ( 'BOOL' )
                    // InternalXContext.g:395:3: 'BOOL'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:400:2: ( 'FALSE' )
                    {
                    // InternalXContext.g:400:2: ( 'FALSE' )
                    // InternalXContext.g:401:3: 'FALSE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFALSEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:406:2: ( 'TRUE' )
                    {
                    // InternalXContext.g:406:2: ( 'TRUE' )
                    // InternalXContext.g:407:3: 'TRUE'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:412:2: ( 'bool' )
                    {
                    // InternalXContext.g:412:2: ( 'bool' )
                    // InternalXContext.g:413:3: 'bool'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getBoolKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:418:2: ( 'card' )
                    {
                    // InternalXContext.g:418:2: ( 'card' )
                    // InternalXContext.g:419:3: 'card'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getCardKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:424:2: ( 'dom' )
                    {
                    // InternalXContext.g:424:2: ( 'dom' )
                    // InternalXContext.g:425:3: 'dom'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDomKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:430:2: ( 'finite' )
                    {
                    // InternalXContext.g:430:2: ( 'finite' )
                    // InternalXContext.g:431:3: 'finite'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getFiniteKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:436:2: ( 'id' )
                    {
                    // InternalXContext.g:436:2: ( 'id' )
                    // InternalXContext.g:437:3: 'id'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getIdKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:442:2: ( 'inter' )
                    {
                    // InternalXContext.g:442:2: ( 'inter' )
                    // InternalXContext.g:443:3: 'inter'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getInterKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:448:2: ( 'max' )
                    {
                    // InternalXContext.g:448:2: ( 'max' )
                    // InternalXContext.g:449:3: 'max'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMaxKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:454:2: ( 'min' )
                    {
                    // InternalXContext.g:454:2: ( 'min' )
                    // InternalXContext.g:455:3: 'min'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getMinKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:460:2: ( 'mod' )
                    {
                    // InternalXContext.g:460:2: ( 'mod' )
                    // InternalXContext.g:461:3: 'mod'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getModKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:466:2: ( 'pred' )
                    {
                    // InternalXContext.g:466:2: ( 'pred' )
                    // InternalXContext.g:467:3: 'pred'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPredKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:472:2: ( 'prj1' )
                    {
                    // InternalXContext.g:472:2: ( 'prj1' )
                    // InternalXContext.g:473:3: 'prj1'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj1Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:478:2: ( 'prj2' )
                    {
                    // InternalXContext.g:478:2: ( 'prj2' )
                    // InternalXContext.g:479:3: 'prj2'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getPrj2Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:484:2: ( 'ran' )
                    {
                    // InternalXContext.g:484:2: ( 'ran' )
                    // InternalXContext.g:485:3: 'ran'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getRanKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:490:2: ( 'succ' )
                    {
                    // InternalXContext.g:490:2: ( 'succ' )
                    // InternalXContext.g:491:3: 'succ'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getSuccKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:496:2: ( 'union' )
                    {
                    // InternalXContext.g:496:2: ( 'union' )
                    // InternalXContext.g:497:3: 'union'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getUnionKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:502:2: ( '\\u21151' )
                    {
                    // InternalXContext.g:502:2: ( '\\u21151' )
                    // InternalXContext.g:503:3: '\\u21151'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNDigitOneKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:508:2: ( '\\u2115' )
                    {
                    // InternalXContext.g:508:2: ( '\\u2115' )
                    // InternalXContext.g:509:3: '\\u2115'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalNKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:514:2: ( '\\u21191' )
                    {
                    // InternalXContext.g:514:2: ( '\\u21191' )
                    // InternalXContext.g:515:3: '\\u21191'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPDigitOneKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:520:2: ( '\\u2119' )
                    {
                    // InternalXContext.g:520:2: ( '\\u2119' )
                    // InternalXContext.g:521:3: '\\u2119'
                    {
                     before(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_IDENTIFIER_KEYWORDAccess().getDoubleStruckCapitalPKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:526:2: ( '\\u2124' )
                    {
                    // InternalXContext.g:526:2: ( '\\u2124' )
                    // InternalXContext.g:527:3: '\\u2124'
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
    // InternalXContext.g:536:1: rule__EVENTB_PREDICATE_SYMBOLS__Alternatives : ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) );
    public final void rule__EVENTB_PREDICATE_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:540:1: ( ( '(' ) | ( ')' ) | ( '\\u21D4' ) | ( '\\u21D2' ) | ( '\\u2227' ) | ( '&' ) | ( '\\u2228' ) | ( '\\u00AC' ) | ( '\\u22A4' ) | ( '\\u22A5' ) | ( '\\u2200' ) | ( '!' ) | ( '\\u2203' ) | ( '#' ) | ( ',' ) | ( '\\u00B7' ) | ( '.' ) | ( '=' ) | ( '\\u2260' ) | ( '\\u2264' ) | ( '<' ) | ( '\\u2265' ) | ( '>' ) | ( '\\u2208' ) | ( ':' ) | ( '\\u2209' ) | ( '\\u2282' ) | ( '\\u2284' ) | ( '\\u2286' ) | ( '\\u2288' ) | ( 'partition' ) )
            int alt4=31;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 39:
                {
                alt4=5;
                }
                break;
            case 40:
                {
                alt4=6;
                }
                break;
            case 41:
                {
                alt4=7;
                }
                break;
            case 42:
                {
                alt4=8;
                }
                break;
            case 43:
                {
                alt4=9;
                }
                break;
            case 44:
                {
                alt4=10;
                }
                break;
            case 45:
                {
                alt4=11;
                }
                break;
            case 46:
                {
                alt4=12;
                }
                break;
            case 47:
                {
                alt4=13;
                }
                break;
            case 48:
                {
                alt4=14;
                }
                break;
            case 49:
                {
                alt4=15;
                }
                break;
            case 50:
                {
                alt4=16;
                }
                break;
            case 51:
                {
                alt4=17;
                }
                break;
            case 52:
                {
                alt4=18;
                }
                break;
            case 53:
                {
                alt4=19;
                }
                break;
            case 54:
                {
                alt4=20;
                }
                break;
            case 55:
                {
                alt4=21;
                }
                break;
            case 56:
                {
                alt4=22;
                }
                break;
            case 57:
                {
                alt4=23;
                }
                break;
            case 58:
                {
                alt4=24;
                }
                break;
            case 59:
                {
                alt4=25;
                }
                break;
            case 60:
                {
                alt4=26;
                }
                break;
            case 61:
                {
                alt4=27;
                }
                break;
            case 62:
                {
                alt4=28;
                }
                break;
            case 63:
                {
                alt4=29;
                }
                break;
            case 64:
                {
                alt4=30;
                }
                break;
            case 65:
                {
                alt4=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXContext.g:541:2: ( '(' )
                    {
                    // InternalXContext.g:541:2: ( '(' )
                    // InternalXContext.g:542:3: '('
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftParenthesisKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:547:2: ( ')' )
                    {
                    // InternalXContext.g:547:2: ( ')' )
                    // InternalXContext.g:548:3: ')'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:553:2: ( '\\u21D4' )
                    {
                    // InternalXContext.g:553:2: ( '\\u21D4' )
                    // InternalXContext.g:554:3: '\\u21D4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLeftRightDoubleArrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:559:2: ( '\\u21D2' )
                    {
                    // InternalXContext.g:559:2: ( '\\u21D2' )
                    // InternalXContext.g:560:3: '\\u21D2'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getRightwardsDoubleArrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:565:2: ( '\\u2227' )
                    {
                    // InternalXContext.g:565:2: ( '\\u2227' )
                    // InternalXContext.g:566:3: '\\u2227'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalAndKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:571:2: ( '&' )
                    {
                    // InternalXContext.g:571:2: ( '&' )
                    // InternalXContext.g:572:3: '&'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:577:2: ( '\\u2228' )
                    {
                    // InternalXContext.g:577:2: ( '\\u2228' )
                    // InternalXContext.g:578:3: '\\u2228'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLogicalOrKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:583:2: ( '\\u00AC' )
                    {
                    // InternalXContext.g:583:2: ( '\\u00AC' )
                    // InternalXContext.g:584:3: '\\u00AC'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:589:2: ( '\\u22A4' )
                    {
                    // InternalXContext.g:589:2: ( '\\u22A4' )
                    // InternalXContext.g:590:3: '\\u22A4'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getDownTackKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:595:2: ( '\\u22A5' )
                    {
                    // InternalXContext.g:595:2: ( '\\u22A5' )
                    // InternalXContext.g:596:3: '\\u22A5'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getUpTackKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:601:2: ( '\\u2200' )
                    {
                    // InternalXContext.g:601:2: ( '\\u2200' )
                    // InternalXContext.g:602:3: '\\u2200'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getForAllKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:607:2: ( '!' )
                    {
                    // InternalXContext.g:607:2: ( '!' )
                    // InternalXContext.g:608:3: '!'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getExclamationMarkKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:613:2: ( '\\u2203' )
                    {
                    // InternalXContext.g:613:2: ( '\\u2203' )
                    // InternalXContext.g:614:3: '\\u2203'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getThereExistsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:619:2: ( '#' )
                    {
                    // InternalXContext.g:619:2: ( '#' )
                    // InternalXContext.g:620:3: '#'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNumberSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:625:2: ( ',' )
                    {
                    // InternalXContext.g:625:2: ( ',' )
                    // InternalXContext.g:626:3: ','
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getCommaKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:631:2: ( '\\u00B7' )
                    {
                    // InternalXContext.g:631:2: ( '\\u00B7' )
                    // InternalXContext.g:632:3: '\\u00B7'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getMiddleDotKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:637:2: ( '.' )
                    {
                    // InternalXContext.g:637:2: ( '.' )
                    // InternalXContext.g:638:3: '.'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getFullStopKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:643:2: ( '=' )
                    {
                    // InternalXContext.g:643:2: ( '=' )
                    // InternalXContext.g:644:3: '='
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:649:2: ( '\\u2260' )
                    {
                    // InternalXContext.g:649:2: ( '\\u2260' )
                    // InternalXContext.g:650:3: '\\u2260'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotEqualToKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:655:2: ( '\\u2264' )
                    {
                    // InternalXContext.g:655:2: ( '\\u2264' )
                    // InternalXContext.g:656:3: '\\u2264'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanOrEqualToKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:661:2: ( '<' )
                    {
                    // InternalXContext.g:661:2: ( '<' )
                    // InternalXContext.g:662:3: '<'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getLessThanSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:667:2: ( '\\u2265' )
                    {
                    // InternalXContext.g:667:2: ( '\\u2265' )
                    // InternalXContext.g:668:3: '\\u2265'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanOrEqualToKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:673:2: ( '>' )
                    {
                    // InternalXContext.g:673:2: ( '>' )
                    // InternalXContext.g:674:3: '>'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:679:2: ( '\\u2208' )
                    {
                    // InternalXContext.g:679:2: ( '\\u2208' )
                    // InternalXContext.g:680:3: '\\u2208'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getElementOfKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:685:2: ( ':' )
                    {
                    // InternalXContext.g:685:2: ( ':' )
                    // InternalXContext.g:686:3: ':'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getColonKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:691:2: ( '\\u2209' )
                    {
                    // InternalXContext.g:691:2: ( '\\u2209' )
                    // InternalXContext.g:692:3: '\\u2209'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotAnElementOfKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:697:2: ( '\\u2282' )
                    {
                    // InternalXContext.g:697:2: ( '\\u2282' )
                    // InternalXContext.g:698:3: '\\u2282'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:703:2: ( '\\u2284' )
                    {
                    // InternalXContext.g:703:2: ( '\\u2284' )
                    // InternalXContext.g:704:3: '\\u2284'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNotASubsetOfKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:709:2: ( '\\u2286' )
                    {
                    // InternalXContext.g:709:2: ( '\\u2286' )
                    // InternalXContext.g:710:3: '\\u2286'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getSubsetOfOrEqualToKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:715:2: ( '\\u2288' )
                    {
                    // InternalXContext.g:715:2: ( '\\u2288' )
                    // InternalXContext.g:716:3: '\\u2288'
                    {
                     before(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_PREDICATE_SYMBOLSAccess().getNeitherASubsetOfNorEqualToKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:721:2: ( 'partition' )
                    {
                    // InternalXContext.g:721:2: ( 'partition' )
                    // InternalXContext.g:722:3: 'partition'
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
    // InternalXContext.g:731:1: rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives : ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) );
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:735:1: ( ( '\\u2194' ) | ( '\\uE100' ) | ( '\\uE101' ) | ( '\\uE102' ) | ( '\\u21F8' ) | ( '\\u2192' ) | ( '\\u2914' ) | ( '\\u21A3' ) | ( '\\u2900' ) | ( '\\u21A0' ) | ( '\\u2916' ) | ( '{' ) | ( '}' ) | ( '\\u21A6' ) | ( '\\u2205' ) | ( '\\u2229' ) | ( '\\u222A' ) | ( '\\u2216' ) | ( '\\u00D7' ) | ( '[' ) | ( ']' ) | ( '\\uE103' ) | ( '\\u2218' ) | ( ';' ) | ( '\\u2297' ) | ( '\\u2225' ) | ( '\\u223C' ) | ( '\\u25C1' ) | ( '\\u2A64' ) | ( '\\u25B7' ) | ( '\\u2A65' ) | ( '\\u03BB' ) | ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) ) | ( '\\u22C3' ) | ( '\\u2223' ) | ( '\\u2025' ) | ( '+' ) | ( '\\u2212' ) | ( '-' ) | ( '\\u2217' ) | ( '*' ) | ( '\\u00F7' ) | ( '/' ) | ( '^' ) | ( '\\\\' ) )
            int alt5=45;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt5=1;
                }
                break;
            case 67:
                {
                alt5=2;
                }
                break;
            case 68:
                {
                alt5=3;
                }
                break;
            case 69:
                {
                alt5=4;
                }
                break;
            case 70:
                {
                alt5=5;
                }
                break;
            case 71:
                {
                alt5=6;
                }
                break;
            case 72:
                {
                alt5=7;
                }
                break;
            case 73:
                {
                alt5=8;
                }
                break;
            case 74:
                {
                alt5=9;
                }
                break;
            case 75:
                {
                alt5=10;
                }
                break;
            case 76:
                {
                alt5=11;
                }
                break;
            case 77:
                {
                alt5=12;
                }
                break;
            case 78:
                {
                alt5=13;
                }
                break;
            case 79:
                {
                alt5=14;
                }
                break;
            case 80:
                {
                alt5=15;
                }
                break;
            case 81:
                {
                alt5=16;
                }
                break;
            case 82:
                {
                alt5=17;
                }
                break;
            case 83:
                {
                alt5=18;
                }
                break;
            case 84:
                {
                alt5=19;
                }
                break;
            case 85:
                {
                alt5=20;
                }
                break;
            case 86:
                {
                alt5=21;
                }
                break;
            case 87:
                {
                alt5=22;
                }
                break;
            case 88:
                {
                alt5=23;
                }
                break;
            case 89:
                {
                alt5=24;
                }
                break;
            case 90:
                {
                alt5=25;
                }
                break;
            case 91:
                {
                alt5=26;
                }
                break;
            case 92:
                {
                alt5=27;
                }
                break;
            case 93:
                {
                alt5=28;
                }
                break;
            case 94:
                {
                alt5=29;
                }
                break;
            case 95:
                {
                alt5=30;
                }
                break;
            case 96:
                {
                alt5=31;
                }
                break;
            case 97:
                {
                alt5=32;
                }
                break;
            case 120:
                {
                alt5=33;
                }
                break;
            case 98:
                {
                alt5=34;
                }
                break;
            case 99:
                {
                alt5=35;
                }
                break;
            case 100:
                {
                alt5=36;
                }
                break;
            case 101:
                {
                alt5=37;
                }
                break;
            case 102:
                {
                alt5=38;
                }
                break;
            case 103:
                {
                alt5=39;
                }
                break;
            case 104:
                {
                alt5=40;
                }
                break;
            case 105:
                {
                alt5=41;
                }
                break;
            case 106:
                {
                alt5=42;
                }
                break;
            case 107:
                {
                alt5=43;
                }
                break;
            case 108:
                {
                alt5=44;
                }
                break;
            case 109:
                {
                alt5=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXContext.g:736:2: ( '\\u2194' )
                    {
                    // InternalXContext.g:736:2: ( '\\u2194' )
                    // InternalXContext.g:737:3: '\\u2194'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftRightArrowKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:742:2: ( '\\uE100' )
                    {
                    // InternalXContext.g:742:2: ( '\\uE100' )
                    // InternalXContext.g:743:3: '\\uE100'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE100Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:748:2: ( '\\uE101' )
                    {
                    // InternalXContext.g:748:2: ( '\\uE101' )
                    // InternalXContext.g:749:3: '\\uE101'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE101Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXContext.g:754:2: ( '\\uE102' )
                    {
                    // InternalXContext.g:754:2: ( '\\uE102' )
                    // InternalXContext.g:755:3: '\\uE102'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE102Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXContext.g:760:2: ( '\\u21F8' )
                    {
                    // InternalXContext.g:760:2: ( '\\u21F8' )
                    // InternalXContext.g:761:3: '\\u21F8'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithVerticalStrokeKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXContext.g:766:2: ( '\\u2192' )
                    {
                    // InternalXContext.g:766:2: ( '\\u2192' )
                    // InternalXContext.g:767:3: '\\u2192'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXContext.g:772:2: ( '\\u2914' )
                    {
                    // InternalXContext.g:772:2: ( '\\u2914' )
                    // InternalXContext.g:773:3: '\\u2914'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailWithVerticalStrokeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXContext.g:778:2: ( '\\u21A3' )
                    {
                    // InternalXContext.g:778:2: ( '\\u21A3' )
                    // InternalXContext.g:779:3: '\\u21A3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowWithTailKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXContext.g:784:2: ( '\\u2900' )
                    {
                    // InternalXContext.g:784:2: ( '\\u2900' )
                    // InternalXContext.g:785:3: '\\u2900'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithVerticalStrokeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXContext.g:790:2: ( '\\u21A0' )
                    {
                    // InternalXContext.g:790:2: ( '\\u21A0' )
                    // InternalXContext.g:791:3: '\\u21A0'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXContext.g:796:2: ( '\\u2916' )
                    {
                    // InternalXContext.g:796:2: ( '\\u2916' )
                    // InternalXContext.g:797:3: '\\u2916'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsTwoHeadedArrowWithTailKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXContext.g:802:2: ( '{' )
                    {
                    // InternalXContext.g:802:2: ( '{' )
                    // InternalXContext.g:803:3: '{'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 
                    match(input,77,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftCurlyBracketKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalXContext.g:808:2: ( '}' )
                    {
                    // InternalXContext.g:808:2: ( '}' )
                    // InternalXContext.g:809:3: '}'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 
                    match(input,78,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightCurlyBracketKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalXContext.g:814:2: ( '\\u21A6' )
                    {
                    // InternalXContext.g:814:2: ( '\\u21A6' )
                    // InternalXContext.g:815:3: '\\u21A6'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 
                    match(input,79,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightwardsArrowFromBarKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalXContext.g:820:2: ( '\\u2205' )
                    {
                    // InternalXContext.g:820:2: ( '\\u2205' )
                    // InternalXContext.g:821:3: '\\u2205'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 
                    match(input,80,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getEmptySetKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalXContext.g:826:2: ( '\\u2229' )
                    {
                    // InternalXContext.g:826:2: ( '\\u2229' )
                    // InternalXContext.g:827:3: '\\u2229'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 
                    match(input,81,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getIntersectionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalXContext.g:832:2: ( '\\u222A' )
                    {
                    // InternalXContext.g:832:2: ( '\\u222A' )
                    // InternalXContext.g:833:3: '\\u222A'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 
                    match(input,82,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getUnionKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalXContext.g:838:2: ( '\\u2216' )
                    {
                    // InternalXContext.g:838:2: ( '\\u2216' )
                    // InternalXContext.g:839:3: '\\u2216'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 
                    match(input,83,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSetMinusKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalXContext.g:844:2: ( '\\u00D7' )
                    {
                    // InternalXContext.g:844:2: ( '\\u00D7' )
                    // InternalXContext.g:845:3: '\\u00D7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 
                    match(input,84,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMultiplicationSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalXContext.g:850:2: ( '[' )
                    {
                    // InternalXContext.g:850:2: ( '[' )
                    // InternalXContext.g:851:3: '['
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 
                    match(input,85,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getLeftSquareBracketKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalXContext.g:856:2: ( ']' )
                    {
                    // InternalXContext.g:856:2: ( ']' )
                    // InternalXContext.g:857:3: ']'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 
                    match(input,86,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRightSquareBracketKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalXContext.g:862:2: ( '\\uE103' )
                    {
                    // InternalXContext.g:862:2: ( '\\uE103' )
                    // InternalXContext.g:863:3: '\\uE103'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 
                    match(input,87,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPrivateUseAreaE103Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalXContext.g:868:2: ( '\\u2218' )
                    {
                    // InternalXContext.g:868:2: ( '\\u2218' )
                    // InternalXContext.g:869:3: '\\u2218'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 
                    match(input,88,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getRingOperatorKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalXContext.g:874:2: ( ';' )
                    {
                    // InternalXContext.g:874:2: ( ';' )
                    // InternalXContext.g:875:3: ';'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 
                    match(input,89,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSemicolonKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalXContext.g:880:2: ( '\\u2297' )
                    {
                    // InternalXContext.g:880:2: ( '\\u2297' )
                    // InternalXContext.g:881:3: '\\u2297'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 
                    match(input,90,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircledTimesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalXContext.g:886:2: ( '\\u2225' )
                    {
                    // InternalXContext.g:886:2: ( '\\u2225' )
                    // InternalXContext.g:887:3: '\\u2225'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 
                    match(input,91,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getParallelToKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalXContext.g:892:2: ( '\\u223C' )
                    {
                    // InternalXContext.g:892:2: ( '\\u223C' )
                    // InternalXContext.g:893:3: '\\u223C'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 
                    match(input,92,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTildeOperatorKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalXContext.g:898:2: ( '\\u25C1' )
                    {
                    // InternalXContext.g:898:2: ( '\\u25C1' )
                    // InternalXContext.g:899:3: '\\u25C1'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 
                    match(input,93,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteLeftPointingTriangleKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalXContext.g:904:2: ( '\\u2A64' )
                    {
                    // InternalXContext.g:904:2: ( '\\u2A64' )
                    // InternalXContext.g:905:3: '\\u2A64'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 
                    match(input,94,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationDomainAntirestrictionKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalXContext.g:910:2: ( '\\u25B7' )
                    {
                    // InternalXContext.g:910:2: ( '\\u25B7' )
                    // InternalXContext.g:911:3: '\\u25B7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 
                    match(input,95,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getWhiteRightPointingTriangleKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalXContext.g:916:2: ( '\\u2A65' )
                    {
                    // InternalXContext.g:916:2: ( '\\u2A65' )
                    // InternalXContext.g:917:3: '\\u2A65'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 
                    match(input,96,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getZNotationRangeAntirestrictionKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalXContext.g:922:2: ( '\\u03BB' )
                    {
                    // InternalXContext.g:922:2: ( '\\u03BB' )
                    // InternalXContext.g:923:3: '\\u03BB'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 
                    match(input,97,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGreekSmallLetterLamdaKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalXContext.g:928:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    {
                    // InternalXContext.g:928:2: ( ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 ) )
                    // InternalXContext.g:929:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getGroup_32()); 
                    // InternalXContext.g:930:3: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 )
                    // InternalXContext.g:930:4: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0
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
                    // InternalXContext.g:934:2: ( '\\u22C3' )
                    {
                    // InternalXContext.g:934:2: ( '\\u22C3' )
                    // InternalXContext.g:935:3: '\\u22C3'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 
                    match(input,98,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryUnionKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalXContext.g:940:2: ( '\\u2223' )
                    {
                    // InternalXContext.g:940:2: ( '\\u2223' )
                    // InternalXContext.g:941:3: '\\u2223'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 
                    match(input,99,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDividesKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalXContext.g:946:2: ( '\\u2025' )
                    {
                    // InternalXContext.g:946:2: ( '\\u2025' )
                    // InternalXContext.g:947:3: '\\u2025'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 
                    match(input,100,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getTwoDotLeaderKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalXContext.g:952:2: ( '+' )
                    {
                    // InternalXContext.g:952:2: ( '+' )
                    // InternalXContext.g:953:3: '+'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 
                    match(input,101,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPlusSignKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalXContext.g:958:2: ( '\\u2212' )
                    {
                    // InternalXContext.g:958:2: ( '\\u2212' )
                    // InternalXContext.g:959:3: '\\u2212'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 
                    match(input,102,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getMinusSignKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalXContext.g:964:2: ( '-' )
                    {
                    // InternalXContext.g:964:2: ( '-' )
                    // InternalXContext.g:965:3: '-'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 
                    match(input,103,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getHyphenMinusKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalXContext.g:970:2: ( '\\u2217' )
                    {
                    // InternalXContext.g:970:2: ( '\\u2217' )
                    // InternalXContext.g:971:3: '\\u2217'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 
                    match(input,104,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskOperatorKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalXContext.g:976:2: ( '*' )
                    {
                    // InternalXContext.g:976:2: ( '*' )
                    // InternalXContext.g:977:3: '*'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 
                    match(input,105,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getAsteriskKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalXContext.g:982:2: ( '\\u00F7' )
                    {
                    // InternalXContext.g:982:2: ( '\\u00F7' )
                    // InternalXContext.g:983:3: '\\u00F7'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 
                    match(input,106,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getDivisionSignKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalXContext.g:988:2: ( '/' )
                    {
                    // InternalXContext.g:988:2: ( '/' )
                    // InternalXContext.g:989:3: '/'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 
                    match(input,107,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getSolidusKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalXContext.g:994:2: ( '^' )
                    {
                    // InternalXContext.g:994:2: ( '^' )
                    // InternalXContext.g:995:3: '^'
                    {
                     before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 
                    match(input,108,FOLLOW_2); 
                     after(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getCircumflexAccentKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalXContext.g:1000:2: ( '\\\\' )
                    {
                    // InternalXContext.g:1000:2: ( '\\\\' )
                    // InternalXContext.g:1001:3: '\\\\'
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


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalXContext.g:1010:1: rule__Multiplicity__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1014:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) | ( ( 'opt' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt6=1;
                }
                break;
            case 111:
                {
                alt6=2;
                }
                break;
            case 112:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXContext.g:1015:2: ( ( 'one' ) )
                    {
                    // InternalXContext.g:1015:2: ( ( 'one' ) )
                    // InternalXContext.g:1016:3: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 
                    // InternalXContext.g:1017:3: ( 'one' )
                    // InternalXContext.g:1017:4: 'one'
                    {
                    match(input,110,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXContext.g:1021:2: ( ( 'many' ) )
                    {
                    // InternalXContext.g:1021:2: ( ( 'many' ) )
                    // InternalXContext.g:1022:3: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 
                    // InternalXContext.g:1023:3: ( 'many' )
                    // InternalXContext.g:1023:4: 'many'
                    {
                    match(input,111,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getMANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXContext.g:1027:2: ( ( 'opt' ) )
                    {
                    // InternalXContext.g:1027:2: ( ( 'opt' ) )
                    // InternalXContext.g:1028:3: ( 'opt' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    // InternalXContext.g:1029:3: ( 'opt' )
                    // InternalXContext.g:1029:4: 'opt'
                    {
                    match(input,112,FOLLOW_2); 

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
    // InternalXContext.g:1037:1: rule__XContext__Group__0 : rule__XContext__Group__0__Impl rule__XContext__Group__1 ;
    public final void rule__XContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1041:1: ( rule__XContext__Group__0__Impl rule__XContext__Group__1 )
            // InternalXContext.g:1042:2: rule__XContext__Group__0__Impl rule__XContext__Group__1
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
    // InternalXContext.g:1049:1: rule__XContext__Group__0__Impl : ( () ) ;
    public final void rule__XContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1053:1: ( ( () ) )
            // InternalXContext.g:1054:1: ( () )
            {
            // InternalXContext.g:1054:1: ( () )
            // InternalXContext.g:1055:2: ()
            {
             before(grammarAccess.getXContextAccess().getContextAction_0()); 
            // InternalXContext.g:1056:2: ()
            // InternalXContext.g:1056:3: 
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
    // InternalXContext.g:1064:1: rule__XContext__Group__1 : rule__XContext__Group__1__Impl rule__XContext__Group__2 ;
    public final void rule__XContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1068:1: ( rule__XContext__Group__1__Impl rule__XContext__Group__2 )
            // InternalXContext.g:1069:2: rule__XContext__Group__1__Impl rule__XContext__Group__2
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
    // InternalXContext.g:1076:1: rule__XContext__Group__1__Impl : ( 'context' ) ;
    public final void rule__XContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1080:1: ( ( 'context' ) )
            // InternalXContext.g:1081:1: ( 'context' )
            {
            // InternalXContext.g:1081:1: ( 'context' )
            // InternalXContext.g:1082:2: 'context'
            {
             before(grammarAccess.getXContextAccess().getContextKeyword_1()); 
            match(input,113,FOLLOW_2); 
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
    // InternalXContext.g:1091:1: rule__XContext__Group__2 : rule__XContext__Group__2__Impl rule__XContext__Group__3 ;
    public final void rule__XContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1095:1: ( rule__XContext__Group__2__Impl rule__XContext__Group__3 )
            // InternalXContext.g:1096:2: rule__XContext__Group__2__Impl rule__XContext__Group__3
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
    // InternalXContext.g:1103:1: rule__XContext__Group__2__Impl : ( ( rule__XContext__NameAssignment_2 ) ) ;
    public final void rule__XContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1107:1: ( ( ( rule__XContext__NameAssignment_2 ) ) )
            // InternalXContext.g:1108:1: ( ( rule__XContext__NameAssignment_2 ) )
            {
            // InternalXContext.g:1108:1: ( ( rule__XContext__NameAssignment_2 ) )
            // InternalXContext.g:1109:2: ( rule__XContext__NameAssignment_2 )
            {
             before(grammarAccess.getXContextAccess().getNameAssignment_2()); 
            // InternalXContext.g:1110:2: ( rule__XContext__NameAssignment_2 )
            // InternalXContext.g:1110:3: rule__XContext__NameAssignment_2
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
    // InternalXContext.g:1118:1: rule__XContext__Group__3 : rule__XContext__Group__3__Impl rule__XContext__Group__4 ;
    public final void rule__XContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1122:1: ( rule__XContext__Group__3__Impl rule__XContext__Group__4 )
            // InternalXContext.g:1123:2: rule__XContext__Group__3__Impl rule__XContext__Group__4
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
    // InternalXContext.g:1130:1: rule__XContext__Group__3__Impl : ( ( rule__XContext__Group_3__0 )? ) ;
    public final void rule__XContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1134:1: ( ( ( rule__XContext__Group_3__0 )? ) )
            // InternalXContext.g:1135:1: ( ( rule__XContext__Group_3__0 )? )
            {
            // InternalXContext.g:1135:1: ( ( rule__XContext__Group_3__0 )? )
            // InternalXContext.g:1136:2: ( rule__XContext__Group_3__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_3()); 
            // InternalXContext.g:1137:2: ( rule__XContext__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==115) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXContext.g:1137:3: rule__XContext__Group_3__0
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
    // InternalXContext.g:1145:1: rule__XContext__Group__4 : rule__XContext__Group__4__Impl rule__XContext__Group__5 ;
    public final void rule__XContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1149:1: ( rule__XContext__Group__4__Impl rule__XContext__Group__5 )
            // InternalXContext.g:1150:2: rule__XContext__Group__4__Impl rule__XContext__Group__5
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
    // InternalXContext.g:1157:1: rule__XContext__Group__4__Impl : ( ( rule__XContext__Group_4__0 )? ) ;
    public final void rule__XContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1161:1: ( ( ( rule__XContext__Group_4__0 )? ) )
            // InternalXContext.g:1162:1: ( ( rule__XContext__Group_4__0 )? )
            {
            // InternalXContext.g:1162:1: ( ( rule__XContext__Group_4__0 )? )
            // InternalXContext.g:1163:2: ( rule__XContext__Group_4__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_4()); 
            // InternalXContext.g:1164:2: ( rule__XContext__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==116) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXContext.g:1164:3: rule__XContext__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1172:1: rule__XContext__Group__5 : rule__XContext__Group__5__Impl rule__XContext__Group__6 ;
    public final void rule__XContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1176:1: ( rule__XContext__Group__5__Impl rule__XContext__Group__6 )
            // InternalXContext.g:1177:2: rule__XContext__Group__5__Impl rule__XContext__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1184:1: rule__XContext__Group__5__Impl : ( ( rule__XContext__Group_5__0 )? ) ;
    public final void rule__XContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1188:1: ( ( ( rule__XContext__Group_5__0 )? ) )
            // InternalXContext.g:1189:1: ( ( rule__XContext__Group_5__0 )? )
            {
            // InternalXContext.g:1189:1: ( ( rule__XContext__Group_5__0 )? )
            // InternalXContext.g:1190:2: ( rule__XContext__Group_5__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_5()); 
            // InternalXContext.g:1191:2: ( rule__XContext__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==117) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXContext.g:1191:3: rule__XContext__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalXContext.g:1199:1: rule__XContext__Group__6 : rule__XContext__Group__6__Impl rule__XContext__Group__7 ;
    public final void rule__XContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1203:1: ( rule__XContext__Group__6__Impl rule__XContext__Group__7 )
            // InternalXContext.g:1204:2: rule__XContext__Group__6__Impl rule__XContext__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__7();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:1211:1: rule__XContext__Group__6__Impl : ( ( rule__XContext__Group_6__0 )? ) ;
    public final void rule__XContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1215:1: ( ( ( rule__XContext__Group_6__0 )? ) )
            // InternalXContext.g:1216:1: ( ( rule__XContext__Group_6__0 )? )
            {
            // InternalXContext.g:1216:1: ( ( rule__XContext__Group_6__0 )? )
            // InternalXContext.g:1217:2: ( rule__XContext__Group_6__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_6()); 
            // InternalXContext.g:1218:2: ( rule__XContext__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==118) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXContext.g:1218:3: rule__XContext__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__XContext__Group__7"
    // InternalXContext.g:1226:1: rule__XContext__Group__7 : rule__XContext__Group__7__Impl rule__XContext__Group__8 ;
    public final void rule__XContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1230:1: ( rule__XContext__Group__7__Impl rule__XContext__Group__8 )
            // InternalXContext.g:1231:2: rule__XContext__Group__7__Impl rule__XContext__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__XContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__7"


    // $ANTLR start "rule__XContext__Group__7__Impl"
    // InternalXContext.g:1238:1: rule__XContext__Group__7__Impl : ( ( rule__XContext__Group_7__0 )? ) ;
    public final void rule__XContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1242:1: ( ( ( rule__XContext__Group_7__0 )? ) )
            // InternalXContext.g:1243:1: ( ( rule__XContext__Group_7__0 )? )
            {
            // InternalXContext.g:1243:1: ( ( rule__XContext__Group_7__0 )? )
            // InternalXContext.g:1244:2: ( rule__XContext__Group_7__0 )?
            {
             before(grammarAccess.getXContextAccess().getGroup_7()); 
            // InternalXContext.g:1245:2: ( rule__XContext__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==119) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXContext.g:1245:3: rule__XContext__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XContext__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXContextAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__7__Impl"


    // $ANTLR start "rule__XContext__Group__8"
    // InternalXContext.g:1253:1: rule__XContext__Group__8 : rule__XContext__Group__8__Impl ;
    public final void rule__XContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1257:1: ( rule__XContext__Group__8__Impl )
            // InternalXContext.g:1258:2: rule__XContext__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__8"


    // $ANTLR start "rule__XContext__Group__8__Impl"
    // InternalXContext.g:1264:1: rule__XContext__Group__8__Impl : ( 'end' ) ;
    public final void rule__XContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1268:1: ( ( 'end' ) )
            // InternalXContext.g:1269:1: ( 'end' )
            {
            // InternalXContext.g:1269:1: ( 'end' )
            // InternalXContext.g:1270:2: 'end'
            {
             before(grammarAccess.getXContextAccess().getEndKeyword_8()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group__8__Impl"


    // $ANTLR start "rule__XContext__Group_3__0"
    // InternalXContext.g:1280:1: rule__XContext__Group_3__0 : rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1 ;
    public final void rule__XContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1284:1: ( rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1 )
            // InternalXContext.g:1285:2: rule__XContext__Group_3__0__Impl rule__XContext__Group_3__1
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
    // InternalXContext.g:1292:1: rule__XContext__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__XContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1296:1: ( ( 'extends' ) )
            // InternalXContext.g:1297:1: ( 'extends' )
            {
            // InternalXContext.g:1297:1: ( 'extends' )
            // InternalXContext.g:1298:2: 'extends'
            {
             before(grammarAccess.getXContextAccess().getExtendsKeyword_3_0()); 
            match(input,115,FOLLOW_2); 
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
    // InternalXContext.g:1307:1: rule__XContext__Group_3__1 : rule__XContext__Group_3__1__Impl ;
    public final void rule__XContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1311:1: ( rule__XContext__Group_3__1__Impl )
            // InternalXContext.g:1312:2: rule__XContext__Group_3__1__Impl
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
    // InternalXContext.g:1318:1: rule__XContext__Group_3__1__Impl : ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) ) ;
    public final void rule__XContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1322:1: ( ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) ) )
            // InternalXContext.g:1323:1: ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) )
            {
            // InternalXContext.g:1323:1: ( ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* ) )
            // InternalXContext.g:1324:2: ( ( rule__XContext__ExtendsAssignment_3_1 ) ) ( ( rule__XContext__ExtendsAssignment_3_1 )* )
            {
            // InternalXContext.g:1324:2: ( ( rule__XContext__ExtendsAssignment_3_1 ) )
            // InternalXContext.g:1325:3: ( rule__XContext__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 
            // InternalXContext.g:1326:3: ( rule__XContext__ExtendsAssignment_3_1 )
            // InternalXContext.g:1326:4: rule__XContext__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_7);
            rule__XContext__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 

            }

            // InternalXContext.g:1329:2: ( ( rule__XContext__ExtendsAssignment_3_1 )* )
            // InternalXContext.g:1330:3: ( rule__XContext__ExtendsAssignment_3_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtendsAssignment_3_1()); 
            // InternalXContext.g:1331:3: ( rule__XContext__ExtendsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXContext.g:1331:4: rule__XContext__ExtendsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XContext__ExtendsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "rule__XContext__Group_4__0"
    // InternalXContext.g:1341:1: rule__XContext__Group_4__0 : rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 ;
    public final void rule__XContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1345:1: ( rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1 )
            // InternalXContext.g:1346:2: rule__XContext__Group_4__0__Impl rule__XContext__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1353:1: rule__XContext__Group_4__0__Impl : ( 'sets' ) ;
    public final void rule__XContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1357:1: ( ( 'sets' ) )
            // InternalXContext.g:1358:1: ( 'sets' )
            {
            // InternalXContext.g:1358:1: ( 'sets' )
            // InternalXContext.g:1359:2: 'sets'
            {
             before(grammarAccess.getXContextAccess().getSetsKeyword_4_0()); 
            match(input,116,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getSetsKeyword_4_0()); 

            }


            }

        }
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
    // InternalXContext.g:1368:1: rule__XContext__Group_4__1 : rule__XContext__Group_4__1__Impl ;
    public final void rule__XContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1372:1: ( rule__XContext__Group_4__1__Impl )
            // InternalXContext.g:1373:2: rule__XContext__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1379:1: rule__XContext__Group_4__1__Impl : ( ( ( rule__XContext__SetsAssignment_4_1 ) ) ( ( rule__XContext__SetsAssignment_4_1 )* ) ) ;
    public final void rule__XContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1383:1: ( ( ( ( rule__XContext__SetsAssignment_4_1 ) ) ( ( rule__XContext__SetsAssignment_4_1 )* ) ) )
            // InternalXContext.g:1384:1: ( ( ( rule__XContext__SetsAssignment_4_1 ) ) ( ( rule__XContext__SetsAssignment_4_1 )* ) )
            {
            // InternalXContext.g:1384:1: ( ( ( rule__XContext__SetsAssignment_4_1 ) ) ( ( rule__XContext__SetsAssignment_4_1 )* ) )
            // InternalXContext.g:1385:2: ( ( rule__XContext__SetsAssignment_4_1 ) ) ( ( rule__XContext__SetsAssignment_4_1 )* )
            {
            // InternalXContext.g:1385:2: ( ( rule__XContext__SetsAssignment_4_1 ) )
            // InternalXContext.g:1386:3: ( rule__XContext__SetsAssignment_4_1 )
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_4_1()); 
            // InternalXContext.g:1387:3: ( rule__XContext__SetsAssignment_4_1 )
            // InternalXContext.g:1387:4: rule__XContext__SetsAssignment_4_1
            {
            pushFollow(FOLLOW_7);
            rule__XContext__SetsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getSetsAssignment_4_1()); 

            }

            // InternalXContext.g:1390:2: ( ( rule__XContext__SetsAssignment_4_1 )* )
            // InternalXContext.g:1391:3: ( rule__XContext__SetsAssignment_4_1 )*
            {
             before(grammarAccess.getXContextAccess().getSetsAssignment_4_1()); 
            // InternalXContext.g:1392:3: ( rule__XContext__SetsAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXContext.g:1392:4: rule__XContext__SetsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XContext__SetsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getSetsAssignment_4_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__XContext__Group_5__0"
    // InternalXContext.g:1402:1: rule__XContext__Group_5__0 : rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 ;
    public final void rule__XContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1406:1: ( rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1 )
            // InternalXContext.g:1407:2: rule__XContext__Group_5__0__Impl rule__XContext__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__XContext__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__0"


    // $ANTLR start "rule__XContext__Group_5__0__Impl"
    // InternalXContext.g:1414:1: rule__XContext__Group_5__0__Impl : ( 'constants' ) ;
    public final void rule__XContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1418:1: ( ( 'constants' ) )
            // InternalXContext.g:1419:1: ( 'constants' )
            {
            // InternalXContext.g:1419:1: ( 'constants' )
            // InternalXContext.g:1420:2: 'constants'
            {
             before(grammarAccess.getXContextAccess().getConstantsKeyword_5_0()); 
            match(input,117,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getConstantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__0__Impl"


    // $ANTLR start "rule__XContext__Group_5__1"
    // InternalXContext.g:1429:1: rule__XContext__Group_5__1 : rule__XContext__Group_5__1__Impl ;
    public final void rule__XContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1433:1: ( rule__XContext__Group_5__1__Impl )
            // InternalXContext.g:1434:2: rule__XContext__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__1"


    // $ANTLR start "rule__XContext__Group_5__1__Impl"
    // InternalXContext.g:1440:1: rule__XContext__Group_5__1__Impl : ( ( ( rule__XContext__ConstantsAssignment_5_1 ) ) ( ( rule__XContext__ConstantsAssignment_5_1 )* ) ) ;
    public final void rule__XContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1444:1: ( ( ( ( rule__XContext__ConstantsAssignment_5_1 ) ) ( ( rule__XContext__ConstantsAssignment_5_1 )* ) ) )
            // InternalXContext.g:1445:1: ( ( ( rule__XContext__ConstantsAssignment_5_1 ) ) ( ( rule__XContext__ConstantsAssignment_5_1 )* ) )
            {
            // InternalXContext.g:1445:1: ( ( ( rule__XContext__ConstantsAssignment_5_1 ) ) ( ( rule__XContext__ConstantsAssignment_5_1 )* ) )
            // InternalXContext.g:1446:2: ( ( rule__XContext__ConstantsAssignment_5_1 ) ) ( ( rule__XContext__ConstantsAssignment_5_1 )* )
            {
            // InternalXContext.g:1446:2: ( ( rule__XContext__ConstantsAssignment_5_1 ) )
            // InternalXContext.g:1447:3: ( rule__XContext__ConstantsAssignment_5_1 )
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_5_1()); 
            // InternalXContext.g:1448:3: ( rule__XContext__ConstantsAssignment_5_1 )
            // InternalXContext.g:1448:4: rule__XContext__ConstantsAssignment_5_1
            {
            pushFollow(FOLLOW_7);
            rule__XContext__ConstantsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getConstantsAssignment_5_1()); 

            }

            // InternalXContext.g:1451:2: ( ( rule__XContext__ConstantsAssignment_5_1 )* )
            // InternalXContext.g:1452:3: ( rule__XContext__ConstantsAssignment_5_1 )*
            {
             before(grammarAccess.getXContextAccess().getConstantsAssignment_5_1()); 
            // InternalXContext.g:1453:3: ( rule__XContext__ConstantsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXContext.g:1453:4: rule__XContext__ConstantsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XContext__ConstantsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getConstantsAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_5__1__Impl"


    // $ANTLR start "rule__XContext__Group_6__0"
    // InternalXContext.g:1463:1: rule__XContext__Group_6__0 : rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 ;
    public final void rule__XContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1467:1: ( rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1 )
            // InternalXContext.g:1468:2: rule__XContext__Group_6__0__Impl rule__XContext__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__XContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__0"


    // $ANTLR start "rule__XContext__Group_6__0__Impl"
    // InternalXContext.g:1475:1: rule__XContext__Group_6__0__Impl : ( 'records' ) ;
    public final void rule__XContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1479:1: ( ( 'records' ) )
            // InternalXContext.g:1480:1: ( 'records' )
            {
            // InternalXContext.g:1480:1: ( 'records' )
            // InternalXContext.g:1481:2: 'records'
            {
             before(grammarAccess.getXContextAccess().getRecordsKeyword_6_0()); 
            match(input,118,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getRecordsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__0__Impl"


    // $ANTLR start "rule__XContext__Group_6__1"
    // InternalXContext.g:1490:1: rule__XContext__Group_6__1 : rule__XContext__Group_6__1__Impl ;
    public final void rule__XContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1494:1: ( rule__XContext__Group_6__1__Impl )
            // InternalXContext.g:1495:2: rule__XContext__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__1"


    // $ANTLR start "rule__XContext__Group_6__1__Impl"
    // InternalXContext.g:1501:1: rule__XContext__Group_6__1__Impl : ( ( ( rule__XContext__ExtensionsAssignment_6_1 ) ) ( ( rule__XContext__ExtensionsAssignment_6_1 )* ) ) ;
    public final void rule__XContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1505:1: ( ( ( ( rule__XContext__ExtensionsAssignment_6_1 ) ) ( ( rule__XContext__ExtensionsAssignment_6_1 )* ) ) )
            // InternalXContext.g:1506:1: ( ( ( rule__XContext__ExtensionsAssignment_6_1 ) ) ( ( rule__XContext__ExtensionsAssignment_6_1 )* ) )
            {
            // InternalXContext.g:1506:1: ( ( ( rule__XContext__ExtensionsAssignment_6_1 ) ) ( ( rule__XContext__ExtensionsAssignment_6_1 )* ) )
            // InternalXContext.g:1507:2: ( ( rule__XContext__ExtensionsAssignment_6_1 ) ) ( ( rule__XContext__ExtensionsAssignment_6_1 )* )
            {
            // InternalXContext.g:1507:2: ( ( rule__XContext__ExtensionsAssignment_6_1 ) )
            // InternalXContext.g:1508:3: ( rule__XContext__ExtensionsAssignment_6_1 )
            {
             before(grammarAccess.getXContextAccess().getExtensionsAssignment_6_1()); 
            // InternalXContext.g:1509:3: ( rule__XContext__ExtensionsAssignment_6_1 )
            // InternalXContext.g:1509:4: rule__XContext__ExtensionsAssignment_6_1
            {
            pushFollow(FOLLOW_9);
            rule__XContext__ExtensionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getExtensionsAssignment_6_1()); 

            }

            // InternalXContext.g:1512:2: ( ( rule__XContext__ExtensionsAssignment_6_1 )* )
            // InternalXContext.g:1513:3: ( rule__XContext__ExtensionsAssignment_6_1 )*
            {
             before(grammarAccess.getXContextAccess().getExtensionsAssignment_6_1()); 
            // InternalXContext.g:1514:3: ( rule__XContext__ExtensionsAssignment_6_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==122) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXContext.g:1514:4: rule__XContext__ExtensionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XContext__ExtensionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getExtensionsAssignment_6_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_6__1__Impl"


    // $ANTLR start "rule__XContext__Group_7__0"
    // InternalXContext.g:1524:1: rule__XContext__Group_7__0 : rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 ;
    public final void rule__XContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1528:1: ( rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1 )
            // InternalXContext.g:1529:2: rule__XContext__Group_7__0__Impl rule__XContext__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__XContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XContext__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__0"


    // $ANTLR start "rule__XContext__Group_7__0__Impl"
    // InternalXContext.g:1536:1: rule__XContext__Group_7__0__Impl : ( 'axioms' ) ;
    public final void rule__XContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1540:1: ( ( 'axioms' ) )
            // InternalXContext.g:1541:1: ( 'axioms' )
            {
            // InternalXContext.g:1541:1: ( 'axioms' )
            // InternalXContext.g:1542:2: 'axioms'
            {
             before(grammarAccess.getXContextAccess().getAxiomsKeyword_7_0()); 
            match(input,119,FOLLOW_2); 
             after(grammarAccess.getXContextAccess().getAxiomsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__0__Impl"


    // $ANTLR start "rule__XContext__Group_7__1"
    // InternalXContext.g:1551:1: rule__XContext__Group_7__1 : rule__XContext__Group_7__1__Impl ;
    public final void rule__XContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1555:1: ( rule__XContext__Group_7__1__Impl )
            // InternalXContext.g:1556:2: rule__XContext__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XContext__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__1"


    // $ANTLR start "rule__XContext__Group_7__1__Impl"
    // InternalXContext.g:1562:1: rule__XContext__Group_7__1__Impl : ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) ;
    public final void rule__XContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1566:1: ( ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) ) )
            // InternalXContext.g:1567:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            {
            // InternalXContext.g:1567:1: ( ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* ) )
            // InternalXContext.g:1568:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) ) ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            {
            // InternalXContext.g:1568:2: ( ( rule__XContext__AxiomsAssignment_7_1 ) )
            // InternalXContext.g:1569:3: ( rule__XContext__AxiomsAssignment_7_1 )
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:1570:3: ( rule__XContext__AxiomsAssignment_7_1 )
            // InternalXContext.g:1570:4: rule__XContext__AxiomsAssignment_7_1
            {
            pushFollow(FOLLOW_11);
            rule__XContext__AxiomsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }

            // InternalXContext.g:1573:2: ( ( rule__XContext__AxiomsAssignment_7_1 )* )
            // InternalXContext.g:1574:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            {
             before(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 
            // InternalXContext.g:1575:3: ( rule__XContext__AxiomsAssignment_7_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_XLABEL||LA16_0==123) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXContext.g:1575:4: rule__XContext__AxiomsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__XContext__AxiomsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getXContextAccess().getAxiomsAssignment_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__Group_7__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXContext.g:1585:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1589:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXContext.g:1590:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalXContext.g:1597:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1601:1: ( ( RULE_ID ) )
            // InternalXContext.g:1602:1: ( RULE_ID )
            {
            // InternalXContext.g:1602:1: ( RULE_ID )
            // InternalXContext.g:1603:2: RULE_ID
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
    // InternalXContext.g:1612:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1616:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXContext.g:1617:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXContext.g:1623:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1627:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXContext.g:1628:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXContext.g:1628:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXContext.g:1629:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXContext.g:1630:2: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==51) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXContext.g:1630:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalXContext.g:1639:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1643:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXContext.g:1644:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXContext.g:1651:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1655:1: ( ( '.' ) )
            // InternalXContext.g:1656:1: ( '.' )
            {
            // InternalXContext.g:1656:1: ( '.' )
            // InternalXContext.g:1657:2: '.'
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
    // InternalXContext.g:1666:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1670:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXContext.g:1671:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXContext.g:1677:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1681:1: ( ( RULE_ID ) )
            // InternalXContext.g:1682:1: ( RULE_ID )
            {
            // InternalXContext.g:1682:1: ( RULE_ID )
            // InternalXContext.g:1683:2: RULE_ID
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
    // InternalXContext.g:1693:1: rule__XCarrierSet__Group__0 : rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 ;
    public final void rule__XCarrierSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1697:1: ( rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1 )
            // InternalXContext.g:1698:2: rule__XCarrierSet__Group__0__Impl rule__XCarrierSet__Group__1
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
    // InternalXContext.g:1705:1: rule__XCarrierSet__Group__0__Impl : ( () ) ;
    public final void rule__XCarrierSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1709:1: ( ( () ) )
            // InternalXContext.g:1710:1: ( () )
            {
            // InternalXContext.g:1710:1: ( () )
            // InternalXContext.g:1711:2: ()
            {
             before(grammarAccess.getXCarrierSetAccess().getCarrierSetAction_0()); 
            // InternalXContext.g:1712:2: ()
            // InternalXContext.g:1712:3: 
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
    // InternalXContext.g:1720:1: rule__XCarrierSet__Group__1 : rule__XCarrierSet__Group__1__Impl ;
    public final void rule__XCarrierSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1724:1: ( rule__XCarrierSet__Group__1__Impl )
            // InternalXContext.g:1725:2: rule__XCarrierSet__Group__1__Impl
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
    // InternalXContext.g:1731:1: rule__XCarrierSet__Group__1__Impl : ( ( rule__XCarrierSet__NameAssignment_1 ) ) ;
    public final void rule__XCarrierSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1735:1: ( ( ( rule__XCarrierSet__NameAssignment_1 ) ) )
            // InternalXContext.g:1736:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            {
            // InternalXContext.g:1736:1: ( ( rule__XCarrierSet__NameAssignment_1 ) )
            // InternalXContext.g:1737:2: ( rule__XCarrierSet__NameAssignment_1 )
            {
             before(grammarAccess.getXCarrierSetAccess().getNameAssignment_1()); 
            // InternalXContext.g:1738:2: ( rule__XCarrierSet__NameAssignment_1 )
            // InternalXContext.g:1738:3: rule__XCarrierSet__NameAssignment_1
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
    // InternalXContext.g:1747:1: rule__XConstant__Group__0 : rule__XConstant__Group__0__Impl rule__XConstant__Group__1 ;
    public final void rule__XConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1751:1: ( rule__XConstant__Group__0__Impl rule__XConstant__Group__1 )
            // InternalXContext.g:1752:2: rule__XConstant__Group__0__Impl rule__XConstant__Group__1
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
    // InternalXContext.g:1759:1: rule__XConstant__Group__0__Impl : ( () ) ;
    public final void rule__XConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1763:1: ( ( () ) )
            // InternalXContext.g:1764:1: ( () )
            {
            // InternalXContext.g:1764:1: ( () )
            // InternalXContext.g:1765:2: ()
            {
             before(grammarAccess.getXConstantAccess().getConstantAction_0()); 
            // InternalXContext.g:1766:2: ()
            // InternalXContext.g:1766:3: 
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
    // InternalXContext.g:1774:1: rule__XConstant__Group__1 : rule__XConstant__Group__1__Impl ;
    public final void rule__XConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1778:1: ( rule__XConstant__Group__1__Impl )
            // InternalXContext.g:1779:2: rule__XConstant__Group__1__Impl
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
    // InternalXContext.g:1785:1: rule__XConstant__Group__1__Impl : ( ( rule__XConstant__NameAssignment_1 ) ) ;
    public final void rule__XConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1789:1: ( ( ( rule__XConstant__NameAssignment_1 ) ) )
            // InternalXContext.g:1790:1: ( ( rule__XConstant__NameAssignment_1 ) )
            {
            // InternalXContext.g:1790:1: ( ( rule__XConstant__NameAssignment_1 ) )
            // InternalXContext.g:1791:2: ( rule__XConstant__NameAssignment_1 )
            {
             before(grammarAccess.getXConstantAccess().getNameAssignment_1()); 
            // InternalXContext.g:1792:2: ( rule__XConstant__NameAssignment_1 )
            // InternalXContext.g:1792:3: rule__XConstant__NameAssignment_1
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


    // $ANTLR start "rule__XAxiom__Group__0"
    // InternalXContext.g:1801:1: rule__XAxiom__Group__0 : rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 ;
    public final void rule__XAxiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1805:1: ( rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1 )
            // InternalXContext.g:1806:2: rule__XAxiom__Group__0__Impl rule__XAxiom__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__XAxiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1813:1: rule__XAxiom__Group__0__Impl : ( () ) ;
    public final void rule__XAxiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1817:1: ( ( () ) )
            // InternalXContext.g:1818:1: ( () )
            {
            // InternalXContext.g:1818:1: ( () )
            // InternalXContext.g:1819:2: ()
            {
             before(grammarAccess.getXAxiomAccess().getAxiomAction_0()); 
            // InternalXContext.g:1820:2: ()
            // InternalXContext.g:1820:3: 
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
    // InternalXContext.g:1828:1: rule__XAxiom__Group__1 : rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 ;
    public final void rule__XAxiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1832:1: ( rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2 )
            // InternalXContext.g:1833:2: rule__XAxiom__Group__1__Impl rule__XAxiom__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__XAxiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1840:1: rule__XAxiom__Group__1__Impl : ( ( rule__XAxiom__TheoremAssignment_1 )? ) ;
    public final void rule__XAxiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1844:1: ( ( ( rule__XAxiom__TheoremAssignment_1 )? ) )
            // InternalXContext.g:1845:1: ( ( rule__XAxiom__TheoremAssignment_1 )? )
            {
            // InternalXContext.g:1845:1: ( ( rule__XAxiom__TheoremAssignment_1 )? )
            // InternalXContext.g:1846:2: ( rule__XAxiom__TheoremAssignment_1 )?
            {
             before(grammarAccess.getXAxiomAccess().getTheoremAssignment_1()); 
            // InternalXContext.g:1847:2: ( rule__XAxiom__TheoremAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==123) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXContext.g:1847:3: rule__XAxiom__TheoremAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XAxiom__TheoremAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXAxiomAccess().getTheoremAssignment_1()); 

            }


            }

        }
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
    // InternalXContext.g:1855:1: rule__XAxiom__Group__2 : rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 ;
    public final void rule__XAxiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1859:1: ( rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3 )
            // InternalXContext.g:1860:2: rule__XAxiom__Group__2__Impl rule__XAxiom__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__XAxiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1867:1: rule__XAxiom__Group__2__Impl : ( ( rule__XAxiom__NameAssignment_2 ) ) ;
    public final void rule__XAxiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1871:1: ( ( ( rule__XAxiom__NameAssignment_2 ) ) )
            // InternalXContext.g:1872:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            {
            // InternalXContext.g:1872:1: ( ( rule__XAxiom__NameAssignment_2 ) )
            // InternalXContext.g:1873:2: ( rule__XAxiom__NameAssignment_2 )
            {
             before(grammarAccess.getXAxiomAccess().getNameAssignment_2()); 
            // InternalXContext.g:1874:2: ( rule__XAxiom__NameAssignment_2 )
            // InternalXContext.g:1874:3: rule__XAxiom__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1882:1: rule__XAxiom__Group__3 : rule__XAxiom__Group__3__Impl ;
    public final void rule__XAxiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1886:1: ( rule__XAxiom__Group__3__Impl )
            // InternalXContext.g:1887:2: rule__XAxiom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalXContext.g:1893:1: rule__XAxiom__Group__3__Impl : ( ( rule__XAxiom__PredicateAssignment_3 ) ) ;
    public final void rule__XAxiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1897:1: ( ( ( rule__XAxiom__PredicateAssignment_3 ) ) )
            // InternalXContext.g:1898:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            {
            // InternalXContext.g:1898:1: ( ( rule__XAxiom__PredicateAssignment_3 ) )
            // InternalXContext.g:1899:2: ( rule__XAxiom__PredicateAssignment_3 )
            {
             before(grammarAccess.getXAxiomAccess().getPredicateAssignment_3()); 
            // InternalXContext.g:1900:2: ( rule__XAxiom__PredicateAssignment_3 )
            // InternalXContext.g:1900:3: rule__XAxiom__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0"
    // InternalXContext.g:1909:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1913:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 )
            // InternalXContext.g:1914:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalXContext.g:1921:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl : ( '%' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1925:1: ( ( '%' ) )
            // InternalXContext.g:1926:1: ( '%' )
            {
            // InternalXContext.g:1926:1: ( '%' )
            // InternalXContext.g:1927:2: '%'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getPercentSignKeyword_32_0()); 
            match(input,120,FOLLOW_2); 
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
    // InternalXContext.g:1936:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1 : rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1940:1: ( rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl )
            // InternalXContext.g:1941:2: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl
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
    // InternalXContext.g:1947:1: rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl : ( '\\u22C2' ) ;
    public final void rule__EVENTB_EXPRESSION_SYMBOLS__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1951:1: ( ( '\\u22C2' ) )
            // InternalXContext.g:1952:1: ( '\\u22C2' )
            {
            // InternalXContext.g:1952:1: ( '\\u22C2' )
            // InternalXContext.g:1953:2: '\\u22C2'
            {
             before(grammarAccess.getEVENTB_EXPRESSION_SYMBOLSAccess().getNAryIntersectionKeyword_32_1()); 
            match(input,121,FOLLOW_2); 
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


    // $ANTLR start "rule__Record__Group__0"
    // InternalXContext.g:1963:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1967:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // InternalXContext.g:1968:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__1();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:1975:1: rule__Record__Group__0__Impl : ( () ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1979:1: ( ( () ) )
            // InternalXContext.g:1980:1: ( () )
            {
            // InternalXContext.g:1980:1: ( () )
            // InternalXContext.g:1981:2: ()
            {
             before(grammarAccess.getRecordAccess().getRecordAction_0()); 
            // InternalXContext.g:1982:2: ()
            // InternalXContext.g:1982:3: 
            {
            }

             after(grammarAccess.getRecordAccess().getRecordAction_0()); 

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
    // InternalXContext.g:1990:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:1994:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // InternalXContext.g:1995:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__2();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2002:1: rule__Record__Group__1__Impl : ( 'record' ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2006:1: ( ( 'record' ) )
            // InternalXContext.g:2007:1: ( 'record' )
            {
            // InternalXContext.g:2007:1: ( 'record' )
            // InternalXContext.g:2008:2: 'record'
            {
             before(grammarAccess.getRecordAccess().getRecordKeyword_1()); 
            match(input,122,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getRecordKeyword_1()); 

            }


            }

        }
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
    // InternalXContext.g:2017:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2021:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // InternalXContext.g:2022:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__3();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2029:1: rule__Record__Group__2__Impl : ( ( rule__Record__NameAssignment_2 ) ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2033:1: ( ( ( rule__Record__NameAssignment_2 ) ) )
            // InternalXContext.g:2034:1: ( ( rule__Record__NameAssignment_2 ) )
            {
            // InternalXContext.g:2034:1: ( ( rule__Record__NameAssignment_2 ) )
            // InternalXContext.g:2035:2: ( rule__Record__NameAssignment_2 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_2()); 
            // InternalXContext.g:2036:2: ( rule__Record__NameAssignment_2 )
            // InternalXContext.g:2036:3: rule__Record__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Record__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalXContext.g:2044:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2048:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // InternalXContext.g:2049:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Record__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__4();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2056:1: rule__Record__Group__3__Impl : ( ( rule__Record__Group_3__0 )? ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2060:1: ( ( ( rule__Record__Group_3__0 )? ) )
            // InternalXContext.g:2061:1: ( ( rule__Record__Group_3__0 )? )
            {
            // InternalXContext.g:2061:1: ( ( rule__Record__Group_3__0 )? )
            // InternalXContext.g:2062:2: ( rule__Record__Group_3__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_3()); 
            // InternalXContext.g:2063:2: ( rule__Record__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==115) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXContext.g:2063:3: rule__Record__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalXContext.g:2071:1: rule__Record__Group__4 : rule__Record__Group__4__Impl ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2075:1: ( rule__Record__Group__4__Impl )
            // InternalXContext.g:2076:2: rule__Record__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2082:1: rule__Record__Group__4__Impl : ( ( rule__Record__Group_4__0 )? ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2086:1: ( ( ( rule__Record__Group_4__0 )? ) )
            // InternalXContext.g:2087:1: ( ( rule__Record__Group_4__0 )? )
            {
            // InternalXContext.g:2087:1: ( ( rule__Record__Group_4__0 )? )
            // InternalXContext.g:2088:2: ( rule__Record__Group_4__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_4()); 
            // InternalXContext.g:2089:2: ( rule__Record__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXContext.g:2089:3: rule__Record__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalXContext.g:2098:1: rule__Record__Group_3__0 : rule__Record__Group_3__0__Impl rule__Record__Group_3__1 ;
    public final void rule__Record__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2102:1: ( rule__Record__Group_3__0__Impl rule__Record__Group_3__1 )
            // InternalXContext.g:2103:2: rule__Record__Group_3__0__Impl rule__Record__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2110:1: rule__Record__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Record__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2114:1: ( ( 'extends' ) )
            // InternalXContext.g:2115:1: ( 'extends' )
            {
            // InternalXContext.g:2115:1: ( 'extends' )
            // InternalXContext.g:2116:2: 'extends'
            {
             before(grammarAccess.getRecordAccess().getExtendsKeyword_3_0()); 
            match(input,115,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
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
    // InternalXContext.g:2125:1: rule__Record__Group_3__1 : rule__Record__Group_3__1__Impl ;
    public final void rule__Record__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2129:1: ( rule__Record__Group_3__1__Impl )
            // InternalXContext.g:2130:2: rule__Record__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2136:1: rule__Record__Group_3__1__Impl : ( ( rule__Record__SubsetsAssignment_3_1 ) ) ;
    public final void rule__Record__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2140:1: ( ( ( rule__Record__SubsetsAssignment_3_1 ) ) )
            // InternalXContext.g:2141:1: ( ( rule__Record__SubsetsAssignment_3_1 ) )
            {
            // InternalXContext.g:2141:1: ( ( rule__Record__SubsetsAssignment_3_1 ) )
            // InternalXContext.g:2142:2: ( rule__Record__SubsetsAssignment_3_1 )
            {
             before(grammarAccess.getRecordAccess().getSubsetsAssignment_3_1()); 
            // InternalXContext.g:2143:2: ( rule__Record__SubsetsAssignment_3_1 )
            // InternalXContext.g:2143:3: rule__Record__SubsetsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__SubsetsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getSubsetsAssignment_3_1()); 

            }


            }

        }
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
    // InternalXContext.g:2152:1: rule__Record__Group_4__0 : rule__Record__Group_4__0__Impl rule__Record__Group_4__1 ;
    public final void rule__Record__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2156:1: ( rule__Record__Group_4__0__Impl rule__Record__Group_4__1 )
            // InternalXContext.g:2157:2: rule__Record__Group_4__0__Impl rule__Record__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Record__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2164:1: rule__Record__Group_4__0__Impl : ( ( rule__Record__FieldsAssignment_4_0 ) ) ;
    public final void rule__Record__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2168:1: ( ( ( rule__Record__FieldsAssignment_4_0 ) ) )
            // InternalXContext.g:2169:1: ( ( rule__Record__FieldsAssignment_4_0 ) )
            {
            // InternalXContext.g:2169:1: ( ( rule__Record__FieldsAssignment_4_0 ) )
            // InternalXContext.g:2170:2: ( rule__Record__FieldsAssignment_4_0 )
            {
             before(grammarAccess.getRecordAccess().getFieldsAssignment_4_0()); 
            // InternalXContext.g:2171:2: ( rule__Record__FieldsAssignment_4_0 )
            // InternalXContext.g:2171:3: rule__Record__FieldsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Record__FieldsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getFieldsAssignment_4_0()); 

            }


            }

        }
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
    // InternalXContext.g:2179:1: rule__Record__Group_4__1 : rule__Record__Group_4__1__Impl ;
    public final void rule__Record__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2183:1: ( rule__Record__Group_4__1__Impl )
            // InternalXContext.g:2184:2: rule__Record__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalXContext.g:2190:1: rule__Record__Group_4__1__Impl : ( ( rule__Record__FieldsAssignment_4_1 )* ) ;
    public final void rule__Record__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2194:1: ( ( ( rule__Record__FieldsAssignment_4_1 )* ) )
            // InternalXContext.g:2195:1: ( ( rule__Record__FieldsAssignment_4_1 )* )
            {
            // InternalXContext.g:2195:1: ( ( rule__Record__FieldsAssignment_4_1 )* )
            // InternalXContext.g:2196:2: ( rule__Record__FieldsAssignment_4_1 )*
            {
             before(grammarAccess.getRecordAccess().getFieldsAssignment_4_1()); 
            // InternalXContext.g:2197:2: ( rule__Record__FieldsAssignment_4_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXContext.g:2197:3: rule__Record__FieldsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Record__FieldsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRecordAccess().getFieldsAssignment_4_1()); 

            }


            }

        }
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
    // InternalXContext.g:2206:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2210:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalXContext.g:2211:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXContext.g:2218:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2222:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalXContext.g:2223:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalXContext.g:2223:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalXContext.g:2224:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalXContext.g:2225:2: ( rule__Field__NameAssignment_0 )
            // InternalXContext.g:2225:3: rule__Field__NameAssignment_0
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
    // InternalXContext.g:2233:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2237:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalXContext.g:2238:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalXContext.g:2245:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2249:1: ( ( ':' ) )
            // InternalXContext.g:2250:1: ( ':' )
            {
            // InternalXContext.g:2250:1: ( ':' )
            // InternalXContext.g:2251:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalXContext.g:2260:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2264:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalXContext.g:2265:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXContext.g:2272:1: rule__Field__Group__2__Impl : ( ( rule__Field__MultiplicityAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2276:1: ( ( ( rule__Field__MultiplicityAssignment_2 )? ) )
            // InternalXContext.g:2277:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            {
            // InternalXContext.g:2277:1: ( ( rule__Field__MultiplicityAssignment_2 )? )
            // InternalXContext.g:2278:2: ( rule__Field__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getMultiplicityAssignment_2()); 
            // InternalXContext.g:2279:2: ( rule__Field__MultiplicityAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=110 && LA22_0<=112)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXContext.g:2279:3: rule__Field__MultiplicityAssignment_2
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
    // InternalXContext.g:2287:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2291:1: ( rule__Field__Group__3__Impl )
            // InternalXContext.g:2292:2: rule__Field__Group__3__Impl
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
    // InternalXContext.g:2298:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2302:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // InternalXContext.g:2303:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // InternalXContext.g:2303:1: ( ( rule__Field__TypeAssignment_3 ) )
            // InternalXContext.g:2304:2: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // InternalXContext.g:2305:2: ( rule__Field__TypeAssignment_3 )
            // InternalXContext.g:2305:3: rule__Field__TypeAssignment_3
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
    // InternalXContext.g:2314:1: rule__XContext__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__XContext__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2318:1: ( ( RULE_ID ) )
            // InternalXContext.g:2319:2: ( RULE_ID )
            {
            // InternalXContext.g:2319:2: ( RULE_ID )
            // InternalXContext.g:2320:3: RULE_ID
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
    // InternalXContext.g:2329:1: rule__XContext__ExtendsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XContext__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2333:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXContext.g:2334:2: ( ( ruleQualifiedName ) )
            {
            // InternalXContext.g:2334:2: ( ( ruleQualifiedName ) )
            // InternalXContext.g:2335:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getXContextAccess().getExtendsContextCrossReference_3_1_0()); 
            // InternalXContext.g:2336:3: ( ruleQualifiedName )
            // InternalXContext.g:2337:4: ruleQualifiedName
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


    // $ANTLR start "rule__XContext__SetsAssignment_4_1"
    // InternalXContext.g:2348:1: rule__XContext__SetsAssignment_4_1 : ( ruleXCarrierSet ) ;
    public final void rule__XContext__SetsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2352:1: ( ( ruleXCarrierSet ) )
            // InternalXContext.g:2353:2: ( ruleXCarrierSet )
            {
            // InternalXContext.g:2353:2: ( ruleXCarrierSet )
            // InternalXContext.g:2354:3: ruleXCarrierSet
            {
             before(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXCarrierSet();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getSetsXCarrierSetParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__SetsAssignment_4_1"


    // $ANTLR start "rule__XContext__ConstantsAssignment_5_1"
    // InternalXContext.g:2363:1: rule__XContext__ConstantsAssignment_5_1 : ( ruleXConstant ) ;
    public final void rule__XContext__ConstantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2367:1: ( ( ruleXConstant ) )
            // InternalXContext.g:2368:2: ( ruleXConstant )
            {
            // InternalXContext.g:2368:2: ( ruleXConstant )
            // InternalXContext.g:2369:3: ruleXConstant
            {
             before(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXConstant();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getConstantsXConstantParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ConstantsAssignment_5_1"


    // $ANTLR start "rule__XContext__ExtensionsAssignment_6_1"
    // InternalXContext.g:2378:1: rule__XContext__ExtensionsAssignment_6_1 : ( ruleRecord ) ;
    public final void rule__XContext__ExtensionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2382:1: ( ( ruleRecord ) )
            // InternalXContext.g:2383:2: ( ruleRecord )
            {
            // InternalXContext.g:2383:2: ( ruleRecord )
            // InternalXContext.g:2384:3: ruleRecord
            {
             before(grammarAccess.getXContextAccess().getExtensionsRecordParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecord();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getExtensionsRecordParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__ExtensionsAssignment_6_1"


    // $ANTLR start "rule__XContext__AxiomsAssignment_7_1"
    // InternalXContext.g:2393:1: rule__XContext__AxiomsAssignment_7_1 : ( ruleXAxiom ) ;
    public final void rule__XContext__AxiomsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2397:1: ( ( ruleXAxiom ) )
            // InternalXContext.g:2398:2: ( ruleXAxiom )
            {
            // InternalXContext.g:2398:2: ( ruleXAxiom )
            // InternalXContext.g:2399:3: ruleXAxiom
            {
             before(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXAxiom();

            state._fsp--;

             after(grammarAccess.getXContextAccess().getAxiomsXAxiomParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContext__AxiomsAssignment_7_1"


    // $ANTLR start "rule__XCarrierSet__NameAssignment_1"
    // InternalXContext.g:2408:1: rule__XCarrierSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCarrierSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2412:1: ( ( RULE_ID ) )
            // InternalXContext.g:2413:2: ( RULE_ID )
            {
            // InternalXContext.g:2413:2: ( RULE_ID )
            // InternalXContext.g:2414:3: RULE_ID
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
    // InternalXContext.g:2423:1: rule__XConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2427:1: ( ( RULE_ID ) )
            // InternalXContext.g:2428:2: ( RULE_ID )
            {
            // InternalXContext.g:2428:2: ( RULE_ID )
            // InternalXContext.g:2429:3: RULE_ID
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


    // $ANTLR start "rule__XAxiom__TheoremAssignment_1"
    // InternalXContext.g:2438:1: rule__XAxiom__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__XAxiom__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2442:1: ( ( ( 'theorem' ) ) )
            // InternalXContext.g:2443:2: ( ( 'theorem' ) )
            {
            // InternalXContext.g:2443:2: ( ( 'theorem' ) )
            // InternalXContext.g:2444:3: ( 'theorem' )
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_1_0()); 
            // InternalXContext.g:2445:3: ( 'theorem' )
            // InternalXContext.g:2446:4: 'theorem'
            {
             before(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_1_0()); 
            match(input,123,FOLLOW_2); 
             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_1_0()); 

            }

             after(grammarAccess.getXAxiomAccess().getTheoremTheoremKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XAxiom__TheoremAssignment_1"


    // $ANTLR start "rule__XAxiom__NameAssignment_2"
    // InternalXContext.g:2457:1: rule__XAxiom__NameAssignment_2 : ( RULE_XLABEL ) ;
    public final void rule__XAxiom__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2461:1: ( ( RULE_XLABEL ) )
            // InternalXContext.g:2462:2: ( RULE_XLABEL )
            {
            // InternalXContext.g:2462:2: ( RULE_XLABEL )
            // InternalXContext.g:2463:3: RULE_XLABEL
            {
             before(grammarAccess.getXAxiomAccess().getNameXLABELTerminalRuleCall_2_0()); 
            match(input,RULE_XLABEL,FOLLOW_2); 
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
    // InternalXContext.g:2472:1: rule__XAxiom__PredicateAssignment_3 : ( ruleXFormula ) ;
    public final void rule__XAxiom__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2476:1: ( ( ruleXFormula ) )
            // InternalXContext.g:2477:2: ( ruleXFormula )
            {
            // InternalXContext.g:2477:2: ( ruleXFormula )
            // InternalXContext.g:2478:3: ruleXFormula
            {
             before(grammarAccess.getXAxiomAccess().getPredicateXFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Record__NameAssignment_2"
    // InternalXContext.g:2487:1: rule__Record__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2491:1: ( ( RULE_ID ) )
            // InternalXContext.g:2492:2: ( RULE_ID )
            {
            // InternalXContext.g:2492:2: ( RULE_ID )
            // InternalXContext.g:2493:3: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXContext.g:2502:1: rule__Record__SubsetsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Record__SubsetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2506:1: ( ( ( RULE_ID ) ) )
            // InternalXContext.g:2507:2: ( ( RULE_ID ) )
            {
            // InternalXContext.g:2507:2: ( ( RULE_ID ) )
            // InternalXContext.g:2508:3: ( RULE_ID )
            {
             before(grammarAccess.getRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 
            // InternalXContext.g:2509:3: ( RULE_ID )
            // InternalXContext.g:2510:4: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getSubsetsRecordIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRecordAccess().getSubsetsRecordCrossReference_3_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:2521:1: rule__Record__FieldsAssignment_4_0 : ( ruleField ) ;
    public final void rule__Record__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2525:1: ( ( ruleField ) )
            // InternalXContext.g:2526:2: ( ruleField )
            {
            // InternalXContext.g:2526:2: ( ruleField )
            // InternalXContext.g:2527:3: ruleField
            {
             before(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_0_0()); 

            }


            }

        }
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
    // InternalXContext.g:2536:1: rule__Record__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__Record__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2540:1: ( ( ruleField ) )
            // InternalXContext.g:2541:2: ( ruleField )
            {
            // InternalXContext.g:2541:2: ( ruleField )
            // InternalXContext.g:2542:3: ruleField
            {
             before(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getFieldsFieldParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalXContext.g:2551:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2555:1: ( ( RULE_ID ) )
            // InternalXContext.g:2556:2: ( RULE_ID )
            {
            // InternalXContext.g:2556:2: ( RULE_ID )
            // InternalXContext.g:2557:3: RULE_ID
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
    // InternalXContext.g:2566:1: rule__Field__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Field__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2570:1: ( ( ruleMultiplicity ) )
            // InternalXContext.g:2571:2: ( ruleMultiplicity )
            {
            // InternalXContext.g:2571:2: ( ruleMultiplicity )
            // InternalXContext.g:2572:3: ruleMultiplicity
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
    // InternalXContext.g:2581:1: rule__Field__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXContext.g:2585:1: ( ( RULE_ID ) )
            // InternalXContext.g:2586:2: ( RULE_ID )
            {
            // InternalXContext.g:2586:2: ( RULE_ID )
            // InternalXContext.g:2587:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFF032L,0x01003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x00FC000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L,0x0800000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L,0x0800000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xFFFFFFFFFFFFF030L,0x01003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L,0x0001C00000000000L});

}