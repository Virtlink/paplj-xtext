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
import static extension org.metaborg.paplj.PapljModelUtil.*

//import org.metaborg.paplj.types.BoolType

@RunWith(XtextRunner)
@InjectWith(PapljInjectorProvider)
class PapljTypeProviderTest {
	
	@Inject extension ParseHelper<Program>
	@Inject extension PapljTypeProvider
	
	def assertType(CharSequence input, String expectedTypeName) {
		expectedTypeName.assertEquals('''
			program Test

			class L {}
			class M {}
			class N {}
			class P extends R {
				M m
				R r() { null R }
			}
			class R { V v }
			class V extends R { N n }
			class C extends R {
				L l
				R m(P p) {
					«input»;
					null R
				}
			}

			run true
		'''.parse.classes.last.methods.last.body.exprs.get(0).typeOf.name)
	}
	
	@Test def void orExpr()               { "true || false".assertBoolType }
	@Test def void andExpr()              { "true && false".assertBoolType }
	@Test def void eqExpr()               { "10 == 5"      .assertBoolType }
	@Test def void neqExpr()              { "10 != 5"      .assertBoolType }
	@Test def void ltExpr()               { "10 < 5"       .assertBoolType }
	@Test def void addExpr()              { "10 + 5"       .assertNumType }
	@Test def void subExpr()              { "10 - 5"       .assertNumType }
	@Test def void mulExpr()              { "10 * 5"       .assertNumType }
	@Test def void divExpr()              { "10 / 5"       .assertNumType }
	@Test def void notExpr()              { "!true"        .assertBoolType }
	@Test def void minExpr()              { "-10"          .assertNumType }
	@Test def void numLiteral()           { "10"           .assertNumType }
	@Test def void boolLiteral()          { "true"         .assertBoolType }
	@Test def void thisExpr()             { "this"         .assertType("C") }
	@Test def void paramRefExpr()         { "p"            .assertType("P") }
	@Test def void thisFieldRefExpr()     { "this.l"       .assertType("L") }
	@Test def void remoteFieldRefExpr()   { "p.m"          .assertType("M") }
	@Test def void ancestorFieldRefExpr() { "this.v"       .assertType("V") }
	@Test def void methodCallExpr()       { "p.r()"        .assertType("R") }
	@Test def void nullExpr()             { "null"         .assertType("Null") }
	
	def assertNumType(CharSequence input) {
		input.assertType(PapljTypeProvider.NumT.name)
	}
	
	def assertBoolType(CharSequence input) {
		input.assertType(PapljTypeProvider.BoolT.name)
	}
	
}