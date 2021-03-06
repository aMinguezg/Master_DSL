/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.dsl.multimaven.ui.internal.MultimavenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MultiMavenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MultimavenActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MultimavenActivator activator = MultimavenActivator.getInstance();
		return activator != null ? activator.getInjector(MultimavenActivator.ORG_XTEXT_DSL_MULTIMAVEN_MULTIMAVEN) : null;
	}

}
