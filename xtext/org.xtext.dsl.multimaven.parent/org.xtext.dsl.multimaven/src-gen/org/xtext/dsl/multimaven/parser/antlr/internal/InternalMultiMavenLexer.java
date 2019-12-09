package org.xtext.dsl.multimaven.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiMavenLexer extends Lexer {
    public static final int RULE_ARTIFACT=7;
    public static final int RULE_STRING=10;
    public static final int RULE_GROUP=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_VERSION=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_PATH=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMultiMavenLexer() {;} 
    public InternalMultiMavenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMultiMavenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMultiMaven.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:11:7: ( 'Proyecto' )
            // InternalMultiMaven.g:11:9: 'Proyecto'
            {
            match("Proyecto"); 


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
            // InternalMultiMaven.g:12:7: ( 'Xlmn:' )
            // InternalMultiMaven.g:12:9: 'Xlmn:'
            {
            match("Xlmn:"); 


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
            // InternalMultiMaven.g:13:7: ( 'Root' )
            // InternalMultiMaven.g:13:9: 'Root'
            {
            match("Root"); 


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
            // InternalMultiMaven.g:14:7: ( '{' )
            // InternalMultiMaven.g:14:9: '{'
            {
            match('{'); 

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
            // InternalMultiMaven.g:15:7: ( 'Path' )
            // InternalMultiMaven.g:15:9: 'Path'
            {
            match("Path"); 


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
            // InternalMultiMaven.g:16:7: ( 'Group' )
            // InternalMultiMaven.g:16:9: 'Group'
            {
            match("Group"); 


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
            // InternalMultiMaven.g:17:7: ( 'Artifact' )
            // InternalMultiMaven.g:17:9: 'Artifact'
            {
            match("Artifact"); 


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
            // InternalMultiMaven.g:18:7: ( 'Version' )
            // InternalMultiMaven.g:18:9: 'Version'
            {
            match("Version"); 


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
            // InternalMultiMaven.g:19:7: ( 'Packaging' )
            // InternalMultiMaven.g:19:9: 'Packaging'
            {
            match("Packaging"); 


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
            // InternalMultiMaven.g:20:7: ( 'Dependencias' )
            // InternalMultiMaven.g:20:9: 'Dependencias'
            {
            match("Dependencias"); 


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
            // InternalMultiMaven.g:21:7: ( '}' )
            // InternalMultiMaven.g:21:9: '}'
            {
            match('}'); 

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
            // InternalMultiMaven.g:22:7: ( 'Plugins' )
            // InternalMultiMaven.g:22:9: 'Plugins'
            {
            match("Plugins"); 


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
            // InternalMultiMaven.g:23:7: ( 'Hijos' )
            // InternalMultiMaven.g:23:9: 'Hijos'
            {
            match("Hijos"); 


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
            // InternalMultiMaven.g:24:7: ( 'Scope' )
            // InternalMultiMaven.g:24:9: 'Scope'
            {
            match("Scope"); 


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
            // InternalMultiMaven.g:25:7: ( 'Hijo' )
            // InternalMultiMaven.g:25:9: 'Hijo'
            {
            match("Hijo"); 


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
            // InternalMultiMaven.g:26:7: ( 'POM' )
            // InternalMultiMaven.g:26:9: 'POM'
            {
            match("POM"); 


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
            // InternalMultiMaven.g:27:7: ( 'JAR' )
            // InternalMultiMaven.g:27:9: 'JAR'
            {
            match("JAR"); 


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
            // InternalMultiMaven.g:28:7: ( 'EAR' )
            // InternalMultiMaven.g:28:9: 'EAR'
            {
            match("EAR"); 


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
            // InternalMultiMaven.g:29:7: ( 'WAR' )
            // InternalMultiMaven.g:29:9: 'WAR'
            {
            match("WAR"); 


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
            // InternalMultiMaven.g:30:7: ( 'RAR' )
            // InternalMultiMaven.g:30:9: 'RAR'
            {
            match("RAR"); 


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
            // InternalMultiMaven.g:31:7: ( 'MAVENPLUGIN' )
            // InternalMultiMaven.g:31:9: 'MAVENPLUGIN'
            {
            match("MAVENPLUGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:32:7: ( 'EJB' )
            // InternalMultiMaven.g:32:9: 'EJB'
            {
            match("EJB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:33:7: ( 'COMPILE' )
            // InternalMultiMaven.g:33:9: 'COMPILE'
            {
            match("COMPILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:34:7: ( 'TEST' )
            // InternalMultiMaven.g:34:9: 'TEST'
            {
            match("TEST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:35:7: ( 'PACKAGE' )
            // InternalMultiMaven.g:35:9: 'PACKAGE'
            {
            match("PACKAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:36:7: ( 'INSTALL' )
            // InternalMultiMaven.g:36:9: 'INSTALL'
            {
            match("INSTALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:37:7: ( 'DEPLOY' )
            // InternalMultiMaven.g:37:9: 'DEPLOY'
            {
            match("DEPLOY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_PATH"
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:932:11: ( ( 'a' | 'b' ) )
            // InternalMultiMaven.g:932:13: ( 'a' | 'b' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='b') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATH"

    // $ANTLR start "RULE_GROUP"
    public final void mRULE_GROUP() throws RecognitionException {
        try {
            int _type = RULE_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:934:12: ( ( 'c' | 'd' ) )
            // InternalMultiMaven.g:934:14: ( 'c' | 'd' )
            {
            if ( (input.LA(1)>='c' && input.LA(1)<='d') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GROUP"

    // $ANTLR start "RULE_ARTIFACT"
    public final void mRULE_ARTIFACT() throws RecognitionException {
        try {
            int _type = RULE_ARTIFACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:936:15: ( ( 'e' | 'f' ) )
            // InternalMultiMaven.g:936:17: ( 'e' | 'f' )
            {
            if ( (input.LA(1)>='e' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARTIFACT"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:938:14: ( '0' .. '9' '.' '0' .. '9' '.' '0' .. '9' )
            // InternalMultiMaven.g:938:16: '0' .. '9' '.' '0' .. '9' '.' '0' .. '9'
            {
            matchRange('0','9'); 
            match('.'); 
            matchRange('0','9'); 
            match('.'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMultiMaven.g:940:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMultiMaven.g:940:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMultiMaven.g:940:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMultiMaven.g:940:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMultiMaven.g:940:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMultiMaven.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalMultiMaven.g:942:10: ( ( '0' .. '9' )+ )
            // InternalMultiMaven.g:942:12: ( '0' .. '9' )+
            {
            // InternalMultiMaven.g:942:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMultiMaven.g:942:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalMultiMaven.g:944:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMultiMaven.g:944:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMultiMaven.g:944:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMultiMaven.g:944:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMultiMaven.g:944:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMultiMaven.g:944:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMultiMaven.g:944:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMultiMaven.g:944:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMultiMaven.g:944:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMultiMaven.g:944:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMultiMaven.g:944:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalMultiMaven.g:946:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMultiMaven.g:946:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMultiMaven.g:946:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMultiMaven.g:946:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalMultiMaven.g:948:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMultiMaven.g:948:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMultiMaven.g:948:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMultiMaven.g:948:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalMultiMaven.g:948:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMultiMaven.g:948:41: ( '\\r' )? '\\n'
                    {
                    // InternalMultiMaven.g:948:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMultiMaven.g:948:41: '\\r'
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
            // InternalMultiMaven.g:950:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMultiMaven.g:950:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMultiMaven.g:950:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMultiMaven.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalMultiMaven.g:952:16: ( . )
            // InternalMultiMaven.g:952:18: .
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
        // InternalMultiMaven.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_PATH | RULE_GROUP | RULE_ARTIFACT | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMultiMaven.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMultiMaven.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMultiMaven.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMultiMaven.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMultiMaven.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMultiMaven.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMultiMaven.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMultiMaven.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMultiMaven.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMultiMaven.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMultiMaven.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMultiMaven.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMultiMaven.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMultiMaven.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMultiMaven.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMultiMaven.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMultiMaven.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMultiMaven.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMultiMaven.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMultiMaven.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMultiMaven.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMultiMaven.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMultiMaven.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMultiMaven.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMultiMaven.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMultiMaven.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMultiMaven.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMultiMaven.g:1:172: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 29 :
                // InternalMultiMaven.g:1:182: RULE_GROUP
                {
                mRULE_GROUP(); 

                }
                break;
            case 30 :
                // InternalMultiMaven.g:1:193: RULE_ARTIFACT
                {
                mRULE_ARTIFACT(); 

                }
                break;
            case 31 :
                // InternalMultiMaven.g:1:207: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 32 :
                // InternalMultiMaven.g:1:220: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalMultiMaven.g:1:228: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalMultiMaven.g:1:237: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalMultiMaven.g:1:249: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMultiMaven.g:1:265: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalMultiMaven.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalMultiMaven.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\43\1\uffff\4\43\1\uffff\11\43\1\70\1\71\1\72\1\74\1\35\1\uffff\3\35\2\uffff\5\43\1\uffff\3\43\1\uffff\5\43\1\uffff\12\43\11\uffff\4\43\1\135\3\43\1\141\7\43\1\151\1\152\1\153\1\154\5\43\1\162\2\43\1\uffff\2\43\1\167\1\uffff\5\43\1\176\1\43\4\uffff\2\43\1\u0082\2\43\1\uffff\3\43\2\uffff\1\u0088\4\43\1\u008d\1\uffff\1\u008e\2\43\1\uffff\5\43\1\uffff\3\43\1\u0099\2\uffff\5\43\1\u009f\1\u00a0\1\43\1\u00a2\1\43\1\uffff\1\43\1\u00a5\1\u00a6\1\u00a7\1\43\2\uffff\1\u00a9\1\uffff\2\43\3\uffff\1\u00ac\1\uffff\2\43\1\uffff\3\43\1\u00b2\1\u00b3\2\uffff";
    static final String DFA12_eofS =
        "\u00b4\uffff";
    static final String DFA12_minS =
        "\1\0\1\101\1\154\1\101\1\uffff\2\162\1\145\1\105\1\uffff\1\151\1\143\4\101\1\117\1\105\1\116\3\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\157\1\143\1\165\1\115\1\103\1\uffff\1\155\1\157\1\122\1\uffff\1\157\1\164\1\162\1\160\1\120\1\uffff\1\152\1\157\2\122\1\102\1\122\1\126\1\115\2\123\11\uffff\1\171\1\150\1\153\1\147\1\60\1\113\1\156\1\164\1\60\1\165\1\151\1\163\1\145\1\114\1\157\1\160\4\60\1\105\1\120\2\124\1\145\1\60\1\141\1\151\1\uffff\1\101\1\72\1\60\1\uffff\1\160\1\146\1\151\1\156\1\117\1\60\1\145\4\uffff\1\116\1\111\1\60\1\101\1\143\1\uffff\1\147\1\156\1\107\2\uffff\1\60\1\141\1\157\1\144\1\131\1\60\1\uffff\1\60\1\120\1\114\1\uffff\1\114\1\164\1\151\1\163\1\105\1\uffff\1\143\1\156\1\145\1\60\2\uffff\1\114\1\105\1\114\1\157\1\156\2\60\1\164\1\60\1\156\1\uffff\1\125\3\60\1\147\2\uffff\1\60\1\uffff\1\143\1\107\3\uffff\1\60\1\uffff\1\151\1\111\1\uffff\1\141\1\116\1\163\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\154\1\157\1\uffff\2\162\2\145\1\uffff\1\151\1\143\1\101\1\112\2\101\1\117\1\105\1\116\3\172\1\56\1\172\1\uffff\2\uffff\1\57\2\uffff\1\157\1\164\1\165\1\115\1\103\1\uffff\1\155\1\157\1\122\1\uffff\1\157\1\164\1\162\1\160\1\120\1\uffff\1\152\1\157\2\122\1\102\1\122\1\126\1\115\2\123\11\uffff\1\171\1\150\1\153\1\147\1\172\1\113\1\156\1\164\1\172\1\165\1\151\1\163\1\145\1\114\1\157\1\160\4\172\1\105\1\120\2\124\1\145\1\172\1\141\1\151\1\uffff\1\101\1\72\1\172\1\uffff\1\160\1\146\1\151\1\156\1\117\1\172\1\145\4\uffff\1\116\1\111\1\172\1\101\1\143\1\uffff\1\147\1\156\1\107\2\uffff\1\172\1\141\1\157\1\144\1\131\1\172\1\uffff\1\172\1\120\1\114\1\uffff\1\114\1\164\1\151\1\163\1\105\1\uffff\1\143\1\156\1\145\1\172\2\uffff\1\114\1\105\1\114\1\157\1\156\2\172\1\164\1\172\1\156\1\uffff\1\125\3\172\1\147\2\uffff\1\172\1\uffff\1\143\1\107\3\uffff\1\172\1\uffff\1\151\1\111\1\uffff\1\141\1\116\1\163\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\4\uffff\1\13\16\uffff\1\40\3\uffff\1\45\1\46\5\uffff\1\40\3\uffff\1\4\5\uffff\1\13\12\uffff\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45\34\uffff\1\20\3\uffff\1\24\7\uffff\1\21\1\22\1\26\1\23\5\uffff\1\5\3\uffff\1\2\1\3\6\uffff\1\17\3\uffff\1\30\5\uffff\1\6\4\uffff\1\15\1\16\12\uffff\1\33\5\uffff\1\14\1\31\1\uffff\1\10\2\uffff\1\27\1\32\1\1\1\uffff\1\7\2\uffff\1\11\5\uffff\1\25\1\12";
    static final String DFA12_specialS =
        "\1\1\30\uffff\1\0\1\2\u0099\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\7\35\1\33\12\26\7\35\1\6\1\30\1\20\1\10\1\15\1\30\1\5\1\12\1\22\1\14\2\30\1\17\2\30\1\1\1\30\1\3\1\13\1\21\1\30\1\7\1\16\1\2\2\30\3\35\1\27\1\30\1\35\2\23\2\24\2\25\24\30\1\4\1\35\1\11\uff82\35",
            "\1\42\15\uffff\1\41\21\uffff\1\37\12\uffff\1\40\5\uffff\1\36",
            "\1\44",
            "\1\46\55\uffff\1\45",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54\37\uffff\1\53",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\10\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\73",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "\1\103\20\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\175\7\43",
            "\1\177",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a8",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_PATH | RULE_GROUP | RULE_ARTIFACT | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='X') ) {s = 2;}

                        else if ( (LA12_0=='R') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='G') ) {s = 5;}

                        else if ( (LA12_0=='A') ) {s = 6;}

                        else if ( (LA12_0=='V') ) {s = 7;}

                        else if ( (LA12_0=='D') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='H') ) {s = 10;}

                        else if ( (LA12_0=='S') ) {s = 11;}

                        else if ( (LA12_0=='J') ) {s = 12;}

                        else if ( (LA12_0=='E') ) {s = 13;}

                        else if ( (LA12_0=='W') ) {s = 14;}

                        else if ( (LA12_0=='M') ) {s = 15;}

                        else if ( (LA12_0=='C') ) {s = 16;}

                        else if ( (LA12_0=='T') ) {s = 17;}

                        else if ( (LA12_0=='I') ) {s = 18;}

                        else if ( ((LA12_0>='a' && LA12_0<='b')) ) {s = 19;}

                        else if ( ((LA12_0>='c' && LA12_0<='d')) ) {s = 20;}

                        else if ( ((LA12_0>='e' && LA12_0<='f')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='^') ) {s = 23;}

                        else if ( (LA12_0=='B'||LA12_0=='F'||(LA12_0>='K' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||LA12_0=='Q'||LA12_0=='U'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='z')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}