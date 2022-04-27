/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2022, by David Gilbert and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 *
 */

package org.jfree.chart.block;

import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import org.jfree.chart.api.HorizontalAlignment;
import org.jfree.chart.api.PublicCloneable;
import org.jfree.chart.api.VerticalAlignment;
import org.jfree.chart.internal.Args;

/**
 * A simple class for representing the dimensions of an object.  It would be
 * better to use {@code Dimension2D}, but this class is broken on various
 * JDK releases (particularly JDK 1.3.1, refer to bugs 4189446 and 4976448 on 
 * the Java bug parade).
 */
public class Size2D implements Cloneable, PublicCloneable, Serializable {

    /** For serialization. */ 
    private static final long serialVersionUID = 2558191683786418168L;
    
    /** The width. */
    public double width;

    /** The height. */
    public double height;

    /**
     * Creates a new instance with zero width and height.
     */
    public Size2D() {
        this(0.0, 0.0);
    }
    
    /**
     * Creates a new instance with the specified width and height.
     *
     * @param width  the width.
     * @param height  the height.
     */
    public Size2D(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width.
     *
     * @return The width.
     */
    public double getWidth() {
        return this.width;
    }
    
    /**
     * Sets the width.
     * 
     * @param width  the width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height.
     *
     * @return The height.
     */
    public double getHeight() {
        return this.height;
    }
    
    /**
     * Sets the height.
     * 
     * @param height  the height.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns a string representation of this instance, mostly used for 
     * debugging purposes.
     * 
     * @return A string.
     */
    @Override
    public String toString() {
        return "Size2D[width=" + this.width + ", height=" + this.height + "]";   
    }

    /**
     * Compares this instance for equality with an arbitrary object.
     * 
     * @param obj  the object ({@code null} permitted).
     * 
     * @return A boolean.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size2D)) {
            return false;
        }
        Size2D that = (Size2D) obj;
        if (this.width != that.width) {
            return false;
        }
        if (this.height != that.height) {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code for this instance.
     * 
     * @return A hash code. 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }
    
    /**
     * Returns a clone of this object.
     * 
     * @return A clone.
     * 
     * @throws CloneNotSupportedException if the object cannot be cloned.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	/**
	 * Creates a rectangle that is aligned to the frame.
	 * @param frame   the frame to align to.
	 * @param hAlign   the horizontal alignment ( {@code  null}  not permitted).
	 * @param vAlign   the vertical alignment ( {@code  null}  not permitted).
	 * @return  A rectangle.
	 */
	public Rectangle2D createAlignedRectangle2D(Rectangle2D frame, HorizontalAlignment hAlign,
			VerticalAlignment vAlign) {
		Args.nullNotPermitted(hAlign, "hAlign");
		Args.nullNotPermitted(vAlign, "vAlign");
		double x = Double.NaN;
		double y = Double.NaN;
		switch (hAlign) {
		case LEFT:
			x = frame.getX();
			break;
		case CENTER:
			x = frame.getCenterX() - (this.width / 2.0);
			break;
		case RIGHT:
			x = frame.getMaxX() - this.width;
			break;
		default:
			throw new IllegalStateException("Unexpected enum value " + hAlign);
		}
		switch (vAlign) {
		case TOP:
			y = frame.getY();
			break;
		case CENTER:
			y = frame.getCenterY() - (this.height / 2.0);
			break;
		case BOTTOM:
			y = frame.getMaxY() - this.height;
			break;
		default:
			throw new IllegalStateException("Unexpected enum value " + hAlign);
		}
		return new Rectangle2D.Double(x, y, this.width, this.height);
	}
    
}
