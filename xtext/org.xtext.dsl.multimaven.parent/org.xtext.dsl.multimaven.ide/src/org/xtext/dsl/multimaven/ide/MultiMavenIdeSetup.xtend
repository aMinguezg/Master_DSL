/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.dsl.multimaven.MultiMavenRuntimeModule
import org.xtext.dsl.multimaven.MultiMavenStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MultiMavenIdeSetup extends MultiMavenStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MultiMavenRuntimeModule, new MultiMavenIdeModule))
	}
	
}
