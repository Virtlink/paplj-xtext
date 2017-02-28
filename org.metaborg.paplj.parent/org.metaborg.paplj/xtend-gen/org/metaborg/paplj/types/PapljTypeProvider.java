package org.metaborg.paplj.types;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.metaborg.paplj.lib.PapljLib;
import org.metaborg.paplj.paplj.Add;
import org.metaborg.paplj.paplj.And;
import org.metaborg.paplj.paplj.Assignment;
import org.metaborg.paplj.paplj.Block2;
import org.metaborg.paplj.paplj.Bool;
import org.metaborg.paplj.paplj.Div;
import org.metaborg.paplj.paplj.Eq;
import org.metaborg.paplj.paplj.Expr;
import org.metaborg.paplj.paplj.If;
import org.metaborg.paplj.paplj.Lt;
import org.metaborg.paplj.paplj.Member;
import org.metaborg.paplj.paplj.MemberRef;
import org.metaborg.paplj.paplj.Method;
import org.metaborg.paplj.paplj.Min;
import org.metaborg.paplj.paplj.Mul;
import org.metaborg.paplj.paplj.Neq;
import org.metaborg.paplj.paplj.New;
import org.metaborg.paplj.paplj.Not;
import org.metaborg.paplj.paplj.Null;
import org.metaborg.paplj.paplj.Num;
import org.metaborg.paplj.paplj.Or;
import org.metaborg.paplj.paplj.PapljFactory;
import org.metaborg.paplj.paplj.PapljPackage;
import org.metaborg.paplj.paplj.Sub;
import org.metaborg.paplj.paplj.Symbol;
import org.metaborg.paplj.paplj.This;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.paplj.Var;

/**
 * Determines the type of an expression.
 */
@SuppressWarnings("all")
public class PapljTypeProvider {
  @Inject
  @Extension
  private PapljLib _papljLib;
  
  private final PapljPackage ep = PapljPackage.eINSTANCE;
  
  public final static Type BoolT = ObjectExtensions.<Type>operator_doubleArrow(PapljFactory.eINSTANCE.createType(), ((Procedure1<Type>) (Type it) -> {
    it.setName("Bool");
  }));
  
  public final static Type NumT = ObjectExtensions.<Type>operator_doubleArrow(PapljFactory.eINSTANCE.createType(), ((Procedure1<Type>) (Type it) -> {
    it.setName("Num");
  }));
  
  public final static Type NullT = ObjectExtensions.<Type>operator_doubleArrow(PapljFactory.eINSTANCE.createType(), ((Procedure1<Type>) (Type it) -> {
    it.setName("Null");
  }));
  
  public final static Type AnyT = ObjectExtensions.<Type>operator_doubleArrow(PapljFactory.eINSTANCE.createType(), ((Procedure1<Type>) (Type it) -> {
    it.setName("Any");
  }));
  
  public final static Type EmptyT = ObjectExtensions.<Type>operator_doubleArrow(PapljFactory.eINSTANCE.createType(), ((Procedure1<Type>) (Type it) -> {
    it.setName("Empty");
  }));
  
  public Type typeOf(final Expr e) {
    Type _switchResult = null;
    boolean _matched = false;
    if (e instanceof Or) {
      _matched=true;
      _switchResult = PapljTypeProvider.BoolT;
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof Eq) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof Neq) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof Lt) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof Add) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Sub) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Mul) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Div) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof Min) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Num) {
        _matched=true;
        _switchResult = PapljTypeProvider.NumT;
      }
    }
    if (!_matched) {
      if (e instanceof Bool) {
        _matched=true;
        _switchResult = PapljTypeProvider.BoolT;
      }
    }
    if (!_matched) {
      if (e instanceof This) {
        _matched=true;
        _switchResult = EcoreUtil2.<Type>getContainerOfType(e, Type.class);
      }
    }
    if (!_matched) {
      if (e instanceof Null) {
        _matched=true;
        _switchResult = PapljTypeProvider.NullT;
      }
    }
    if (!_matched) {
      if (e instanceof New) {
        _matched=true;
        _switchResult = ((New)e).getType();
      }
    }
    if (!_matched) {
      if (e instanceof Var) {
        _matched=true;
        Symbol _member = ((Var)e).getMember();
        Type _type = null;
        if (_member!=null) {
          _type=_member.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof MemberRef) {
        _matched=true;
        Member _member = ((MemberRef)e).getMember();
        Type _type = null;
        if (_member!=null) {
          _type=_member.getType();
        }
        _switchResult = _type;
      }
    }
    if (!_matched) {
      if (e instanceof Block2) {
        _matched=true;
        _switchResult = this.typeOf(IterableExtensions.<Expr>last(((Block2)e).getExprs()));
      }
    }
    return _switchResult;
  }
  
  public Type expectedTypeOf(final Expr e) {
    Type _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      Type _switchResult = null;
      boolean _matched = false;
      if (c instanceof If) {
        EReference _if_Condition = this.ep.getIf_Condition();
        boolean _equals = Objects.equal(f, _if_Condition);
        if (_equals) {
          _matched=true;
          _switchResult = PapljTypeProvider.BoolT;
        }
      }
      if (!_matched) {
        if (c instanceof Assignment) {
          EReference _assignment_Value = this.ep.getAssignment_Value();
          boolean _equals = Objects.equal(f, _assignment_Value);
          if (_equals) {
            _matched=true;
            _switchResult = this.typeOf(((Assignment)c).getLeft());
          }
        }
      }
      if (!_matched) {
        if (c instanceof Method) {
          EReference _method_Body = this.ep.getMethod_Body();
          boolean _equals = Objects.equal(f, _method_Body);
          if (_equals) {
            _matched=true;
            _switchResult = ((Method)c).getType();
          }
        }
      }
      if (!_matched) {
        if (c instanceof MemberRef) {
          EReference _memberRef_Args = this.ep.getMemberRef_Args();
          boolean _equals = Objects.equal(f, _memberRef_Args);
          if (_equals) {
            _matched=true;
            Type _xtrycatchfinallyexpression = null;
            try {
              Member _member = ((MemberRef)c).getMember();
              _xtrycatchfinallyexpression = ((Method) _member).getParams().get(((MemberRef)c).getArgs().indexOf(e)).getType();
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                final Throwable t = (Throwable)_t;
                _xtrycatchfinallyexpression = null;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _switchResult = _xtrycatchfinallyexpression;
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  /**
   * Determines whether the specified type is a primitive type.
   */
  public boolean isPrimitive(final Type t) {
    Resource _eResource = t.eResource();
    return (_eResource == null);
  }
}
