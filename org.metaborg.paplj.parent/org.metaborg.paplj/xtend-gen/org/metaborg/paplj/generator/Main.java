package org.metaborg.paplj.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.metaborg.paplj.PapljStandaloneSetupGenerated;
import org.metaborg.paplj.lib.PapljLib;

@SuppressWarnings("all")
public class Main {
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private PapljLib papljLib;
  
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      System.err.println("ERROR: Provide one or more PAPLJ files.");
      return;
    }
    final Injector injector = new PapljStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
    injector.<Main>getInstance(Main.class).run(args);
  }
  
  protected void run(final String[] files) {
    final ResourceSet resourceSet = this.papljLib.loadLib();
    final Consumer<String> _function = (String f) -> {
      resourceSet.getResource(URI.createURI(f), true);
    };
    ((List<String>)Conversions.doWrapArray(files)).forEach(_function);
    boolean success = true;
    EList<Resource> _resources = resourceSet.getResources();
    for (final Resource resource : _resources) {
      {
        URI _uRI = resource.getURI();
        String _plus = ("Checking " + _uRI);
        String _plus_1 = (_plus + "...");
        System.out.println(_plus_1);
        final List<Issue> issues = this.validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
        boolean _isEmpty = issues.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          for (final Issue issue : issues) {
            System.err.println(issue);
          }
          success = false;
        }
      }
    }
    if (success) {
      System.out.println("All resources validated.");
    }
  }
}
