/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.multiMaven.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.dsl.multimaven.multiMaven.Dependencia;
import org.xtext.dsl.multimaven.multiMaven.Directorio;
import org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage;
import org.xtext.dsl.multimaven.multiMaven.Packaging;
import org.xtext.dsl.multimaven.multiMaven.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directorio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getDependencias <em>Dependencias</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.impl.DirectorioImpl#getPlugins <em>Plugins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectorioImpl extends MinimalEObjectImpl.Container implements Directorio
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected String artifact = ARTIFACT_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getPackaging() <em>Packaging</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackaging()
   * @generated
   * @ordered
   */
  protected static final Packaging PACKAGING_EDEFAULT = Packaging.POM;

  /**
   * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackaging()
   * @generated
   * @ordered
   */
  protected Packaging packaging = PACKAGING_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependencias() <em>Dependencias</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencias()
   * @generated
   * @ordered
   */
  protected EList<Dependencia> dependencias;

  /**
   * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlugins()
   * @generated
   * @ordered
   */
  protected EList<Plugin> plugins;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectorioImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MultiMavenPackage.Literals.DIRECTORIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiMavenPackage.DIRECTORIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGroup(String newGroup)
  {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiMavenPackage.DIRECTORIO__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArtifact()
  {
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArtifact(String newArtifact)
  {
    String oldArtifact = artifact;
    artifact = newArtifact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiMavenPackage.DIRECTORIO__ARTIFACT, oldArtifact, artifact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiMavenPackage.DIRECTORIO__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Packaging getPackaging()
  {
    return packaging;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPackaging(Packaging newPackaging)
  {
    Packaging oldPackaging = packaging;
    packaging = newPackaging == null ? PACKAGING_EDEFAULT : newPackaging;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MultiMavenPackage.DIRECTORIO__PACKAGING, oldPackaging, packaging));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Dependencia> getDependencias()
  {
    if (dependencias == null)
    {
      dependencias = new EObjectContainmentEList<Dependencia>(Dependencia.class, this, MultiMavenPackage.DIRECTORIO__DEPENDENCIAS);
    }
    return dependencias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Plugin> getPlugins()
  {
    if (plugins == null)
    {
      plugins = new EObjectContainmentEList<Plugin>(Plugin.class, this, MultiMavenPackage.DIRECTORIO__PLUGINS);
    }
    return plugins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MultiMavenPackage.DIRECTORIO__DEPENDENCIAS:
        return ((InternalEList<?>)getDependencias()).basicRemove(otherEnd, msgs);
      case MultiMavenPackage.DIRECTORIO__PLUGINS:
        return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MultiMavenPackage.DIRECTORIO__NAME:
        return getName();
      case MultiMavenPackage.DIRECTORIO__GROUP:
        return getGroup();
      case MultiMavenPackage.DIRECTORIO__ARTIFACT:
        return getArtifact();
      case MultiMavenPackage.DIRECTORIO__VERSION:
        return getVersion();
      case MultiMavenPackage.DIRECTORIO__PACKAGING:
        return getPackaging();
      case MultiMavenPackage.DIRECTORIO__DEPENDENCIAS:
        return getDependencias();
      case MultiMavenPackage.DIRECTORIO__PLUGINS:
        return getPlugins();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MultiMavenPackage.DIRECTORIO__NAME:
        setName((String)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__GROUP:
        setGroup((String)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__ARTIFACT:
        setArtifact((String)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__VERSION:
        setVersion((String)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__PACKAGING:
        setPackaging((Packaging)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__DEPENDENCIAS:
        getDependencias().clear();
        getDependencias().addAll((Collection<? extends Dependencia>)newValue);
        return;
      case MultiMavenPackage.DIRECTORIO__PLUGINS:
        getPlugins().clear();
        getPlugins().addAll((Collection<? extends Plugin>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MultiMavenPackage.DIRECTORIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MultiMavenPackage.DIRECTORIO__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case MultiMavenPackage.DIRECTORIO__ARTIFACT:
        setArtifact(ARTIFACT_EDEFAULT);
        return;
      case MultiMavenPackage.DIRECTORIO__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case MultiMavenPackage.DIRECTORIO__PACKAGING:
        setPackaging(PACKAGING_EDEFAULT);
        return;
      case MultiMavenPackage.DIRECTORIO__DEPENDENCIAS:
        getDependencias().clear();
        return;
      case MultiMavenPackage.DIRECTORIO__PLUGINS:
        getPlugins().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MultiMavenPackage.DIRECTORIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MultiMavenPackage.DIRECTORIO__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case MultiMavenPackage.DIRECTORIO__ARTIFACT:
        return ARTIFACT_EDEFAULT == null ? artifact != null : !ARTIFACT_EDEFAULT.equals(artifact);
      case MultiMavenPackage.DIRECTORIO__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case MultiMavenPackage.DIRECTORIO__PACKAGING:
        return packaging != PACKAGING_EDEFAULT;
      case MultiMavenPackage.DIRECTORIO__DEPENDENCIAS:
        return dependencias != null && !dependencias.isEmpty();
      case MultiMavenPackage.DIRECTORIO__PLUGINS:
        return plugins != null && !plugins.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", group: ");
    result.append(group);
    result.append(", artifact: ");
    result.append(artifact);
    result.append(", version: ");
    result.append(version);
    result.append(", packaging: ");
    result.append(packaging);
    result.append(')');
    return result.toString();
  }

} //DirectorioImpl