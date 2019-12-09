package org.xtext.dsl.multimaven.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.multimaven.services.MultiMavenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiMavenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION", "RULE_PATH", "RULE_GROUP", "RULE_ARTIFACT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Proyecto'", "'Xlmn:'", "'Root'", "'{'", "'Path'", "'Group'", "'Artifact'", "'Version'", "'Packaging'", "'Dependencias'", "'}'", "'Plugins'", "'Hijos'", "'Scope'", "'Hijo'", "'POM'", "'JAR'", "'EAR'", "'WAR'", "'RAR'", "'MAVENPLUGIN'", "'EJB'", "'COMPILE'", "'TEST'", "'PACKAGE'", "'INSTALL'", "'DEPLOY'"
    };
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


        public InternalMultiMavenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMultiMavenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMultiMavenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMultiMaven.g"; }



     	private MultiMavenGrammarAccess grammarAccess;

        public InternalMultiMavenParser(TokenStream input, MultiMavenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Proyecto";
       	}

       	@Override
       	protected MultiMavenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProyecto"
    // InternalMultiMaven.g:65:1: entryRuleProyecto returns [EObject current=null] : iv_ruleProyecto= ruleProyecto EOF ;
    public final EObject entryRuleProyecto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProyecto = null;


        try {
            // InternalMultiMaven.g:65:49: (iv_ruleProyecto= ruleProyecto EOF )
            // InternalMultiMaven.g:66:2: iv_ruleProyecto= ruleProyecto EOF
            {
             newCompositeNode(grammarAccess.getProyectoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProyecto=ruleProyecto();

            state._fsp--;

             current =iv_ruleProyecto; 
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
    // $ANTLR end "entryRuleProyecto"


    // $ANTLR start "ruleProyecto"
    // InternalMultiMaven.g:72:1: ruleProyecto returns [EObject current=null] : (otherlv_0= 'Proyecto' otherlv_1= 'Xlmn:' ( (lv_version_2_0= RULE_VERSION ) ) ( (lv_padre_3_0= ruleDirectorioPadre ) ) ) ;
    public final EObject ruleProyecto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_version_2_0=null;
        EObject lv_padre_3_0 = null;



        	enterRule();

        try {
            // InternalMultiMaven.g:78:2: ( (otherlv_0= 'Proyecto' otherlv_1= 'Xlmn:' ( (lv_version_2_0= RULE_VERSION ) ) ( (lv_padre_3_0= ruleDirectorioPadre ) ) ) )
            // InternalMultiMaven.g:79:2: (otherlv_0= 'Proyecto' otherlv_1= 'Xlmn:' ( (lv_version_2_0= RULE_VERSION ) ) ( (lv_padre_3_0= ruleDirectorioPadre ) ) )
            {
            // InternalMultiMaven.g:79:2: (otherlv_0= 'Proyecto' otherlv_1= 'Xlmn:' ( (lv_version_2_0= RULE_VERSION ) ) ( (lv_padre_3_0= ruleDirectorioPadre ) ) )
            // InternalMultiMaven.g:80:3: otherlv_0= 'Proyecto' otherlv_1= 'Xlmn:' ( (lv_version_2_0= RULE_VERSION ) ) ( (lv_padre_3_0= ruleDirectorioPadre ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProyectoAccess().getProyectoKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProyectoAccess().getXlmnKeyword_1());
            		
            // InternalMultiMaven.g:88:3: ( (lv_version_2_0= RULE_VERSION ) )
            // InternalMultiMaven.g:89:4: (lv_version_2_0= RULE_VERSION )
            {
            // InternalMultiMaven.g:89:4: (lv_version_2_0= RULE_VERSION )
            // InternalMultiMaven.g:90:5: lv_version_2_0= RULE_VERSION
            {
            lv_version_2_0=(Token)match(input,RULE_VERSION,FOLLOW_5); 

            					newLeafNode(lv_version_2_0, grammarAccess.getProyectoAccess().getVersionVERSIONTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProyectoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_2_0,
            						"org.xtext.dsl.multimaven.MultiMaven.VERSION");
            				

            }


            }

            // InternalMultiMaven.g:106:3: ( (lv_padre_3_0= ruleDirectorioPadre ) )
            // InternalMultiMaven.g:107:4: (lv_padre_3_0= ruleDirectorioPadre )
            {
            // InternalMultiMaven.g:107:4: (lv_padre_3_0= ruleDirectorioPadre )
            // InternalMultiMaven.g:108:5: lv_padre_3_0= ruleDirectorioPadre
            {

            					newCompositeNode(grammarAccess.getProyectoAccess().getPadreDirectorioPadreParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_padre_3_0=ruleDirectorioPadre();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProyectoRule());
            					}
            					set(
            						current,
            						"padre",
            						lv_padre_3_0,
            						"org.xtext.dsl.multimaven.MultiMaven.DirectorioPadre");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleProyecto"


    // $ANTLR start "entryRuleDirectorioPadre"
    // InternalMultiMaven.g:129:1: entryRuleDirectorioPadre returns [EObject current=null] : iv_ruleDirectorioPadre= ruleDirectorioPadre EOF ;
    public final EObject entryRuleDirectorioPadre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectorioPadre = null;


        try {
            // InternalMultiMaven.g:129:56: (iv_ruleDirectorioPadre= ruleDirectorioPadre EOF )
            // InternalMultiMaven.g:130:2: iv_ruleDirectorioPadre= ruleDirectorioPadre EOF
            {
             newCompositeNode(grammarAccess.getDirectorioPadreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectorioPadre=ruleDirectorioPadre();

            state._fsp--;

             current =iv_ruleDirectorioPadre; 
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
    // $ANTLR end "entryRuleDirectorioPadre"


    // $ANTLR start "ruleDirectorioPadre"
    // InternalMultiMaven.g:136:1: ruleDirectorioPadre returns [EObject current=null] : (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'Path' ( (lv_path_3_0= RULE_PATH ) ) otherlv_4= 'Group' ( (lv_group_5_0= RULE_GROUP ) ) otherlv_6= 'Artifact' ( (lv_artifact_7_0= RULE_ARTIFACT ) ) otherlv_8= 'Version' ( (lv_version_9_0= RULE_VERSION ) ) (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )? (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )? (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )? otherlv_20= 'Hijos' otherlv_21= '{' ( (lv_directorios_22_0= ruleDirectorio ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleDirectorioPadre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token lv_group_5_0=null;
        Token otherlv_6=null;
        Token lv_artifact_7_0=null;
        Token otherlv_8=null;
        Token lv_version_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_packaging_11_0 = null;

        EObject lv_dependencias_14_0 = null;

        EObject lv_plugins_18_0 = null;

        EObject lv_directorios_22_0 = null;



        	enterRule();

        try {
            // InternalMultiMaven.g:142:2: ( (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'Path' ( (lv_path_3_0= RULE_PATH ) ) otherlv_4= 'Group' ( (lv_group_5_0= RULE_GROUP ) ) otherlv_6= 'Artifact' ( (lv_artifact_7_0= RULE_ARTIFACT ) ) otherlv_8= 'Version' ( (lv_version_9_0= RULE_VERSION ) ) (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )? (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )? (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )? otherlv_20= 'Hijos' otherlv_21= '{' ( (lv_directorios_22_0= ruleDirectorio ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalMultiMaven.g:143:2: (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'Path' ( (lv_path_3_0= RULE_PATH ) ) otherlv_4= 'Group' ( (lv_group_5_0= RULE_GROUP ) ) otherlv_6= 'Artifact' ( (lv_artifact_7_0= RULE_ARTIFACT ) ) otherlv_8= 'Version' ( (lv_version_9_0= RULE_VERSION ) ) (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )? (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )? (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )? otherlv_20= 'Hijos' otherlv_21= '{' ( (lv_directorios_22_0= ruleDirectorio ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalMultiMaven.g:143:2: (otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'Path' ( (lv_path_3_0= RULE_PATH ) ) otherlv_4= 'Group' ( (lv_group_5_0= RULE_GROUP ) ) otherlv_6= 'Artifact' ( (lv_artifact_7_0= RULE_ARTIFACT ) ) otherlv_8= 'Version' ( (lv_version_9_0= RULE_VERSION ) ) (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )? (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )? (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )? otherlv_20= 'Hijos' otherlv_21= '{' ( (lv_directorios_22_0= ruleDirectorio ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalMultiMaven.g:144:3: otherlv_0= 'Root' otherlv_1= '{' otherlv_2= 'Path' ( (lv_path_3_0= RULE_PATH ) ) otherlv_4= 'Group' ( (lv_group_5_0= RULE_GROUP ) ) otherlv_6= 'Artifact' ( (lv_artifact_7_0= RULE_ARTIFACT ) ) otherlv_8= 'Version' ( (lv_version_9_0= RULE_VERSION ) ) (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )? (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )? (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )? otherlv_20= 'Hijos' otherlv_21= '{' ( (lv_directorios_22_0= ruleDirectorio ) )* otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectorioPadreAccess().getRootKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectorioPadreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectorioPadreAccess().getPathKeyword_2());
            		
            // InternalMultiMaven.g:156:3: ( (lv_path_3_0= RULE_PATH ) )
            // InternalMultiMaven.g:157:4: (lv_path_3_0= RULE_PATH )
            {
            // InternalMultiMaven.g:157:4: (lv_path_3_0= RULE_PATH )
            // InternalMultiMaven.g:158:5: lv_path_3_0= RULE_PATH
            {
            lv_path_3_0=(Token)match(input,RULE_PATH,FOLLOW_9); 

            					newLeafNode(lv_path_3_0, grammarAccess.getDirectorioPadreAccess().getPathPATHTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioPadreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.xtext.dsl.multimaven.MultiMaven.PATH");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDirectorioPadreAccess().getGroupKeyword_4());
            		
            // InternalMultiMaven.g:178:3: ( (lv_group_5_0= RULE_GROUP ) )
            // InternalMultiMaven.g:179:4: (lv_group_5_0= RULE_GROUP )
            {
            // InternalMultiMaven.g:179:4: (lv_group_5_0= RULE_GROUP )
            // InternalMultiMaven.g:180:5: lv_group_5_0= RULE_GROUP
            {
            lv_group_5_0=(Token)match(input,RULE_GROUP,FOLLOW_11); 

            					newLeafNode(lv_group_5_0, grammarAccess.getDirectorioPadreAccess().getGroupGROUPTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioPadreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_5_0,
            						"org.xtext.dsl.multimaven.MultiMaven.GROUP");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getDirectorioPadreAccess().getArtifactKeyword_6());
            		
            // InternalMultiMaven.g:200:3: ( (lv_artifact_7_0= RULE_ARTIFACT ) )
            // InternalMultiMaven.g:201:4: (lv_artifact_7_0= RULE_ARTIFACT )
            {
            // InternalMultiMaven.g:201:4: (lv_artifact_7_0= RULE_ARTIFACT )
            // InternalMultiMaven.g:202:5: lv_artifact_7_0= RULE_ARTIFACT
            {
            lv_artifact_7_0=(Token)match(input,RULE_ARTIFACT,FOLLOW_13); 

            					newLeafNode(lv_artifact_7_0, grammarAccess.getDirectorioPadreAccess().getArtifactARTIFACTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioPadreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifact",
            						lv_artifact_7_0,
            						"org.xtext.dsl.multimaven.MultiMaven.ARTIFACT");
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDirectorioPadreAccess().getVersionKeyword_8());
            		
            // InternalMultiMaven.g:222:3: ( (lv_version_9_0= RULE_VERSION ) )
            // InternalMultiMaven.g:223:4: (lv_version_9_0= RULE_VERSION )
            {
            // InternalMultiMaven.g:223:4: (lv_version_9_0= RULE_VERSION )
            // InternalMultiMaven.g:224:5: lv_version_9_0= RULE_VERSION
            {
            lv_version_9_0=(Token)match(input,RULE_VERSION,FOLLOW_14); 

            					newLeafNode(lv_version_9_0, grammarAccess.getDirectorioPadreAccess().getVersionVERSIONTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioPadreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_9_0,
            						"org.xtext.dsl.multimaven.MultiMaven.VERSION");
            				

            }


            }

            // InternalMultiMaven.g:240:3: (otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMultiMaven.g:241:4: otherlv_10= 'Packaging' ( (lv_packaging_11_0= rulePackaging ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getDirectorioPadreAccess().getPackagingKeyword_10_0());
                    			
                    // InternalMultiMaven.g:245:4: ( (lv_packaging_11_0= rulePackaging ) )
                    // InternalMultiMaven.g:246:5: (lv_packaging_11_0= rulePackaging )
                    {
                    // InternalMultiMaven.g:246:5: (lv_packaging_11_0= rulePackaging )
                    // InternalMultiMaven.g:247:6: lv_packaging_11_0= rulePackaging
                    {

                    						newCompositeNode(grammarAccess.getDirectorioPadreAccess().getPackagingPackagingEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_packaging_11_0=rulePackaging();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectorioPadreRule());
                    						}
                    						set(
                    							current,
                    							"packaging",
                    							lv_packaging_11_0,
                    							"org.xtext.dsl.multimaven.MultiMaven.Packaging");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMultiMaven.g:265:3: (otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMultiMaven.g:266:4: otherlv_12= 'Dependencias' otherlv_13= '{' ( (lv_dependencias_14_0= ruleDependencia ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getDirectorioPadreAccess().getDependenciasKeyword_11_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getDirectorioPadreAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMultiMaven.g:274:4: ( (lv_dependencias_14_0= ruleDependencia ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMultiMaven.g:275:5: (lv_dependencias_14_0= ruleDependencia )
                    	    {
                    	    // InternalMultiMaven.g:275:5: (lv_dependencias_14_0= ruleDependencia )
                    	    // InternalMultiMaven.g:276:6: lv_dependencias_14_0= ruleDependencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectorioPadreAccess().getDependenciasDependenciaParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_dependencias_14_0=ruleDependencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectorioPadreRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dependencias",
                    	    							lv_dependencias_14_0,
                    	    							"org.xtext.dsl.multimaven.MultiMaven.Dependencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getDirectorioPadreAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalMultiMaven.g:298:3: (otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMultiMaven.g:299:4: otherlv_16= 'Plugins' otherlv_17= '{' ( (lv_plugins_18_0= rulePlugin ) )* otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getDirectorioPadreAccess().getPluginsKeyword_12_0());
                    			
                    otherlv_17=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getDirectorioPadreAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalMultiMaven.g:307:4: ( (lv_plugins_18_0= rulePlugin ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMultiMaven.g:308:5: (lv_plugins_18_0= rulePlugin )
                    	    {
                    	    // InternalMultiMaven.g:308:5: (lv_plugins_18_0= rulePlugin )
                    	    // InternalMultiMaven.g:309:6: lv_plugins_18_0= rulePlugin
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectorioPadreAccess().getPluginsPluginParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_plugins_18_0=rulePlugin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectorioPadreRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"plugins",
                    	    							lv_plugins_18_0,
                    	    							"org.xtext.dsl.multimaven.MultiMaven.Plugin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getDirectorioPadreAccess().getRightCurlyBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getDirectorioPadreAccess().getHijosKeyword_13());
            		
            otherlv_21=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_21, grammarAccess.getDirectorioPadreAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalMultiMaven.g:339:3: ( (lv_directorios_22_0= ruleDirectorio ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMultiMaven.g:340:4: (lv_directorios_22_0= ruleDirectorio )
            	    {
            	    // InternalMultiMaven.g:340:4: (lv_directorios_22_0= ruleDirectorio )
            	    // InternalMultiMaven.g:341:5: lv_directorios_22_0= ruleDirectorio
            	    {

            	    					newCompositeNode(grammarAccess.getDirectorioPadreAccess().getDirectoriosDirectorioParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_directorios_22_0=ruleDirectorio();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDirectorioPadreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directorios",
            	    						lv_directorios_22_0,
            	    						"org.xtext.dsl.multimaven.MultiMaven.Directorio");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_23=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_23, grammarAccess.getDirectorioPadreAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_24=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDirectorioPadreAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleDirectorioPadre"


    // $ANTLR start "entryRuleDirectorio"
    // InternalMultiMaven.g:370:1: entryRuleDirectorio returns [EObject current=null] : iv_ruleDirectorio= ruleDirectorio EOF ;
    public final EObject entryRuleDirectorio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectorio = null;


        try {
            // InternalMultiMaven.g:370:51: (iv_ruleDirectorio= ruleDirectorio EOF )
            // InternalMultiMaven.g:371:2: iv_ruleDirectorio= ruleDirectorio EOF
            {
             newCompositeNode(grammarAccess.getDirectorioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectorio=ruleDirectorio();

            state._fsp--;

             current =iv_ruleDirectorio; 
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
    // $ANTLR end "entryRuleDirectorio"


    // $ANTLR start "ruleDirectorio"
    // InternalMultiMaven.g:377:1: ruleDirectorio returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdDirectorio ) ) otherlv_1= '{' otherlv_2= 'Group' ( (lv_group_3_0= RULE_GROUP ) ) otherlv_4= 'Artifact' ( (lv_artifact_5_0= RULE_ARTIFACT ) ) otherlv_6= 'Version' ( (lv_version_7_0= RULE_VERSION ) ) (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )? (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )? (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleDirectorio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_group_3_0=null;
        Token otherlv_4=null;
        Token lv_artifact_5_0=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_packaging_9_0 = null;

        EObject lv_dependencias_12_0 = null;

        EObject lv_plugins_16_0 = null;



        	enterRule();

        try {
            // InternalMultiMaven.g:383:2: ( ( ( (lv_name_0_0= ruleIdDirectorio ) ) otherlv_1= '{' otherlv_2= 'Group' ( (lv_group_3_0= RULE_GROUP ) ) otherlv_4= 'Artifact' ( (lv_artifact_5_0= RULE_ARTIFACT ) ) otherlv_6= 'Version' ( (lv_version_7_0= RULE_VERSION ) ) (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )? (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )? (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalMultiMaven.g:384:2: ( ( (lv_name_0_0= ruleIdDirectorio ) ) otherlv_1= '{' otherlv_2= 'Group' ( (lv_group_3_0= RULE_GROUP ) ) otherlv_4= 'Artifact' ( (lv_artifact_5_0= RULE_ARTIFACT ) ) otherlv_6= 'Version' ( (lv_version_7_0= RULE_VERSION ) ) (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )? (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )? (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalMultiMaven.g:384:2: ( ( (lv_name_0_0= ruleIdDirectorio ) ) otherlv_1= '{' otherlv_2= 'Group' ( (lv_group_3_0= RULE_GROUP ) ) otherlv_4= 'Artifact' ( (lv_artifact_5_0= RULE_ARTIFACT ) ) otherlv_6= 'Version' ( (lv_version_7_0= RULE_VERSION ) ) (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )? (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )? (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalMultiMaven.g:385:3: ( (lv_name_0_0= ruleIdDirectorio ) ) otherlv_1= '{' otherlv_2= 'Group' ( (lv_group_3_0= RULE_GROUP ) ) otherlv_4= 'Artifact' ( (lv_artifact_5_0= RULE_ARTIFACT ) ) otherlv_6= 'Version' ( (lv_version_7_0= RULE_VERSION ) ) (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )? (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )? (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalMultiMaven.g:385:3: ( (lv_name_0_0= ruleIdDirectorio ) )
            // InternalMultiMaven.g:386:4: (lv_name_0_0= ruleIdDirectorio )
            {
            // InternalMultiMaven.g:386:4: (lv_name_0_0= ruleIdDirectorio )
            // InternalMultiMaven.g:387:5: lv_name_0_0= ruleIdDirectorio
            {

            					newCompositeNode(grammarAccess.getDirectorioAccess().getNameIdDirectorioParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleIdDirectorio();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectorioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.dsl.multimaven.MultiMaven.IdDirectorio");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectorioAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectorioAccess().getGroupKeyword_2());
            		
            // InternalMultiMaven.g:412:3: ( (lv_group_3_0= RULE_GROUP ) )
            // InternalMultiMaven.g:413:4: (lv_group_3_0= RULE_GROUP )
            {
            // InternalMultiMaven.g:413:4: (lv_group_3_0= RULE_GROUP )
            // InternalMultiMaven.g:414:5: lv_group_3_0= RULE_GROUP
            {
            lv_group_3_0=(Token)match(input,RULE_GROUP,FOLLOW_11); 

            					newLeafNode(lv_group_3_0, grammarAccess.getDirectorioAccess().getGroupGROUPTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_3_0,
            						"org.xtext.dsl.multimaven.MultiMaven.GROUP");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDirectorioAccess().getArtifactKeyword_4());
            		
            // InternalMultiMaven.g:434:3: ( (lv_artifact_5_0= RULE_ARTIFACT ) )
            // InternalMultiMaven.g:435:4: (lv_artifact_5_0= RULE_ARTIFACT )
            {
            // InternalMultiMaven.g:435:4: (lv_artifact_5_0= RULE_ARTIFACT )
            // InternalMultiMaven.g:436:5: lv_artifact_5_0= RULE_ARTIFACT
            {
            lv_artifact_5_0=(Token)match(input,RULE_ARTIFACT,FOLLOW_13); 

            					newLeafNode(lv_artifact_5_0, grammarAccess.getDirectorioAccess().getArtifactARTIFACTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifact",
            						lv_artifact_5_0,
            						"org.xtext.dsl.multimaven.MultiMaven.ARTIFACT");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getDirectorioAccess().getVersionKeyword_6());
            		
            // InternalMultiMaven.g:456:3: ( (lv_version_7_0= RULE_VERSION ) )
            // InternalMultiMaven.g:457:4: (lv_version_7_0= RULE_VERSION )
            {
            // InternalMultiMaven.g:457:4: (lv_version_7_0= RULE_VERSION )
            // InternalMultiMaven.g:458:5: lv_version_7_0= RULE_VERSION
            {
            lv_version_7_0=(Token)match(input,RULE_VERSION,FOLLOW_22); 

            					newLeafNode(lv_version_7_0, grammarAccess.getDirectorioAccess().getVersionVERSIONTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectorioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_7_0,
            						"org.xtext.dsl.multimaven.MultiMaven.VERSION");
            				

            }


            }

            // InternalMultiMaven.g:474:3: (otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMultiMaven.g:475:4: otherlv_8= 'Packaging' ( (lv_packaging_9_0= rulePackaging ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getDirectorioAccess().getPackagingKeyword_8_0());
                    			
                    // InternalMultiMaven.g:479:4: ( (lv_packaging_9_0= rulePackaging ) )
                    // InternalMultiMaven.g:480:5: (lv_packaging_9_0= rulePackaging )
                    {
                    // InternalMultiMaven.g:480:5: (lv_packaging_9_0= rulePackaging )
                    // InternalMultiMaven.g:481:6: lv_packaging_9_0= rulePackaging
                    {

                    						newCompositeNode(grammarAccess.getDirectorioAccess().getPackagingPackagingEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_packaging_9_0=rulePackaging();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectorioRule());
                    						}
                    						set(
                    							current,
                    							"packaging",
                    							lv_packaging_9_0,
                    							"org.xtext.dsl.multimaven.MultiMaven.Packaging");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMultiMaven.g:499:3: (otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMultiMaven.g:500:4: otherlv_10= 'Dependencias' otherlv_11= '{' ( (lv_dependencias_12_0= ruleDependencia ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getDirectorioAccess().getDependenciasKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getDirectorioAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMultiMaven.g:508:4: ( (lv_dependencias_12_0= ruleDependencia ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMultiMaven.g:509:5: (lv_dependencias_12_0= ruleDependencia )
                    	    {
                    	    // InternalMultiMaven.g:509:5: (lv_dependencias_12_0= ruleDependencia )
                    	    // InternalMultiMaven.g:510:6: lv_dependencias_12_0= ruleDependencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectorioAccess().getDependenciasDependenciaParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_dependencias_12_0=ruleDependencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectorioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dependencias",
                    	    							lv_dependencias_12_0,
                    	    							"org.xtext.dsl.multimaven.MultiMaven.Dependencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getDirectorioAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

            }

            // InternalMultiMaven.g:532:3: (otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMultiMaven.g:533:4: otherlv_14= 'Plugins' otherlv_15= '{' ( (lv_plugins_16_0= rulePlugin ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getDirectorioAccess().getPluginsKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getDirectorioAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMultiMaven.g:541:4: ( (lv_plugins_16_0= rulePlugin ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMultiMaven.g:542:5: (lv_plugins_16_0= rulePlugin )
                    	    {
                    	    // InternalMultiMaven.g:542:5: (lv_plugins_16_0= rulePlugin )
                    	    // InternalMultiMaven.g:543:6: lv_plugins_16_0= rulePlugin
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectorioAccess().getPluginsPluginParserRuleCall_10_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_plugins_16_0=rulePlugin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectorioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"plugins",
                    	    							lv_plugins_16_0,
                    	    							"org.xtext.dsl.multimaven.MultiMaven.Plugin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getDirectorioAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDirectorioAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleDirectorio"


    // $ANTLR start "entryRuleDependencia"
    // InternalMultiMaven.g:573:1: entryRuleDependencia returns [EObject current=null] : iv_ruleDependencia= ruleDependencia EOF ;
    public final EObject entryRuleDependencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencia = null;


        try {
            // InternalMultiMaven.g:573:52: (iv_ruleDependencia= ruleDependencia EOF )
            // InternalMultiMaven.g:574:2: iv_ruleDependencia= ruleDependencia EOF
            {
             newCompositeNode(grammarAccess.getDependenciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencia=ruleDependencia();

            state._fsp--;

             current =iv_ruleDependencia; 
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
    // $ANTLR end "entryRuleDependencia"


    // $ANTLR start "ruleDependencia"
    // InternalMultiMaven.g:580:1: ruleDependencia returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleDependencia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_group_2_0=null;
        Token otherlv_3=null;
        Token lv_artifact_4_0=null;
        Token otherlv_5=null;
        Token lv_version_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_scope_8_0 = null;



        	enterRule();

        try {
            // InternalMultiMaven.g:586:2: ( (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )? otherlv_9= '}' ) )
            // InternalMultiMaven.g:587:2: (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )? otherlv_9= '}' )
            {
            // InternalMultiMaven.g:587:2: (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )? otherlv_9= '}' )
            // InternalMultiMaven.g:588:3: otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDependenciaAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDependenciaAccess().getGroupKeyword_1());
            		
            // InternalMultiMaven.g:596:3: ( (lv_group_2_0= RULE_GROUP ) )
            // InternalMultiMaven.g:597:4: (lv_group_2_0= RULE_GROUP )
            {
            // InternalMultiMaven.g:597:4: (lv_group_2_0= RULE_GROUP )
            // InternalMultiMaven.g:598:5: lv_group_2_0= RULE_GROUP
            {
            lv_group_2_0=(Token)match(input,RULE_GROUP,FOLLOW_11); 

            					newLeafNode(lv_group_2_0, grammarAccess.getDependenciaAccess().getGroupGROUPTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependenciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_2_0,
            						"org.xtext.dsl.multimaven.MultiMaven.GROUP");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDependenciaAccess().getArtifactKeyword_3());
            		
            // InternalMultiMaven.g:618:3: ( (lv_artifact_4_0= RULE_ARTIFACT ) )
            // InternalMultiMaven.g:619:4: (lv_artifact_4_0= RULE_ARTIFACT )
            {
            // InternalMultiMaven.g:619:4: (lv_artifact_4_0= RULE_ARTIFACT )
            // InternalMultiMaven.g:620:5: lv_artifact_4_0= RULE_ARTIFACT
            {
            lv_artifact_4_0=(Token)match(input,RULE_ARTIFACT,FOLLOW_13); 

            					newLeafNode(lv_artifact_4_0, grammarAccess.getDependenciaAccess().getArtifactARTIFACTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependenciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifact",
            						lv_artifact_4_0,
            						"org.xtext.dsl.multimaven.MultiMaven.ARTIFACT");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDependenciaAccess().getVersionKeyword_5());
            		
            // InternalMultiMaven.g:640:3: ( (lv_version_6_0= RULE_VERSION ) )
            // InternalMultiMaven.g:641:4: (lv_version_6_0= RULE_VERSION )
            {
            // InternalMultiMaven.g:641:4: (lv_version_6_0= RULE_VERSION )
            // InternalMultiMaven.g:642:5: lv_version_6_0= RULE_VERSION
            {
            lv_version_6_0=(Token)match(input,RULE_VERSION,FOLLOW_25); 

            					newLeafNode(lv_version_6_0, grammarAccess.getDependenciaAccess().getVersionVERSIONTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependenciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_6_0,
            						"org.xtext.dsl.multimaven.MultiMaven.VERSION");
            				

            }


            }

            // InternalMultiMaven.g:658:3: (otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMultiMaven.g:659:4: otherlv_7= 'Scope' ( (lv_scope_8_0= ruleScope ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getDependenciaAccess().getScopeKeyword_7_0());
                    			
                    // InternalMultiMaven.g:663:4: ( (lv_scope_8_0= ruleScope ) )
                    // InternalMultiMaven.g:664:5: (lv_scope_8_0= ruleScope )
                    {
                    // InternalMultiMaven.g:664:5: (lv_scope_8_0= ruleScope )
                    // InternalMultiMaven.g:665:6: lv_scope_8_0= ruleScope
                    {

                    						newCompositeNode(grammarAccess.getDependenciaAccess().getScopeScopeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_scope_8_0=ruleScope();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDependenciaRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_8_0,
                    							"org.xtext.dsl.multimaven.MultiMaven.Scope");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDependenciaAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDependencia"


    // $ANTLR start "entryRulePlugin"
    // InternalMultiMaven.g:691:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // InternalMultiMaven.g:691:47: (iv_rulePlugin= rulePlugin EOF )
            // InternalMultiMaven.g:692:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
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
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // InternalMultiMaven.g:698:1: rulePlugin returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) otherlv_7= '}' ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_group_2_0=null;
        Token otherlv_3=null;
        Token lv_artifact_4_0=null;
        Token otherlv_5=null;
        Token lv_version_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMultiMaven.g:704:2: ( (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) otherlv_7= '}' ) )
            // InternalMultiMaven.g:705:2: (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) otherlv_7= '}' )
            {
            // InternalMultiMaven.g:705:2: (otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) otherlv_7= '}' )
            // InternalMultiMaven.g:706:3: otherlv_0= '{' otherlv_1= 'Group' ( (lv_group_2_0= RULE_GROUP ) ) otherlv_3= 'Artifact' ( (lv_artifact_4_0= RULE_ARTIFACT ) ) otherlv_5= 'Version' ( (lv_version_6_0= RULE_VERSION ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPluginAccess().getGroupKeyword_1());
            		
            // InternalMultiMaven.g:714:3: ( (lv_group_2_0= RULE_GROUP ) )
            // InternalMultiMaven.g:715:4: (lv_group_2_0= RULE_GROUP )
            {
            // InternalMultiMaven.g:715:4: (lv_group_2_0= RULE_GROUP )
            // InternalMultiMaven.g:716:5: lv_group_2_0= RULE_GROUP
            {
            lv_group_2_0=(Token)match(input,RULE_GROUP,FOLLOW_11); 

            					newLeafNode(lv_group_2_0, grammarAccess.getPluginAccess().getGroupGROUPTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_2_0,
            						"org.xtext.dsl.multimaven.MultiMaven.GROUP");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPluginAccess().getArtifactKeyword_3());
            		
            // InternalMultiMaven.g:736:3: ( (lv_artifact_4_0= RULE_ARTIFACT ) )
            // InternalMultiMaven.g:737:4: (lv_artifact_4_0= RULE_ARTIFACT )
            {
            // InternalMultiMaven.g:737:4: (lv_artifact_4_0= RULE_ARTIFACT )
            // InternalMultiMaven.g:738:5: lv_artifact_4_0= RULE_ARTIFACT
            {
            lv_artifact_4_0=(Token)match(input,RULE_ARTIFACT,FOLLOW_13); 

            					newLeafNode(lv_artifact_4_0, grammarAccess.getPluginAccess().getArtifactARTIFACTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"artifact",
            						lv_artifact_4_0,
            						"org.xtext.dsl.multimaven.MultiMaven.ARTIFACT");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getVersionKeyword_5());
            		
            // InternalMultiMaven.g:758:3: ( (lv_version_6_0= RULE_VERSION ) )
            // InternalMultiMaven.g:759:4: (lv_version_6_0= RULE_VERSION )
            {
            // InternalMultiMaven.g:759:4: (lv_version_6_0= RULE_VERSION )
            // InternalMultiMaven.g:760:5: lv_version_6_0= RULE_VERSION
            {
            lv_version_6_0=(Token)match(input,RULE_VERSION,FOLLOW_21); 

            					newLeafNode(lv_version_6_0, grammarAccess.getPluginAccess().getVersionVERSIONTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPluginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_6_0,
            						"org.xtext.dsl.multimaven.MultiMaven.VERSION");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRuleIdDirectorio"
    // InternalMultiMaven.g:784:1: entryRuleIdDirectorio returns [String current=null] : iv_ruleIdDirectorio= ruleIdDirectorio EOF ;
    public final String entryRuleIdDirectorio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdDirectorio = null;


        try {
            // InternalMultiMaven.g:784:52: (iv_ruleIdDirectorio= ruleIdDirectorio EOF )
            // InternalMultiMaven.g:785:2: iv_ruleIdDirectorio= ruleIdDirectorio EOF
            {
             newCompositeNode(grammarAccess.getIdDirectorioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdDirectorio=ruleIdDirectorio();

            state._fsp--;

             current =iv_ruleIdDirectorio.getText(); 
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
    // $ANTLR end "entryRuleIdDirectorio"


    // $ANTLR start "ruleIdDirectorio"
    // InternalMultiMaven.g:791:1: ruleIdDirectorio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Hijo' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIdDirectorio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMultiMaven.g:797:2: ( (kw= 'Hijo' this_INT_1= RULE_INT ) )
            // InternalMultiMaven.g:798:2: (kw= 'Hijo' this_INT_1= RULE_INT )
            {
            // InternalMultiMaven.g:798:2: (kw= 'Hijo' this_INT_1= RULE_INT )
            // InternalMultiMaven.g:799:3: kw= 'Hijo' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,29,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIdDirectorioAccess().getHijoKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getIdDirectorioAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleIdDirectorio"


    // $ANTLR start "rulePackaging"
    // InternalMultiMaven.g:815:1: rulePackaging returns [Enumerator current=null] : ( (enumLiteral_0= 'POM' ) | (enumLiteral_1= 'JAR' ) | (enumLiteral_2= 'EAR' ) | (enumLiteral_3= 'WAR' ) | (enumLiteral_4= 'RAR' ) | (enumLiteral_5= 'MAVENPLUGIN' ) | (enumLiteral_6= 'EJB' ) ) ;
    public final Enumerator rulePackaging() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMultiMaven.g:821:2: ( ( (enumLiteral_0= 'POM' ) | (enumLiteral_1= 'JAR' ) | (enumLiteral_2= 'EAR' ) | (enumLiteral_3= 'WAR' ) | (enumLiteral_4= 'RAR' ) | (enumLiteral_5= 'MAVENPLUGIN' ) | (enumLiteral_6= 'EJB' ) ) )
            // InternalMultiMaven.g:822:2: ( (enumLiteral_0= 'POM' ) | (enumLiteral_1= 'JAR' ) | (enumLiteral_2= 'EAR' ) | (enumLiteral_3= 'WAR' ) | (enumLiteral_4= 'RAR' ) | (enumLiteral_5= 'MAVENPLUGIN' ) | (enumLiteral_6= 'EJB' ) )
            {
            // InternalMultiMaven.g:822:2: ( (enumLiteral_0= 'POM' ) | (enumLiteral_1= 'JAR' ) | (enumLiteral_2= 'EAR' ) | (enumLiteral_3= 'WAR' ) | (enumLiteral_4= 'RAR' ) | (enumLiteral_5= 'MAVENPLUGIN' ) | (enumLiteral_6= 'EJB' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            case 35:
                {
                alt13=6;
                }
                break;
            case 36:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMultiMaven.g:823:3: (enumLiteral_0= 'POM' )
                    {
                    // InternalMultiMaven.g:823:3: (enumLiteral_0= 'POM' )
                    // InternalMultiMaven.g:824:4: enumLiteral_0= 'POM'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getPOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackagingAccess().getPOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMultiMaven.g:831:3: (enumLiteral_1= 'JAR' )
                    {
                    // InternalMultiMaven.g:831:3: (enumLiteral_1= 'JAR' )
                    // InternalMultiMaven.g:832:4: enumLiteral_1= 'JAR'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getJAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPackagingAccess().getJAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMultiMaven.g:839:3: (enumLiteral_2= 'EAR' )
                    {
                    // InternalMultiMaven.g:839:3: (enumLiteral_2= 'EAR' )
                    // InternalMultiMaven.g:840:4: enumLiteral_2= 'EAR'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getEAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPackagingAccess().getEAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMultiMaven.g:847:3: (enumLiteral_3= 'WAR' )
                    {
                    // InternalMultiMaven.g:847:3: (enumLiteral_3= 'WAR' )
                    // InternalMultiMaven.g:848:4: enumLiteral_3= 'WAR'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getWAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPackagingAccess().getWAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMultiMaven.g:855:3: (enumLiteral_4= 'RAR' )
                    {
                    // InternalMultiMaven.g:855:3: (enumLiteral_4= 'RAR' )
                    // InternalMultiMaven.g:856:4: enumLiteral_4= 'RAR'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getRAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPackagingAccess().getRAREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMultiMaven.g:863:3: (enumLiteral_5= 'MAVENPLUGIN' )
                    {
                    // InternalMultiMaven.g:863:3: (enumLiteral_5= 'MAVENPLUGIN' )
                    // InternalMultiMaven.g:864:4: enumLiteral_5= 'MAVENPLUGIN'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getMAVENPLUGINEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPackagingAccess().getMAVENPLUGINEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMultiMaven.g:871:3: (enumLiteral_6= 'EJB' )
                    {
                    // InternalMultiMaven.g:871:3: (enumLiteral_6= 'EJB' )
                    // InternalMultiMaven.g:872:4: enumLiteral_6= 'EJB'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPackagingAccess().getEJBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPackagingAccess().getEJBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePackaging"


    // $ANTLR start "ruleScope"
    // InternalMultiMaven.g:882:1: ruleScope returns [Enumerator current=null] : ( (enumLiteral_0= 'COMPILE' ) | (enumLiteral_1= 'TEST' ) | (enumLiteral_2= 'PACKAGE' ) | (enumLiteral_3= 'INSTALL' ) | (enumLiteral_4= 'DEPLOY' ) ) ;
    public final Enumerator ruleScope() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMultiMaven.g:888:2: ( ( (enumLiteral_0= 'COMPILE' ) | (enumLiteral_1= 'TEST' ) | (enumLiteral_2= 'PACKAGE' ) | (enumLiteral_3= 'INSTALL' ) | (enumLiteral_4= 'DEPLOY' ) ) )
            // InternalMultiMaven.g:889:2: ( (enumLiteral_0= 'COMPILE' ) | (enumLiteral_1= 'TEST' ) | (enumLiteral_2= 'PACKAGE' ) | (enumLiteral_3= 'INSTALL' ) | (enumLiteral_4= 'DEPLOY' ) )
            {
            // InternalMultiMaven.g:889:2: ( (enumLiteral_0= 'COMPILE' ) | (enumLiteral_1= 'TEST' ) | (enumLiteral_2= 'PACKAGE' ) | (enumLiteral_3= 'INSTALL' ) | (enumLiteral_4= 'DEPLOY' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 38:
                {
                alt14=2;
                }
                break;
            case 39:
                {
                alt14=3;
                }
                break;
            case 40:
                {
                alt14=4;
                }
                break;
            case 41:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMultiMaven.g:890:3: (enumLiteral_0= 'COMPILE' )
                    {
                    // InternalMultiMaven.g:890:3: (enumLiteral_0= 'COMPILE' )
                    // InternalMultiMaven.g:891:4: enumLiteral_0= 'COMPILE'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getScopeAccess().getCOMPILEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMultiMaven.g:898:3: (enumLiteral_1= 'TEST' )
                    {
                    // InternalMultiMaven.g:898:3: (enumLiteral_1= 'TEST' )
                    // InternalMultiMaven.g:899:4: enumLiteral_1= 'TEST'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getScopeAccess().getTESTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getScopeAccess().getTESTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMultiMaven.g:906:3: (enumLiteral_2= 'PACKAGE' )
                    {
                    // InternalMultiMaven.g:906:3: (enumLiteral_2= 'PACKAGE' )
                    // InternalMultiMaven.g:907:4: enumLiteral_2= 'PACKAGE'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getScopeAccess().getPACKAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getScopeAccess().getPACKAGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMultiMaven.g:914:3: (enumLiteral_3= 'INSTALL' )
                    {
                    // InternalMultiMaven.g:914:3: (enumLiteral_3= 'INSTALL' )
                    // InternalMultiMaven.g:915:4: enumLiteral_3= 'INSTALL'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getScopeAccess().getINSTALLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getScopeAccess().getINSTALLEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMultiMaven.g:922:3: (enumLiteral_4= 'DEPLOY' )
                    {
                    // InternalMultiMaven.g:922:3: (enumLiteral_4= 'DEPLOY' )
                    // InternalMultiMaven.g:923:4: enumLiteral_4= 'DEPLOY'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getScopeAccess().getDEPLOYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getScopeAccess().getDEPLOYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleScope"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000D800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000100L});

}