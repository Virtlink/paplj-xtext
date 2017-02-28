package org.metaborg.paplj.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import com.google.inject.Inject
import org.metaborg.paplj.paplj.*
import static extension org.junit.Assert.*
import org.metaborg.paplj.PapljIndex
import org.junit.Test
import java.util.List
import java.util.ArrayList
import com.google.common.collect.Lists

@RunWith(XtextRunner)
@InjectWith(PapljInjectorProvider)
class PapljIndexTest {
	
	@Inject extension ParseHelper<Program>;
	@Inject extension PapljIndex;
	
	@Test def void testExportedDescriptions() {
		val program = '''
		program Test
		
		class A {}
		
		class C {
			A field
			
			A method(A param) {
				10
			}
		}
		
		run
			10
		'''.parse
		
		val result = Lists.newArrayList(program.exportedDescriptions.map[qualifiedName.toString])
			
		#['Test', 'Test.A', 'Test.C', 'Test.C.field', 'Test.C.method', 'Test.C.method.param']
		.assertEquals(result)
	}
	
}