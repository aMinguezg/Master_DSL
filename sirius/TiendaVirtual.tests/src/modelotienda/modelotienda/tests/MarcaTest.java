/**
 */
package modelotienda.modelotienda.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelotienda.modelotienda.Marca;
import modelotienda.modelotienda.ModelotiendaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Marca</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarcaTest extends TestCase {

	/**
	 * The fixture for this Marca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Marca fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MarcaTest.class);
	}

	/**
	 * Constructs a new Marca test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarcaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Marca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Marca fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Marca test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Marca getFixture() {
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
		setFixture(ModelotiendaFactory.eINSTANCE.createMarca());
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

} //MarcaTest
