package org.metaborg.paplj.types;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.metaborg.paplj.lib.PapljLib;
import org.metaborg.paplj.paplj.Add;
import org.metaborg.paplj.paplj.And;
import org.metaborg.paplj.paplj.Assignment;
import org.metaborg.paplj.paplj.Binding;
import org.metaborg.paplj.paplj.Block2;
import org.metaborg.paplj.paplj.Bool;
import org.metaborg.paplj.paplj.Cast;
import org.metaborg.paplj.paplj.Div;
import org.metaborg.paplj.paplj.Eq;
import org.metaborg.paplj.paplj.Expr;
import org.metaborg.paplj.paplj.Field;
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
import org.metaborg.paplj.paplj.Param;
import org.metaborg.paplj.paplj.Sub;
import org.metaborg.paplj.paplj.Symbol;
import org.metaborg.paplj.paplj.This;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.paplj.Var;
import org.metaborg.paplj.types.PapljTypeConformance;

/**
 * Determines the type of an expression.
 */
@SuppressWarnings("all")
public class PapljTypeProvider {
  @Inject
  @Extension
  private PapljLib _papljLib;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private PapljTypeConformance _papljTypeConformance;
  
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
      if (e instanceof Cast) {
        _matched=true;
        _switchResult = ((Cast)e).getType();
      }
    }
    if (!_matched) {
      if (e instanceof Block2) {
        _matched=true;
        _switchResult = this.typeOf(IterableExtensions.<Expr>last(((Block2)e).getExprs()));
      }
    }
    if (!_matched) {
      if (e instanceof If) {
        _matched=true;
        _switchResult = this.commonAncestorOf(this.typeOf(((If)e).getOnTrue()), this.typeOf(((If)e).getOnFalse()));
      }
    }
    return _switchResult;
  }
  
  public Type getSuperTypeOrAny(final Type t) {
    Type _elvis = null;
    Type _superType = t.getSuperType();
    if (_superType != null) {
      _elvis = _superType;
    } else {
      Type _papljAnyType = this._papljLib.getPapljAnyType(t);
      _elvis = _papljAnyType;
    }
    return _elvis;
  }
  
  public Type commonAncestorOf(final Type t1, final Type t2) {
    Type _xblockexpression = null;
    {
      ArrayList<Type> _ancestorsWithAny = this._papljLib.ancestorsWithAny(t1);
      List<Type> candidates = IterableExtensions.<Type>toList(Iterables.<Type>concat(Collections.<Type>unmodifiableList(CollectionLiterals.<Type>newArrayList(t1)), _ancestorsWithAny));
      final Function1<Type, Boolean> _function = (Type c) -> {
        return Boolean.valueOf(this._papljTypeConformance.isConformant(t2, c));
      };
      Type type = IterableExtensions.<Type>findFirst(candidates, _function);
      Type _elvis = null;
      if (type != null) {
        _elvis = type;
      } else {
        Type _papljAnyType = this._papljLib.getPapljAnyType(t1);
        _elvis = _papljAnyType;
      }
      _xblockexpression = _elvis;
    }
    return _xblockexpression;
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
      if (!_matched) {
        if (c instanceof Binding) {
          EReference _binding_Value = this.ep.getBinding_Value();
          boolean _equals = Objects.equal(f, _binding_Value);
          if (_equals) {
            _matched=true;
            _switchResult = ((Binding)c).getType();
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
  
  public boolean isNum(final Type c) {
    return (Objects.equal(c, PapljTypeProvider.NumT) || 
      Objects.equal(this._iQualifiedNameProvider.getFullyQualifiedName(c).toString(), PapljLib.LIB_NUM));
  }
  
  public boolean isBool(final Type c) {
    return (Objects.equal(c, PapljTypeProvider.BoolT) || 
      Objects.equal(this._iQualifiedNameProvider.getFullyQualifiedName(c).toString(), PapljLib.LIB_BOOL));
  }
  
  public boolean isAny(final Type c) {
    return (Objects.equal(c, PapljTypeProvider.AnyT) || 
      Objects.equal(this._iQualifiedNameProvider.getFullyQualifiedName(c).toString(), PapljLib.LIB_ANY));
  }
  
  public CharSequence memberAsString(final Member member) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (member instanceof Field) {
      _matched=true;
      _switchResult = ((Field)member).getName();
    }
    if (!_matched) {
      if (member instanceof Method) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _name = ((Method)member).getName();
        _builder.append(_name);
        _builder.append("(");
        String _paramsTypesAsString = this.paramsTypesAsString(((Method)member));
        _builder.append(_paramsTypesAsString);
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public String paramsTypesAsString(final Method method) {
    final Function1<Param, String> _function = (Param it) -> {
      Type _type = it.getType();
      String _name = null;
      if (_type!=null) {
        _name=_type.getName();
      }
      return _name;
    };
    return IterableExtensions.join(ListExtensions.<Param, String>map(method.getParams(), _function), ", ");
  }
  
  public CharSequence memberAsStringWithType(final Member member) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _memberAsString = this.memberAsString(member);
    _builder.append(_memberAsString);
    _builder.append(" : ");
    String _name = member.getType().getName();
    _builder.append(_name);
    return _builder;
  }
  
  public String argsTypesAsStrings(final MemberRef ref) {
    final Function1<Expr, String> _function = (Expr it) -> {
      Type _typeOf = this.typeOf(it);
      String _name = null;
      if (_typeOf!=null) {
        _name=_typeOf.getName();
      }
      return _name;
    };
    String _join = IterableExtensions.join(ListExtensions.<Expr, String>map(ref.getArgs(), _function), ", ");
    String _plus = ("(" + _join);
    return (_plus + ")");
  }
}
