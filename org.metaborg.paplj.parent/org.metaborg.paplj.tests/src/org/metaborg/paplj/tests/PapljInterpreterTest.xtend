package org.metaborg.paplj.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.metaborg.paplj.paplj.Program
//import org.metaborg.paplj.interpreter.PapljInterpreter
import org.metaborg.paplj.paplj.PapljPackage
import org.metaborg.paplj.interpreter.*
import java.util.Map

//@RunWith(XtextRunner)
@InjectWith(PapljInjectorProvider)
class PapljInterpreterTest {
	
//	@Inject ParseHelper<Program> parseHelper;
//	@Inject PapljInterpreter interpreter;
//	
//	private def eval(String s) {
//		eval(s, new Context())
//	}
//	
//	private def eval(String s, Context context) {
//		val model = parseHelper.parse('''
//			program Test
//
//			run «s»
//		''') as Program
//		interpreter.eval(model, context)
//	}
//
//	@Test 
//	def void trueLiteral() {
//		val result = eval('true')
//		
//		Assert.assertEquals(new BoolV(true), result);
//	}
//
//	@Test 
//	def void falseLiteral() {
//		val result = eval('false')
//		
//		Assert.assertEquals(new BoolV(false), result);
//	}
//
//	@Test 
//	def void notOperator() {
//		val result = eval('!false')
//		
//		Assert.assertEquals(new BoolV(true), result);
//	}
//
//	@Test 
//	def void andOperator() {
//		val result = eval('true && true')
//		
//		Assert.assertEquals(new BoolV(true), result);
//	}
//
//	@Test 
//	def void orOperator() {
//		val result = eval('false || true')
//		
//		Assert.assertEquals(new BoolV(true), result);
//	}
//
//	@Test 
//	def void ifExpression() {
//		val result = eval('if (false) 1 else 2')
//		
//		Assert.assertEquals(new NumV(2), result);
//	}
//
//	@Test 
//	def void doExpression() {
//		val result0 = eval('{ 1; 2; 3 }')
//		Assert.assertEquals(new NumV(3), result0);
//		
//		val result1 = eval('{ 1 }')
//		Assert.assertEquals(new NumV(1), result1);
//		
//		val result2 = eval('{ }')
//		Assert.assertEquals(new UnitV(), result2);
//	}
//
//	@Test 
//	def void numLiteral() {
//		val result = eval('42')
//		
//		Assert.assertEquals(new NumV(42), result);
//	}
//
//	@Test 
//	def void minOperator() {
//		val result = eval('-42')
//		
//		Assert.assertEquals(new NumV(-42), result);
//	}
//
//	@Test 
//	def void addOperator() {
//		val result = eval('42 + 12')
//		
//		Assert.assertEquals(new NumV(54), result);
//	}
//
//	@Test 
//	def void subOperator() {
//		val result = eval('42 - 12')
//		
//		Assert.assertEquals(new NumV(30), result);
//	}
//
//	@Test 
//	def void mulOperator() {
//		val result = eval('42 * 12')
//		
//		Assert.assertEquals(new NumV(504), result);
//	}
//
//	@Test 
//	def void neqOperator() {
//		val result = eval('42 != 12')
//		
//		Assert.assertEquals(new BoolV(true), result);
//	}
//
//	@Test 
//	def void eqOperator() {
//		val result = eval('42 == 12')
//		
//		Assert.assertEquals(new BoolV(false), result);
//	}
//
//	@Test 
//	def void ltOperator() {
//		val result = eval('42 < 12')
//		
//		Assert.assertEquals(new BoolV(false), result);
//	}
//	
//	@Test
//	def void varExpression() {
//		val context = new Context().bindVar('x', new NumV(42))
//		val result = eval('x', context)
//		
//		Assert.assertEquals(new NumV(42), result);
//	}
//	
//	@Test
//	def void letExpression() {
//		val result = eval('let T x = 12 in x + 30')
//		
//		Assert.assertEquals(new NumV(42), result);
//	}
//	
//	@Test
//	def void emptyLetExpression() {
//		val result = eval('let in 42')
//		
//		Assert.assertEquals(new NumV(42), result);
//	}
//	
//	@Test
//	def void letExpressionWithBindingDependencies() {
//		val result = eval('let T x = 12 T y = x + 28 in y + 2')
//		
//		Assert.assertEquals(new NumV(42), result);
//	}
//	
//	
//	
//	
//	
//	@Test
//	def void class02() {
//		val result = eval('
//program class02
//
//class Z {
//	Num count() { 0 }
//}
//
//class A extends Z {
//	Num count() { 1 }
//} 
//
//class B extends A {
//	Num count() { 2 } 
//}
//
//class C extends A {
//	Num count() { 3; }	
//}
// 
//run let 
//  B b = new B()
//  C c = new C()
//  A a = new A()
//  Z z = new Z()
// in 
//   (if (true)
//     if (true) b else c 
//   else z).count() 
// 
//')
//		
//		Assert.assertEquals(new NumV(2), result);
//	}
}