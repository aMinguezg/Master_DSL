/*
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.validation

import org.eclipse.xtext.validation.Check
import org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage
import org.xtext.dsl.multimaven.multiMaven.DirectorioPadre
import org.xtext.dsl.multimaven.multiMaven.Directorio
import org.xtext.dsl.multimaven.multiMaven.Dependencia
import org.xtext.dsl.multimaven.multiMaven.Plugin

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MultiMavenValidator extends AbstractMultiMavenValidator {
	
	public static val GROUP_ARTIFACT_DIFERENTES = 'groupArtifactDiferentes'
	public static val PATH_MUY_GRANDE = 'pathMuyGrande'
	public static val NOMBRES_IGUALES = 'nombresIguales'

	@Check
	def checkGroupArtifact(DirectorioPadre dir, Dependencia dep, Directorio d, Plugin p){
		if(dir.group == dir.artifact){
			warning('El nombre del grupo deber�a ser diferente del artefacto', 
				MultiMavenPackage.Literals.DIRECTORIO_PADRE__GROUP, GROUP_ARTIFACT_DIFERENTES
			)
		}
		
		if(dep.group == dep.artifact){
			warning('El nombre del grupo deber�a ser diferente del artefacto', 
				MultiMavenPackage.Literals.DEPENDENCIA__GROUP, GROUP_ARTIFACT_DIFERENTES
			)
		}
		
		if(d.group == d.artifact){
			warning('El nombre del grupo deber�a ser diferente del artefacto', 
				MultiMavenPackage.Literals.DIRECTORIO__GROUP, GROUP_ARTIFACT_DIFERENTES
			)
		}
		
		if(p.group == p.artifact){
			warning('El nombre del grupo deber�a ser diferente del artefacto', 
				MultiMavenPackage.Literals.PLUGIN__GROUP, GROUP_ARTIFACT_DIFERENTES
			)
		}
	}
	
	@Check
	def checkPath(DirectorioPadre dir){
		if(dir.path.length >= 15){
			warning('El path deber�a tener menos de 15 caracteres', 
				MultiMavenPackage.Literals.DIRECTORIO_PADRE__PATH, PATH_MUY_GRANDE
			)
		}
		
	}
	
	@Check
	def checkNombres(DirectorioPadre dir){
		
		for(var i = 0; i<dir.directorios.size; i++){
			for(var j = i + 1; j<dir.directorios.size; j++){
				if(dir.directorios.get(i).name == dir.directorios.get(j).name){
					error('No puede haber dos nombres de hijo iguales', 
						MultiMavenPackage.Literals.DIRECTORIO__NAME, NOMBRES_IGUALES
					)
				}
			}
		}
		
	}
	
}
