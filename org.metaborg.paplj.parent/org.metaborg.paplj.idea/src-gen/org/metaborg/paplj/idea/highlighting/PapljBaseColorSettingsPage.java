/*
 * generated by Xtext 2.11.0
 */
package org.metaborg.paplj.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;
import org.metaborg.paplj.idea.lang.PapljLanguage;

public class PapljBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public PapljBaseColorSettingsPage() {
		PapljLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return PapljLanguage.INSTANCE.getDisplayName();
	}
}