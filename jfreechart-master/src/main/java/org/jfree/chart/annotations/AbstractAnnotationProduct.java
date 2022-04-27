package org.jfree.chart.annotations;


import org.jfree.chart.event.AnnotationChangeEvent;
import java.io.Serializable;

public class AbstractAnnotationProduct implements Serializable, Cloneable {
	private boolean notify = true;

	public boolean getNotify() {
		return notify;
	}

	/**
	* Sets a flag that indicates whether listeners should be notified about changes of an annotation.
	* @param flag   the flag
	* @see #getNotify()
	*/
	public void setNotify(boolean flag, AbstractAnnotation abstractAnnotation) {
		this.notify = flag;
		if (notify) {
			fireAnnotationChanged(abstractAnnotation);
		}
	}

	/**
	* Notifies all registered listeners that the annotation has changed.
	* @see #addChangeListener(AnnotationChangeListener)
	*/
	public void fireAnnotationChanged(AbstractAnnotation abstractAnnotation) {
		if (notify) {
			abstractAnnotation.notifyListeners(new AnnotationChangeEvent(abstractAnnotation, abstractAnnotation));
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return (AbstractAnnotationProduct) super.clone();
	}
}