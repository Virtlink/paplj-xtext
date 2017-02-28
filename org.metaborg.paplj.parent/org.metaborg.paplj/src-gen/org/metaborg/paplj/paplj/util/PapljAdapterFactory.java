/**
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.paplj.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.metaborg.paplj.paplj.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.metaborg.paplj.paplj.PapljPackage
 * @generated
 */
public class PapljAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PapljPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PapljAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PapljPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PapljSwitch<Adapter> modelSwitch =
    new PapljSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseBlock2(Block2 object)
      {
        return createBlock2Adapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseLet(Let object)
      {
        return createLetAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEq(Eq object)
      {
        return createEqAdapter();
      }
      @Override
      public Adapter caseNeq(Neq object)
      {
        return createNeqAdapter();
      }
      @Override
      public Adapter caseLt(Lt object)
      {
        return createLtAdapter();
      }
      @Override
      public Adapter caseAdd(Add object)
      {
        return createAddAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter caseMul(Mul object)
      {
        return createMulAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseCast(Cast object)
      {
        return createCastAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseMin(Min object)
      {
        return createMinAdapter();
      }
      @Override
      public Adapter caseMemberRef(MemberRef object)
      {
        return createMemberRefAdapter();
      }
      @Override
      public Adapter caseNum(Num object)
      {
        return createNumAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseThis(This object)
      {
        return createThisAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseNew(New object)
      {
        return createNewAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Block2 <em>Block2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Block2
   * @generated
   */
  public Adapter createBlock2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Let <em>Let</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Let
   * @generated
   */
  public Adapter createLetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Eq
   * @generated
   */
  public Adapter createEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Neq <em>Neq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Neq
   * @generated
   */
  public Adapter createNeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Lt <em>Lt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Lt
   * @generated
   */
  public Adapter createLtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Add
   * @generated
   */
  public Adapter createAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Mul
   * @generated
   */
  public Adapter createMulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Cast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Cast
   * @generated
   */
  public Adapter createCastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Min <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Min
   * @generated
   */
  public Adapter createMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.MemberRef <em>Member Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.MemberRef
   * @generated
   */
  public Adapter createMemberRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Num <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Num
   * @generated
   */
  public Adapter createNumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.This
   * @generated
   */
  public Adapter createThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.New <em>New</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.New
   * @generated
   */
  public Adapter createNewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.metaborg.paplj.paplj.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.metaborg.paplj.paplj.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PapljAdapterFactory
