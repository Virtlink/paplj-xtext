package org.metaborg.paplj.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.tests.PapljInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(PapljInjectorProvider.class)
@SuppressWarnings("all")
public class PapljLibTest {
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private PapljLib _papljLib;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testImplicitImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("program test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Bool b\t\t\t\t// paplj.lang.Bool implicitly imported");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Num n\t\t\t\t// paplj.lang.Num implicitly imported");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._validationTestHelper.assertNoErrors(this.loadLibAndParse(_builder));
  }
  
  public void testLibHadNoErrors() {
    this.loadLibrary();
  }
  
  private Program loadLibAndParse(final CharSequence p) {
    try {
      return this._parseHelper.parse(p, this.loadLibrary());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ResourceSet loadLibrary() {
    ResourceSet _loadLib = this._papljLib.loadLib();
    final Procedure1<ResourceSet> _function = (ResourceSet it) -> {
      final Consumer<Resource> _function_1 = (Resource it_1) -> {
        this._validationTestHelper.assertNoErrors(it_1.getContents().get(0));
      };
      it.getResources().forEach(_function_1);
    };
    return ObjectExtensions.<ResourceSet>operator_doubleArrow(_loadLib, _function);
  }
}
