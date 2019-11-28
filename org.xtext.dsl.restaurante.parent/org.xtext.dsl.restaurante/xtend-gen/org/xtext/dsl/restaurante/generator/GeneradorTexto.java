package org.xtext.dsl.restaurante.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;

@SuppressWarnings("all")
public class GeneradorTexto {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorTexto(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    StringBuilder sb = new StringBuilder();
    Iterable<Ingrediente> _filter = Iterables.<Ingrediente>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Ingrediente.class);
    for (final Ingrediente i : _filter) {
      sb.append(this.compilarTexto(i));
    }
    this.fsa.generateFile("ingredientes.txt", sb.toString());
  }
  
  public CharSequence compilarTexto(final Ingrediente i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Ingrediente: ");
    String _nombre = i.getNombre();
    _builder.append(_nombre);
    _builder.append(" código ");
    String _name = i.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      boolean _isAlergenico = i.isAlergenico();
      if (_isAlergenico) {
        _builder.append("(alergénico)");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _infoURL = i.getInfoURL();
      boolean _tripleNotEquals = (_infoURL != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("Se puede consultar más información en ");
        String _infoURL_1 = i.getInfoURL();
        _builder.append(_infoURL_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _foto = i.getFoto();
      boolean _tripleNotEquals_1 = (_foto != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        _builder.append("Se ha proporcionado una foto para el ingrediente en la ruta imagenes/");
        String _foto_1 = i.getFoto();
        _builder.append(_foto_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
