package org.metaborg.paplj.types;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.lib.PapljLib;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.types.PapljTypeProvider;

@SuppressWarnings("all")
public class PapljTypeConformance {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private PapljTypeProvider _papljTypeProvider;
  
  public boolean isSubclassOf(final Type c, final Type ancestor) {
    return PapljModelUtil.ancestors(c).contains(ancestor);
  }
  
  public boolean isConformant(final Type from, final Type to) {
    return ((((Objects.equal(from, PapljTypeProvider.NullT) || 
      Objects.equal(from, to)) || 
      this.isConformantLibraryType(from, to)) || 
      Objects.equal(this._iQualifiedNameProvider.getFullyQualifiedName(to).toString(), PapljLib.LIB_ANY)) || 
      this.isSubclassOf(from, to));
  }
  
  public boolean isConformantLibraryType(final Type c1, final Type c2) {
    return (((this._papljTypeProvider.isNum(c1) && this._papljTypeProvider.isNum(c2)) || (this._papljTypeProvider.isBool(c1) && this._papljTypeProvider.isBool(c2))) || (this._papljTypeProvider.isAny(c1) && this._papljTypeProvider.isAny(c2)));
  }
}
