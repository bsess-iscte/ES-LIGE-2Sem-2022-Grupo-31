package org.jfree.chart.axis;


import java.io.Serializable;

public class AxisProduct implements Serializable, Cloneable {
	private AxisProductProduct axisProductProduct = new AxisProductProduct();
	private float minorTickMarkOutsideLength;

	public boolean getMinorTickMarksVisible() {
		return axisProductProduct.getMinorTickMarksVisible();
	}

	public void setMinorTickMarksVisible2(boolean minorTickMarksVisible) {
		axisProductProduct.setMinorTickMarksVisible2(minorTickMarksVisible);
	}

	public float getMinorTickMarkInsideLength() {
		return axisProductProduct.getMinorTickMarkInsideLength();
	}

	public void setMinorTickMarkInsideLength2(float minorTickMarkInsideLength) {
		axisProductProduct.setMinorTickMarkInsideLength2(minorTickMarkInsideLength);
	}

	public float getMinorTickMarkOutsideLength() {
		return minorTickMarkOutsideLength;
	}

	public void setMinorTickMarkOutsideLength2(float minorTickMarkOutsideLength) {
		this.minorTickMarkOutsideLength = minorTickMarkOutsideLength;
	}

	/**
	* Sets the flag that indicates whether or not the minor tick marks are  showing and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param flag   the flag.
	* @see #isMinorTickMarksVisible()
	*/
	public void setMinorTickMarksVisible(boolean flag, Axis axis) {
		axisProductProduct.setMinorTickMarksVisible(flag, axis);
	}

	/**
	* Sets the inside length of the minor tick marks and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param length   the new length.
	* @see #getMinorTickMarkInsideLength()
	*/
	public void setMinorTickMarkInsideLength(float length, Axis axis) {
		axisProductProduct.setMinorTickMarkInsideLength(length, axis);
	}

	/**
	* Sets the outside length of the minor tick marks and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param length   the new length.
	* @see #getMinorTickMarkInsideLength()
	*/
	public void setMinorTickMarkOutsideLength(float length, Axis axis) {
		this.minorTickMarkOutsideLength = length;
		axis.fireChangeEvent();
	}

	public Object clone() throws CloneNotSupportedException {
		return (AxisProduct) super.clone();
	}
}