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
package com.offbynull.portmapper.io.network.internalmessages;

/**
 * Error message associated with a socket. Once received, it means the socket associated with this ID is dead (no longer usable).
 * @author Kasra Faghihi
 */
public final class IdentifiableErrorNetworkResponse extends IdentifiableNetworkResponse {

    /**
     * Constructs a {@link IdentifiableErrorNetworkResponse} object.
     * @param id socket id
     */
    public IdentifiableErrorNetworkResponse(int id) {
        super(id);
    }

}
