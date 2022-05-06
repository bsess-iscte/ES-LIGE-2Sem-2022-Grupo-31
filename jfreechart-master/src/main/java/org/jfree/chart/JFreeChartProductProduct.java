package org.jfree.chart;


import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import java.io.Serializable;
import javax.swing.event.EventListenerList;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.JFreeChartProduct.
 *
 * @author Bárbara
 */
public class JFreeChartProductProduct implements Serializable, Cloneable {
	private boolean notify;

	/**
	 * Returns the notification.
	 * 
	 * @return		A notification.
	 */
	public boolean getNotify() {
		return notify;
	}

	/**
	* Sets a flag that controls whether or not listeners receive  {@link ChartChangeEvent}   notifications.
	* @param notify    a boolean.
	*/
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
	
	/**
     * Clones the object, and takes care of listeners.
     * Note: caller shall register its own listeners on cloned graph.
     *
     * @return A clone.
     *
     * @throws CloneNotSupportedException if the chart is not cloneable.
     */
	public Object clone() throws CloneNotSupportedException {
		return (JFreeChartProductProduct) super.clone();
	}
}