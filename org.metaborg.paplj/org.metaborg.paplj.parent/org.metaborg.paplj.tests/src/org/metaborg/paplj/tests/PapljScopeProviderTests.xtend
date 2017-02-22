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
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import java.util.List
import static extension org.junit.Assert.*
import static extension org.metaborg.paplj.PapljModelUtil.*
import com.google.common.collect.Lists

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PapljInjectorProvider))
class PapljScopeProviderTests {
	
	@Inject extension ParseHelper<Program>
	@Inject extension ValidationTestHelper
	@Inject extension IScopeProvider
	
	val ep = PapljPackage::eINSTANCE
	
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	@Test def void testImports() {
		val first = '''
		program first;
		
		class C1 { }
		class C2 { }
		'''.parse
		
		'''
		program second;
		
		class D1 { }
		class D2 { }
		'''.parse(first.eResource.resourceSet)
		
		'''
		program third;
		
		import first.C1;
		import second.*;
		
		class E extends C1 {	// C1 explicitly imported
			first.C2 c			// C2 fully qualified
			D1 d1				// D1 imported through wildcard
			D2 d2				// D2 imported through wildcard
		}
		'''.parse(first.eResource.resourceSet)
			.assertNoErrors
	}
	
	@Test def void testScopeProvider() {
		'''
		class C {
			A f;
			A m (A p) {
				let A v = null in
					null
			}
		}
		class A { }
		'''.parse.classes.head.methods.last.body.exprs.last.asLet.expr => [
			assertScope(ep.memberRef_Member, #['f', 'm', 'C.f', 'C.m'])
		]
	}
	
	private def void assertScope(EObject context, EReference reference, Iterable<String> expected) {
		context.assertNoErrors
		expected.assertEquals(Lists.newArrayList(context.getScope(reference).allElements.map[name.toString]))
	}
}