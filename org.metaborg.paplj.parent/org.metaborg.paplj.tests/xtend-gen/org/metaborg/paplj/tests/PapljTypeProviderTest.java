package org.metaborg.paplj.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.paplj.Method;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.tests.PapljInjectorProvider;
import org.metaborg.paplj.types.PapljTypeProvider;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljTypeProviderTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private PapljTypeProvider _papljTypeProvider;
  
  public void assertType(final CharSequence input, final String expectedTypeName) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("program Test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class L {}");
      _builder.newLine();
      _builder.append("class M {}");
      _builder.newLine();
      _builder.append("class N {}");
      _builder.newLine();
      _builder.append("class P extends R {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("M m");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R r() { null R }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class R { V v }");
      _builder.newLine();
      _builder.append("class V extends R { N n }");
      _builder.newLine();
      _builder.append("class C extends R {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("L l");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("R m(P p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(input, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("null R");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("run true");
      _builder.newLine();
      Assert.assertEquals(expectedTypeName, this._papljTypeProvider.typeOf(IterableExtensions.<Method>last(PapljModelUtil.methods(IterableExtensions.<Type>last(this._parseHelper.parse(_builder).getClasses()))).getBody().getExprs().get(0)).getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void orExpr() {
    this.assertBoolType("true || false");
  }
  
  @Test
  public void andExpr() {
    this.assertBoolType("true && false");
  }
  
  @Test
  public void eqExpr() {
    this.assertBoolType("10 == 5");
  }
  
  @Test
  public void neqExpr() {
    this.assertBoolType("10 != 5");
  }
  
  @Test
  public void ltExpr() {
    this.assertBoolType("10 < 5");
  }
  
  @Test
  public void addExpr() {
    this.assertNumType("10 + 5");
  }
  
  @Test
  public void subExpr() {
    this.assertNumType("10 - 5");
  }
  
  @Test
  public void mulExpr() {
    this.assertNumType("10 * 5");
  }
  
  @Test
  public void divExpr() {
    this.assertNumType("10 / 5");
  }
  
  @Test
  public void notExpr() {
    this.assertBoolType("!true");
  }
  
  @Test
  public void minExpr() {
    this.assertNumType("-10");
  }
  
  @Test
  public void numLiteral() {
    this.assertNumType("10");
  }
  
  @Test
  public void boolLiteral() {
    this.assertBoolType("true");
  }
  
  @Test
  public void thisExpr() {
    this.assertType("this", "C");
  }
  
  @Test
  public void paramRefExpr() {
    this.assertType("p", "P");
  }
  
  @Test
  public void thisFieldRefExpr() {
    this.assertType("this.l", "L");
  }
  
  @Test
  public void remoteFieldRefExpr() {
    this.assertType("p.m", "M");
  }
  
  @Test
  public void ancestorFieldRefExpr() {
    this.assertType("this.v", "V");
  }
  
  @Test
  public void methodCallExpr() {
    this.assertType("p.r()", "R");
  }
  
  @Test
  public void nullExpr() {
    this.assertType("null", "Null");
  }
  
  public void assertNumType(final CharSequence input) {
    this.assertType(input, PapljTypeProvider.NumT.getName());
  }
  
  public void assertBoolType(final CharSequence input) {
    this.assertType(input, PapljTypeProvider.BoolT.getName());
  }
}
