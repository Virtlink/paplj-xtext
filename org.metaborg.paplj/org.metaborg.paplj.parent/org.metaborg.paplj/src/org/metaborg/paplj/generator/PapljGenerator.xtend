package org.metaborg.paplj.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.metaborg.paplj.paplj.*
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import static extension org.metaborg.paplj.PapljModelUtil.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PapljGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// Each PAPLJ class should yield a Java file. 
		for (t : resource.allContents.toIterable.filter(Type)) {
			fsa.generateFile(
				t.fullyQualifiedName.toString("/") + ".java",
				t.compileType)
		}
		// The `run` PAPLJ statement should yield a main Java file.
		// TODO
	}
	
	def compileType(Type t) '''
		«IF t.eContainer.fullyQualifiedName !== null»
			package «t.eContainer.fullyQualifiedName»;
		«ENDIF»
		
		public class «t.name» «IF t.superType !== null
				»extends «t.superType.fullyQualifiedName» «ENDIF»{
			
			«FOR f : t.fields»
				«f.compileField»
			«ENDFOR»
			
			«FOR m : t.methods»
				«m.compileMethod»
			«ENDFOR»
		}
	'''
	
	def compileField(Field f) '''
	public «f.type.fullyQualifiedName» «f.name»;
	'''
	
	def compileMethod(Method m) '''
	public «m.type.fullyQualifiedName» «m.name»(«FOR p : m.params SEPARATOR ', '»«p.compileParam»«ENDFOR»)
	«compileBlock(m.body)»
	'''
	
	def compileParam(Param p) '''«p.type.fullyQualifiedName» «p.name»'''
	
	def compileBinding(Binding b) '''«b.type.fullyQualifiedName» «b.name» = «b.value.compileExpr»;'''
	
	def compileBlock(Block2 b) '''{
		«FOR e : b.exprs»
			«e.compileExpr»
		«ENDFOR»
	}
	'''

	// FIXME: This is not correct for expressions.
	def dispatch compileExpr(If e) '''
	if («e.condition.compileExpr»)
		«e.onTrue.compileExpr»
	else
		«e.onFalse.compileExpr»
	'''
	// FIXME: This is not correct for expressions.
	def dispatch compileExpr(Let e) '''
	{
		«FOR b : e.bindings»
			«b.compileBinding»
		«ENDFOR»
		«e.expr.compileExpr»
	}
	'''
	def dispatch compileExpr(Assignment a) '''
	«a.member.fullyQualifiedName» = «a.value.compileExpr»;
	'''
	def dispatch compileExpr(MemberRef r) '''
	«r.member.fullyQualifiedName»«IF r.methodInvocation»(«FOR a : r.args SEPARATOR ', '»«a.compileExpr»«ENDFOR»)«ENDIF»
	'''
	def dispatch compileExpr(Or e) '''
	(«e.left.compileExpr» || «e.right.compileExpr»)
	'''
	def dispatch compileExpr(And e) '''
	(«e.left.compileExpr» && «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Eq e) '''
	(«e.left.compileExpr» == «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Neq e) '''
	(«e.left.compileExpr» != «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Lt e) '''
	(«e.left.compileExpr» < «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Add e) '''
	(«e.left.compileExpr» + «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Sub e) '''
	(«e.left.compileExpr» - «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Mul e) '''
	(«e.left.compileExpr» * «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Div e) '''
	(«e.left.compileExpr» / «e.right.compileExpr»)
	'''
	def dispatch compileExpr(Cast e) '''
	((«e.type.fullyQualifiedName»)«e.left.compileExpr»)
	'''
	def dispatch compileExpr(Not e) '''
	(!«e.expr.compileExpr»)
	'''
	def dispatch compileExpr(Min e) '''
	(-«e.expr.compileExpr»)
	'''
	def dispatch compileExpr(Num e) '''
	«e.value»
	'''
	def dispatch compileExpr(Bool e) '''
	«IF e.^true»true«ELSE»false«ENDIF»
	'''
	def dispatch compileExpr(This e) '''
	this
	'''
	def dispatch compileExpr(Null e) '''
	((«e.type.fullyQualifiedName»)null)
	'''
	def dispatch compileExpr(New e) '''
	(new «e.type.fullyQualifiedName»())
	'''
	def dispatch compileExpr(Var e) '''
	«e.member.fullyQualifiedName»«IF e.methodInvocation»(«FOR a : e.args SEPARATOR ', '»«a.compileExpr»«ENDFOR»)«ENDIF»
	'''
}
