/**
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.paplj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.metaborg.paplj.paplj.Sub#getLeft <em>Left</em>}</li>
 *   <li>{@link org.metaborg.paplj.paplj.Sub#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.metaborg.paplj.paplj.PapljPackage#getSub()
 * @model
 * @generated
 */
public interface Sub extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see org.metaborg.paplj.paplj.PapljPackage#getSub_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link org.metaborg.paplj.paplj.Sub#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see org.metaborg.paplj.paplj.PapljPackage#getSub_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.metaborg.paplj.paplj.Sub#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // Sub
