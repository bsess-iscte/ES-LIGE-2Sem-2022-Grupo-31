package org.jfree.chart.axis;


import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.CategoryAxis.
 *
 * @author Bárbara
 */
public class CategoryAxisProduct implements Serializable, Cloneable {
	private CategoryAxisProductProduct categoryAxisProductProduct = new CategoryAxisProductProduct();
	private int categoryLabelPositionOffset;
	
	/**
     * Returns the category label width ratio.
     *
     * @return The ratio.
     */
	public float getMaximumCategoryLabelWidthRatio() {
		return categoryAxisProductProduct.getMaximumCategoryLabelWidthRatio();
	}

	/**
     * Sets the maximum category label width ratio and sends an
     * {@link AxisChangeEvent} to all registered listeners.
     *
     * @param ratio  the ratio.
     */
	public void setMaximumCategoryLabelWidthRatio2(float maximumCategoryLabelWidthRatio) {
		categoryAxisProductProduct.setMaximumCategoryLabelWidthRatio2(maximumCategoryLabelWidthRatio);
	}

	 /**
     * Returns the offset between the axis and the category labels (before
     * label positioning is taken into account).
     *
     * @return The offset (in Java2D units).
     */
	public int getCategoryLabelPositionOffset() {
		return categoryLabelPositionOffset;
	}

	/**
     * Sets the offset between the axis and the category labels (before label
     * positioning is taken into account) and sends a change event to all 
     * registered listeners.
     *
     * @param offset  the offset (in Java2D units).
     */
	public void setCategoryLabelPositionOffset2(int categoryLabelPositionOffset) {
		this.categoryLabelPositionOffset = categoryLabelPositionOffset;
	}

	/**
     * Returns the category label position specification (this contains label
     * positioning info for all four possible axis locations).
     *
     * @return The positions (never {@code null}).
     */
	public CategoryLabelPositions getCategoryLabelPositions() {
		return categoryAxisProductProduct.getCategoryLabelPositions();
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
		categoryAxisProductProduct.setCategoryLabelPositions2(categoryLabelPositions);
	}

	/**
	* Sets the maximum category label width ratio and sends an {@link AxisChangeEvent}  to all registered listeners.
	* @param ratio   the ratio.
	* @see #getMaximumCategoryLabelWidthRatio()
	*/
	public void setMaximumCategoryLabelWidthRatio(float ratio, CategoryAxis categoryAxis) {
		categoryAxisProductProduct.setMaximumCategoryLabelWidthRatio(ratio, categoryAxis);
	}

	/**
	* Sets the category label position specification for the axis and sends an {@link AxisChangeEvent}  to all registered listeners.
	* @param positions   the positions ( {@code  null}  not permitted).
	* @see #getCategoryLabelPositions()
	*/
	public void setCategoryLabelPositions(CategoryLabelPositions positions, CategoryAxis categoryAxis) {
		categoryAxisProductProduct.setCategoryLabelPositions(positions, categoryAxis);
	}

	/**
	* Sets the offset between the axis and the category labels (before label positioning is taken into account) and sends a change event to all  registered listeners.
	* @param offset   the offset (in Java2D units).
	* @see #getCategoryLabelPositionOffset()
	*/
	public void setCategoryLabelPositionOffset(int offset, CategoryAxis categoryAxis) {
		this.categoryLabelPositionOffset = offset;
		categoryAxis.fireChangeEvent();
	}

	/**
     * Clones the object, and takes care of listeners.
     *
     * @return A clone.
     */
	public Object clone() throws CloneNotSupportedException {
		return (CategoryAxisProduct) super.clone();
	}
}