package org.jfree.chart.axis;


import java.io.Serializable;

public class LogarithmicAxisProduct implements Serializable, Cloneable {
	private boolean smallLogFlag = false;

	public boolean getSmallLogFlag() {
		return smallLogFlag;
	}

	public void setSmallLogFlag(boolean smallLogFlag) {
		this.smallLogFlag = smallLogFlag;
	}

	/**
	* Returns the log10 value, depending on if values between 0 and 1 are being plotted.  If negative values are not allowed and the lower bound is between 0 and 10 then a normal log is returned; otherwise the returned value is adjusted if the given value is less than 10.
	* @param val  the value.
	* @return  log<sub>10</sub>(val).
	* @see #switchedPow10(double)
	*/
	public double switchedLog10(double val) {
		return this.smallLogFlag ? Math.log(val) / LogarithmicAxis.LOG10_VALUE : adjustedLog10(val);
	}

	/**
	* Returns an adjusted log10 value for graphing purposes.  The first adjustment is that negative values are changed to positive during the calculations, and then the answer is negated at the end.  The second is that, for values less than 10, an increasingly large (0 to 1) scaling factor is added such that at 0 the value is adjusted to 1, resulting in a returned result of 0.
	* @param val   value for which log10 should be calculated.
	* @return  An adjusted log<sub>10</sub>(val).
	* @see #adjustedPow10(double)
	*/
	public double adjustedLog10(double val) {
		boolean negFlag = (val < 0.0);
		if (negFlag) {
			val = -val;
		}
		if (val < 10.0) {
			val += (10.0 - val) / 10.0;
		}
		double res = Math.log(val) / LogarithmicAxis.LOG10_VALUE;
		return negFlag ? (-res) : res;
	}

	/**
	* Returns a power of 10, depending on if values between 0 and 1 are being plotted.  If negative values are not allowed and the lower bound is between 0 and 10 then a normal power is returned; otherwise the returned value is adjusted if the given value is less than 1.
	* @param val  the value.
	* @return  10<sup>val</sup>.
	* @see #switchedLog10(double)
	*/
	public double switchedPow10(double val) {
		return this.smallLogFlag ? Math.pow(10.0, val) : adjustedPow10(val);
	}

	/**
	* Returns an adjusted power of 10 value for graphing purposes.  The first adjustment is that negative values are changed to positive during the calculations, and then the answer is negated at the end.  The second is that, for values less than 1, a progressive logarithmic offset is subtracted such that at 0 the returned result is also 0.
	* @param val   value for which power of 10 should be calculated.
	* @return  An adjusted 10<sup>val</sup>.
	* @see #adjustedLog10(double)
	*/
	public double adjustedPow10(double val) {
		boolean negFlag = (val < 0.0);
		if (negFlag) {
			val = -val;
		}
		double res;
		if (val < 1.0) {
			res = (Math.pow(10, val + 1.0) - 10.0) / 9.0;
		} else {
			res = Math.pow(10, val);
		}
		return negFlag ? (-res) : res;
	}

	public Object clone() throws CloneNotSupportedException {
		return (LogarithmicAxisProduct) super.clone();
	}
}