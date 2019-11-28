/*
 * generated by Xtext 2.19.0
 */
grammar InternalRestaurante;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.dsl.restaurante.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleRestaurante
entryRuleRestaurante
:
{ before(grammarAccess.getRestauranteRule()); }
	 ruleRestaurante
{ after(grammarAccess.getRestauranteRule()); } 
	 EOF 
;

// Rule Restaurante
ruleRestaurante 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRestauranteAccess().getGroup()); }
		(rule__Restaurante__Group__0)
		{ after(grammarAccess.getRestauranteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIngrediente
entryRuleIngrediente
:
{ before(grammarAccess.getIngredienteRule()); }
	 ruleIngrediente
{ after(grammarAccess.getIngredienteRule()); } 
	 EOF 
;

// Rule Ingrediente
ruleIngrediente 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIngredienteAccess().getGroup()); }
		(rule__Ingrediente__Group__0)
		{ after(grammarAccess.getIngredienteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__0__Impl
	rule__Restaurante__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); }
	'Restaurantes'
	{ after(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__1__Impl
	rule__Restaurante__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); }
	(rule__Restaurante__NombreAssignment_1)
	{ after(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__2__Impl
	rule__Restaurante__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); }
	'fecha'
	{ after(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__3__Impl
	rule__Restaurante__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); }
	(rule__Restaurante__FechaAssignment_3)
	{ after(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__4__Impl
	rule__Restaurante__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); }
	'Ingredientes'
	{ after(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__5__Impl
	rule__Restaurante__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__6__Impl
	rule__Restaurante__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); }
	(rule__Restaurante__IngredientesAssignment_6)*
	{ after(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Restaurante__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ingrediente__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__0__Impl
	rule__Ingrediente__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); }
	'Ingrediente:'
	{ after(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__1__Impl
	rule__Ingrediente__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getNameAssignment_1()); }
	(rule__Ingrediente__NameAssignment_1)
	{ after(grammarAccess.getIngredienteAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__2__Impl
	rule__Ingrediente__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); }
	(rule__Ingrediente__NombreAssignment_2)
	{ after(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__3__Impl
	rule__Ingrediente__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getGroup_3()); }
	(rule__Ingrediente__Group_3__0)?
	{ after(grammarAccess.getIngredienteAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__4__Impl
	rule__Ingrediente__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getGroup_4()); }
	(rule__Ingrediente__Group_4__0)?
	{ after(grammarAccess.getIngredienteAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); }
	(rule__Ingrediente__AlergenicoAssignment_5)?
	{ after(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ingrediente__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group_3__0__Impl
	rule__Ingrediente__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); }
	'infoURL:'
	{ after(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); }
	(rule__Ingrediente__InfoURLAssignment_3_1)
	{ after(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ingrediente__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group_4__0__Impl
	rule__Ingrediente__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); }
	'foto:'
	{ after(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingrediente__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); }
	(rule__Ingrediente__FotoAssignment_4_1)
	{ after(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Restaurante__NombreAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__FechaAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); }
		RULE_FECHA
		{ after(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Restaurante__IngredientesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); }
		ruleIngrediente
		{ after(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__NombreAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__InfoURLAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); }
		RULE_URL
		{ after(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__FotoAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingrediente__AlergenicoAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); }
		(
			{ before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); }
			'alergenico'
			{ after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); }
		)
		{ after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_FECHA : '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9';

RULE_URL : ('http'|'https') '://' ('a'..'z'|'A'..'Z'|'_'|'-'|'('|')'|'\\'|'/'|'.'|'0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;