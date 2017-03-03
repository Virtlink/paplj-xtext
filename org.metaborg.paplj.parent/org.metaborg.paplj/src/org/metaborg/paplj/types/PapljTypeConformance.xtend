package org.metaborg.paplj.types

import static extension org.metaborg.paplj.PapljModelUtil.*;
import org.metaborg.paplj.paplj.*
import com.google.inject.Inject
import org.metaborg.paplj.lib.PapljLib
import org.eclipse.xtext.naming.IQualifiedNameProvider

class PapljTypeConformance {
	
	@Inject extension IQualifiedNameProvider
	@Inject extension PapljTypeProvider
	
	def boolean isSubclassOf(Type c, Type ancestor) {
		c.ancestors.contains(ancestor)
	}
	
	def isConformant(Type from, Type to) {
		from == PapljTypeProvider.NullT ||
		from == to ||
		isConformantLibraryType(from, to) ||
		to.fullyQualifiedName.toString == PapljLib::LIB_ANY ||
		from.isSubclassOf(to)
	}
	
	def isConformantLibraryType(Type c1, Type c2) {
		(c1.isNum && c2.isNum) ||
		(c1.isBool && c2.isBool) ||
		(c1.isAny && c2.isAny)
	}
}