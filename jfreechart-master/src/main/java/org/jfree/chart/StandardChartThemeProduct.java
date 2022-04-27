package org.jfree.chart;


import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.internal.Args;
import org.jfree.chart.api.PublicCloneable;
import java.io.Serializable;

public class StandardChartThemeProduct implements Serializable, Cloneable {
	private DrawingSupplier drawingSupplier;

	public DrawingSupplier getDrawingSupplier2() {
		return drawingSupplier;
	}

	public void setDrawingSupplier2(DrawingSupplier drawingSupplier) {
		this.drawingSupplier = drawingSupplier;
	}

	/**
	* Sets the drawing supplier for this theme.
	* @param supplier   the supplier ( {@code  null}  not permitted).
	* @see #getDrawingSupplier()
	*/
	public void setDrawingSupplier(DrawingSupplier supplier) {
		Args.nullNotPermitted(supplier, "supplier");
		this.drawingSupplier = supplier;
	}

	/**
	* Returns a clone of the drawing supplier for this theme.
	* @return  A clone of the drawing supplier.
	*/
	public DrawingSupplier getDrawingSupplier() {
		DrawingSupplier result = null;
		if (this.drawingSupplier instanceof PublicCloneable) {
			PublicCloneable pc = (PublicCloneable) this.drawingSupplier;
			try {
				result = (DrawingSupplier) pc.clone();
			} catch (CloneNotSupportedException e) {
				throw new RuntimeException(e);
			}
		}
		return result;
	}

	public Object clone() throws CloneNotSupportedException {
		return (StandardChartThemeProduct) super.clone();
	}
}