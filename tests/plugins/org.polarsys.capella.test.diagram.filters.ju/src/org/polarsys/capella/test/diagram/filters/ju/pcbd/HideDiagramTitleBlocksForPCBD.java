/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.filters.ju.pcbd;

import java.util.Arrays;
import java.util.List;
import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;
import org.polarsys.capella.test.diagram.filters.ju.DiagramTitleBlockFilterTestCase;

public class HideDiagramTitleBlocksForPCBD extends DiagramTitleBlockFilterTestCase {

  private final String DIAGRAM_TITLE_BLOCK_ID = "_NY7g45QdEeqmRd48Y6X5KA";
  
  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_COMMON_HIDE_DIAGRAM_TITLE_BLOCKS;
  }

  @Override
  protected String getDiagramName() {
    return "[PCBD] Physical System Title Blocks";
  }
  
  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(new String[] { DIAGRAM_TITLE_BLOCK_ID });
  }
}
