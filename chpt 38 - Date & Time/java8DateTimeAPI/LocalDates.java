package java8DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDates {

	public static void main(String[] args) {

		/*
		 * Issues with the Existing Date/Time APIs - Thread Safety - APIs Design and
		 * Ease of Understanding - ZonedDate and Time
		 */

		
		// ****** Creating a Local date ******
		LocalDate localDateNow = LocalDate.now();
		LocalDate localDateCustom = LocalDate.of(2015, 02, 20);
		LocalDate localDateFromString = LocalDate.parse("2015-02-20"); // needs to be the correct format

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDateFromString2 = LocalDate.parse("25/09/1980", formatter);

		System.out.println("\n\n ****** Creating a Local date ******");
		System.out.println(localDateNow);
		System.out.println(localDateCustom);
		System.out.println(localDateFromString);
		System.out.println(localDateFromString2);
		System.out.println(localDateFromString2.format(formatter));
		System.out.println(localDateFromString2.format(DateTimeFormatter.ofPattern("yyyy -- MM -- dd")));

		
		// ****** Creating a Local date +/- a certain date ******
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);

		System.out.println("\n\n ****** Creating a Local date +/- a certain date ******");
		System.out.println(tomorrow);
		System.out.println(previousMonthSameDay);

		
		// ****** Getting data from a date ******
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek(); // This returns an enum
		int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
		boolean leapYear = LocalDate.now().isLeapYear();

		System.out.println("\n\n ****** Getting data from a date ******");
		System.out.println(sunday);
		System.out.println(twelve);
		System.out.println(leapYear);

		
		// ****** Relationships between two dates ******

		System.out.println("\n\n ******  Relationships between two dates ******");
		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));

	}

}
