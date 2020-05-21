/**
 */
package modeloagencia.modeloagencia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloagencia.modeloagencia.Alojamiento;
import modeloagencia.modeloagencia.ModeloagenciaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alojamiento</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlojamientoTest extends TestCase {

	/**
	 * The fixture for this Alojamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alojamiento fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlojamientoTest.class);
	}

	/**
	 * Constructs a new Alojamiento test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlojamientoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Alojamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Alojamiento fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alojamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alojamiento getFixture() {
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
		setFixture(ModeloagenciaFactory.eINSTANCE.createAlojamiento());
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

} //AlojamientoTest
