package org.jfree.chart.axis;


import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import java.io.Serializable;

/**
 * Classe criada a partir da refabricação de God Class na classe org.jfree.chart.axis.DateTickUnit.
 *
 * @author Bárbara
 */
public class DateTickUnitProduct implements Serializable {
	private DateTickUnitType rollUnitType;
	private int rollCount;

	/**
     * Returns the roll unit type.
     *
     * @return The roll unit type (never {@code null}).
     */
	public DateTickUnitType getRollUnitType() {
		return rollUnitType;
	}

	/**
	 * Sets the roll unit type.
	 * 
	 * @param rollUnitType  the roll unit type.
	 */
	public void setRollUnitType(DateTickUnitType rollUnitType) {
		this.rollUnitType = rollUnitType;
	}

	/**
	 * Returns the number of rolls.
	 * 
	 * @return  The number of rolls.
	 */
	public int getRollCount() {
		return rollCount;
	}

	/**
	 * Sets the number of rolls.
	 * 
	 * @param rollCount		number of rolls.
	 */
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