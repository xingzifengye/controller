/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.sal.dom.api;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Base class for failures that can occur during RPC invocation. This covers
 * transport and protocol-level failures.
 */
@SuppressFBWarnings(value = "NM_SAME_SIMPLE_NAME_AS_SUPERCLASS", justification = "Migration")
public abstract class DOMRpcException extends org.opendaylight.mdsal.dom.api.DOMRpcException {
    private static final long serialVersionUID = 1L;

    /**
     * Construct an new instance with a message and an empty cause.
     *
     * @param message Exception message
     */
    protected DOMRpcException(final String message) {
        super(message);
    }

    /**
     * Construct an new instance with a message and a cause.
     *
     * @param message Exception message
     * @param cause Chained cause
     */
    protected DOMRpcException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
