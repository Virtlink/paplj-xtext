/*
 * generated by Xtext 2.10.0
 */
package org.metaborg.paplj.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import static extension org.junit.Assert.*
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.metaborg.paplj.paplj.*
import static extension org.metaborg.paplj.PapljModelUtil.*

@RunWith(XtextRunner)
@InjectWith(PapljInjectorProvider)
class PapljParsingTests {

	@Inject extension ParseHelper<Program>
	@Inject extension ValidationTestHelper
	
	@Test def void testMemberRefLeftAssociativity() {
		"this.m().m()".assertExprEquals("((this.m()).m())")
	}
	
	@Test def void testAssignmentRightAssociativity() {
		"this.f = this.g = this".assertExprEquals("(this.f = (this.g = this))")
	}

	def private assertExprEquals(CharSequence actual, CharSequence expected) {
		val actualRepr   = wrapInProgram(actual)  .parse.classes.head.methods.head.body.exprs.last.stringRepr
		val expectedRepr = wrapInProgram(expected).parse.classes.head.methods.head.body.exprs.last.stringRepr
		actualRepr.assertNotNull
		expectedRepr.assertNotNull
		expectedRepr.assertEquals(actualRepr)
	}
	
	def private wrapInProgram(CharSequence expr) {
		'''
		class A {
			A f
			A g
			A m() { «expr» }
		}'''
	}

	def private String stringRepr(Expr e) {
		switch (e) {
			MemberRef: '''(«e.left.stringRepr».«e.member.name»«IF e.methodInvocation»(«e.args.join(', ')[ it.stringRepr ]»)«ENDIF»)'''
			Assignment: '''(«e.left.stringRepr».«e.member.name» = «e.value.stringRepr»)'''
			This: "this"
		}
	}
}
