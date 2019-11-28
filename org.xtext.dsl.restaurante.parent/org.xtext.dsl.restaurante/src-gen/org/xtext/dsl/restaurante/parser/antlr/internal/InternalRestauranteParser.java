package org.xtext.dsl.restaurante.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestauranteParser extends AbstractInternalAntlrParser {
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

        public InternalRestauranteParser(TokenStream input, RestauranteGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Restaurante";
       	}

       	@Override
       	protected RestauranteGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestaurante"
    // InternalRestaurante.g:64:1: entryRuleRestaurante returns [EObject current=null] : iv_ruleRestaurante= ruleRestaurante EOF ;
    public final EObject entryRuleRestaurante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurante = null;


        try {
            // InternalRestaurante.g:64:52: (iv_ruleRestaurante= ruleRestaurante EOF )
            // InternalRestaurante.g:65:2: iv_ruleRestaurante= ruleRestaurante EOF
            {
             newCompositeNode(grammarAccess.getRestauranteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestaurante=ruleRestaurante();

            state._fsp--;

             current =iv_ruleRestaurante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestaurante"


    // $ANTLR start "ruleRestaurante"
    // InternalRestaurante.g:71:1: ruleRestaurante returns [EObject current=null] : (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' ) ;
    public final EObject ruleRestaurante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token lv_fecha_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ingredientes_6_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:77:2: ( (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' ) )
            // InternalRestaurante.g:78:2: (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' )
            {
            // InternalRestaurante.g:78:2: (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' )
            // InternalRestaurante.g:79:3: otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0());
            		
            // InternalRestaurante.g:83:3: ( (lv_nombre_1_0= RULE_STRING ) )
            // InternalRestaurante.g:84:4: (lv_nombre_1_0= RULE_STRING )
            {
            // InternalRestaurante.g:84:4: (lv_nombre_1_0= RULE_STRING )
            // InternalRestaurante.g:85:5: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestauranteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRestauranteAccess().getFechaKeyword_2());
            		
            // InternalRestaurante.g:105:3: ( (lv_fecha_3_0= RULE_FECHA ) )
            // InternalRestaurante.g:106:4: (lv_fecha_3_0= RULE_FECHA )
            {
            // InternalRestaurante.g:106:4: (lv_fecha_3_0= RULE_FECHA )
            // InternalRestaurante.g:107:5: lv_fecha_3_0= RULE_FECHA
            {
            lv_fecha_3_0=(Token)match(input,RULE_FECHA,FOLLOW_6); 

            					newLeafNode(lv_fecha_3_0, grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestauranteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fecha",
            						lv_fecha_3_0,
            						"org.xtext.dsl.restaurante.Restaurante.FECHA");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRestauranteAccess().getIngredientesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRestaurante.g:131:3: ( (lv_ingredientes_6_0= ruleIngrediente ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestaurante.g:132:4: (lv_ingredientes_6_0= ruleIngrediente )
            	    {
            	    // InternalRestaurante.g:132:4: (lv_ingredientes_6_0= ruleIngrediente )
            	    // InternalRestaurante.g:133:5: lv_ingredientes_6_0= ruleIngrediente
            	    {

            	    					newCompositeNode(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ingredientes_6_0=ruleIngrediente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestauranteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredientes",
            	    						lv_ingredientes_6_0,
            	    						"org.xtext.dsl.restaurante.Restaurante.Ingrediente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestaurante"


    // $ANTLR start "entryRuleIngrediente"
    // InternalRestaurante.g:158:1: entryRuleIngrediente returns [EObject current=null] : iv_ruleIngrediente= ruleIngrediente EOF ;
    public final EObject entryRuleIngrediente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngrediente = null;


        try {
            // InternalRestaurante.g:158:52: (iv_ruleIngrediente= ruleIngrediente EOF )
            // InternalRestaurante.g:159:2: iv_ruleIngrediente= ruleIngrediente EOF
            {
             newCompositeNode(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngrediente=ruleIngrediente();

            state._fsp--;

             current =iv_ruleIngrediente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalRestaurante.g:165:1: ruleIngrediente returns [EObject current=null] : (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? ) ;
    public final EObject ruleIngrediente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token lv_infoURL_4_0=null;
        Token otherlv_5=null;
        Token lv_foto_6_0=null;
        Token lv_alergenico_7_0=null;


        	enterRule();

        try {
            // InternalRestaurante.g:171:2: ( (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? ) )
            // InternalRestaurante.g:172:2: (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? )
            {
            // InternalRestaurante.g:172:2: (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? )
            // InternalRestaurante.g:173:3: otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredienteAccess().getIngredienteKeyword_0());
            		
            // InternalRestaurante.g:177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:178:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:195:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:196:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:196:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:197:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:213:3: (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRestaurante.g:214:4: otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0());
                    			
                    // InternalRestaurante.g:218:4: ( (lv_infoURL_4_0= RULE_URL ) )
                    // InternalRestaurante.g:219:5: (lv_infoURL_4_0= RULE_URL )
                    {
                    // InternalRestaurante.g:219:5: (lv_infoURL_4_0= RULE_URL )
                    // InternalRestaurante.g:220:6: lv_infoURL_4_0= RULE_URL
                    {
                    lv_infoURL_4_0=(Token)match(input,RULE_URL,FOLLOW_12); 

                    						newLeafNode(lv_infoURL_4_0, grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredienteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"infoURL",
                    							lv_infoURL_4_0,
                    							"org.xtext.dsl.restaurante.Restaurante.URL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestaurante.g:237:3: (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestaurante.g:238:4: otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIngredienteAccess().getFotoKeyword_4_0());
                    			
                    // InternalRestaurante.g:242:4: ( (lv_foto_6_0= RULE_STRING ) )
                    // InternalRestaurante.g:243:5: (lv_foto_6_0= RULE_STRING )
                    {
                    // InternalRestaurante.g:243:5: (lv_foto_6_0= RULE_STRING )
                    // InternalRestaurante.g:244:6: lv_foto_6_0= RULE_STRING
                    {
                    lv_foto_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_foto_6_0, grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredienteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"foto",
                    							lv_foto_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestaurante.g:261:3: ( (lv_alergenico_7_0= 'alergenico' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRestaurante.g:262:4: (lv_alergenico_7_0= 'alergenico' )
                    {
                    // InternalRestaurante.g:262:4: (lv_alergenico_7_0= 'alergenico' )
                    // InternalRestaurante.g:263:5: lv_alergenico_7_0= 'alergenico'
                    {
                    lv_alergenico_7_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_alergenico_7_0, grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIngredienteRule());
                    					}
                    					setWithLastConsumed(current, "alergenico", true, "alergenico");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngrediente"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});

}