/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.restaurante.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.dsl.restaurante.ui.internal.RestauranteActivator;

public class RestauranteUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RestauranteActivator.getInstance().getInjector("org.xtext.dsl.restaurante.Restaurante");
	}

}
