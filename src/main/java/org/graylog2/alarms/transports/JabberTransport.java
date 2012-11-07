/**
 * Copyright 2012 Lennart Koopmann <lennart@socketfeed.com>
 *
 * This file is part of Graylog2.
 *
 * Graylog2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog2.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.graylog2.alarms.transports;

import java.util.Map;
import org.apache.log4j.Logger;
import org.graylog2.plugin.alarms.Alarm;
import org.graylog2.plugin.alarms.transports.Transport;
import org.graylog2.plugin.alarms.transports.TransportConfigurationException;

/**
 * @author Lennart Koopmann <lennart@socketfeed.com>
 */
public class JabberTransport implements Transport {

    private static final Logger LOG = Logger.getLogger(JabberTransport.class);
    
    public static final String NAME = "Jabber/XMPP";
    
    @Override
    public void initialize(Map<String, String> config) throws TransportConfigurationException {
    }

    @Override
    public void transportAlarm(Alarm alarm) {
System.out.println("JABBER TRANSPORT CALLED.");
    }

    @Override
    public String getName() {
        return NAME;
    }
    
}