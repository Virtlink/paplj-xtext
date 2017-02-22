package org.metaborg.paplj.tests

import org.metaborg.paplj.types.PapljTypeProvider
import org.metaborg.paplj.types.PapljTypeConformance
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import com.google.inject.Inject
import org.junit.runner.RunWith
import org.metaborg.paplj.paplj.*
import static extension org.junit.Assert.*
import static extension org.metaborg.paplj.PapljModelUtil.*
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PapljInjectorProvider))
class PapljTypeConformanceTests {
	
	@Inject extension ParseHelper<Program>
	@Inject extension PapljTypeConformance
	@Inject extension PapljTypeProvider
	
	@Test def void testClassConformance() {
		'''
		class A { }
		class B extends A { }
		class C { }
		'''.parse.classes => [
			// Class A is conformant to itself
			get(0).isConformant(get(0)).assertTrue
			// Class B is a subclass of A
			get(1).isConformant(get(0)).assertTrue
			// Class C is not a subclass of A
			get(2).isConformant(get(0)).assertFalse
		]
	}
	
	@Test def void testNullConformance() {
		'''
		class C { }
		class D {
			C m() { null }
		}'''.parse.classes => [
			val typeOfNull = last.methods.head.body.exprs.last.typeOf
			// Null is assignable to any class.
			typeOfNull.isConformant(get(0)).assertTrue
			typeOfNull.isConformant(get(1)).assertTrue
		]
	}
}