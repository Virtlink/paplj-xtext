/*
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.metaborg.paplj.PapljRuntimeModule
import org.metaborg.paplj.PapljStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PapljIdeSetup extends PapljStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PapljRuntimeModule, new PapljIdeModule))
	}
	
}
