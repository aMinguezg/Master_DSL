/**
 */
package modeloagencia.modeloagencia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modeloagencia.modeloagencia.ModeloagenciaFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloagenciaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeloagencia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modeloagencia";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agencia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloagenciaPackage eINSTANCE = modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl.init();

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.AgenciaImpl <em>Agencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.AgenciaImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getAgencia()
	 * @generated
	 */
	int AGENCIA = 0;

	/**
	 * The feature id for the '<em><b>Tienda tiene clientes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_CLIENTES = 0;

	/**
	 * The feature id for the '<em><b>Tienda tiene desplazamientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS = 1;

	/**
	 * The feature id for the '<em><b>Tienda tiene excursiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_EXCURSIONES = 2;

	/**
	 * The feature id for the '<em><b>Tienda tiene guias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_GUIAS = 3;

	/**
	 * The feature id for the '<em><b>Tienda tiene alojamientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_ALOJAMIENTOS = 4;

	/**
	 * The feature id for the '<em><b>Tienda tiene viajes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__TIENDA_TIENE_VIAJES = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__NOMBRE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__ID = 7;

	/**
	 * The feature id for the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA__UBICACION = 8;

	/**
	 * The number of structural features of the '<em>Agencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Agencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.ClienteImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Cliente tiene viajes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CLIENTE_TIENE_VIAJES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DNI = 2;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EDAD = 3;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TELEFONO = 4;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.ViajeImpl <em>Viaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.ViajeImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getViaje()
	 * @generated
	 */
	int VIAJE = 2;

	/**
	 * The feature id for the '<em><b>Viaje tiene alojamientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE__VIAJE_TIENE_ALOJAMIENTOS = 0;

	/**
	 * The feature id for the '<em><b>Viaje tiene desplazamientos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS = 1;

	/**
	 * The feature id for the '<em><b>Viaje tiene excursiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE__VIAJE_TIENE_EXCURSIONES = 2;

	/**
	 * The feature id for the '<em><b>Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE__FACTURA = 3;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE__PRECIO = 4;

	/**
	 * The number of structural features of the '<em>Viaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Viaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIAJE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.DesplazamientoImpl <em>Desplazamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.DesplazamientoImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getDesplazamiento()
	 * @generated
	 */
	int DESPLAZAMIENTO = 3;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPLAZAMIENTO__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPLAZAMIENTO__DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Medio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPLAZAMIENTO__MEDIO = 2;

	/**
	 * The number of structural features of the '<em>Desplazamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPLAZAMIENTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Desplazamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESPLAZAMIENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.AlojamientoImpl <em>Alojamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.AlojamientoImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getAlojamiento()
	 * @generated
	 */
	int ALOJAMIENTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ubicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO__UBICACION = 1;

	/**
	 * The feature id for the '<em><b>Tiempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO__TIEMPO = 2;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO__PRECIO = 3;

	/**
	 * The number of structural features of the '<em>Alojamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Alojamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOJAMIENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.ExcursionImpl <em>Excursion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.ExcursionImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getExcursion()
	 * @generated
	 */
	int EXCURSION = 5;

	/**
	 * The feature id for the '<em><b>Excursion tiene guias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__EXCURSION_TIENE_GUIAS = 0;

	/**
	 * The feature id for the '<em><b>Lugar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__LUGAR = 1;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__PRECIO = 2;

	/**
	 * The number of structural features of the '<em>Excursion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Excursion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloagencia.modeloagencia.impl.GuiaImpl <em>Guia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloagencia.modeloagencia.impl.GuiaImpl
	 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getGuia()
	 * @generated
	 */
	int GUIA = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Idioma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__IDIOMA = 1;

	/**
	 * The feature id for the '<em><b>Tarifa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA__TARIFA = 2;

	/**
	 * The number of structural features of the '<em>Guia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Guia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUIA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Agencia <em>Agencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agencia</em>'.
	 * @see modeloagencia.modeloagencia.Agencia
	 * @generated
	 */
	EClass getAgencia();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_clientes <em>Tienda tiene clientes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene clientes</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_clientes()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_clientes();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_desplazamientos <em>Tienda tiene desplazamientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene desplazamientos</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_desplazamientos()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_desplazamientos();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_excursiones <em>Tienda tiene excursiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene excursiones</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_excursiones()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_excursiones();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_guias <em>Tienda tiene guias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene guias</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_guias()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_guias();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_alojamientos <em>Tienda tiene alojamientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene alojamientos</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_alojamientos()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_alojamientos();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Agencia#getTienda_tiene_viajes <em>Tienda tiene viajes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tienda tiene viajes</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getTienda_tiene_viajes()
	 * @see #getAgencia()
	 * @generated
	 */
	EReference getAgencia_Tienda_tiene_viajes();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Agencia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getNombre()
	 * @see #getAgencia()
	 * @generated
	 */
	EAttribute getAgencia_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Agencia#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getId()
	 * @see #getAgencia()
	 * @generated
	 */
	EAttribute getAgencia_Id();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Agencia#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubicacion</em>'.
	 * @see modeloagencia.modeloagencia.Agencia#getUbicacion()
	 * @see #getAgencia()
	 * @generated
	 */
	EAttribute getAgencia_Ubicacion();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see modeloagencia.modeloagencia.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Cliente#getCliente_tiene_viajes <em>Cliente tiene viajes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cliente tiene viajes</em>'.
	 * @see modeloagencia.modeloagencia.Cliente#getCliente_tiene_viajes()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Cliente_tiene_viajes();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Cliente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloagencia.modeloagencia.Cliente#getNombre()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Cliente#getDni <em>Dni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dni</em>'.
	 * @see modeloagencia.modeloagencia.Cliente#getDni()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Dni();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Cliente#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see modeloagencia.modeloagencia.Cliente#getEdad()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Edad();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Cliente#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see modeloagencia.modeloagencia.Cliente#getTelefono()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Telefono();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Viaje <em>Viaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viaje</em>'.
	 * @see modeloagencia.modeloagencia.Viaje
	 * @generated
	 */
	EClass getViaje();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_alojamientos <em>Viaje tiene alojamientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viaje tiene alojamientos</em>'.
	 * @see modeloagencia.modeloagencia.Viaje#getViaje_tiene_alojamientos()
	 * @see #getViaje()
	 * @generated
	 */
	EReference getViaje_Viaje_tiene_alojamientos();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_desplazamientos <em>Viaje tiene desplazamientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viaje tiene desplazamientos</em>'.
	 * @see modeloagencia.modeloagencia.Viaje#getViaje_tiene_desplazamientos()
	 * @see #getViaje()
	 * @generated
	 */
	EReference getViaje_Viaje_tiene_desplazamientos();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Viaje#getViaje_tiene_excursiones <em>Viaje tiene excursiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viaje tiene excursiones</em>'.
	 * @see modeloagencia.modeloagencia.Viaje#getViaje_tiene_excursiones()
	 * @see #getViaje()
	 * @generated
	 */
	EReference getViaje_Viaje_tiene_excursiones();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Viaje#getFactura <em>Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factura</em>'.
	 * @see modeloagencia.modeloagencia.Viaje#getFactura()
	 * @see #getViaje()
	 * @generated
	 */
	EAttribute getViaje_Factura();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Viaje#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see modeloagencia.modeloagencia.Viaje#getPrecio()
	 * @see #getViaje()
	 * @generated
	 */
	EAttribute getViaje_Precio();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Desplazamiento <em>Desplazamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desplazamiento</em>'.
	 * @see modeloagencia.modeloagencia.Desplazamiento
	 * @generated
	 */
	EClass getDesplazamiento();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Desplazamiento#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see modeloagencia.modeloagencia.Desplazamiento#getOrigen()
	 * @see #getDesplazamiento()
	 * @generated
	 */
	EAttribute getDesplazamiento_Origen();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Desplazamiento#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destino</em>'.
	 * @see modeloagencia.modeloagencia.Desplazamiento#getDestino()
	 * @see #getDesplazamiento()
	 * @generated
	 */
	EAttribute getDesplazamiento_Destino();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Desplazamiento#getMedio <em>Medio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medio</em>'.
	 * @see modeloagencia.modeloagencia.Desplazamiento#getMedio()
	 * @see #getDesplazamiento()
	 * @generated
	 */
	EAttribute getDesplazamiento_Medio();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Alojamiento <em>Alojamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alojamiento</em>'.
	 * @see modeloagencia.modeloagencia.Alojamiento
	 * @generated
	 */
	EClass getAlojamiento();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Alojamiento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloagencia.modeloagencia.Alojamiento#getNombre()
	 * @see #getAlojamiento()
	 * @generated
	 */
	EAttribute getAlojamiento_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Alojamiento#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubicacion</em>'.
	 * @see modeloagencia.modeloagencia.Alojamiento#getUbicacion()
	 * @see #getAlojamiento()
	 * @generated
	 */
	EAttribute getAlojamiento_Ubicacion();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Alojamiento#getTiempo <em>Tiempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiempo</em>'.
	 * @see modeloagencia.modeloagencia.Alojamiento#getTiempo()
	 * @see #getAlojamiento()
	 * @generated
	 */
	EAttribute getAlojamiento_Tiempo();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Alojamiento#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see modeloagencia.modeloagencia.Alojamiento#getPrecio()
	 * @see #getAlojamiento()
	 * @generated
	 */
	EAttribute getAlojamiento_Precio();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Excursion <em>Excursion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excursion</em>'.
	 * @see modeloagencia.modeloagencia.Excursion
	 * @generated
	 */
	EClass getExcursion();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloagencia.modeloagencia.Excursion#getExcursion_tiene_guias <em>Excursion tiene guias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excursion tiene guias</em>'.
	 * @see modeloagencia.modeloagencia.Excursion#getExcursion_tiene_guias()
	 * @see #getExcursion()
	 * @generated
	 */
	EReference getExcursion_Excursion_tiene_guias();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Excursion#getLugar <em>Lugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lugar</em>'.
	 * @see modeloagencia.modeloagencia.Excursion#getLugar()
	 * @see #getExcursion()
	 * @generated
	 */
	EAttribute getExcursion_Lugar();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Excursion#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see modeloagencia.modeloagencia.Excursion#getPrecio()
	 * @see #getExcursion()
	 * @generated
	 */
	EAttribute getExcursion_Precio();

	/**
	 * Returns the meta object for class '{@link modeloagencia.modeloagencia.Guia <em>Guia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guia</em>'.
	 * @see modeloagencia.modeloagencia.Guia
	 * @generated
	 */
	EClass getGuia();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Guia#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloagencia.modeloagencia.Guia#getNombre()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Guia#getIdioma <em>Idioma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idioma</em>'.
	 * @see modeloagencia.modeloagencia.Guia#getIdioma()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Idioma();

	/**
	 * Returns the meta object for the attribute '{@link modeloagencia.modeloagencia.Guia#getTarifa <em>Tarifa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarifa</em>'.
	 * @see modeloagencia.modeloagencia.Guia#getTarifa()
	 * @see #getGuia()
	 * @generated
	 */
	EAttribute getGuia_Tarifa();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloagenciaFactory getModeloagenciaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.AgenciaImpl <em>Agencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.AgenciaImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getAgencia()
		 * @generated
		 */
		EClass AGENCIA = eINSTANCE.getAgencia();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene clientes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_CLIENTES = eINSTANCE.getAgencia_Tienda_tiene_clientes();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene desplazamientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_DESPLAZAMIENTOS = eINSTANCE.getAgencia_Tienda_tiene_desplazamientos();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene excursiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_EXCURSIONES = eINSTANCE.getAgencia_Tienda_tiene_excursiones();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene guias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_GUIAS = eINSTANCE.getAgencia_Tienda_tiene_guias();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene alojamientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_ALOJAMIENTOS = eINSTANCE.getAgencia_Tienda_tiene_alojamientos();

		/**
		 * The meta object literal for the '<em><b>Tienda tiene viajes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCIA__TIENDA_TIENE_VIAJES = eINSTANCE.getAgencia_Tienda_tiene_viajes();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCIA__NOMBRE = eINSTANCE.getAgencia_Nombre();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCIA__ID = eINSTANCE.getAgencia_Id();

		/**
		 * The meta object literal for the '<em><b>Ubicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCIA__UBICACION = eINSTANCE.getAgencia_Ubicacion();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.ClienteImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Cliente tiene viajes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__CLIENTE_TIENE_VIAJES = eINSTANCE.getCliente_Cliente_tiene_viajes();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOMBRE = eINSTANCE.getCliente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Dni</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__DNI = eINSTANCE.getCliente_Dni();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__EDAD = eINSTANCE.getCliente_Edad();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TELEFONO = eINSTANCE.getCliente_Telefono();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.ViajeImpl <em>Viaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.ViajeImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getViaje()
		 * @generated
		 */
		EClass VIAJE = eINSTANCE.getViaje();

		/**
		 * The meta object literal for the '<em><b>Viaje tiene alojamientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIAJE__VIAJE_TIENE_ALOJAMIENTOS = eINSTANCE.getViaje_Viaje_tiene_alojamientos();

		/**
		 * The meta object literal for the '<em><b>Viaje tiene desplazamientos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIAJE__VIAJE_TIENE_DESPLAZAMIENTOS = eINSTANCE.getViaje_Viaje_tiene_desplazamientos();

		/**
		 * The meta object literal for the '<em><b>Viaje tiene excursiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIAJE__VIAJE_TIENE_EXCURSIONES = eINSTANCE.getViaje_Viaje_tiene_excursiones();

		/**
		 * The meta object literal for the '<em><b>Factura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIAJE__FACTURA = eINSTANCE.getViaje_Factura();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIAJE__PRECIO = eINSTANCE.getViaje_Precio();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.DesplazamientoImpl <em>Desplazamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.DesplazamientoImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getDesplazamiento()
		 * @generated
		 */
		EClass DESPLAZAMIENTO = eINSTANCE.getDesplazamiento();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESPLAZAMIENTO__ORIGEN = eINSTANCE.getDesplazamiento_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESPLAZAMIENTO__DESTINO = eINSTANCE.getDesplazamiento_Destino();

		/**
		 * The meta object literal for the '<em><b>Medio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESPLAZAMIENTO__MEDIO = eINSTANCE.getDesplazamiento_Medio();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.AlojamientoImpl <em>Alojamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.AlojamientoImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getAlojamiento()
		 * @generated
		 */
		EClass ALOJAMIENTO = eINSTANCE.getAlojamiento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALOJAMIENTO__NOMBRE = eINSTANCE.getAlojamiento_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ubicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALOJAMIENTO__UBICACION = eINSTANCE.getAlojamiento_Ubicacion();

		/**
		 * The meta object literal for the '<em><b>Tiempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALOJAMIENTO__TIEMPO = eINSTANCE.getAlojamiento_Tiempo();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALOJAMIENTO__PRECIO = eINSTANCE.getAlojamiento_Precio();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.ExcursionImpl <em>Excursion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.ExcursionImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getExcursion()
		 * @generated
		 */
		EClass EXCURSION = eINSTANCE.getExcursion();

		/**
		 * The meta object literal for the '<em><b>Excursion tiene guias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCURSION__EXCURSION_TIENE_GUIAS = eINSTANCE.getExcursion_Excursion_tiene_guias();

		/**
		 * The meta object literal for the '<em><b>Lugar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCURSION__LUGAR = eINSTANCE.getExcursion_Lugar();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCURSION__PRECIO = eINSTANCE.getExcursion_Precio();

		/**
		 * The meta object literal for the '{@link modeloagencia.modeloagencia.impl.GuiaImpl <em>Guia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloagencia.modeloagencia.impl.GuiaImpl
		 * @see modeloagencia.modeloagencia.impl.ModeloagenciaPackageImpl#getGuia()
		 * @generated
		 */
		EClass GUIA = eINSTANCE.getGuia();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__NOMBRE = eINSTANCE.getGuia_Nombre();

		/**
		 * The meta object literal for the '<em><b>Idioma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__IDIOMA = eINSTANCE.getGuia_Idioma();

		/**
		 * The meta object literal for the '<em><b>Tarifa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUIA__TARIFA = eINSTANCE.getGuia_Tarifa();

	}

} //ModeloagenciaPackage
