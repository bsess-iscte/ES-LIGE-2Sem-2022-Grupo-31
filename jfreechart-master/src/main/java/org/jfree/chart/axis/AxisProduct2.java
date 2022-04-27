package org.jfree.chart.axis;


import javax.swing.event.EventListenerList;
import org.jfree.chart.event.AxisChangeListener;
import java.util.EventListener;
import java.util.List;
import java.util.Arrays;
import org.jfree.chart.event.AxisChangeEvent;
import java.io.Serializable;

public class AxisProduct2 implements Serializable, Cloneable {
	private transient EventListenerList listenerList;

	public void setListenerList(EventListenerList listenerList) {
		this.listenerList = listenerList;
	}

	/**
	* Registers an object for notification of changes to the axis.
	* @param listener   the object that is being registered.
	* @see #removeChangeListener(AxisChangeListener)
	*/
	public void addChangeListener(AxisChangeListener listener) {
		this.listenerList.add(AxisChangeListener.class, listener);
	}

	/**
	* Deregisters an object for notification of changes to the axis.
	* @param listener   the object to deregister.
	* @see #addChangeListener(AxisChangeListener)
	*/
	public void removeChangeListener(AxisChangeListener listener) {
		this.listenerList.remove(AxisChangeListener.class, listener);
	}

	/**
	* Returns  {@code  true}  if the specified object is registered with the dataset as a listener.  Most applications won't need to call this method, it exists mainly for use by unit testing code.
	* @param listener   the listener.
	* @return  A boolean.
	*/
	public boolean hasListener(EventListener listener) {
		List list = Arrays.asList(this.listenerList.getListenerList());
		return list.contains(listener);
	}

	/**
	* Notifies all registered listeners that the axis has changed. The AxisChangeEvent provides information about the change.
	* @param event   information about the change to the axis.
	*/
	public void notifyListeners(AxisChangeEvent event) {
		Object[] listeners = this.listenerList.getListenerList();
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == AxisChangeListener.class) {
				((AxisChangeListener) listeners[i + 1]).axisChanged(event);
			}
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return (AxisProduct2) super.clone();
	}
}