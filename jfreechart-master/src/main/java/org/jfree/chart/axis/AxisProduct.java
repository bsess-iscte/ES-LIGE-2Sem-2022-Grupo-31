package org.jfree.chart.axis;


import java.io.Serializable;

import org.jfree.chart.event.AxisChangeEvent;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.Axis.
 *
 * @author Bárbara
 */
public class AxisProduct implements Serializable, Cloneable {
	private AxisProductProduct axisProductProduct = new AxisProductProduct();
	private float minorTickMarkOutsideLength;

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
		return axisProductProduct.getMinorTickMarksVisible();
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
		axisProductProduct.setMinorTickMarksVisible2(minorTickMarksVisible);
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
		return axisProductProduct.getMinorTickMarkInsideLength();
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
		axisProductProduct.setMinorTickMarkInsideLength2(minorTickMarkInsideLength);
	}

	/**
     * Returns the outside length of the minor tick marks.
     *
     * @return The length.
     *
     * @see #getMinorTickMarkInsideLength()
     * @see #setMinorTickMarkOutsideLength(float)
     */
	public float getMinorTickMarkOutsideLength() {
		return minorTickMarkOutsideLength;
	}

	/**
     * Sets the outside length of the minor tick marks and sends
     * an {@link AxisChangeEvent} to all registered listeners.
     *
     * @param length  the new length.
     *
     * @see #getMinorTickMarkInsideLength()
     */
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

	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (AxisProduct) super.clone();
	}
}