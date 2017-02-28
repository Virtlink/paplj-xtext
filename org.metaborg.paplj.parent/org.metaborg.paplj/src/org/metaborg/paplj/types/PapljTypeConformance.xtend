package org.metaborg.paplj.types

import static extension org.metaborg.paplj.PapljModelUtil.*;
import org.metaborg.paplj.paplj.*
import com.google.inject.Inject

class PapljTypeConformance {
	
	def isSubclassOf(Type c, Type ancestor) {
		c.ancestors.contains(ancestor)
	}
	
	def isConformant(Type c1, Type c2) {
		c1 == PapljTypeProvider.NullT ||
		c1 == c2 ||
		c1.isSubclassOf(c2)
	}
}