/*
 * File:    $HeadURL: https://svn.code.sf.net/p/jvoicexml/code/trunk/org.jvoicexml/src/org/jvoicexml/implementation/ObservableSynthesizedOutput.java $
 * Version: $LastChangedRevision: 3839 $
 * Date:    $Date: 2013-07-17 09:37:34 +0200 (Wed, 17 Jul 2013) $
 * Author:  $LastChangedBy: schnelle $
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2005-2013 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public
 *  License as published by the Free Software Foundation; either
 *  version 2 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Library General Public License for more details.
 *
 *  You should have received a copy of the GNU Library General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.implementation;


/**
 * A {@link SynthesizedOutput} that can be monitored by
 * {@link SynthesizedOutputListener}s.
 *
 * <p>
 * Implementations must implement this interface to propagate output events
 * to the {@link org.jvoicexml.ImplementationPlatform}.
 * </p>
 *
 * @author Dirk Schnelle-Walka
 * @version $Revision: 3839 $
 * @since 0.5.5
 */
public interface ObservableSynthesizedOutput {
    /**
     * Adds the listener for system output events.
     *
     * <p>
     * The implementation of this interface must notify the listener
     * about all events.
     * </p>
     *
     * @param listener the listener to add.
     */
    void addListener(final SynthesizedOutputListener listener);

    /**
     * Removes the listener for system output events.
     * @param listener the listener to remove.
     *
     * @since 0.6
     */
    void removeListener(final SynthesizedOutputListener listener);
}
