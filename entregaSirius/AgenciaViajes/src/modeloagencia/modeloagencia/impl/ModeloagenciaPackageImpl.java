/**
 */
package modeloagencia.modeloagencia.impl;

import modeloagencia.modeloagencia.Agencia;
import modeloagencia.modeloagencia.Alojamiento;
import modeloagencia.modeloagencia.Cliente;
import modeloagencia.modeloagencia.Desplazamiento;
import modeloagencia.modeloagencia.Excursion;
import modeloagencia.modeloagencia.Guia;
import modeloagencia.modeloagencia.ModeloagenciaFactory;
import modeloagencia.modeloagencia.ModeloagenciaPackage;
import modeloagencia.modeloagencia.Viaje;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloagenciaPackageImpl extends EPackageImpl implements ModeloagenciaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desplazamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alojamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excursionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modeloagencia.modeloagencia.ModeloagenciaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeloagenciaPackageImpl() {
		super(eNS_URI, ModeloagenciaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModeloagenciaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeloagenciaPackage init() {
		if (isInited) return (ModeloagenciaPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloagenciaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModeloagenciaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModeloagenciaPackageImpl theModeloagenciaPackage = registeredModeloagenciaPackage instanceof ModeloagenciaPackageImpl ? (ModeloagenciaPackageImpl)registeredModeloagenciaPackage : new ModeloagenciaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModeloagenciaPackage.createPackageContents();

		// Initialize created meta-data
		theModeloagenciaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeloagenciaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeloagenciaPackage.eNS_URI, theModeloagenciaPackage);
		return theModeloagenciaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgencia() {
		return agenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_clientes() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_desplazamientos() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_excursiones() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_guias() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_alojamientos() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgencia_Tienda_tiene_viajes() {
		return (EReference)agenciaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgencia_Nombre() {
		return (EAttribute)agenciaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgencia_Id() {
		return (EAttribute)agenciaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgencia_Ubicacion() {
		return (EAttribute)agenciaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCliente_Cliente_tiene_viajes() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Nombre() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Dni() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Edad() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Telefono() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViaje() {
		return viajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaje_Viaje_tiene_alojamientos() {
		return (EReference)viajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaje_Viaje_tiene_desplazamientos() {
		return (EReference)viajeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViaje_Viaje_tiene_excursiones() {
		return (EReference)viajeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViaje_Factura() {
		return (EAttribute)viajeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViaje_Precio() {
		return (EAttribute)viajeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesplazamiento() {
		return desplazamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesplazamiento_Origen() {
		return (EAttribute)desplazamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesplazamiento_Destino() {
		return (EAttribute)desplazamientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesplazamiento_Medio() {
		return (EAttribute)desplazamientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlojamiento() {
		return alojamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlojamiento_Nombre() {
		return (EAttribute)alojamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlojamiento_Ubicacion() {
		return (EAttribute)alojamientoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlojamiento_Tiempo() {
		return (EAttribute)alojamientoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlojamiento_Precio() {
		return (EAttribute)alojamientoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcursion() {
		return excursionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcursion_Excursion_tiene_guias() {
		return (EReference)excursionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExcursion_Lugar() {
		return (EAttribute)excursionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExcursion_Precio() {
		return (EAttribute)excursionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGuia() {
		return guiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGuia_Nombre() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGuia_Idioma() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGuia_Tarifa() {
		return (EAttribute)guiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeloagenciaFactory getModeloagenciaFactory() {
		return (ModeloagenciaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		agenciaEClass = createEClass(AGENCIA);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_CLIENTES);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_EXCURSIONES);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_GUIAS);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_ALOJAMIENTOS);
		createEReference(agenciaEClass, AGENCIA__TIENDA_TIENE_VIAJES);
		createEAttribute(agenciaEClass, AGENCIA__NOMBRE);
		createEAttribute(agenciaEClass, AGENCIA__ID);
		createEAttribute(agenciaEClass, AGENCIA__UBICACION);

		clienteEClass = createEClass(CLIENTE);
		createEReference(clienteEClass, CLIENTE__CLIENTE_TIENE_VIAJES);
		createEAttribute(clienteEClass, CLIENTE__NOMBRE);
		createEAttribute(clienteEClass, CLIENTE__DNI);
		createEAttribute(clienteEClass, CLIENTE__EDAD);
		createEAttribute(clienteEClass, CLIENTE__TELEFONO);

		viajeEClass = createEClass(VIAJE);
		createEReference(viajeEClass, VIAJE__VIAJE_TIENE_ALOJAMIENTOS);
		createEReference(viajeEClass, VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS);
		createEReference(viajeEClass, VIAJE__VIAJE_TIENE_EXCURSIONES);
		createEAttribute(viajeEClass, VIAJE__FACTURA);
		createEAttribute(viajeEClass, VIAJE__PRECIO);

		desplazamientoEClass = createEClass(DESPLAZAMIENTO);
		createEAttribute(desplazamientoEClass, DESPLAZAMIENTO__ORIGEN);
		createEAttribute(desplazamientoEClass, DESPLAZAMIENTO__DESTINO);
		createEAttribute(desplazamientoEClass, DESPLAZAMIENTO__MEDIO);

		alojamientoEClass = createEClass(ALOJAMIENTO);
		createEAttribute(alojamientoEClass, ALOJAMIENTO__NOMBRE);
		createEAttribute(alojamientoEClass, ALOJAMIENTO__UBICACION);
		createEAttribute(alojamientoEClass, ALOJAMIENTO__TIEMPO);
		createEAttribute(alojamientoEClass, ALOJAMIENTO__PRECIO);

		excursionEClass = createEClass(EXCURSION);
		createEReference(excursionEClass, EXCURSION__EXCURSION_TIENE_GUIAS);
		createEAttribute(excursionEClass, EXCURSION__LUGAR);
		createEAttribute(excursionEClass, EXCURSION__PRECIO);

		guiaEClass = createEClass(GUIA);
		createEAttribute(guiaEClass, GUIA__NOMBRE);
		createEAttribute(guiaEClass, GUIA__IDIOMA);
		createEAttribute(guiaEClass, GUIA__TARIFA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(agenciaEClass, Agencia.class, "Agencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgencia_Tienda_tiene_clientes(), this.getCliente(), null, "tienda_tiene_clientes", null, 1, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencia_Tienda_tiene_desplazamientos(), this.getDesplazamiento(), null, "tienda_tiene_desplazamientos", null, 0, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencia_Tienda_tiene_excursiones(), this.getExcursion(), null, "tienda_tiene_excursiones", null, 0, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencia_Tienda_tiene_guias(), this.getGuia(), null, "tienda_tiene_guias", null, 0, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencia_Tienda_tiene_alojamientos(), this.getAlojamiento(), null, "tienda_tiene_alojamientos", null, 0, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencia_Tienda_tiene_viajes(), this.getViaje(), null, "tienda_tiene_viajes", null, 0, -1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgencia_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgencia_Id(), ecorePackage.getEInt(), "Id", null, 0, 1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgencia_Ubicacion(), ecorePackage.getEString(), "Ubicacion", null, 0, 1, Agencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCliente_Cliente_tiene_viajes(), this.getViaje(), null, "cliente_tiene_viajes", null, 1, -1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Dni(), ecorePackage.getEString(), "Dni", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Edad(), ecorePackage.getEInt(), "Edad", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Telefono(), ecorePackage.getEInt(), "Telefono", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viajeEClass, Viaje.class, "Viaje", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViaje_Viaje_tiene_alojamientos(), this.getAlojamiento(), null, "viaje_tiene_alojamientos", null, 0, -1, Viaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaje_Viaje_tiene_desplazamientos(), this.getDesplazamiento(), null, "viaje_tiene_desplazamientos", null, 0, -1, Viaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViaje_Viaje_tiene_excursiones(), this.getExcursion(), null, "viaje_tiene_excursiones", null, 0, -1, Viaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViaje_Factura(), ecorePackage.getEString(), "Factura", null, 0, 1, Viaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViaje_Precio(), ecorePackage.getEDouble(), "Precio", null, 0, 1, Viaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(desplazamientoEClass, Desplazamiento.class, "Desplazamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesplazamiento_Origen(), ecorePackage.getEString(), "Origen", null, 0, 1, Desplazamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesplazamiento_Destino(), ecorePackage.getEString(), "Destino", null, 0, 1, Desplazamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesplazamiento_Medio(), ecorePackage.getEString(), "Medio", null, 0, 1, Desplazamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alojamientoEClass, Alojamiento.class, "Alojamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlojamiento_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Alojamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlojamiento_Ubicacion(), ecorePackage.getEString(), "Ubicacion", null, 0, 1, Alojamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlojamiento_Tiempo(), ecorePackage.getEInt(), "Tiempo", null, 0, 1, Alojamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlojamiento_Precio(), ecorePackage.getEDouble(), "Precio", null, 0, 1, Alojamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excursionEClass, Excursion.class, "Excursion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcursion_Excursion_tiene_guias(), this.getGuia(), null, "excursion_tiene_guias", null, 0, -1, Excursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcursion_Lugar(), ecorePackage.getEString(), "Lugar", null, 0, 1, Excursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcursion_Precio(), ecorePackage.getEDouble(), "Precio", null, 0, 1, Excursion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiaEClass, Guia.class, "Guia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuia_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_Idioma(), ecorePackage.getEString(), "Idioma", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuia_Tarifa(), ecorePackage.getEDouble(), "Tarifa", null, 0, 1, Guia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModeloagenciaPackageImpl
