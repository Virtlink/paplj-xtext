/*
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PapljStandaloneSetup extends PapljStandaloneSetupGenerated {

	def static void doSetup() {
		new PapljStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}