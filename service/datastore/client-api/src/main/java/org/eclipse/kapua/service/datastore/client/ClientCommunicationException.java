/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.datastore.client;

/**
 * Client communication exception (timeout, no node available ...)
 *
 * @since 1.0
 */
public class ClientCommunicationException extends ClientException {

    private static final long serialVersionUID = 1599649533697887868L;

    /**
     * Construct the exception with the provided throwable
     *
     * @param t
     * @param message
     */
    public ClientCommunicationException(String message, Throwable t) {
        super(ClientErrorCodes.COMMUNICATION_ERROR, t, null);
    }

}
