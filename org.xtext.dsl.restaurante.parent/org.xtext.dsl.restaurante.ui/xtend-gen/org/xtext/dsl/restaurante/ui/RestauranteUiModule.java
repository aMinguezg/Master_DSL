/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.xtext.dsl.restaurante.ui.AbstractRestauranteUiModule;
import org.xtext.dsl.restaurante.ui.RestauranteHighlightingCalculator;
import org.xtext.dsl.restaurante.ui.RestauranteHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class RestauranteUiModule extends AbstractRestauranteUiModule {
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return RestauranteHighlightingConfiguration.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return RestauranteHighlightingCalculator.class;
  }
  
  public RestauranteUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
