/**
 */
package ac.soton.eventb.featureinclusion.impl;

import ac.soton.eventb.featureinclusion.EventSynchronisation;
import ac.soton.eventb.featureinclusion.FeatureinclusionFactory;
import ac.soton.eventb.featureinclusion.FeatureinclusionPackage;
import ac.soton.eventb.featureinclusion.MachineInclusion;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureinclusionPackageImpl extends EPackageImpl implements FeatureinclusionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSynchronisationEClass = null;

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
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeatureinclusionPackageImpl() {
		super(eNS_URI, FeatureinclusionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeatureinclusionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeatureinclusionPackage init() {
		if (isInited) return (FeatureinclusionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureinclusionPackage.eNS_URI);

		// Obtain or create and register package
		FeatureinclusionPackageImpl theFeatureinclusionPackage = (FeatureinclusionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeatureinclusionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeatureinclusionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFeatureinclusionPackage.createPackageContents();

		// Initialize created meta-data
		theFeatureinclusionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeatureinclusionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeatureinclusionPackage.eNS_URI, theFeatureinclusionPackage);
		return theFeatureinclusionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineInclusion() {
		return machineInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachineInclusion_AbstractMachine() {
		return (EReference)machineInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachineInclusion_ConcreteMachine() {
		return (EReference)machineInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineInclusion_Prefixes() {
		return (EAttribute)machineInclusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSynchronisation() {
		return eventSynchronisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSynchronisation_SynchronisedEvent() {
		return (EReference)eventSynchronisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventSynchronisation_Prefix() {
		return (EAttribute)eventSynchronisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureinclusionFactory getFeatureinclusionFactory() {
		return (FeatureinclusionFactory)getEFactoryInstance();
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
		machineInclusionEClass = createEClass(MACHINE_INCLUSION);
		createEReference(machineInclusionEClass, MACHINE_INCLUSION__ABSTRACT_MACHINE);
		createEReference(machineInclusionEClass, MACHINE_INCLUSION__CONCRETE_MACHINE);
		createEAttribute(machineInclusionEClass, MACHINE_INCLUSION__PREFIXES);

		eventSynchronisationEClass = createEClass(EVENT_SYNCHRONISATION);
		createEReference(eventSynchronisationEClass, EVENT_SYNCHRONISATION__SYNCHRONISED_EVENT);
		createEAttribute(eventSynchronisationEClass, EVENT_SYNCHRONISATION__PREFIX);
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

		// Obtain other dependent packages
		MachinePackage theMachinePackage = (MachinePackage)EPackage.Registry.INSTANCE.getEPackage(MachinePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineInclusionEClass.getESuperTypes().add(theMachinePackage.getMachine());
		machineInclusionEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());
		eventSynchronisationEClass.getESuperTypes().add(theMachinePackage.getEvent());
		eventSynchronisationEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(machineInclusionEClass, MachineInclusion.class, "MachineInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachineInclusion_AbstractMachine(), theMachinePackage.getMachine(), null, "abstractMachine", null, 0, 1, MachineInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachineInclusion_ConcreteMachine(), theMachinePackage.getMachine(), null, "concreteMachine", null, 0, 1, MachineInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineInclusion_Prefixes(), ecorePackage.getEString(), "prefixes", null, 0, -1, MachineInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSynchronisationEClass, EventSynchronisation.class, "EventSynchronisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSynchronisation_SynchronisedEvent(), theMachinePackage.getEvent(), null, "synchronisedEvent", null, 0, 1, EventSynchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventSynchronisation_Prefix(), ecorePackage.getEString(), "prefix", "", 0, 1, EventSynchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eventb.emf.core.extendedMetaClasses
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eventb.emf.core.extendedMetaClasses</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eventb.emf.core.extendedMetaClasses";	
		addAnnotation
		  (machineInclusionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CorePackage.eNS_URI).appendFragment("//machine/Machine")
		   });	
		addAnnotation
		  (eventSynchronisationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CorePackage.eNS_URI).appendFragment("//machine/Event")
		   });
	}

} //FeatureinclusionPackageImpl
