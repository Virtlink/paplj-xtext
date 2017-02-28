package org.metaborg.paplj.tests;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.metaborg.paplj.PapljIndex;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.tests.PapljInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljIndexTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private PapljIndex _papljIndex;
  
  @Test
  public void testExportedDescriptions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("program Test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A field");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A method(A param) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("10");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("run");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("10");
      _builder.newLine();
      final Program program = this._parseHelper.parse(_builder);
      final Function1<IEObjectDescription, String> _function = (IEObjectDescription it) -> {
        return it.getQualifiedName().toString();
      };
      final ArrayList<String> result = Lists.<String>newArrayList(IterableExtensions.<IEObjectDescription, String>map(this._papljIndex.getExportedDescriptions(program), _function));
      Assert.assertEquals(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Test", "Test.A", "Test.C", "Test.C.field", "Test.C.method", "Test.C.method.param")), result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
