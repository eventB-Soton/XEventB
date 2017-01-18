/**
 */
package ac.soton.eventb.featureinclusion.impl;

import ac.soton.eventb.featureinclusion.FeatureinclusionPackage;
import ac.soton.eventb.featureinclusion.MachineInclusion;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl#getAbstractMachine <em>Abstract Machine</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl#getConcreteMachine <em>Concrete Machine</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.impl.MachineInclusionImpl#getPrefixes <em>Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineInclusionImpl extends MachineImpl implements MachineInclusion {
	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractMachine() <em>Abstract Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMachine()
	 * @generated
	 * @ordered
	 */
	protected Machine abstractMachine;

	/**
	 * The cached value of the '{@link #getConcreteMachine() <em>Concrete Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMachine()
	 * @generated
	 * @ordered
	 */
	protected Machine concreteMachine;

	/**
	 * The cached value of the '{@link #getPrefixes() <em>Prefixes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> prefixes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureinclusionPackage.Literals.MACHINE_INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID, oldExtensionId, extensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getAbstractMachine() {
		if (abstractMachine != null && abstractMachine.eIsProxy()) {
			InternalEObject oldAbstractMachine = (InternalEObject)abstractMachine;
			abstractMachine = (Machine)eResolveProxy(oldAbstractMachine);
			if (abstractMachine != oldAbstractMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE, oldAbstractMachine, abstractMachine));
			}
		}
		return abstractMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetAbstractMachine() {
		return abstractMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractMachine(Machine newAbstractMachine) {
		Machine oldAbstractMachine = abstractMachine;
		abstractMachine = newAbstractMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE, oldAbstractMachine, abstractMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getConcreteMachine() {
		if (concreteMachine != null && concreteMachine.eIsProxy()) {
			InternalEObject oldConcreteMachine = (InternalEObject)concreteMachine;
			concreteMachine = (Machine)eResolveProxy(oldConcreteMachine);
			if (concreteMachine != oldConcreteMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE, oldConcreteMachine, concreteMachine));
			}
		}
		return concreteMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetConcreteMachine() {
		return concreteMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteMachine(Machine newConcreteMachine) {
		Machine oldConcreteMachine = concreteMachine;
		concreteMachine = newConcreteMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE, oldConcreteMachine, concreteMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPrefixes() {
		if (prefixes == null) {
			prefixes = new EDataTypeUniqueEList<String>(String.class, this, FeatureinclusionPackage.MACHINE_INCLUSION__PREFIXES);
		}
		return prefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID:
				return getExtensionId();
			case FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE:
				if (resolve) return getAbstractMachine();
				return basicGetAbstractMachine();
			case FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE:
				if (resolve) return getConcreteMachine();
				return basicGetConcreteMachine();
			case FeatureinclusionPackage.MACHINE_INCLUSION__PREFIXES:
				return getPrefixes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE:
				setAbstractMachine((Machine)newValue);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE:
				setConcreteMachine((Machine)newValue);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__PREFIXES:
				getPrefixes().clear();
				getPrefixes().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE:
				setAbstractMachine((Machine)null);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE:
				setConcreteMachine((Machine)null);
				return;
			case FeatureinclusionPackage.MACHINE_INCLUSION__PREFIXES:
				getPrefixes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case FeatureinclusionPackage.MACHINE_INCLUSION__ABSTRACT_MACHINE:
				return abstractMachine != null;
			case FeatureinclusionPackage.MACHINE_INCLUSION__CONCRETE_MACHINE:
				return concreteMachine != null;
			case FeatureinclusionPackage.MACHINE_INCLUSION__PREFIXES:
				return prefixes != null && !prefixes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return FeatureinclusionPackage.MACHINE_INCLUSION__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(", prefixes: ");
		result.append(prefixes);
		result.append(')');
		return result.toString();
	}

} //MachineInclusionImpl
