package org.jfree.chart.axis;


import java.io.Serializable;

import org.jfree.chart.event.AxisChangeEvent;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.AxisProduct.
 *
 * @author Bárbara
 */
public class AxisProductProduct implements Serializable, Cloneable {
	private boolean minorTickMarksVisible;
	private float minorTickMarkInsideLength;

	/**
     * Returns the flag that indicates whether or not the minor tick marks are
     * showing.
     *
     * @return The flag that indicates whether or not the minor tick marks are
     *         showing.
     *
     * @see #setMinorTickMarksVisible(boolean)
     */
	public boolean getMinorTickMarksVisible() {
		return minorTickMarksVisible;
	}

	/**
     * Sets the flag that indicates whether or not the minor tick marks are 
     * showing and sends an {@link AxisChangeEvent} to all registered
     * listeners.
     *
     * @param flag  the flag.
     *
     * @see #isMinorTickMarksVisible()
     */
	public void setMinorTickMarksVisible2(boolean minorTickMarksVisible) {
		this.minorTickMarksVisible = minorTickMarksVisible;
	}

	 /**
     * Returns the inside length of the minor tick marks.
     *
     * @return The length.
     *
     * @see #getMinorTickMarkOutsideLength()
     * @see #setMinorTickMarkInsideLength(float)
     */
	public float getMinorTickMarkInsideLength() {
		return minorTickMarkInsideLength;
	}

	/**
     * Sets the inside length of the minor tick marks and sends
     * an {@link AxisChangeEvent} to all registered listeners.
     *
     * @param length  the new length.
     *
     * @see #getMinorTickMarkInsideLength()
     */
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

	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (AxisProductProduct) super.clone();
	}
}