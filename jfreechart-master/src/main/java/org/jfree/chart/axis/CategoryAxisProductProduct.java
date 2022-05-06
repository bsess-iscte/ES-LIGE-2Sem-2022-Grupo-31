package org.jfree.chart.axis;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.CategoryAxisProduct.
 *
 * @author Bárbara
 */
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class CategoryAxisProductProduct implements Serializable, Cloneable {
	private float maximumCategoryLabelWidthRatio;
	private CategoryLabelPositions categoryLabelPositions;

	/**
     * Returns the category label width ratio.
     *
     * @return The ratio.
     */
	public float getMaximumCategoryLabelWidthRatio() {
		return maximumCategoryLabelWidthRatio;
	}

	/**
     * Sets the maximum category label width ratio and sends an
     * {@link AxisChangeEvent} to all registered listeners.
     *
     * @param ratio  the ratio.
     */
	public void setMaximumCategoryLabelWidthRatio2(float maximumCategoryLabelWidthRatio) {
		this.maximumCategoryLabelWidthRatio = maximumCategoryLabelWidthRatio;
	}

	/**
     * Returns the category label position specification (this contains label
     * positioning info for all four possible axis locations).
     *
     * @return The positions (never {@code null}).
     */
	public CategoryLabelPositions getCategoryLabelPositions() {
		return categoryLabelPositions;
	}

	/**
     * Sets the category label position specification for the axis and sends an
     * {@link AxisChangeEvent} to all registered listeners.
     *
     * @param positions  the positions ({@code null} not permitted).
     *
     * @see #getCategoryLabelPositions()
     */
	public void setCategoryLabelPositions2(CategoryLabelPositions categoryLabelPositions) {
		this.categoryLabelPositions = categoryLabelPositions;
	}

	/**
	* Sets the maximum category label width ratio and sends an  {@link AxisChangeEvent}   to all registered listeners.
	* @param ratio    the ratio.
	* @see #getMaximumCategoryLabelWidthRatio()
	*/
	public void setMaximumCategoryLabelWidthRatio(float ratio, CategoryAxis categoryAxis) {
		this.maximumCategoryLabelWidthRatio = ratio;
		categoryAxis.fireChangeEvent();
	}

	/**
	* Sets the category label position specification for the axis and sends an  {@link AxisChangeEvent}   to all registered listeners.
	* @param positions    the positions (  {@code   null}   not permitted).
	* @see #getCategoryLabelPositions()
	*/
	public void setCategoryLabelPositions(CategoryLabelPositions positions, CategoryAxis categoryAxis) {
		Args.nullNotPermitted(positions, "positions");
		this.categoryLabelPositions = positions;
		categoryAxis.fireChangeEvent();
	}

	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (CategoryAxisProductProduct) super.clone();
	}
}