/**
 */
package modeloagencia.modeloagencia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloagencia.modeloagencia.Excursion;
import modeloagencia.modeloagencia.ModeloagenciaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Excursion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcursionTest extends TestCase {

	/**
	 * The fixture for this Excursion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Excursion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcursionTest.class);
	}

	/**
	 * Constructs a new Excursion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcursionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Excursion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Excursion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Excursion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Excursion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloagenciaFactory.eINSTANCE.createExcursion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExcursionTest
