/**
 */
package ac.soton.eventb.featureinclusion;

import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Synchronisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getSynchronisedEvent <em>Synchronised Event</em>}</li>
 *   <li>{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getEventSynchronisation()
 * @model
 * @generated
 */
public interface EventSynchronisation extends AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Synchronised Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronised Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronised Event</em>' reference.
	 * @see #setSynchronisedEvent(Event)
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getEventSynchronisation_SynchronisedEvent()
	 * @model
	 * @generated
	 */
	Event getSynchronisedEvent();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getSynchronisedEvent <em>Synchronised Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronised Event</em>' reference.
	 * @see #getSynchronisedEvent()
	 * @generated
	 */
	void setSynchronisedEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see ac.soton.eventb.featureinclusion.FeatureinclusionPackage#getEventSynchronisation_Prefix()
	 * @model default=""
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.featureinclusion.EventSynchronisation#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // EventSynchronisation
