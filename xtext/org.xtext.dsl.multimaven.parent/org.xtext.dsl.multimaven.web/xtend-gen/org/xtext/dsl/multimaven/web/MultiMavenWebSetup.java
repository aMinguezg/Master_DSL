/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.dsl.multimaven.MultiMavenRuntimeModule;
import org.xtext.dsl.multimaven.MultiMavenStandaloneSetup;
import org.xtext.dsl.multimaven.ide.MultiMavenIdeModule;
import org.xtext.dsl.multimaven.web.MultiMavenWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class MultiMavenWebSetup extends MultiMavenStandaloneSetup {
  @Override
  public Injector createInjector() {
    MultiMavenRuntimeModule _multiMavenRuntimeModule = new MultiMavenRuntimeModule();
    MultiMavenIdeModule _multiMavenIdeModule = new MultiMavenIdeModule();
    MultiMavenWebModule _multiMavenWebModule = new MultiMavenWebModule();
    return Guice.createInjector(Modules2.mixin(_multiMavenRuntimeModule, _multiMavenIdeModule, _multiMavenWebModule));
  }
}
