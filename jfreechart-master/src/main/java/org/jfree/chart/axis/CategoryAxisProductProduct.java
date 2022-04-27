package org.jfree.chart.axis;


import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class CategoryAxisProductProduct implements Serializable, Cloneable {
	private float maximumCategoryLabelWidthRatio;
	private CategoryLabelPositions categoryLabelPositions;

	public float getMaximumCategoryLabelWidthRatio() {
		return maximumCategoryLabelWidthRatio;
	}

	public void setMaximumCategoryLabelWidthRatio2(float maximumCategoryLabelWidthRatio) {
		this.maximumCategoryLabelWidthRatio = maximumCategoryLabelWidthRatio;
	}

	public CategoryLabelPositions getCategoryLabelPositions() {
		return categoryLabelPositions;
	}

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

	public Object clone() throws CloneNotSupportedException {
		return (CategoryAxisProductProduct) super.clone();
	}
}