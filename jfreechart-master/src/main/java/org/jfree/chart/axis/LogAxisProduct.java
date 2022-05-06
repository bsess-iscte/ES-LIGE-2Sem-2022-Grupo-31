package org.jfree.chart.axis;


import java.text.Format;
import java.text.DecimalFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.internal.Args;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.swing.ChartPanel;
import org.jfree.chart.title.Title;

import java.io.Serializable;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.LogAxis.
 *
 * @author Bárbara
 */
public class LogAxisProduct implements Serializable, Cloneable {
	private String baseSymbol = null;
	private Format baseFormatter = new DecimalFormat("0");

	/**
     * Returns the symbol used to represent the base of the logarithmic scale
     * for the axis.  If this is {@code null} (the default) then the 
     * numerical value of the base is displayed.
     * 
     * @return The base symbol (possibly {@code null}).
     */
	public String getBaseSymbol() {
		return baseSymbol;
	}

	/**
     * Returns the formatter used to format the base value of the logarithmic
     * scale when it is displayed numerically.  The default value is
     * {@code new DecimalFormat("0")}.
     * 
     * @return The base formatter (never {@code null}).
     */
	public Format getBaseFormatter() {
		return baseFormatter;
	}

	/**
	* Sets the symbol used to represent the base value of the logarithmic  scale and sends a change event to all registered listeners.
	* @param symbol   the symbol ( {@code  null}  permitted).
	*/
	public void setBaseSymbol(String symbol, LogAxis logAxis) {
		this.baseSymbol = symbol;
		logAxis.fireChangeEvent();
	}

	/**
	* Sets the formatter used to format the base value of the logarithmic  scale when it is displayed numerically and sends a change event to all registered listeners.
	* @param formatter   the formatter ( {@code  null}  not permitted).
	*/
	public void setBaseFormatter(Format formatter, LogAxis logAxis) {
		Args.nullNotPermitted(formatter, "formatter");
		this.baseFormatter = formatter;
		logAxis.fireChangeEvent();
	}

	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (LogAxisProduct) super.clone();
	}
}