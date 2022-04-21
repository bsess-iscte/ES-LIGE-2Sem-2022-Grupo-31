package org.jfree.chart.axis;


import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.Color;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class PeriodAxisProduct implements Serializable, Cloneable {
	private transient Stroke minorTickMarkStroke = new BasicStroke(0.5f);
	private transient Paint minorTickMarkPaint = Color.BLACK;

	public Stroke getMinorTickMarkStroke() {
		return minorTickMarkStroke;
	}

	public void setMinorTickMarkStroke2(Stroke minorTickMarkStroke) {
		this.minorTickMarkStroke = minorTickMarkStroke;
	}

	public Paint getMinorTickMarkPaint() {
		return minorTickMarkPaint;
	}

	public void setMinorTickMarkPaint2(Paint minorTickMarkPaint) {
		this.minorTickMarkPaint = minorTickMarkPaint;
	}

	/**
	* Sets the stroke used to display minor tick marks, if they are visible, and sends a  {@link AxisChangeEvent}  to all registered listeners.
	* @param stroke   the stroke ( {@code  null}  not permitted).
	*/
	public void setMinorTickMarkStroke(Stroke stroke, PeriodAxis periodAxis) {
		Args.nullNotPermitted(stroke, "stroke");
		this.minorTickMarkStroke = stroke;
		periodAxis.fireChangeEvent();
	}

	/**
	* Sets the paint used to display minor tick marks, if they are visible, and sends a  {@link AxisChangeEvent}  to all registered listeners.
	* @param paint   the paint ( {@code  null}  not permitted).
	*/
	public void setMinorTickMarkPaint(Paint paint, PeriodAxis periodAxis) {
		Args.nullNotPermitted(paint, "paint");
		this.minorTickMarkPaint = paint;
		periodAxis.fireChangeEvent();
	}

	public Object clone() throws CloneNotSupportedException {
		return (PeriodAxisProduct) super.clone();
	}
}