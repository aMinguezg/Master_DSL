/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RestauranteGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RestauranteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.dsl.restaurante.Restaurante.Restaurante");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRestaurantesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNombreAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNombreSTRINGTerminalRuleCall_1_0 = (RuleCall)cNombreAssignment_1.eContents().get(0);
		private final Keyword cFechaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFechaAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFechaFECHATerminalRuleCall_3_0 = (RuleCall)cFechaAssignment_3.eContents().get(0);
		private final Keyword cIngredientesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIngredientesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIngredientesIngredienteParserRuleCall_6_0 = (RuleCall)cIngredientesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Restaurante:
		//	'Restaurantes' nombre=STRING
		//	'fecha' fecha=FECHA
		//	'Ingredientes' '{'
		//	ingredientes+=Ingrediente*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Restaurantes' nombre=STRING 'fecha' fecha=FECHA 'Ingredientes' '{' ingredientes+=Ingrediente* '}'
		public Group getGroup() { return cGroup; }
		
		//'Restaurantes'
		public Keyword getRestaurantesKeyword_0() { return cRestaurantesKeyword_0; }
		
		//nombre=STRING
		public Assignment getNombreAssignment_1() { return cNombreAssignment_1; }
		
		//STRING
		public RuleCall getNombreSTRINGTerminalRuleCall_1_0() { return cNombreSTRINGTerminalRuleCall_1_0; }
		
		//'fecha'
		public Keyword getFechaKeyword_2() { return cFechaKeyword_2; }
		
		//fecha=FECHA
		public Assignment getFechaAssignment_3() { return cFechaAssignment_3; }
		
		//FECHA
		public RuleCall getFechaFECHATerminalRuleCall_3_0() { return cFechaFECHATerminalRuleCall_3_0; }
		
		//'Ingredientes'
		public Keyword getIngredientesKeyword_4() { return cIngredientesKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//ingredientes+=Ingrediente*
		public Assignment getIngredientesAssignment_6() { return cIngredientesAssignment_6; }
		
		//Ingrediente
		public RuleCall getIngredientesIngredienteParserRuleCall_6_0() { return cIngredientesIngredienteParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class IngredienteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.dsl.restaurante.Restaurante.Ingrediente");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIngredienteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cNombreAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNombreSTRINGTerminalRuleCall_2_0 = (RuleCall)cNombreAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInfoURLKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInfoURLAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cInfoURLURLTerminalRuleCall_3_1_0 = (RuleCall)cInfoURLAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFotoKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFotoAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFotoSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cFotoAssignment_4_1.eContents().get(0);
		private final Assignment cAlergenicoAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cAlergenicoAlergenicoKeyword_5_0 = (Keyword)cAlergenicoAssignment_5.eContents().get(0);
		
		//Ingrediente:
		//	'Ingrediente:' name=ID
		//	nombre=STRING ('infoURL:' infoURL=URL)? ('foto:' foto=STRING)?
		//	alergenico?='alergenico'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Ingrediente:' name=ID nombre=STRING ('infoURL:' infoURL=URL)? ('foto:' foto=STRING)? alergenico?='alergenico'?
		public Group getGroup() { return cGroup; }
		
		//'Ingrediente:'
		public Keyword getIngredienteKeyword_0() { return cIngredienteKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//nombre=STRING
		public Assignment getNombreAssignment_2() { return cNombreAssignment_2; }
		
		//STRING
		public RuleCall getNombreSTRINGTerminalRuleCall_2_0() { return cNombreSTRINGTerminalRuleCall_2_0; }
		
		//('infoURL:' infoURL=URL)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'infoURL:'
		public Keyword getInfoURLKeyword_3_0() { return cInfoURLKeyword_3_0; }
		
		//infoURL=URL
		public Assignment getInfoURLAssignment_3_1() { return cInfoURLAssignment_3_1; }
		
		//URL
		public RuleCall getInfoURLURLTerminalRuleCall_3_1_0() { return cInfoURLURLTerminalRuleCall_3_1_0; }
		
		//('foto:' foto=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'foto:'
		public Keyword getFotoKeyword_4_0() { return cFotoKeyword_4_0; }
		
		//foto=STRING
		public Assignment getFotoAssignment_4_1() { return cFotoAssignment_4_1; }
		
		//STRING
		public RuleCall getFotoSTRINGTerminalRuleCall_4_1_0() { return cFotoSTRINGTerminalRuleCall_4_1_0; }
		
		//alergenico?='alergenico'?
		public Assignment getAlergenicoAssignment_5() { return cAlergenicoAssignment_5; }
		
		//'alergenico'
		public Keyword getAlergenicoAlergenicoKeyword_5_0() { return cAlergenicoAlergenicoKeyword_5_0; }
	}
	
	
	private final RestauranteElements pRestaurante;
	private final IngredienteElements pIngrediente;
	private final TerminalRule tFECHA;
	private final TerminalRule tURL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RestauranteGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRestaurante = new RestauranteElements();
		this.pIngrediente = new IngredienteElements();
		this.tFECHA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.dsl.restaurante.Restaurante.FECHA");
		this.tURL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.dsl.restaurante.Restaurante.URL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.dsl.restaurante.Restaurante".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Restaurante:
	//	'Restaurantes' nombre=STRING
	//	'fecha' fecha=FECHA
	//	'Ingredientes' '{'
	//	ingredientes+=Ingrediente*
	//	'}';
	public RestauranteElements getRestauranteAccess() {
		return pRestaurante;
	}
	
	public ParserRule getRestauranteRule() {
		return getRestauranteAccess().getRule();
	}
	
	//Ingrediente:
	//	'Ingrediente:' name=ID
	//	nombre=STRING ('infoURL:' infoURL=URL)? ('foto:' foto=STRING)?
	//	alergenico?='alergenico'?;
	public IngredienteElements getIngredienteAccess() {
		return pIngrediente;
	}
	
	public ParserRule getIngredienteRule() {
		return getIngredienteAccess().getRule();
	}
	
	//terminal FECHA:
	//	'0'..'9' '0'..'9' '-'
	//	'0'..'9' '0'..'9' '-'
	//	'0'..'9' '0'..'9' '0'..'9' '0'..'9';
	public TerminalRule getFECHARule() {
		return tFECHA;
	}
	
	//terminal URL:
	//	('http' | 'https') '://' ('a'..'z' | 'A'..'Z' | '_' | '-' | '(' | ')' | '\\' | '/' | '.' | '0'..'9')+;
	public TerminalRule getURLRule() {
		return tURL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
