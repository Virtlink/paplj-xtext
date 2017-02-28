package org.metaborg.paplj.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.paplj.Expr;
import org.metaborg.paplj.paplj.Method;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.tests.PapljInjectorProvider;
import org.metaborg.paplj.types.PapljTypeConformance;
import org.metaborg.paplj.types.PapljTypeProvider;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljTypeConformanceTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private PapljTypeConformance _papljTypeConformance;
  
  @Inject
  @Extension
  private PapljTypeProvider _papljTypeProvider;
  
  @Test
  public void testClassConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A { }");
      _builder.newLine();
      _builder.append("class B extends A { }");
      _builder.newLine();
      _builder.append("class C { }");
      _builder.newLine();
      EList<Type> _classes = this._parseHelper.parse(_builder).getClasses();
      final Procedure1<EList<Type>> _function = (EList<Type> it) -> {
        Assert.assertTrue(this._papljTypeConformance.isConformant(it.get(0), it.get(0)));
        Assert.assertTrue(this._papljTypeConformance.isConformant(it.get(1), it.get(0)));
        Assert.assertFalse(this._papljTypeConformance.isConformant(it.get(2), it.get(0)));
      };
      ObjectExtensions.<EList<Type>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNullConformance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { }");
      _builder.newLine();
      _builder.append("class D {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { null }");
      _builder.newLine();
      _builder.append("}");
      EList<Type> _classes = this._parseHelper.parse(_builder).getClasses();
      final Procedure1<EList<Type>> _function = (EList<Type> it) -> {
        final Type typeOfNull = this._papljTypeProvider.typeOf(IterableExtensions.<Expr>last(IterableExtensions.<Method>head(PapljModelUtil.methods(IterableExtensions.<Type>last(it))).getBody().getExprs()));
        Assert.assertTrue(this._papljTypeConformance.isConformant(typeOfNull, it.get(0)));
        Assert.assertTrue(this._papljTypeConformance.isConformant(typeOfNull, it.get(1)));
      };
      ObjectExtensions.<EList<Type>>operator_doubleArrow(_classes, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
