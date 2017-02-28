package org.metaborg.paplj.tests

import org.metaborg.paplj.types.PapljTypeProvider
import org.metaborg.paplj.types.PapljTypeConformance
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import com.google.inject.Inject
import org.junit.runner.RunWith
import org.metaborg.paplj.paplj.*
import static extension org.junit.Assert.*
import org.junit.Test
import org.metaborg.paplj.validation.PapljValidator
import org.eclipse.emf.ecore.EClass
import org.metaborg.paplj.lib.PapljLib

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PapljInjectorProvider))
class PapljValidatorTest {
	
	@Inject extension ParseHelper<Program>
	@Inject extension ValidationTestHelper
	@Inject extension PapljLib
	
	@Test def void assertReturnTypeIncompatible() {
		"new F()".assertIncompatibleTypes(PapljPackage::eINSTANCE.block2, "R", "F")
	}
	
	@Test def void assertArgumentTypesIncompatible() {
		"this.n(new F(), new V()); null" => [
			assertIncompatibleTypes(PapljPackage::eINSTANCE.^new, "P1", "F")
			assertIncompatibleTypes(PapljPackage::eINSTANCE.^new, "P2", "V")
		]
	}
	
	def void assertIncompatibleTypes(CharSequence methodBody, EClass c, String expectedType, String actualType) {
		'''
		class F {}
		class R {}
		class P {}
		class P1 {}
		class P2 {}
		class C {
			F f;
			R n(P1 p1, P2 p2) { null }
			R m(P p) {
				«methodBody»
			}
		}
		'''.parse.assertError(c, PapljValidator::INCOMPATIBLE_TYPES)
	}
}