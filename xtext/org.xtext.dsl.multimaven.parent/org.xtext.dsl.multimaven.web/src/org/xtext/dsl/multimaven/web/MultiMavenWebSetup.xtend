/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.xtext.dsl.multimaven.MultiMavenRuntimeModule
import org.xtext.dsl.multimaven.MultiMavenStandaloneSetup
import org.xtext.dsl.multimaven.ide.MultiMavenIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class MultiMavenWebSetup extends MultiMavenStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MultiMavenRuntimeModule, new MultiMavenIdeModule, new MultiMavenWebModule))
	}
	
}
