/*
 * Copyright (c) 2013-2016, Kasra Faghihi, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.offbynull.portmapper.gateways.process.internalmessages;

import com.offbynull.portmapper.gateway.Bus;
import org.apache.commons.lang3.Validate;

/**
 * Get ID to use for a new socket. Only possible response is {@link GetNextProcessIdResponse}.
 * @author Kasra Faghihi
 */
public final class GetNextIdProcessRequest implements ProcessRequest {
    
    private Bus responseBus;
    
    /**
     * Constructs a {@link GetNextProcessIdRequest} object.
     * @param responseBus bus to send new ID to
     * @throws NullPointerException if any argument is {@code null}, or contains {@code null}
     */
    public GetNextIdProcessRequest(Bus responseBus) {
        Validate.notNull(responseBus);

        this.responseBus = responseBus;
    }
    
    /**
     * Bus to send responses/notifications to for the created process.
     * @return response bus
     */
    public Bus getResponseBus() {
        return responseBus;
    }
}
