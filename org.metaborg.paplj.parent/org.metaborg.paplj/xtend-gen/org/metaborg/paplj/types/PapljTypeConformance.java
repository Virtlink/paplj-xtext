package org.metaborg.paplj.types;

import com.google.common.base.Objects;
import org.metaborg.paplj.PapljModelUtil;
import org.metaborg.paplj.paplj.Type;
import org.metaborg.paplj.types.PapljTypeProvider;

@SuppressWarnings("all")
public class PapljTypeConformance {
  public boolean isSubclassOf(final Type c, final Type ancestor) {
    return PapljModelUtil.ancestors(c).contains(ancestor);
  }
  
  public boolean isConformant(final Type c1, final Type c2) {
    return ((Objects.equal(c1, PapljTypeProvider.NullT) || 
      Objects.equal(c1, c2)) || 
      this.isSubclassOf(c1, c2));
  }
}
