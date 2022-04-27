package org.jfree.chart.axis;


import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import java.io.Serializable;

public class DateTickUnitProduct implements Serializable {
	private DateTickUnitType rollUnitType;
	private int rollCount;

	public DateTickUnitType getRollUnitType() {
		return rollUnitType;
	}

	public void setRollUnitType(DateTickUnitType rollUnitType) {
		this.rollUnitType = rollUnitType;
	}

	public int getRollCount() {
		return rollCount;
	}

	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}

	/**
	* Rolls the date forward by the amount specified by the roll unit and count.
	* @param base   the base date.
	* @param zone   the time zone.
	* @return  The rolled date.
	*/
	public Date rollDate(Date base, TimeZone zone) {
		Calendar calendar = Calendar.getInstance(zone);
		calendar.setTime(base);
		calendar.add(this.rollUnitType.getCalendarField(), this.rollCount);
		return calendar.getTime();
	}
}