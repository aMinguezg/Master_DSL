package org.xtext.dsl.restaurante.ide.contentassist.antlr.internal;

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
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestauranteParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FECHA", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Restaurantes'", "'fecha'", "'Ingredientes'", "'{'", "'}'", "'Ingrediente:'", "'infoURL:'", "'foto:'", "'alergenico'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_FECHA=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_URL=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRestauranteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestauranteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestauranteParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRestaurante.g"; }


    	private RestauranteGrammarAccess grammarAccess;

    	public void setGrammarAccess(RestauranteGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRestaurante"
    // InternalRestaurante.g:53:1: entryRuleRestaurante : ruleRestaurante EOF ;
    public final void entryRuleRestaurante() throws RecognitionException {
        try {
            // InternalRestaurante.g:54:1: ( ruleRestaurante EOF )
            // InternalRestaurante.g:55:1: ruleRestaurante EOF
            {
             before(grammarAccess.getRestauranteRule()); 
            pushFollow(FOLLOW_1);
            ruleRestaurante();

            state._fsp--;

             after(grammarAccess.getRestauranteRule()); 
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
    // $ANTLR end "entryRuleRestaurante"


    // $ANTLR start "ruleRestaurante"
    // InternalRestaurante.g:62:1: ruleRestaurante : ( ( rule__Restaurante__Group__0 ) ) ;
    public final void ruleRestaurante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:66:2: ( ( ( rule__Restaurante__Group__0 ) ) )
            // InternalRestaurante.g:67:2: ( ( rule__Restaurante__Group__0 ) )
            {
            // InternalRestaurante.g:67:2: ( ( rule__Restaurante__Group__0 ) )
            // InternalRestaurante.g:68:3: ( rule__Restaurante__Group__0 )
            {
             before(grammarAccess.getRestauranteAccess().getGroup()); 
            // InternalRestaurante.g:69:3: ( rule__Restaurante__Group__0 )
            // InternalRestaurante.g:69:4: rule__Restaurante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestaurante"


    // $ANTLR start "entryRuleIngrediente"
    // InternalRestaurante.g:78:1: entryRuleIngrediente : ruleIngrediente EOF ;
    public final void entryRuleIngrediente() throws RecognitionException {
        try {
            // InternalRestaurante.g:79:1: ( ruleIngrediente EOF )
            // InternalRestaurante.g:80:1: ruleIngrediente EOF
            {
             before(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getIngredienteRule()); 
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
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalRestaurante.g:87:1: ruleIngrediente : ( ( rule__Ingrediente__Group__0 ) ) ;
    public final void ruleIngrediente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:91:2: ( ( ( rule__Ingrediente__Group__0 ) ) )
            // InternalRestaurante.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            {
            // InternalRestaurante.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            // InternalRestaurante.g:93:3: ( rule__Ingrediente__Group__0 )
            {
             before(grammarAccess.getIngredienteAccess().getGroup()); 
            // InternalRestaurante.g:94:3: ( rule__Ingrediente__Group__0 )
            // InternalRestaurante.g:94:4: rule__Ingrediente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngrediente"


    // $ANTLR start "rule__Restaurante__Group__0"
    // InternalRestaurante.g:102:1: rule__Restaurante__Group__0 : rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1 ;
    public final void rule__Restaurante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:106:1: ( rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1 )
            // InternalRestaurante.g:107:2: rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Restaurante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__0"


    // $ANTLR start "rule__Restaurante__Group__0__Impl"
    // InternalRestaurante.g:114:1: rule__Restaurante__Group__0__Impl : ( 'Restaurantes' ) ;
    public final void rule__Restaurante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:118:1: ( ( 'Restaurantes' ) )
            // InternalRestaurante.g:119:1: ( 'Restaurantes' )
            {
            // InternalRestaurante.g:119:1: ( 'Restaurantes' )
            // InternalRestaurante.g:120:2: 'Restaurantes'
            {
             before(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__0__Impl"


    // $ANTLR start "rule__Restaurante__Group__1"
    // InternalRestaurante.g:129:1: rule__Restaurante__Group__1 : rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2 ;
    public final void rule__Restaurante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:133:1: ( rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2 )
            // InternalRestaurante.g:134:2: rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Restaurante__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__1"


    // $ANTLR start "rule__Restaurante__Group__1__Impl"
    // InternalRestaurante.g:141:1: rule__Restaurante__Group__1__Impl : ( ( rule__Restaurante__NombreAssignment_1 ) ) ;
    public final void rule__Restaurante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:145:1: ( ( ( rule__Restaurante__NombreAssignment_1 ) ) )
            // InternalRestaurante.g:146:1: ( ( rule__Restaurante__NombreAssignment_1 ) )
            {
            // InternalRestaurante.g:146:1: ( ( rule__Restaurante__NombreAssignment_1 ) )
            // InternalRestaurante.g:147:2: ( rule__Restaurante__NombreAssignment_1 )
            {
             before(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); 
            // InternalRestaurante.g:148:2: ( rule__Restaurante__NombreAssignment_1 )
            // InternalRestaurante.g:148:3: rule__Restaurante__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__1__Impl"


    // $ANTLR start "rule__Restaurante__Group__2"
    // InternalRestaurante.g:156:1: rule__Restaurante__Group__2 : rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3 ;
    public final void rule__Restaurante__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:160:1: ( rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3 )
            // InternalRestaurante.g:161:2: rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Restaurante__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__2"


    // $ANTLR start "rule__Restaurante__Group__2__Impl"
    // InternalRestaurante.g:168:1: rule__Restaurante__Group__2__Impl : ( 'fecha' ) ;
    public final void rule__Restaurante__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:172:1: ( ( 'fecha' ) )
            // InternalRestaurante.g:173:1: ( 'fecha' )
            {
            // InternalRestaurante.g:173:1: ( 'fecha' )
            // InternalRestaurante.g:174:2: 'fecha'
            {
             before(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__2__Impl"


    // $ANTLR start "rule__Restaurante__Group__3"
    // InternalRestaurante.g:183:1: rule__Restaurante__Group__3 : rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4 ;
    public final void rule__Restaurante__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:187:1: ( rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4 )
            // InternalRestaurante.g:188:2: rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Restaurante__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__3"


    // $ANTLR start "rule__Restaurante__Group__3__Impl"
    // InternalRestaurante.g:195:1: rule__Restaurante__Group__3__Impl : ( ( rule__Restaurante__FechaAssignment_3 ) ) ;
    public final void rule__Restaurante__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:199:1: ( ( ( rule__Restaurante__FechaAssignment_3 ) ) )
            // InternalRestaurante.g:200:1: ( ( rule__Restaurante__FechaAssignment_3 ) )
            {
            // InternalRestaurante.g:200:1: ( ( rule__Restaurante__FechaAssignment_3 ) )
            // InternalRestaurante.g:201:2: ( rule__Restaurante__FechaAssignment_3 )
            {
             before(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); 
            // InternalRestaurante.g:202:2: ( rule__Restaurante__FechaAssignment_3 )
            // InternalRestaurante.g:202:3: rule__Restaurante__FechaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__FechaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__3__Impl"


    // $ANTLR start "rule__Restaurante__Group__4"
    // InternalRestaurante.g:210:1: rule__Restaurante__Group__4 : rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5 ;
    public final void rule__Restaurante__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:214:1: ( rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5 )
            // InternalRestaurante.g:215:2: rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Restaurante__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__4"


    // $ANTLR start "rule__Restaurante__Group__4__Impl"
    // InternalRestaurante.g:222:1: rule__Restaurante__Group__4__Impl : ( 'Ingredientes' ) ;
    public final void rule__Restaurante__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:226:1: ( ( 'Ingredientes' ) )
            // InternalRestaurante.g:227:1: ( 'Ingredientes' )
            {
            // InternalRestaurante.g:227:1: ( 'Ingredientes' )
            // InternalRestaurante.g:228:2: 'Ingredientes'
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__4__Impl"


    // $ANTLR start "rule__Restaurante__Group__5"
    // InternalRestaurante.g:237:1: rule__Restaurante__Group__5 : rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6 ;
    public final void rule__Restaurante__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:241:1: ( rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6 )
            // InternalRestaurante.g:242:2: rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Restaurante__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__5"


    // $ANTLR start "rule__Restaurante__Group__5__Impl"
    // InternalRestaurante.g:249:1: rule__Restaurante__Group__5__Impl : ( '{' ) ;
    public final void rule__Restaurante__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:253:1: ( ( '{' ) )
            // InternalRestaurante.g:254:1: ( '{' )
            {
            // InternalRestaurante.g:254:1: ( '{' )
            // InternalRestaurante.g:255:2: '{'
            {
             before(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__5__Impl"


    // $ANTLR start "rule__Restaurante__Group__6"
    // InternalRestaurante.g:264:1: rule__Restaurante__Group__6 : rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7 ;
    public final void rule__Restaurante__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:268:1: ( rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7 )
            // InternalRestaurante.g:269:2: rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Restaurante__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__6"


    // $ANTLR start "rule__Restaurante__Group__6__Impl"
    // InternalRestaurante.g:276:1: rule__Restaurante__Group__6__Impl : ( ( rule__Restaurante__IngredientesAssignment_6 )* ) ;
    public final void rule__Restaurante__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:280:1: ( ( ( rule__Restaurante__IngredientesAssignment_6 )* ) )
            // InternalRestaurante.g:281:1: ( ( rule__Restaurante__IngredientesAssignment_6 )* )
            {
            // InternalRestaurante.g:281:1: ( ( rule__Restaurante__IngredientesAssignment_6 )* )
            // InternalRestaurante.g:282:2: ( rule__Restaurante__IngredientesAssignment_6 )*
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); 
            // InternalRestaurante.g:283:2: ( rule__Restaurante__IngredientesAssignment_6 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestaurante.g:283:3: rule__Restaurante__IngredientesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Restaurante__IngredientesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__6__Impl"


    // $ANTLR start "rule__Restaurante__Group__7"
    // InternalRestaurante.g:291:1: rule__Restaurante__Group__7 : rule__Restaurante__Group__7__Impl ;
    public final void rule__Restaurante__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:295:1: ( rule__Restaurante__Group__7__Impl )
            // InternalRestaurante.g:296:2: rule__Restaurante__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__7"


    // $ANTLR start "rule__Restaurante__Group__7__Impl"
    // InternalRestaurante.g:302:1: rule__Restaurante__Group__7__Impl : ( '}' ) ;
    public final void rule__Restaurante__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:306:1: ( ( '}' ) )
            // InternalRestaurante.g:307:1: ( '}' )
            {
            // InternalRestaurante.g:307:1: ( '}' )
            // InternalRestaurante.g:308:2: '}'
            {
             before(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__7__Impl"


    // $ANTLR start "rule__Ingrediente__Group__0"
    // InternalRestaurante.g:318:1: rule__Ingrediente__Group__0 : rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 ;
    public final void rule__Ingrediente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:322:1: ( rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 )
            // InternalRestaurante.g:323:2: rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Ingrediente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0"


    // $ANTLR start "rule__Ingrediente__Group__0__Impl"
    // InternalRestaurante.g:330:1: rule__Ingrediente__Group__0__Impl : ( 'Ingrediente:' ) ;
    public final void rule__Ingrediente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:334:1: ( ( 'Ingrediente:' ) )
            // InternalRestaurante.g:335:1: ( 'Ingrediente:' )
            {
            // InternalRestaurante.g:335:1: ( 'Ingrediente:' )
            // InternalRestaurante.g:336:2: 'Ingrediente:'
            {
             before(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group__1"
    // InternalRestaurante.g:345:1: rule__Ingrediente__Group__1 : rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 ;
    public final void rule__Ingrediente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:349:1: ( rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 )
            // InternalRestaurante.g:350:2: rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Ingrediente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1"


    // $ANTLR start "rule__Ingrediente__Group__1__Impl"
    // InternalRestaurante.g:357:1: rule__Ingrediente__Group__1__Impl : ( ( rule__Ingrediente__NameAssignment_1 ) ) ;
    public final void rule__Ingrediente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:361:1: ( ( ( rule__Ingrediente__NameAssignment_1 ) ) )
            // InternalRestaurante.g:362:1: ( ( rule__Ingrediente__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:362:1: ( ( rule__Ingrediente__NameAssignment_1 ) )
            // InternalRestaurante.g:363:2: ( rule__Ingrediente__NameAssignment_1 )
            {
             before(grammarAccess.getIngredienteAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:364:2: ( rule__Ingrediente__NameAssignment_1 )
            // InternalRestaurante.g:364:3: rule__Ingrediente__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1__Impl"


    // $ANTLR start "rule__Ingrediente__Group__2"
    // InternalRestaurante.g:372:1: rule__Ingrediente__Group__2 : rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 ;
    public final void rule__Ingrediente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:376:1: ( rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 )
            // InternalRestaurante.g:377:2: rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Ingrediente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2"


    // $ANTLR start "rule__Ingrediente__Group__2__Impl"
    // InternalRestaurante.g:384:1: rule__Ingrediente__Group__2__Impl : ( ( rule__Ingrediente__NombreAssignment_2 ) ) ;
    public final void rule__Ingrediente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:388:1: ( ( ( rule__Ingrediente__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:389:1: ( ( rule__Ingrediente__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:389:1: ( ( rule__Ingrediente__NombreAssignment_2 ) )
            // InternalRestaurante.g:390:2: ( rule__Ingrediente__NombreAssignment_2 )
            {
             before(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:391:2: ( rule__Ingrediente__NombreAssignment_2 )
            // InternalRestaurante.g:391:3: rule__Ingrediente__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2__Impl"


    // $ANTLR start "rule__Ingrediente__Group__3"
    // InternalRestaurante.g:399:1: rule__Ingrediente__Group__3 : rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4 ;
    public final void rule__Ingrediente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:403:1: ( rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4 )
            // InternalRestaurante.g:404:2: rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Ingrediente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3"


    // $ANTLR start "rule__Ingrediente__Group__3__Impl"
    // InternalRestaurante.g:411:1: rule__Ingrediente__Group__3__Impl : ( ( rule__Ingrediente__Group_3__0 )? ) ;
    public final void rule__Ingrediente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:415:1: ( ( ( rule__Ingrediente__Group_3__0 )? ) )
            // InternalRestaurante.g:416:1: ( ( rule__Ingrediente__Group_3__0 )? )
            {
            // InternalRestaurante.g:416:1: ( ( rule__Ingrediente__Group_3__0 )? )
            // InternalRestaurante.g:417:2: ( rule__Ingrediente__Group_3__0 )?
            {
             before(grammarAccess.getIngredienteAccess().getGroup_3()); 
            // InternalRestaurante.g:418:2: ( rule__Ingrediente__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRestaurante.g:418:3: rule__Ingrediente__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3__Impl"


    // $ANTLR start "rule__Ingrediente__Group__4"
    // InternalRestaurante.g:426:1: rule__Ingrediente__Group__4 : rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5 ;
    public final void rule__Ingrediente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:430:1: ( rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5 )
            // InternalRestaurante.g:431:2: rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Ingrediente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__4"


    // $ANTLR start "rule__Ingrediente__Group__4__Impl"
    // InternalRestaurante.g:438:1: rule__Ingrediente__Group__4__Impl : ( ( rule__Ingrediente__Group_4__0 )? ) ;
    public final void rule__Ingrediente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:442:1: ( ( ( rule__Ingrediente__Group_4__0 )? ) )
            // InternalRestaurante.g:443:1: ( ( rule__Ingrediente__Group_4__0 )? )
            {
            // InternalRestaurante.g:443:1: ( ( rule__Ingrediente__Group_4__0 )? )
            // InternalRestaurante.g:444:2: ( rule__Ingrediente__Group_4__0 )?
            {
             before(grammarAccess.getIngredienteAccess().getGroup_4()); 
            // InternalRestaurante.g:445:2: ( rule__Ingrediente__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestaurante.g:445:3: rule__Ingrediente__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__4__Impl"


    // $ANTLR start "rule__Ingrediente__Group__5"
    // InternalRestaurante.g:453:1: rule__Ingrediente__Group__5 : rule__Ingrediente__Group__5__Impl ;
    public final void rule__Ingrediente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:457:1: ( rule__Ingrediente__Group__5__Impl )
            // InternalRestaurante.g:458:2: rule__Ingrediente__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__5"


    // $ANTLR start "rule__Ingrediente__Group__5__Impl"
    // InternalRestaurante.g:464:1: rule__Ingrediente__Group__5__Impl : ( ( rule__Ingrediente__AlergenicoAssignment_5 )? ) ;
    public final void rule__Ingrediente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:468:1: ( ( ( rule__Ingrediente__AlergenicoAssignment_5 )? ) )
            // InternalRestaurante.g:469:1: ( ( rule__Ingrediente__AlergenicoAssignment_5 )? )
            {
            // InternalRestaurante.g:469:1: ( ( rule__Ingrediente__AlergenicoAssignment_5 )? )
            // InternalRestaurante.g:470:2: ( rule__Ingrediente__AlergenicoAssignment_5 )?
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); 
            // InternalRestaurante.g:471:2: ( rule__Ingrediente__AlergenicoAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRestaurante.g:471:3: rule__Ingrediente__AlergenicoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__AlergenicoAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__5__Impl"


    // $ANTLR start "rule__Ingrediente__Group_3__0"
    // InternalRestaurante.g:480:1: rule__Ingrediente__Group_3__0 : rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1 ;
    public final void rule__Ingrediente__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:484:1: ( rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1 )
            // InternalRestaurante.g:485:2: rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Ingrediente__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__0"


    // $ANTLR start "rule__Ingrediente__Group_3__0__Impl"
    // InternalRestaurante.g:492:1: rule__Ingrediente__Group_3__0__Impl : ( 'infoURL:' ) ;
    public final void rule__Ingrediente__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:496:1: ( ( 'infoURL:' ) )
            // InternalRestaurante.g:497:1: ( 'infoURL:' )
            {
            // InternalRestaurante.g:497:1: ( 'infoURL:' )
            // InternalRestaurante.g:498:2: 'infoURL:'
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group_3__1"
    // InternalRestaurante.g:507:1: rule__Ingrediente__Group_3__1 : rule__Ingrediente__Group_3__1__Impl ;
    public final void rule__Ingrediente__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:511:1: ( rule__Ingrediente__Group_3__1__Impl )
            // InternalRestaurante.g:512:2: rule__Ingrediente__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__1"


    // $ANTLR start "rule__Ingrediente__Group_3__1__Impl"
    // InternalRestaurante.g:518:1: rule__Ingrediente__Group_3__1__Impl : ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) ) ;
    public final void rule__Ingrediente__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:522:1: ( ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) ) )
            // InternalRestaurante.g:523:1: ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) )
            {
            // InternalRestaurante.g:523:1: ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) )
            // InternalRestaurante.g:524:2: ( rule__Ingrediente__InfoURLAssignment_3_1 )
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); 
            // InternalRestaurante.g:525:2: ( rule__Ingrediente__InfoURLAssignment_3_1 )
            // InternalRestaurante.g:525:3: rule__Ingrediente__InfoURLAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__InfoURLAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__1__Impl"


    // $ANTLR start "rule__Ingrediente__Group_4__0"
    // InternalRestaurante.g:534:1: rule__Ingrediente__Group_4__0 : rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1 ;
    public final void rule__Ingrediente__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:538:1: ( rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1 )
            // InternalRestaurante.g:539:2: rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Ingrediente__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__0"


    // $ANTLR start "rule__Ingrediente__Group_4__0__Impl"
    // InternalRestaurante.g:546:1: rule__Ingrediente__Group_4__0__Impl : ( 'foto:' ) ;
    public final void rule__Ingrediente__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:550:1: ( ( 'foto:' ) )
            // InternalRestaurante.g:551:1: ( 'foto:' )
            {
            // InternalRestaurante.g:551:1: ( 'foto:' )
            // InternalRestaurante.g:552:2: 'foto:'
            {
             before(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group_4__1"
    // InternalRestaurante.g:561:1: rule__Ingrediente__Group_4__1 : rule__Ingrediente__Group_4__1__Impl ;
    public final void rule__Ingrediente__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:565:1: ( rule__Ingrediente__Group_4__1__Impl )
            // InternalRestaurante.g:566:2: rule__Ingrediente__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__1"


    // $ANTLR start "rule__Ingrediente__Group_4__1__Impl"
    // InternalRestaurante.g:572:1: rule__Ingrediente__Group_4__1__Impl : ( ( rule__Ingrediente__FotoAssignment_4_1 ) ) ;
    public final void rule__Ingrediente__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:576:1: ( ( ( rule__Ingrediente__FotoAssignment_4_1 ) ) )
            // InternalRestaurante.g:577:1: ( ( rule__Ingrediente__FotoAssignment_4_1 ) )
            {
            // InternalRestaurante.g:577:1: ( ( rule__Ingrediente__FotoAssignment_4_1 ) )
            // InternalRestaurante.g:578:2: ( rule__Ingrediente__FotoAssignment_4_1 )
            {
             before(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); 
            // InternalRestaurante.g:579:2: ( rule__Ingrediente__FotoAssignment_4_1 )
            // InternalRestaurante.g:579:3: rule__Ingrediente__FotoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__FotoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__1__Impl"


    // $ANTLR start "rule__Restaurante__NombreAssignment_1"
    // InternalRestaurante.g:588:1: rule__Restaurante__NombreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Restaurante__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:592:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:593:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:593:2: ( RULE_STRING )
            // InternalRestaurante.g:594:3: RULE_STRING
            {
             before(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__NombreAssignment_1"


    // $ANTLR start "rule__Restaurante__FechaAssignment_3"
    // InternalRestaurante.g:603:1: rule__Restaurante__FechaAssignment_3 : ( RULE_FECHA ) ;
    public final void rule__Restaurante__FechaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:607:1: ( ( RULE_FECHA ) )
            // InternalRestaurante.g:608:2: ( RULE_FECHA )
            {
            // InternalRestaurante.g:608:2: ( RULE_FECHA )
            // InternalRestaurante.g:609:3: RULE_FECHA
            {
             before(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); 
            match(input,RULE_FECHA,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__FechaAssignment_3"


    // $ANTLR start "rule__Restaurante__IngredientesAssignment_6"
    // InternalRestaurante.g:618:1: rule__Restaurante__IngredientesAssignment_6 : ( ruleIngrediente ) ;
    public final void rule__Restaurante__IngredientesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:622:1: ( ( ruleIngrediente ) )
            // InternalRestaurante.g:623:2: ( ruleIngrediente )
            {
            // InternalRestaurante.g:623:2: ( ruleIngrediente )
            // InternalRestaurante.g:624:3: ruleIngrediente
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__IngredientesAssignment_6"


    // $ANTLR start "rule__Ingrediente__NameAssignment_1"
    // InternalRestaurante.g:633:1: rule__Ingrediente__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingrediente__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:637:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:638:2: ( RULE_ID )
            {
            // InternalRestaurante.g:638:2: ( RULE_ID )
            // InternalRestaurante.g:639:3: RULE_ID
            {
             before(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__NameAssignment_1"


    // $ANTLR start "rule__Ingrediente__NombreAssignment_2"
    // InternalRestaurante.g:648:1: rule__Ingrediente__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ingrediente__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:652:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:653:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:653:2: ( RULE_STRING )
            // InternalRestaurante.g:654:3: RULE_STRING
            {
             before(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__NombreAssignment_2"


    // $ANTLR start "rule__Ingrediente__InfoURLAssignment_3_1"
    // InternalRestaurante.g:663:1: rule__Ingrediente__InfoURLAssignment_3_1 : ( RULE_URL ) ;
    public final void rule__Ingrediente__InfoURLAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:667:1: ( ( RULE_URL ) )
            // InternalRestaurante.g:668:2: ( RULE_URL )
            {
            // InternalRestaurante.g:668:2: ( RULE_URL )
            // InternalRestaurante.g:669:3: RULE_URL
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__InfoURLAssignment_3_1"


    // $ANTLR start "rule__Ingrediente__FotoAssignment_4_1"
    // InternalRestaurante.g:678:1: rule__Ingrediente__FotoAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Ingrediente__FotoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:682:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:683:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:683:2: ( RULE_STRING )
            // InternalRestaurante.g:684:3: RULE_STRING
            {
             before(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__FotoAssignment_4_1"


    // $ANTLR start "rule__Ingrediente__AlergenicoAssignment_5"
    // InternalRestaurante.g:693:1: rule__Ingrediente__AlergenicoAssignment_5 : ( ( 'alergenico' ) ) ;
    public final void rule__Ingrediente__AlergenicoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:697:1: ( ( ( 'alergenico' ) ) )
            // InternalRestaurante.g:698:2: ( ( 'alergenico' ) )
            {
            // InternalRestaurante.g:698:2: ( ( 'alergenico' ) )
            // InternalRestaurante.g:699:3: ( 'alergenico' )
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 
            // InternalRestaurante.g:700:3: ( 'alergenico' )
            // InternalRestaurante.g:701:4: 'alergenico'
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 

            }

             after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__AlergenicoAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});

}