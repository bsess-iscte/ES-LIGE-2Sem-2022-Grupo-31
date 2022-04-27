/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2022, by David Gilbert and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 * -----------------------
 * ChartProgressEvent.java
 * -----------------------
 * (C) Copyright 2003-2022, by David Gilbert.
 *
 * Original Author:  David Gilbert;
 * Contributor(s):   -;
 *
 */

package org.jfree.chart.event;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.internal.Args;

/**
 * An event that contains information about the drawing progress of a chart.
 */
public class ChartProgressEvent extends java.util.EventObject {

    /** The type of event. */
    private ChartProgressEventType type;

    /** The percentage of completion. */
    private int percent;

    /** The chart that generated the event. */
    private JFreeChart chart;

    /**
     * Creates a new chart change event.
     *
     * @param source  the source of the event (could be the chart, a title, an
     *                axis etc.)
     * @param chart  the chart that generated the event.
     * @param type  the type of event ({@code null} not permitted).
     * @param percent  the percentage of completion.
     */
    public ChartProgressEvent(Object source, JFreeChart chart, 
            ChartProgressEventType type, int percent) {
        super(source);
        Args.nullNotPermitted(type, "type");
        this.chart = chart;
        this.type = type;
        this.percent = percent;
    }   
}
