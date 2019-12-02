/**
 */
package modelotienda.modelotienda.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelotienda.modelotienda.ModelotiendaFactory;
import modelotienda.modelotienda.Tienda;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tienda</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TiendaTest extends TestCase {

	/**
	 * The fixture for this Tienda test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tienda fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TiendaTest.class);
	}

	/**
	 * Constructs a new Tienda test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiendaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tienda test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tienda fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tienda test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tienda getFixture() {
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
		setFixture(ModelotiendaFactory.eINSTANCE.createTienda());
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

} //TiendaTest
