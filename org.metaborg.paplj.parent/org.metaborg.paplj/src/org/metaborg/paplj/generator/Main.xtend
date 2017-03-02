package org.metaborg.paplj.generator

import org.metaborg.paplj.PapljStandaloneSetupGenerated
import com.google.inject.Inject
import org.eclipse.xtext.validation.IResourceValidator
import org.metaborg.paplj.lib.PapljLib
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.util.CancelIndicator

class Main {
	
	@Inject IResourceValidator validator
	@Inject PapljLib papljLib
	
	def static main(String[] args) {
		if (args.empty) {
			System::err.println('ERROR: Provide one or more PAPLJ files.')
			return
		}
		
		val injector = new PapljStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		injector.getInstance(typeof(Main)).run(args)
	}

	def protected run(String[] files) {
		// Load the library.
		val resourceSet = papljLib.loadLib
		// Load each of the input files.
		files.forEach[f | resourceSet.getResource(URI::createURI(f), true)]
		
		// Validate all resources in the set.
		var success = true
		for (resource : resourceSet.resources) {
			System::out.println("Checking " + resource.URI + "...")
			
			val issues = validator.validate(resource, CheckMode::ALL, CancelIndicator::NullImpl)
			if (!issues.isEmpty()) {
				// Issues found.
				for (issue : issues) {
					System::err.println(issue)
				}
				success = false
			}
		}
		
		if (success)
			System::out.println('All resources validated.')
	}	
}
