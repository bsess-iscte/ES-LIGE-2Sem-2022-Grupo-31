package org.jfree.chart;


import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import java.io.Serializable;
import javax.swing.event.EventListenerList;

public class JFreeChartProductProduct implements Serializable, Cloneable {
	private boolean notify;

	public boolean getNotify() {
		return notify;
	}

	public void setNotify2(boolean notify) {
		this.notify = notify;
	}

	/**
	* Sets a flag that controls whether or not listeners receive  {@link ChartChangeEvent}   notifications.
	* @param notify    a boolean.
	* @see #isNotify()
	*/
	public void setNotify(boolean notify, JFreeChart jFreeChart, EventListenerList thisChangeListeners) {
		this.notify = notify;
		if (notify) {
			notifyListeners(new ChartChangeEvent(jFreeChart), thisChangeListeners);
		}
	}

	/**
	* Sends a   {@link ChartChangeEvent}   to all registered listeners.
	* @param event    information about the event that triggered the notification.
	*/
	public void notifyListeners(ChartChangeEvent event, EventListenerList thisChangeListeners) {
		if (this.notify) {
			Object[] listeners = thisChangeListeners.getListenerList();
			for (int i = listeners.length - 2; i >= 0; i -= 2) {
				if (listeners[i] == ChartChangeListener.class) {
					((ChartChangeListener) listeners[i + 1]).chartChanged(event);
				}
			}
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return (JFreeChartProductProduct) super.clone();
	}
}