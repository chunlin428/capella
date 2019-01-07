/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.information.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.polarsys.capella.viatra.core.data.information.surrogate.Union__containedUnionPropertiesMatcher;
import org.polarsys.capella.viatra.core.data.information.surrogate.util.Union__containedUnionPropertiesQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in Union.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Union.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.information.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>Union__containedUnionProperties</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Union extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Union instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Union();
    }
    return INSTANCE;
  }
  
  private static Union INSTANCE;
  
  private Union() throws ViatraQueryException {
    querySpecifications.add(Union__containedUnionPropertiesQuerySpecification.instance());
  }
  
  public Union__containedUnionPropertiesQuerySpecification getUnion__containedUnionProperties() throws ViatraQueryException {
    return Union__containedUnionPropertiesQuerySpecification.instance();
  }
  
  public Union__containedUnionPropertiesMatcher getUnion__containedUnionProperties(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Union__containedUnionPropertiesMatcher.on(engine);
  }
}