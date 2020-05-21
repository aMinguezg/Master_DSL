/**
 */
package modeloagencia.modeloagencia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloagencia.modeloagencia.Desplazamiento;
import modeloagencia.modeloagencia.ModeloagenciaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desplazamiento</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesplazamientoTest extends TestCase {

	/**
	 * The fixture for this Desplazamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Desplazamiento fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DesplazamientoTest.class);
	}

	/**
	 * Constructs a new Desplazamiento test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesplazamientoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Desplazamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Desplazamiento fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Desplazamiento test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Desplazamiento getFixture() {
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
		setFixture(ModeloagenciaFactory.eINSTANCE.createDesplazamiento());
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

} //DesplazamientoTest
