/*******************************************************************************
 * Copyright (c) 2014 Felix Kutzner.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Felix Kutzner - initial implementation.
 ******************************************************************************/

package edu.kit.ipd.sdq.vitruvius.casestudies.emf.changedescription2change;

import java.util.Collection;
import java.util.List;

/**
 * {@link IObjectChangePass} is an interface for classes processing a {@link Collection} of
 * {@link IObjectChange} objects.
 */
interface IObjectChangePass {
    /**
     * Processes the given {@link Collection} of {@link IObjectChange} objects.
     * 
     * @param changes
     *            A {@link Collection} of {@link IObjectChange} objects, which remains unmodified by
     *            {@link IObjectChangePass#runPass(Collection)}.
     * @return A {@link List} containing the processing result.
     */
    public List<IObjectChange> runPass(Collection<IObjectChange> changes);
}
