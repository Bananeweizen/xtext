/**
 */
package org.eclipse.xtext.example.homeautomation.ruleEngine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.homeautomation.ruleEngine.Device#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.homeautomation.ruleEngine.Device#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.homeautomation.ruleEngine.RuleEnginePackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.example.homeautomation.ruleEngine.RuleEnginePackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.homeautomation.ruleEngine.Device#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.example.homeautomation.ruleEngine.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.eclipse.xtext.example.homeautomation.ruleEngine.RuleEnginePackage#getDevice_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Device