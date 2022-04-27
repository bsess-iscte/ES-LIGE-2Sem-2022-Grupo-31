package org.jfree.chart;


import javax.swing.event.EventListenerList;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.internal.Args;
import java.io.Serializable;

public class JFreeChartProduct implements Serializable, Cloneable {
	private transient EventListenerList changeListeners;

	public EventListenerList getChangeListeners() {
		return changeListeners;
	}

	public void setChangeListeners(EventListenerList changeListeners) {
		this.changeListeners = changeListeners;
	}

	/**
	* Registers an object for notification of changes to the chart.
	* @param listener   the listener ( {@code  null}  not permitted).
	* @see #removeChangeListener(ChartChangeListener)
	*/
	public void addChangeListener(ChartChangeListener listener) {
		Args.nullNotPermitted(listener, "listener");
		this.changeListeners.add(ChartChangeListener.class, listener);
	}

	/**
	* Deregisters an object for notification of changes to the chart.
	* @param listener   the listener ( {@code  null}  not permitted)
	* @see #addChangeListener(ChartChangeListener)
	*/
	public void removeChangeListener(ChartChangeListener listener) {
		Args.nullNotPermitted(listener, "listener");
		this.changeListeners.remove(ChartChangeListener.class, listener);
	}

	public Object clone() throws CloneNotSupportedException {
		return (JFreeChartProduct) super.clone();
	}
}