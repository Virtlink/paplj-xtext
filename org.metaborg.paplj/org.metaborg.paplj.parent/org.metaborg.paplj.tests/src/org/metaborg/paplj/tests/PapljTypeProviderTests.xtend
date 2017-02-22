package org.metaborg.paplj.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import com.google.inject.Inject
import org.metaborg.paplj.paplj.Program
//import org.metaborg.paplj.types.PapljType
//import org.metaborg.paplj.types.NumType
import org.junit.Test
import static extension org.junit.Assert.*
import org.metaborg.paplj.types.PapljTypeProvider
import org.metaborg.paplj.paplj.Type

//import org.metaborg.paplj.types.BoolType

@RunWith(XtextRunner)
@InjectWith(PapljInjectorProvider)
class PapljTypeProviderTests {
	
	@Inject extension ParseHelper<Program>
	@Inject extension PapljTypeProvider
	
	@Test def void orExpr() { "true || false".assertBoolType }
	@Test def void andExpr() { "true && false".assertBoolType }
	@Test def void eqExpr() { "10 == 5".assertBoolType }
	@Test def void neqExpr() { "10 != 5".assertBoolType }
	@Test def void ltExpr() { "10 < 5".assertBoolType }
	@Test def void addExpr() { "10 + 5".assertNumType }
	@Test def void subExpr() { "10 - 5".assertNumType }
	@Test def void mulExpr() { "10 * 5".assertNumType }
	@Test def void divExpr() { "10 / 5".assertNumType }
	@Test def void notExpr() { "!true".assertBoolType }
	@Test def void minExpr() { "-10".assertNumType }
	@Test def void numLiteral() { "10".assertNumType }
	@Test def void boolLiteral() { "true".assertBoolType }
	
	def assertNumType(CharSequence input) {
		input.assertType(PapljTypeProvider.NumT)
	}
	
	def assertBoolType(CharSequence input) {
		input.assertType(PapljTypeProvider.BoolT)
	}
	
	def assertType(CharSequence input, Type expectedType) {
		expectedType.assertSame('''
			program Test

			run «input»
		'''.parse.expr.typeOf)
	}
	
}