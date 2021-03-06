/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.dsl.restaurante.ide.contentassist.antlr.internal.InternalRestauranteParser;
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;

public class RestauranteParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RestauranteGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RestauranteGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRestauranteAccess().getGroup(), "rule__Restaurante__Group__0");
			builder.put(grammarAccess.getIngredienteAccess().getGroup(), "rule__Ingrediente__Group__0");
			builder.put(grammarAccess.getIngredienteAccess().getGroup_3(), "rule__Ingrediente__Group_3__0");
			builder.put(grammarAccess.getIngredienteAccess().getGroup_4(), "rule__Ingrediente__Group_4__0");
			builder.put(grammarAccess.getRestauranteAccess().getNombreAssignment_1(), "rule__Restaurante__NombreAssignment_1");
			builder.put(grammarAccess.getRestauranteAccess().getFechaAssignment_3(), "rule__Restaurante__FechaAssignment_3");
			builder.put(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6(), "rule__Restaurante__IngredientesAssignment_6");
			builder.put(grammarAccess.getIngredienteAccess().getNameAssignment_1(), "rule__Ingrediente__NameAssignment_1");
			builder.put(grammarAccess.getIngredienteAccess().getNombreAssignment_2(), "rule__Ingrediente__NombreAssignment_2");
			builder.put(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1(), "rule__Ingrediente__InfoURLAssignment_3_1");
			builder.put(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1(), "rule__Ingrediente__FotoAssignment_4_1");
			builder.put(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5(), "rule__Ingrediente__AlergenicoAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RestauranteGrammarAccess grammarAccess;

	@Override
	protected InternalRestauranteParser createParser() {
		InternalRestauranteParser result = new InternalRestauranteParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RestauranteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RestauranteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
