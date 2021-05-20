package java8DateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimes {

	public static void main(String[] args) {

		// ****** Creating a Local time ******
		LocalTime now = LocalTime.now();
		LocalTime sixThirty = LocalTime.of(6, 30);
		LocalTime sixThirtyFromString = LocalTime.parse("06:30");

		
		// ****** Creating a time for database queries etc******
		LocalTime maxTime = LocalTime.MAX;
		LocalTime minTime = LocalTime.MIN;
		LocalTime midnightTime = LocalTime.MIDNIGHT;
		LocalTime NooTime = LocalTime.NOON;

		
		// ****** Creating a Local time +/- a certain time ******
		LocalTime fiveThirty = LocalTime.parse("06:30").minus(1, ChronoUnit.HOURS);
		LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);

		
		// ****** Getting data from a date ******
		int six = LocalTime.parse("06:30").getHour();
		int nanoSecond = LocalTime.now().getNano();

		
		// ****** Relationships between two dates ******
		boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

	}

}
