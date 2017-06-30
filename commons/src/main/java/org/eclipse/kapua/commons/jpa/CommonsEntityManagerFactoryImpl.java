/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.commons.jpa;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.kapua.commons.core.ComponentProvider;
import org.eclipse.kapua.locator.inject.Service;

/**
 * Commons module entity manager reference service.
 *
 * @since 1.0
 */
@ComponentProvider
@Service(provides=CommonsEntityManagerFactory.class)
public class CommonsEntityManagerFactoryImpl extends AbstractEntityManagerFactory implements CommonsEntityManagerFactory {

    private static final String PERSISTENCE_UNIT_NAME = "kapua-commons";
    private static final String DATASOURCE_NAME = "kapua-dbpool";
    private static final Map<String, String> UNIQUE_CONTRAINTS = new HashMap<>();

    /**
     * Constructor
     */
    public CommonsEntityManagerFactoryImpl() {
        super(PERSISTENCE_UNIT_NAME,
                DATASOURCE_NAME,
                UNIQUE_CONTRAINTS);
    }
}