package org.xtext.dsl.restaurante.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Restaurante

class GeneradorWeb {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		for(r: resource.allContents.toIterable.filter(typeof(Restaurante))){
			r.compilarTexto;
		}
	}
	
	def compilarTexto(Restaurante r) '''
		«fsa.generateFile("scripts/ingredientes_gen.inc", compilarIngredientes(r.ingredientes))»
	'''
	
	//INICIO PARTE WEB PARA INGREDIENTES
	def compilarIngredientes(List<Ingrediente> ingredientes) '''
		var code = '<table class="tingredientes">\
			<tr class="tingredientes_cabecera">\
				<th></th>\
				<th>Ingrediente</th>\
				<th>Alérgeno</th>\
			</tr>\
			«FOR i:ingredientes»
				«i.compilarTexto»
			«ENDFOR»
		</table>';
	'''
	
	def compilarTexto(Ingrediente i) '''
		<tr>\
			<td><img class="ingredientes" src="imagenes/«IF i.foto !== null »«i.foto»«ELSE»generico.jpg«ENDIF»" alt="«i.nombre» («i.name»)" title="«i.nombre» («i.name»)" /></td>\
			<td>«IF i.infoURL !== null »<a href="«i.infoURL»" target="_blank">«i.nombre»</a>«ELSE»«i.nombre»«ENDIF»</td>\
			<td><img class="alergenos" src="imagenes/«IF i.alergenico»alergeno.png«ELSE»noalergeno.png«ENDIF»" alt="Este ingrediente «IF !i.alergenico»no «ENDIF»contiene alérgenos" title="Este ingrediente «IF !i.alergenico»no «ENDIF»contiene alérgenos" /></td>\
		</tr>\
	'''
	//FIN PARTE WEB PARA INGREDIENTES
}