package org.jfree.chart.axis;


import java.awt.Stroke;
import java.awt.Paint;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class CyclicNumberAxisProduct implements Serializable, Cloneable {
	private transient Stroke advanceLineStroke = CyclicNumberAxis.DEFAULT_ADVANCE_LINE_STROKE;
	private transient Paint advanceLinePaint;

	public Stroke getAdvanceLineStroke() {
		return advanceLineStroke;
	}

	public void setAdvanceLineStroke2(Stroke advanceLineStroke) {
		this.advanceLineStroke = advanceLineStroke;
	}

	public Paint getAdvanceLinePaint() {
		return advanceLinePaint;
	}

	public void setAdvanceLinePaint2(Paint advanceLinePaint) {
		this.advanceLinePaint = advanceLinePaint;
	}

	/**
	* The advance line is the line drawn at the limit of the current cycle, when erasing the previous cycle.
	* @param paint   the paint ( {@code  null}  not permitted).
	*/
	public void setAdvanceLinePaint(Paint paint) {
		Args.nullNotPermitted(paint, "paint");
		this.advanceLinePaint = paint;
	}

	/**
	* The advance line is the line drawn at the limit of the current cycle, when erasing the previous cycle.
	* @param stroke   the stroke ( {@code  null}  not permitted).
	*/
	public void setAdvanceLineStroke(Stroke stroke) {
		Args.nullNotPermitted(stroke, "stroke");
		this.advanceLineStroke = stroke;
	}

	public Object clone() throws CloneNotSupportedException {
		return (CyclicNumberAxisProduct) super.clone();
	}
}