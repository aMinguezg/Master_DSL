/**
 * generated by Xtext 2.19.0
 */
package org.xtext.dsl.multimaven.multiMaven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.multimaven.multiMaven.MultiMavenPackage#getScope()
 * @model
 * @generated
 */
public enum Scope implements Enumerator
{
  /**
   * The '<em><b>COMPILE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPILE_VALUE
   * @generated
   * @ordered
   */
  COMPILE(0, "COMPILE", "COMPILE"),

  /**
   * The '<em><b>TEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEST_VALUE
   * @generated
   * @ordered
   */
  TEST(1, "TEST", "TEST"),

  /**
   * The '<em><b>PACKAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACKAGE_VALUE
   * @generated
   * @ordered
   */
  PACKAGE(2, "PACKAGE", "PACKAGE"),

  /**
   * The '<em><b>INSTALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTALL_VALUE
   * @generated
   * @ordered
   */
  INSTALL(3, "INSTALL", "INSTALL"),

  /**
   * The '<em><b>DEPLOY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPLOY_VALUE
   * @generated
   * @ordered
   */
  DEPLOY(4, "DEPLOY", "DEPLOY");

  /**
   * The '<em><b>COMPILE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPILE
   * @model
   * @generated
   * @ordered
   */
  public static final int COMPILE_VALUE = 0;

  /**
   * The '<em><b>TEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEST
   * @model
   * @generated
   * @ordered
   */
  public static final int TEST_VALUE = 1;

  /**
   * The '<em><b>PACKAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACKAGE
   * @model
   * @generated
   * @ordered
   */
  public static final int PACKAGE_VALUE = 2;

  /**
   * The '<em><b>INSTALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTALL
   * @model
   * @generated
   * @ordered
   */
  public static final int INSTALL_VALUE = 3;

  /**
   * The '<em><b>DEPLOY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPLOY
   * @model
   * @generated
   * @ordered
   */
  public static final int DEPLOY_VALUE = 4;

  /**
   * An array of all the '<em><b>Scope</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Scope[] VALUES_ARRAY =
    new Scope[]
    {
      COMPILE,
      TEST,
      PACKAGE,
      INSTALL,
      DEPLOY,
    };

  /**
   * A public read-only list of all the '<em><b>Scope</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Scope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Scope</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Scope get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Scope result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scope</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Scope getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Scope result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Scope</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Scope get(int value)
  {
    switch (value)
    {
      case COMPILE_VALUE: return COMPILE;
      case TEST_VALUE: return TEST;
      case PACKAGE_VALUE: return PACKAGE;
      case INSTALL_VALUE: return INSTALL;
      case DEPLOY_VALUE: return DEPLOY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Scope(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Scope
