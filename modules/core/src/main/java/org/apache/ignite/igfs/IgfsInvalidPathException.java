/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.igfs;

import org.jetbrains.annotations.Nullable;

/**
 * {@code IGFS} exception indicating that operation target is invalid
 * (e.g. not a file while expecting to be a file).
 */
public class IgfsInvalidPathException extends IgfsException {
    /** */
    private static final long serialVersionUID = 0L;

    /**
     * Constructor.
     *
     * @param msg Message.
     */
    public IgfsInvalidPathException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     *
     * @param cause Cause.
     */
    public IgfsInvalidPathException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor.
     *
     * @param msg Message.
     * @param cause Cause.
     */
    public IgfsInvalidPathException(@Nullable String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }
}