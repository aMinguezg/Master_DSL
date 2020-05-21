/**
 */
package modeloagencia.modeloagencia.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloagencia.modeloagencia.Agencia;
import modeloagencia.modeloagencia.ModeloagenciaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgenciaTest extends TestCase {

	/**
	 * The fixture for this Agencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Agencia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgenciaTest.class);
	}

	/**
	 * Constructs a new Agencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenciaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Agencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Agencia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Agencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Agencia getFixture() {
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
		setFixture(ModeloagenciaFactory.eINSTANCE.createAgencia());
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

} //AgenciaTest
