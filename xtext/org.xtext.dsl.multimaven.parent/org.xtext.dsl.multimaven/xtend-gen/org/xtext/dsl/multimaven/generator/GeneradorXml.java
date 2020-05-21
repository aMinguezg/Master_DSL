package org.xtext.dsl.multimaven.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.multimaven.multiMaven.Dependencia;
import org.xtext.dsl.multimaven.multiMaven.Directorio;
import org.xtext.dsl.multimaven.multiMaven.DirectorioPadre;
import org.xtext.dsl.multimaven.multiMaven.Packaging;
import org.xtext.dsl.multimaven.multiMaven.Plugin;
import org.xtext.dsl.multimaven.multiMaven.Proyecto;
import org.xtext.dsl.multimaven.multiMaven.Scope;

@SuppressWarnings("all")
public class GeneradorXml {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorXml(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    Iterable<Proyecto> _filter = Iterables.<Proyecto>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Proyecto.class);
    for (final Proyecto p : _filter) {
      this.compilarTexto(p);
    }
  }
  
  public CharSequence compilarTexto(final Proyecto p) {
    StringConcatenation _builder = new StringConcatenation();
    String _path = p.getPadre().getPath();
    String _plus = (_path + "/pom.xml");
    this.fsa.generateFile(_plus, this.compilarPadre(p.getVersion(), p.getPadre()));
    _builder.newLineIfNotEmpty();
    {
      EList<Directorio> _directorios = p.getPadre().getDirectorios();
      for(final Directorio d : _directorios) {
        String _path_1 = p.getPadre().getPath();
        String _plus_1 = (_path_1 + "/");
        String _name = d.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + "/pom.xml");
        this.fsa.generateFile(_plus_3, this.compilarHijos(p.getVersion(), d, p.getPadre()));
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compilarPadre(final String version, final DirectorioPadre p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/");
    _builder.append(version);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/");
    _builder.append(version, "         ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("http://maven.apache.org/xsd/maven-");
    _builder.append(version, "\t\t ");
    _builder.append(".xsd\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<modelVersion>");
    _builder.append(version, "    ");
    _builder.append("</modelVersion>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- parent pom -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<groupId>");
    String _group = p.getGroup();
    _builder.append(_group, "    ");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<artifactId>");
    String _artifact = p.getArtifact();
    _builder.append(_artifact, "    ");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    {
      Packaging _packaging = p.getPackaging();
      boolean _tripleNotEquals = (_packaging != null);
      if (_tripleNotEquals) {
        _builder.append("    ");
        _builder.append("<packaging>");
        Packaging _packaging_1 = p.getPackaging();
        _builder.append(_packaging_1, "    ");
        _builder.append("</packaging>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<version>");
    String _version = p.getVersion();
    _builder.append(_version, "\t");
    _builder.append("</version>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<!-- submodulos -->");
    _builder.newLine();
    _builder.append("<modules>");
    _builder.newLine();
    {
      EList<Directorio> _directorios = p.getDirectorios();
      for(final Directorio dir : _directorios) {
        _builder.append("<module>");
        String _artifact_1 = dir.getArtifact();
        _builder.append(_artifact_1);
        _builder.append("</module>\t\t\t\t\t   ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</modules>");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      int _length = ((Object[])Conversions.unwrapArray(p.getDependencias(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("    ");
        _builder.append("<!-- Dependencias -->\t\t    \t\t    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<dependencies>");
        _builder.newLine();
        {
          EList<Dependencia> _dependencias = p.getDependencias();
          for(final Dependencia dp : _dependencias) {
            _builder.append("    ");
            _builder.append("<dependency>");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("<groupId>");
            String _group_1 = dp.getGroup();
            _builder.append(_group_1, "        ");
            _builder.append("</groupId>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("<artifactId>");
            String _artifact_2 = dp.getArtifact();
            _builder.append(_artifact_2, "        ");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("<version>");
            String _version_1 = dp.getVersion();
            _builder.append(_version_1, "        ");
            _builder.append("</version>");
            _builder.newLineIfNotEmpty();
            {
              Scope _scope = dp.getScope();
              boolean _tripleNotEquals_1 = (_scope != null);
              if (_tripleNotEquals_1) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("<scope>");
                Scope _scope_1 = dp.getScope();
                _builder.append(_scope_1, "        ");
                _builder.append("</scope>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("</dependency>");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("</dependencies>");
        _builder.newLine();
      }
    }
    _builder.append("    \t");
    _builder.newLine();
    {
      int _length_1 = ((Object[])Conversions.unwrapArray(p.getPlugins(), Object.class)).length;
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        _builder.append("    \t");
        _builder.append("<!-- Plugins -->\t\t    \t\t    ");
        _builder.newLine();
        _builder.append("    \t");
        _builder.append("<plugins>");
        _builder.newLine();
        {
          EList<Plugin> _plugins = p.getPlugins();
          for(final Plugin pl : _plugins) {
            _builder.append("    \t");
            _builder.append("<plugin>");
            _builder.newLine();
            _builder.append("    \t");
            _builder.append("\t      ");
            _builder.append("<groupId>");
            String _group_2 = pl.getGroup();
            _builder.append(_group_2, "    \t\t      ");
            _builder.append("</groupId>");
            _builder.newLineIfNotEmpty();
            _builder.append("    \t");
            _builder.append("\t      ");
            _builder.append("<artifactId>");
            String _artifact_3 = pl.getArtifact();
            _builder.append(_artifact_3, "    \t\t      ");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("    \t");
            _builder.append("\t      ");
            _builder.append("<version>");
            String _version_2 = pl.getVersion();
            _builder.append(_version_2, "    \t\t      ");
            _builder.append("</version>");
            _builder.newLineIfNotEmpty();
            _builder.append("    \t");
            _builder.append(" ");
            _builder.append("</plugin>");
            _builder.newLine();
          }
        }
        _builder.append("    \t");
        _builder.append("</plugins>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarHijos(final String version, final Directorio d, final DirectorioPadre p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/");
    _builder.append(version);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/");
    _builder.append(version, "         ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t ");
    _builder.append("http://maven.apache.org/xsd/maven-");
    _builder.append(version, "\t\t ");
    _builder.append(".xsd\">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- parent pom -->");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<parent>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<artifactId>");
    String _artifact = p.getArtifact();
    _builder.append(_artifact, "\t        ");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("<groupId>");
    String _group = p.getGroup();
    _builder.append(_group, "\t        ");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("<version>");
    String _version = p.getVersion();
    _builder.append(_version, "\t        ");
    _builder.append("</version>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("</parent>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<modelVersion>");
    _builder.append(version, "\t    ");
    _builder.append("</modelVersion>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- hijo info -->");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<groupId>");
    String _group_1 = d.getGroup();
    _builder.append(_group_1, "\t    ");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("<artifactId>");
    String _artifact_1 = d.getArtifact();
    _builder.append(_artifact_1, "\t    ");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("<version>");
    String _version_1 = d.getVersion();
    _builder.append(_version_1, "\t    ");
    _builder.append("</version>");
    _builder.newLineIfNotEmpty();
    {
      Packaging _packaging = d.getPackaging();
      boolean _tripleNotEquals = (_packaging != null);
      if (_tripleNotEquals) {
        _builder.append("\t    ");
        _builder.append("<packaging>");
        Packaging _packaging_1 = d.getPackaging();
        _builder.append(_packaging_1, "\t    ");
        _builder.append("</packaging>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    {
      int _length = ((Object[])Conversions.unwrapArray(d.getDependencias(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("\t    ");
        _builder.append("<!-- Dependencias -->\t\t    \t\t    ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("<dependencies>");
        _builder.newLine();
        {
          EList<Dependencia> _dependencias = d.getDependencias();
          for(final Dependencia dp : _dependencias) {
            _builder.append("\t    ");
            _builder.append("<dependency>");
            _builder.newLine();
            _builder.append("\t    ");
            _builder.append("    ");
            _builder.append("<groupId>");
            String _group_2 = dp.getGroup();
            _builder.append(_group_2, "\t        ");
            _builder.append("</groupId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t    ");
            _builder.append("    ");
            _builder.append("<artifactId>");
            String _artifact_2 = dp.getArtifact();
            _builder.append(_artifact_2, "\t        ");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t    ");
            _builder.append("    ");
            _builder.append("<version>");
            String _version_2 = dp.getVersion();
            _builder.append(_version_2, "\t        ");
            _builder.append("</version>");
            _builder.newLineIfNotEmpty();
            {
              Scope _scope = dp.getScope();
              boolean _tripleNotEquals_1 = (_scope != null);
              if (_tripleNotEquals_1) {
                _builder.append("\t    ");
                _builder.append("    ");
                _builder.append("<scope>");
                Scope _scope_1 = dp.getScope();
                _builder.append(_scope_1, "\t        ");
                _builder.append("</scope>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t    ");
            _builder.append("</dependency>");
            _builder.newLine();
          }
        }
        _builder.append("\t    ");
        _builder.append("</dependencies>");
        _builder.newLine();
      }
    }
    _builder.append("\t    ");
    _builder.newLine();
    {
      int _length_1 = ((Object[])Conversions.unwrapArray(d.getPlugins(), Object.class)).length;
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        _builder.append("\t    ");
        _builder.append(" ");
        _builder.append("<!-- Plugins -->\t\t    \t\t    ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("<plugins>");
        _builder.newLine();
        {
          EList<Plugin> _plugins = d.getPlugins();
          for(final Plugin pl : _plugins) {
            _builder.append("\t    ");
            _builder.append("<plugin>");
            _builder.newLine();
            _builder.append("\t    ");
            _builder.append("      ");
            _builder.append("<groupId>");
            String _group_3 = pl.getGroup();
            _builder.append(_group_3, "\t          ");
            _builder.append("</groupId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t    ");
            _builder.append("      ");
            _builder.append("<artifactId>");
            String _artifact_3 = pl.getArtifact();
            _builder.append(_artifact_3, "\t          ");
            _builder.append("</artifactId>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t    ");
            _builder.append("      ");
            _builder.append("<version>");
            String _version_3 = pl.getVersion();
            _builder.append(_version_3, "\t          ");
            _builder.append("</version>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t    ");
            _builder.append("</plugin>");
            _builder.newLine();
          }
        }
        _builder.append("\t    ");
        _builder.append("</plugins>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
