package ac.soton.xeventb.xmachine.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXMachineLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_XLABEL=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalXMachineLexer() {;} 
    public InternalXMachineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXMachineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXMachine.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:11:7: ( 'ordinary' )
            // InternalXMachine.g:11:9: 'ordinary'
            {
            match("ordinary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:12:7: ( 'convergent' )
            // InternalXMachine.g:12:9: 'convergent'
            {
            match("convergent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:13:7: ( 'anticipated' )
            // InternalXMachine.g:13:9: 'anticipated'
            {
            match("anticipated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:14:7: ( 'machine' )
            // InternalXMachine.g:14:9: 'machine'
            {
            match("machine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:15:7: ( 'end' )
            // InternalXMachine.g:15:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:16:7: ( 'refines' )
            // InternalXMachine.g:16:9: 'refines'
            {
            match("refines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:17:7: ( 'sees' )
            // InternalXMachine.g:17:9: 'sees'
            {
            match("sees"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:18:7: ( 'variables' )
            // InternalXMachine.g:18:9: 'variables'
            {
            match("variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:19:7: ( 'invariants' )
            // InternalXMachine.g:19:9: 'invariants'
            {
            match("invariants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:20:7: ( 'variant' )
            // InternalXMachine.g:20:9: 'variant'
            {
            match("variant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:21:7: ( 'events' )
            // InternalXMachine.g:21:9: 'events'
            {
            match("events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:22:7: ( 'includes' )
            // InternalXMachine.g:22:9: 'includes'
            {
            match("includes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:23:7: ( 'to' )
            // InternalXMachine.g:23:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:24:7: ( 'as' )
            // InternalXMachine.g:24:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:25:7: ( '.' )
            // InternalXMachine.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:26:7: ( 'begin' )
            // InternalXMachine.g:26:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:27:7: ( 'with' )
            // InternalXMachine.g:27:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:28:7: ( 'when' )
            // InternalXMachine.g:28:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:29:7: ( 'then' )
            // InternalXMachine.g:29:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:30:7: ( 'any' )
            // InternalXMachine.g:30:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:31:7: ( 'where' )
            // InternalXMachine.g:31:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:32:7: ( 'synchronises' )
            // InternalXMachine.g:32:9: 'synchronises'
            {
            match("synchronises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:33:7: ( 'theorem' )
            // InternalXMachine.g:33:9: 'theorem'
            {
            match("theorem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:34:7: ( 'extended' )
            // InternalXMachine.g:34:9: 'extended'
            {
            match("extended"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_XLABEL"
    public final void mRULE_XLABEL() throws RecognitionException {
        try {
            int _type = RULE_XLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9494:13: ( '@' (~ ( ':' ) )+ ':' )
            // InternalXMachine.g:9494:15: '@' (~ ( ':' ) )+ ':'
            {
            match('@'); 
            // InternalXMachine.g:9494:19: (~ ( ':' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='9')||(LA1_0>=';' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXMachine.g:9494:19: ~ ( ':' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XLABEL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9496:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )* )
            // InternalXMachine.g:9496:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )*
            {
            // InternalXMachine.g:9496:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXMachine.g:9496:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXMachine.g:9496:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | 'i' .. '\\uFFDC' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='\uFFDC')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXMachine.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='\uFFDC') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9498:10: ( ( '0' .. '9' )+ )
            // InternalXMachine.g:9498:12: ( '0' .. '9' )+
            {
            // InternalXMachine.g:9498:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXMachine.g:9498:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9500:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXMachine.g:9500:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXMachine.g:9500:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXMachine.g:9500:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXMachine.g:9500:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXMachine.g:9500:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXMachine.g:9500:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXMachine.g:9500:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXMachine.g:9500:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXMachine.g:9500:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXMachine.g:9500:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9502:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXMachine.g:9502:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXMachine.g:9502:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXMachine.g:9502:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9504:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXMachine.g:9504:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXMachine.g:9504:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXMachine.g:9504:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalXMachine.g:9504:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXMachine.g:9504:41: ( '\\r' )? '\\n'
                    {
                    // InternalXMachine.g:9504:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalXMachine.g:9504:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9506:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXMachine.g:9506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXMachine.g:9506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXMachine.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXMachine.g:9508:16: ( . )
            // InternalXMachine.g:9508:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalXMachine.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_XLABEL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=32;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalXMachine.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalXMachine.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalXMachine.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalXMachine.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalXMachine.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalXMachine.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalXMachine.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalXMachine.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalXMachine.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalXMachine.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalXMachine.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalXMachine.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalXMachine.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalXMachine.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalXMachine.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalXMachine.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalXMachine.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalXMachine.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalXMachine.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalXMachine.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalXMachine.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalXMachine.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalXMachine.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalXMachine.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalXMachine.g:1:154: RULE_XLABEL
                {
                mRULE_XLABEL(); 

                }
                break;
            case 26 :
                // InternalXMachine.g:1:166: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalXMachine.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalXMachine.g:1:183: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalXMachine.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalXMachine.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalXMachine.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalXMachine.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\12\30\1\uffff\2\30\2\26\2\uffff\3\26\2\uffff\1\30\1\uffff\2\30\1\65\11\30\1\100\1\30\1\uffff\3\30\6\uffff\3\30\1\110\1\uffff\1\30\1\112\10\30\1\uffff\7\30\1\uffff\1\30\1\uffff\3\30\1\140\4\30\1\145\2\30\1\150\1\151\10\30\1\uffff\4\30\1\uffff\1\30\1\170\2\uffff\1\171\4\30\1\176\10\30\2\uffff\3\30\1\u008a\1\uffff\1\30\1\u008c\2\30\1\u008f\2\30\1\u0092\1\u0093\2\30\1\uffff\1\u0096\1\uffff\2\30\1\uffff\1\30\1\u009a\2\uffff\2\30\1\uffff\1\30\1\u009e\1\30\1\uffff\1\u00a0\2\30\1\uffff\1\u00a3\1\uffff\1\u00a4\1\30\2\uffff\1\u00a6\1\uffff";
    static final String DFA13_eofS =
        "\u00a7\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\157\1\156\1\141\1\156\2\145\1\141\1\156\1\150\1\uffff\1\145\1\150\1\0\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\uffff\1\156\1\164\1\60\1\143\1\144\1\145\1\164\1\146\1\145\1\156\1\162\1\143\1\60\1\145\1\uffff\1\147\1\164\1\145\6\uffff\1\151\1\166\1\151\1\60\1\uffff\1\150\1\60\1\156\1\145\1\151\1\163\1\143\1\151\1\141\1\154\1\uffff\1\156\1\151\1\150\2\156\1\145\1\143\1\uffff\1\151\1\uffff\1\164\2\156\1\60\1\150\1\141\1\162\1\165\1\60\1\162\1\156\2\60\1\145\1\141\1\162\1\151\1\156\1\163\1\144\1\145\1\uffff\1\162\1\142\1\151\1\144\1\uffff\1\145\1\60\2\uffff\1\60\1\162\1\147\1\160\1\145\1\60\1\145\1\163\1\157\1\154\1\164\1\141\1\145\1\155\2\uffff\1\171\1\145\1\141\1\60\1\uffff\1\144\1\60\1\156\1\145\1\60\1\156\1\163\2\60\1\156\1\164\1\uffff\1\60\1\uffff\1\151\1\163\1\uffff\1\164\1\60\2\uffff\1\164\1\145\1\uffff\1\163\1\60\1\163\1\uffff\1\60\1\144\1\145\1\uffff\1\60\1\uffff\1\60\1\163\2\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\157\1\163\1\141\1\170\1\145\1\171\1\141\1\156\1\157\1\uffff\1\145\1\151\1\uffff\1\uffdc\2\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\156\1\171\1\uffdc\1\143\1\144\1\145\1\164\1\146\1\145\1\156\1\162\1\166\1\uffdc\1\145\1\uffff\1\147\1\164\1\145\6\uffff\1\151\1\166\1\151\1\uffdc\1\uffff\1\150\1\uffdc\1\156\1\145\1\151\1\163\1\143\1\151\1\141\1\154\1\uffff\1\157\1\151\1\150\1\162\1\156\1\145\1\143\1\uffff\1\151\1\uffff\1\164\2\156\1\uffdc\1\150\1\141\1\162\1\165\1\uffdc\1\162\1\156\2\uffdc\1\145\1\141\1\162\1\151\1\156\1\163\1\144\1\145\1\uffff\1\162\1\156\1\151\1\144\1\uffff\1\145\1\uffdc\2\uffff\1\uffdc\1\162\1\147\1\160\1\145\1\uffdc\1\145\1\163\1\157\1\154\1\164\1\141\1\145\1\155\2\uffff\1\171\1\145\1\141\1\uffdc\1\uffff\1\144\1\uffdc\1\156\1\145\1\uffdc\1\156\1\163\2\uffdc\1\156\1\164\1\uffff\1\uffdc\1\uffff\1\151\1\163\1\uffff\1\164\1\uffdc\2\uffff\1\164\1\145\1\uffff\1\163\1\uffdc\1\163\1\uffff\1\uffdc\1\144\1\145\1\uffff\1\uffdc\1\uffff\1\uffdc\1\163\2\uffff\1\uffdc\1\uffff";
    static final String DFA13_acceptS =
        "\13\uffff\1\17\4\uffff\1\32\1\33\3\uffff\1\37\1\40\1\uffff\1\32\16\uffff\1\17\3\uffff\1\31\1\33\1\34\1\35\1\36\1\37\4\uffff\1\16\12\uffff\1\15\7\uffff\1\24\1\uffff\1\5\25\uffff\1\7\4\uffff\1\23\2\uffff\1\21\1\22\16\uffff\1\20\1\25\4\uffff\1\13\13\uffff\1\4\1\uffff\1\6\2\uffff\1\12\2\uffff\1\27\1\1\2\uffff\1\30\3\uffff\1\14\3\uffff\1\10\1\uffff\1\2\2\uffff\1\11\1\3\1\uffff\1\26";
    static final String DFA13_specialS =
        "\1\1\15\uffff\1\3\3\uffff\1\2\1\0\u0093\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\6\26\1\13\1\24\12\21\6\26\1\16\32\20\3\26\1\17\1\20\1\26\1\3\1\14\1\2\1\20\1\5\3\20\1\11\3\20\1\4\1\20\1\1\2\20\1\6\1\7\1\12\1\20\1\10\1\15\uff65\20\43\26",
            "\1\27",
            "\1\31",
            "\1\32\4\uffff\1\33",
            "\1\34",
            "\1\35\7\uffff\1\36\1\uffff\1\37",
            "\1\40",
            "\1\41\23\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\46\6\uffff\1\45",
            "",
            "\1\50",
            "\1\52\1\51",
            "\72\53\1\uffff\uffc5\53",
            "\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\1\61",
            "",
            "\1\62",
            "\1\63\4\uffff\1\64",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\22\uffff\1\76",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "\1\111",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\146",
            "\1\147",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163\13\uffff\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "\1\u008b",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u008d",
            "\1\u008e",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u0090",
            "\1\u0091",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u0094",
            "\1\u0095",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u009f",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            "\1\u00a5",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\uff7c\30",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_XLABEL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='o') ) {s = 1;}

                        else if ( (LA13_0=='c') ) {s = 2;}

                        else if ( (LA13_0=='a') ) {s = 3;}

                        else if ( (LA13_0=='m') ) {s = 4;}

                        else if ( (LA13_0=='e') ) {s = 5;}

                        else if ( (LA13_0=='r') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='v') ) {s = 8;}

                        else if ( (LA13_0=='i') ) {s = 9;}

                        else if ( (LA13_0=='t') ) {s = 10;}

                        else if ( (LA13_0=='.') ) {s = 11;}

                        else if ( (LA13_0=='b') ) {s = 12;}

                        else if ( (LA13_0=='w') ) {s = 13;}

                        else if ( (LA13_0=='@') ) {s = 14;}

                        else if ( (LA13_0=='^') ) {s = 15;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='d'||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||LA13_0=='n'||(LA13_0>='p' && LA13_0<='q')||LA13_0=='u'||(LA13_0>='x' && LA13_0<='\uFFDC')) ) {s = 16;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 17;}

                        else if ( (LA13_0=='\"') ) {s = 18;}

                        else if ( (LA13_0=='\'') ) {s = 19;}

                        else if ( (LA13_0=='/') ) {s = 20;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 21;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||(LA13_0>=':' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='\uFFDD' && LA13_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( ((LA13_14>='\u0000' && LA13_14<='9')||(LA13_14>=';' && LA13_14<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}