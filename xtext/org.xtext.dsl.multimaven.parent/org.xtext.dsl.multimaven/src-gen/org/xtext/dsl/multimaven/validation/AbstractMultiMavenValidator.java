/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMultiMavenValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage.eINSTANCE);
		return result;
	}
}
