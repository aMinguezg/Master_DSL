package org.xtext.dsl.restaurante.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Restaurante;

@SuppressWarnings("all")
public class GeneradorWeb {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorWeb(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    Iterable<Restaurante> _filter = Iterables.<Restaurante>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Restaurante.class);
    for (final Restaurante r : _filter) {
      this.compilarTexto(r);
    }
  }
  
  public CharSequence compilarTexto(final Restaurante r) {
    StringConcatenation _builder = new StringConcatenation();
    this.fsa.generateFile("scripts/ingredientes_gen.inc", this.compilarIngredientes(r.getIngredientes()));
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarIngredientes(final List<Ingrediente> ingredientes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var code = \'<table class=\"tingredientes\">\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tr class=\"tingredientes_cabecera\">\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th></th>\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th>Ingrediente</th>\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<th>Alérgeno</th>\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</tr>\\");
    _builder.newLine();
    {
      for(final Ingrediente i : ingredientes) {
        _builder.append("\t");
        CharSequence _compilarTexto = this.compilarTexto(i);
        _builder.append(_compilarTexto, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>\';");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Ingrediente i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td><img class=\"ingredientes\" src=\"imagenes/");
    {
      String _foto = i.getFoto();
      boolean _tripleNotEquals = (_foto != null);
      if (_tripleNotEquals) {
        String _foto_1 = i.getFoto();
        _builder.append(_foto_1, "\t");
      } else {
        _builder.append("generico.jpg");
      }
    }
    _builder.append("\" alt=\"");
    String _nombre = i.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append(" (");
    String _name = i.getName();
    _builder.append(_name, "\t");
    _builder.append(")\" title=\"");
    String _nombre_1 = i.getNombre();
    _builder.append(_nombre_1, "\t");
    _builder.append(" (");
    String _name_1 = i.getName();
    _builder.append(_name_1, "\t");
    _builder.append(")\" /></td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<td>");
    {
      String _infoURL = i.getInfoURL();
      boolean _tripleNotEquals_1 = (_infoURL != null);
      if (_tripleNotEquals_1) {
        _builder.append("<a href=\"");
        String _infoURL_1 = i.getInfoURL();
        _builder.append(_infoURL_1, "\t");
        _builder.append("\" target=\"_blank\">");
        String _nombre_2 = i.getNombre();
        _builder.append(_nombre_2, "\t");
        _builder.append("</a>");
      } else {
        String _nombre_3 = i.getNombre();
        _builder.append(_nombre_3, "\t");
      }
    }
    _builder.append("</td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<td><img class=\"alergenos\" src=\"imagenes/");
    {
      boolean _isAlergenico = i.isAlergenico();
      if (_isAlergenico) {
        _builder.append("alergeno.png");
      } else {
        _builder.append("noalergeno.png");
      }
    }
    _builder.append("\" alt=\"Este ingrediente ");
    {
      boolean _isAlergenico_1 = i.isAlergenico();
      boolean _not = (!_isAlergenico_1);
      if (_not) {
        _builder.append("no ");
      }
    }
    _builder.append("contiene alérgenos\" title=\"Este ingrediente ");
    {
      boolean _isAlergenico_2 = i.isAlergenico();
      boolean _not_1 = (!_isAlergenico_2);
      if (_not_1) {
        _builder.append("no ");
      }
    }
    _builder.append("contiene alérgenos\" /></td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("</tr>\\");
    _builder.newLine();
    return _builder;
  }
}
