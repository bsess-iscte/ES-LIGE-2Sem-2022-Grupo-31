package org.jfree.chart;


import javax.swing.event.EventListenerList;
import org.jfree.chart.event.ChartProgressListener;
import org.jfree.chart.event.ChartProgressEvent;
import java.io.Serializable;

public class JFreeChartProduct2 implements Serializable, Cloneable {
	private transient EventListenerList progressListeners;

	public void setProgressListeners(EventListenerList progressListeners) {
		this.progressListeners = progressListeners;
	}

	/**
	* Registers an object for notification of progress events relating to the chart.
	* @param listener   the object being registered.
	* @see #removeProgressListener(ChartProgressListener)
	*/
	public void addProgressListener(ChartProgressListener listener) {
		this.progressListeners.add(ChartProgressListener.class, listener);
	}

	/**
	* Deregisters an object for notification of changes to the chart.
	* @param listener   the object being deregistered.
	* @see #addProgressListener(ChartProgressListener)
	*/
	public void removeProgressListener(ChartProgressListener listener) {
		this.progressListeners.remove(ChartProgressListener.class, listener);
	}

	/**
	* Sends a  {@link ChartProgressEvent}  to all registered listeners.
	* @param event   information about the event that triggered the notification.
	*/
	public void notifyListeners(ChartProgressEvent event) {
		Object[] listeners = this.progressListeners.getListenerList();
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ChartProgressListener.class) {
				((ChartProgressListener) listeners[i + 1]).chartProgress(event);
			}
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return (JFreeChartProduct2) super.clone();
	}
}