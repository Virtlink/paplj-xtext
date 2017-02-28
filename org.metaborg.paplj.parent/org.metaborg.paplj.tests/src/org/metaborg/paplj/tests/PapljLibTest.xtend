package org.metaborg.paplj.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.metaborg.paplj.paplj.*
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Provider
import org.junit.Test
import org.metaborg.paplj.lib.PapljLib

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PapljInjectorProvider))
class PapljLibTest {
	
	@Inject extension ParseHelper<Program>
	@Inject extension ValidationTestHelper
	@Inject extension PapljLib
	
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	@Test def void testImplicitImports() {
		'''
		program test;
		
		class C {
			Bool b				// paplj.lang.Bool implicitly imported
			Num n				// paplj.lang.Num implicitly imported
		}
		'''.loadLibAndParse
			.assertNoErrors
	}
	
	def void testLibHadNoErrors() {
		loadLibrary
	}
	
	def private loadLibAndParse(CharSequence p) {
		p.parse(loadLibrary)
	}
	
	def private loadLibrary() {
		loadLib => [
			resources.forEach [contents.get(0).assertNoErrors]
		]
	}
}