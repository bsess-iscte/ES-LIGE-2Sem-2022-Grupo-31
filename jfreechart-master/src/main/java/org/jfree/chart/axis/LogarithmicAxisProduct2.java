package org.jfree.chart.axis;


import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.Serializable;

public class LogarithmicAxisProduct2 implements Serializable, Cloneable {
	private final NumberFormat numberFormatterObj = NumberFormat.getInstance();
	private boolean expTickLabelsFlag = false;

	public NumberFormat getNumberFormatterObj() {
		return numberFormatterObj;
	}

	public boolean getExpTickLabelsFlag() {
		return expTickLabelsFlag;
	}

	/**
	* Sets the 'expTickLabelsFlag' flag.  If the 'log10TickLabelsFlag' is false then this will set whether or not "1e#"-style tick labels are used.  The default is to use regular numeric tick labels.
	* @param flgVal  true for "1e#"-style tick labels, false for log10 or regular numeric tick labels.
	*/
	public void setExpTickLabelsFlag(boolean flgVal) {
		this.expTickLabelsFlag = flgVal;
		setupNumberFmtObj();
	}

	/**
	* Sets up the number formatter object according to the 'expTickLabelsFlag' flag.
	*/
	public void setupNumberFmtObj() {
		if (this.numberFormatterObj instanceof DecimalFormat) {
			((DecimalFormat) this.numberFormatterObj).applyPattern(this.expTickLabelsFlag ? "0E0" : "0.###");
		}
	}

	/**
	* Converts the given value to a tick label string.
	* @param val  the value to convert.
	* @param forceFmtFlag  true to force the number-formatter object to be used.
	* @return  The tick label string.
	*/
	public String makeTickLabel(double val, boolean forceFmtFlag, LogarithmicAxis logarithmicAxis) {
		if (this.expTickLabelsFlag || forceFmtFlag) {
			return this.numberFormatterObj.format(val).toLowerCase();
		}
		return logarithmicAxis.getTickUnit().valueToString(val);
	}

	public Object clone() throws CloneNotSupportedException {
		return (LogarithmicAxisProduct2) super.clone();
	}
}