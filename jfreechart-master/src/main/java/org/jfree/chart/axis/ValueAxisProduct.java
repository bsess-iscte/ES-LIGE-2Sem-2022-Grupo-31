package org.jfree.chart.axis;


import java.awt.Shape;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class ValueAxisProduct implements Serializable, Cloneable {
	private transient Shape upArrow;
	private transient Shape downArrow;
	private transient Shape leftArrow;
	private transient Shape rightArrow;

	public Shape getUpArrow() {
		return upArrow;
	}

	public void setUpArrow2(Shape upArrow) {
		this.upArrow = upArrow;
	}

	public Shape getDownArrow() {
		return downArrow;
	}

	public void setDownArrow2(Shape downArrow) {
		this.downArrow = downArrow;
	}

	public Shape getLeftArrow() {
		return leftArrow;
	}

	public void setLeftArrow2(Shape leftArrow) {
		this.leftArrow = leftArrow;
	}

	public Shape getRightArrow() {
		return rightArrow;
	}

	public void setRightArrow2(Shape rightArrow) {
		this.rightArrow = rightArrow;
	}

	/**
	* Sets the shape that can be displayed as an arrow pointing upwards at the end of an axis line and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param arrow   the arrow shape ( {@code  null}  not permitted).
	* @see #getUpArrow()
	*/
	public void setUpArrow(Shape arrow, ValueAxis valueAxis) {
		Args.nullNotPermitted(arrow, "arrow");
		this.upArrow = arrow;
		valueAxis.fireChangeEvent();
	}

	/**
	* Sets the shape that can be displayed as an arrow pointing downwards at the end of an axis line and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param arrow   the arrow shape ( {@code  null}  not permitted).
	* @see #getDownArrow()
	*/
	public void setDownArrow(Shape arrow, ValueAxis valueAxis) {
		Args.nullNotPermitted(arrow, "arrow");
		this.downArrow = arrow;
		valueAxis.fireChangeEvent();
	}

	/**
	* Sets the shape that can be displayed as an arrow pointing left at the end of an axis line and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param arrow   the arrow shape ( {@code  null}  not permitted).
	* @see #getLeftArrow()
	*/
	public void setLeftArrow(Shape arrow, ValueAxis valueAxis) {
		Args.nullNotPermitted(arrow, "arrow");
		this.leftArrow = arrow;
		valueAxis.fireChangeEvent();
	}

	/**
	* Sets the shape that can be displayed as an arrow pointing rightwards at the end of an axis line and sends an  {@link AxisChangeEvent}  to all registered listeners.
	* @param arrow   the arrow shape ( {@code  null}  not permitted).
	* @see #getRightArrow()
	*/
	public void setRightArrow(Shape arrow, ValueAxis valueAxis) {
		Args.nullNotPermitted(arrow, "arrow");
		this.rightArrow = arrow;
		valueAxis.fireChangeEvent();
	}

	public Object clone() throws CloneNotSupportedException {
		return (ValueAxisProduct) super.clone();
	}
}