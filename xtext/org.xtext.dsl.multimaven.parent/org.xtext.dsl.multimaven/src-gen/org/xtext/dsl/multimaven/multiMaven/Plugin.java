/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.multiMaven;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getGroup <em>Group</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends EObject
{
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see #setGroup(String)
   * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getPlugin_Group()
   * @model
   * @generated
   */
  String getGroup();

  /**
   * Sets the value of the '{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see #getGroup()
   * @generated
   */
  void setGroup(String value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' attribute.
   * @see #setArtifact(String)
   * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getPlugin_Artifact()
   * @model
   * @generated
   */
  String getArtifact();

  /**
   * Sets the value of the '{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getArtifact <em>Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact</em>' attribute.
   * @see #getArtifact()
   * @generated
   */
  void setArtifact(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getPlugin_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.xtext.dsl.multimaven.multiMaven.Plugin#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // Plugin
