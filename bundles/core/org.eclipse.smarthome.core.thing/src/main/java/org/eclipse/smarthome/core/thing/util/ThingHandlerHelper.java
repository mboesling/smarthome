/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.util;

import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

/**
 * This class provides utility methods related to the {@link ThingHandler} class.
 *
 * @author Markus Rathgeb - Initial contribution
 */
public class ThingHandlerHelper {

    private ThingHandlerHelper() {
    }

    /**
     * Checks if the thing handler has been initialized.
     *
     * @return true if the thing handler has been initialized, otherwise false.
     */
    public static boolean isHandlerInitialized(final Thing thing) {
        final ThingStatus thingStatus = thing.getStatus();
        return thingStatus == ThingStatus.OFFLINE || thingStatus == ThingStatus.ONLINE;
    }

    /**
     * Checks if the thing handler has been initialized.
     *
     * @return true if the thing handler has been initialized, otherwise false.
     */
    public static boolean isHandlerInitialized(final ThingHandler handler) {
        return isHandlerInitialized(handler.getThing());
    }
}
