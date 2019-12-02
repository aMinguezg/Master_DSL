/**
 */
package modelotienda.modelotienda.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelotienda.modelotienda.ModelotiendaFactory;
import modelotienda.modelotienda.Producto;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductoTest extends TestCase {

	/**
	 * The fixture for this Producto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Producto fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductoTest.class);
	}

	/**
	 * Constructs a new Producto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Producto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Producto fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Producto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Producto getFixture() {
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
		setFixture(ModelotiendaFactory.eINSTANCE.createProducto());
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

} //ProductoTest
