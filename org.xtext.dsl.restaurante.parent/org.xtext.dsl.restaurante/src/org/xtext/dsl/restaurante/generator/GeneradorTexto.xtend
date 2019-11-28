package org.xtext.dsl.restaurante.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.restaurante.restaurante.Ingrediente

class GeneradorTexto {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		//SALIDA A UN ARCHIVO TXT CON INFORMACI�N DE LOS INGREDIENTES
		var sb = new StringBuilder();
		for(i: resource.allContents.toIterable.filter(typeof(Ingrediente))){
			sb.append(i.compilarTexto);
		}
		fsa.generateFile('ingredientes.txt', sb.toString);
	}
	
	//INICIO ARCHIVO TXT PARA INGREDIENTES
	def compilarTexto(Ingrediente i) '''
		Ingrediente: �i.nombre� c�digo �i.name� �IF i.alergenico�(alerg�nico)�ENDIF�
			�IF i.infoURL !== null �
			Se puede consultar m�s informaci�n en �i.infoURL�
			�ENDIF�
			�IF i.foto !== null �
			Se ha proporcionado una foto para el ingrediente en la ruta imagenes/�i.foto�
			�ENDIF�
	'''
	//FIN ARCHIVO TXT PARA INGREDIENTES
}