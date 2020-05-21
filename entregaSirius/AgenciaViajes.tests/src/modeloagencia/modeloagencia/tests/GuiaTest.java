/**
 */
package modeloagencia.modeloagencia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloagencia.modeloagencia.Guia;
import modeloagencia.modeloagencia.ModeloagenciaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiaTest extends TestCase {

	/**
	 * The fixture for this Guia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Guia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuiaTest.class);
	}

	/**
	 * Constructs a new Guia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Guia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Guia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Guia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Guia getFixture() {
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
		setFixture(ModeloagenciaFactory.eINSTANCE.createGuia());
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

} //GuiaTest
