package org.metaborg.paplj.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.metaborg.paplj.PapljModelUtil;
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
import org.metaborg.paplj.paplj.Let;
import org.metaborg.paplj.paplj.Lt;
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
import org.metaborg.paplj.paplj.Param;
import org.metaborg.paplj.paplj.Sub;
import org.metaborg.paplj.paplj.This;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.paplj.Var;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PapljGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Type> _filter = Iterables.<Type>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Type.class);
    for (final Type t : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(t).toString("/");
      String _plus = (_string + ".java");
      fsa.generateFile(_plus, 
        this.compileType(t));
    }
  }
  
  public CharSequence compileType(final Type t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(t.eContainer());
      boolean _tripleNotEquals = (_fullyQualifiedName != null);
      if (_tripleNotEquals) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(t.eContainer());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      Type _superType = t.getSuperType();
      boolean _tripleNotEquals_1 = (_superType != null);
      if (_tripleNotEquals_1) {
        _builder.append("extends ");
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(t.getSuperType());
        _builder.append(_fullyQualifiedName_2);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<Field> _fields = PapljModelUtil.fields(t);
      for(final Field f : _fields) {
        _builder.append("\t");
        CharSequence _compileField = this.compileField(f);
        _builder.append(_compileField, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<Method> _methods = PapljModelUtil.methods(t);
      for(final Method m : _methods) {
        _builder.append("\t");
        CharSequence _compileMethod = this.compileMethod(m);
        _builder.append(_compileMethod, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileField(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(f.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(" ");
    String _name = f.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileMethod(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(m.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(" ");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Param> _params = m.getParams();
      boolean _hasElements = false;
      for(final Param p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _compileParam = this.compileParam(p);
        _builder.append(_compileParam);
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    CharSequence _compileBlock = this.compileBlock(m.getBody());
    _builder.append(_compileBlock);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileParam(final Param p) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(p.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(" ");
    String _name = p.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public CharSequence compileBinding(final Binding b) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(b.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(" ");
    String _name = b.getName();
    _builder.append(_name);
    _builder.append(" = ");
    Object _compileExpr = this.compileExpr(b.getValue());
    _builder.append(_compileExpr);
    _builder.append(";");
    return _builder;
  }
  
  public CharSequence compileBlock(final Block2 b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Expr> _exprs = b.getExprs();
      for(final Expr e : _exprs) {
        _builder.append("\t");
        CharSequence _compileExpr = this.compileExpr(e);
        _builder.append(_compileExpr, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileExpr(final If e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getCondition());
    _builder.append(_compileExpr);
    _builder.append(" ? ");
    Object _compileExpr_1 = this.compileExpr(e.getOnTrue());
    _builder.append(_compileExpr_1);
    _builder.append(" : ");
    Object _compileExpr_2 = this.compileExpr(e.getOnFalse());
    _builder.append(_compileExpr_2);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Let e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Binding> _bindings = e.getBindings();
      for(final Binding b : _bindings) {
        _builder.append("\t");
        CharSequence _compileBinding = this.compileBinding(b);
        _builder.append(_compileBinding, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    Object _compileExpr = this.compileExpr(e.getExpr());
    _builder.append(_compileExpr, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Assignment a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(a.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" = ");
    Object _compileExpr_1 = this.compileExpr(a.getValue());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final MemberRef r) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(r.getMember());
    _builder.append(_fullyQualifiedName);
    {
      boolean _isMethodInvocation = r.isMethodInvocation();
      if (_isMethodInvocation) {
        _builder.append("(");
        {
          EList<Expr> _args = r.getArgs();
          boolean _hasElements = false;
          for(final Expr a : _args) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            Object _compileExpr = this.compileExpr(a);
            _builder.append(_compileExpr);
          }
        }
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Or e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" || ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final And e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" && ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Eq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" == ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Neq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" != ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Lt e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" < ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Add e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" + ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Sub e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" - ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Mul e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" * ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Div e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(" / ");
    Object _compileExpr_1 = this.compileExpr(e.getRight());
    _builder.append(_compileExpr_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Cast e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(")");
    Object _compileExpr = this.compileExpr(e.getLeft());
    _builder.append(_compileExpr);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Not e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(!");
    Object _compileExpr = this.compileExpr(e.getExpr());
    _builder.append(_compileExpr);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Min e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(-");
    Object _compileExpr = this.compileExpr(e.getExpr());
    _builder.append(_compileExpr);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Num e) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = e.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Bool e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isTrue = e.isTrue();
      if (_isTrue) {
        _builder.append("true");
      } else {
        _builder.append("false");
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileExpr(final This e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Null e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append(")null)");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final New e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(new ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getType());
    _builder.append(_fullyQualifiedName);
    _builder.append("())");
    return _builder;
  }
  
  protected CharSequence _compileExpr(final Var e) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getMember());
    _builder.append(_fullyQualifiedName);
    {
      boolean _isMethodInvocation = e.isMethodInvocation();
      if (_isMethodInvocation) {
        _builder.append("(");
        {
          EList<Expr> _args = e.getArgs();
          boolean _hasElements = false;
          for(final Expr a : _args) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            Object _compileExpr = this.compileExpr(a);
            _builder.append(_compileExpr);
          }
        }
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  public CharSequence compileExpr(final Expr e) {
    if (e instanceof Add) {
      return _compileExpr((Add)e);
    } else if (e instanceof And) {
      return _compileExpr((And)e);
    } else if (e instanceof Assignment) {
      return _compileExpr((Assignment)e);
    } else if (e instanceof Bool) {
      return _compileExpr((Bool)e);
    } else if (e instanceof Cast) {
      return _compileExpr((Cast)e);
    } else if (e instanceof Div) {
      return _compileExpr((Div)e);
    } else if (e instanceof Eq) {
      return _compileExpr((Eq)e);
    } else if (e instanceof If) {
      return _compileExpr((If)e);
    } else if (e instanceof Let) {
      return _compileExpr((Let)e);
    } else if (e instanceof Lt) {
      return _compileExpr((Lt)e);
    } else if (e instanceof MemberRef) {
      return _compileExpr((MemberRef)e);
    } else if (e instanceof Min) {
      return _compileExpr((Min)e);
    } else if (e instanceof Mul) {
      return _compileExpr((Mul)e);
    } else if (e instanceof Neq) {
      return _compileExpr((Neq)e);
    } else if (e instanceof New) {
      return _compileExpr((New)e);
    } else if (e instanceof Not) {
      return _compileExpr((Not)e);
    } else if (e instanceof Null) {
      return _compileExpr((Null)e);
    } else if (e instanceof Num) {
      return _compileExpr((Num)e);
    } else if (e instanceof Or) {
      return _compileExpr((Or)e);
    } else if (e instanceof Sub) {
      return _compileExpr((Sub)e);
    } else if (e instanceof This) {
      return _compileExpr((This)e);
    } else if (e instanceof Var) {
      return _compileExpr((Var)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
