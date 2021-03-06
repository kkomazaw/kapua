/*******************************************************************************
 * Copyright (c) 2011, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.app.console.client.connection;

import org.eclipse.kapua.app.console.client.ui.tab.EntityDescriptionTabItem;
import org.eclipse.kapua.app.console.shared.model.GwtGroupedNVPair;
import org.eclipse.kapua.app.console.shared.model.connection.GwtDeviceConnection;
import org.eclipse.kapua.app.console.shared.service.GwtDeviceConnectionService;
import org.eclipse.kapua.app.console.shared.service.GwtDeviceConnectionServiceAsync;

import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ConnectionDescriptionTab extends EntityDescriptionTabItem<GwtDeviceConnection> {

    private static final GwtDeviceConnectionServiceAsync GWT_DEVICE_CONNECTION_SERVICE = GWT.create(GwtDeviceConnectionService.class);

    @Override
    protected RpcProxy<ListLoadResult<GwtGroupedNVPair>> getDataProxy() {
        return new RpcProxy<ListLoadResult<GwtGroupedNVPair>>() {

            @Override
            protected void load(Object loadConfig, AsyncCallback<ListLoadResult<GwtGroupedNVPair>> callback) {
                GWT_DEVICE_CONNECTION_SERVICE.getConnectionInfo(selectedEntity.getScopeId(), selectedEntity.getId(), callback);
            }
        };
    }

}
