package org.metaborg.paplj.tests;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.paplj.Expr;
import org.metaborg.paplj.paplj.Method;
import org.metaborg.paplj.paplj.PapljPackage;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.tests.PapljInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  private final PapljPackage ep = PapljPackage.eINSTANCE;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testImports() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("program first;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C1 { }");
      _builder.newLine();
      _builder.append("class C2 { }");
      _builder.newLine();
      final Program first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("program second;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("class D1 { }");
      _builder_1.newLine();
      _builder_1.append("class D2 { }");
      _builder_1.newLine();
      this._parseHelper.parse(_builder_1, first.eResource().getResourceSet());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("program third;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("import first.C1;");
      _builder_2.newLine();
      _builder_2.append("import second.*;");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("class E extends C1 {\t// C1 explicitly imported");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("first.C2 c\t\t\t// C2 fully qualified");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("D1 d1\t\t\t\t// D1 imported through wildcard");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("D2 d2\t\t\t\t// D2 imported through wildcard");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder_2, first.eResource().getResourceSet()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeProvider() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m (A p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("let A v = null in");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("null");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A { }");
      _builder.newLine();
      Expr _expr = PapljModelUtil.asLet(IterableExtensions.<Expr>last(IterableExtensions.<Method>last(PapljModelUtil.methods(IterableExtensions.<Type>head(this._parseHelper.parse(_builder).getClasses()))).getBody().getExprs())).getExpr();
      final Procedure1<Expr> _function = (Expr it) -> {
        this.assertScope(it, this.ep.getMemberRef_Member(), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("f", "m", "C.f", "C.m")));
        this.assertScope(it, this.ep.getVar_Member(), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("p", "v", "f", "m", "m.p", "m.v", "C.f", "C.m", "C.m.p", "C.m.v")));
      };
      ObjectExtensions.<Expr>operator_doubleArrow(_expr, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertScope(final EObject context, final EReference reference, final Iterable<String> expected) {
    this._validationTestHelper.assertNoErrors(context);
    final Function1<IEObjectDescription, String> _function = (IEObjectDescription it) -> {
      return it.getName().toString();
    };
    Assert.assertEquals(expected, Lists.<String>newArrayList(IterableExtensions.<IEObjectDescription, String>map(this._iScopeProvider.getScope(context, reference).getAllElements(), _function)));
  }
}
