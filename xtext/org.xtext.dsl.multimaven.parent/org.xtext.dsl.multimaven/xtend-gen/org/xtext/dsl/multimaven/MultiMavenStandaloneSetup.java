/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven;

import org.xtext.dsl.multimaven.MultiMavenStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MultiMavenStandaloneSetup extends MultiMavenStandaloneSetupGenerated {
  public static void doSetup() {
    new MultiMavenStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
