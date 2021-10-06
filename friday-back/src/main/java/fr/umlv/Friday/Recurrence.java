package fr.umlv.Friday;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Recurrence {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	// https://stackoverflow.com/questions/1579638/what-is-the-best-way-to-represent-recurring-events-in-database

	/**
	 * 0=no recurrence
	 * 1=daily
	 * 2=weekly
	 * 3=monthly
	 */
	@Column
	private byte recurrence;

	/**
	 * CQFD
	 */
	@Column
	private int recurrenceInterval;

	/**
	 * If the user selected monthly type recurrence, on a given day of the month (ex: 10th or the 14th). This has that date. The value is 0 if the user did not select monthly or specific day of month recurrence. The value is 1 to 31 otherwise.
	 */
	@Column
	private byte recurrenceDay;

	/**
	 * 0=Weekdays
	 * 1=Sunday
	 * 2=Monday
	 * 4=Tuesday
	 * 8=Wednesday
	 * 16=Thursday
	 * 32=Friday
	 * 64=Saturday
	 * 128 = Weekend
	 */
	@Column
	private byte recurrenceWeekday;

	/**
	 * 1=first
	 * 2=second
	 * 3=third
	 * 4=fourth
	 * 5=last
	 */
	@Column
	private byte recurrenceOrdinal;
}
