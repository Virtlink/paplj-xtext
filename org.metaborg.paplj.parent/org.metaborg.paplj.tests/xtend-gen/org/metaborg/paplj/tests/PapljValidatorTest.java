package org.metaborg.paplj.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.metaborg.paplj.lib.PapljLib;
import org.metaborg.paplj.paplj.PapljPackage;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.tests.PapljInjectorProvider;
import org.metaborg.paplj.validation.PapljValidator;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private PapljLib _papljLib;
  
  @Test
  public void assertReturnTypeIncompatible() {
    this.assertIncompatibleTypes("new F()", PapljPackage.eINSTANCE.getBlock2(), "R", "F");
  }
  
  @Test
  public void assertArgumentTypesIncompatible() {
    final Procedure1<String> _function = (String it) -> {
      this.assertIncompatibleTypes(it, PapljPackage.eINSTANCE.getNew(), "P1", "F");
      this.assertIncompatibleTypes(it, PapljPackage.eINSTANCE.getNew(), "P2", "V");
    };
    ObjectExtensions.<String>operator_doubleArrow(
      "this.n(new F(), new V()); null", _function);
  }
  
  public void assertIncompatibleTypes(final CharSequence methodBody, final EClass c, final String expectedType, final String actualType) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class F {}");
      _builder.newLine();
      _builder.append("class R {}");
      _builder.newLine();
      _builder.append("class P {}");
      _builder.newLine();
      _builder.append("class P1 {}");
      _builder.newLine();
      _builder.append("class P2 {}");
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("F f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R n(P1 p1, P2 p2) { null }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(methodBody, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), c, PapljValidator.INCOMPATIBLE_TYPES);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
