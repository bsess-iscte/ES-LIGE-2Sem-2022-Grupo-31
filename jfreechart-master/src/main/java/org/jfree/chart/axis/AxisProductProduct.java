package org.jfree.chart.axis;


import java.io.Serializable;

public class AxisProductProduct implements Serializable, Cloneable {
	private boolean minorTickMarksVisible;
	private float minorTickMarkInsideLength;

	public boolean getMinorTickMarksVisible() {
		return minorTickMarksVisible;
	}

	public void setMinorTickMarksVisible2(boolean minorTickMarksVisible) {
		this.minorTickMarksVisible = minorTickMarksVisible;
	}

	public float getMinorTickMarkInsideLength() {
		return minorTickMarkInsideLength;
	}

	public void setMinorTickMarkInsideLength2(float minorTickMarkInsideLength) {
		this.minorTickMarkInsideLength = minorTickMarkInsideLength;
	}

	/**
	* Sets the flag that indicates whether or not the minor tick marks are  showing and sends an   {@link AxisChangeEvent}   to all registered listeners.
	* @param flag    the flag.
	* @see #isMinorTickMarksVisible()
	*/
	public void setMinorTickMarksVisible(boolean flag, Axis axis) {
		if (flag != this.minorTickMarksVisible) {
			this.minorTickMarksVisible = flag;
			axis.fireChangeEvent();
		}
	}

	/**
	* Sets the inside length of the minor tick marks and sends an   {@link AxisChangeEvent}   to all registered listeners.
	* @param length    the new length.
	* @see #getMinorTickMarkInsideLength()
	*/
	public void setMinorTickMarkInsideLength(float length, Axis axis) {
		this.minorTickMarkInsideLength = length;
		axis.fireChangeEvent();
	}

	public Object clone() throws CloneNotSupportedException {
		return (AxisProductProduct) super.clone();
	}
}