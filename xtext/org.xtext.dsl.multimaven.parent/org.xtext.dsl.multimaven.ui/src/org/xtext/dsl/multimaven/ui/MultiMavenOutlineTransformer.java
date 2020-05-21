package org.xtext.dsl.multimaven.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.dsl.multimaven.multiMaven.Dependencia;
import org.xtext.dsl.multimaven.multiMaven.DirectorioPadre;
import org.xtext.dsl.multimaven.multiMaven.Plugin;
import org.xtext.dsl.multimaven.multiMaven.Proyecto;
import org.xtext.dsl.multimaven.multiMaven.impl.MultiMavenPackageImpl;

public class MultiMavenOutlineTransformer extends DefaultOutlineTreeProvider{
	
	@Override
	protected void createNode(IOutlineNode parentNode, EObject modelElement)  {
		if (modelElement instanceof Dependencia) {
			createEObjectNode(parentNode, modelElement); //Se mete al Ingrediente debajo de Restaurante
			
			int posicion = parentNode.getChildren().size()-1; //posición del elemento modelElement en el árbol de objetos IOutlineNode
			IOutlineNode nodoActual = parentNode.getChildren().get(posicion); //se obtiene el nodo de dicha posición (el nodo correspondiente al Ingrediente)

			Dependencia i = (Dependencia)modelElement;
			//EAttribute a = EcoreFactory.eINSTANCE.createEAttribute(); //FALLA AL HACER LA REFERENCIA
			
			EAttribute aArtifact = MultiMavenPackageImpl.eINSTANCE.getDependencia_Group();
			aArtifact.setDefaultValue(i.getGroup());
			createEObjectNode(nodoActual, aArtifact);
		}
		else if(modelElement instanceof Proyecto) {
			createEObjectNode(parentNode, modelElement);
		}
		else if(modelElement instanceof DirectorioPadre) {
			createEObjectNode(parentNode, modelElement);
		}
		else if(modelElement instanceof Plugin) {
			createEObjectNode(parentNode, modelElement);
		}
	}
	

}
