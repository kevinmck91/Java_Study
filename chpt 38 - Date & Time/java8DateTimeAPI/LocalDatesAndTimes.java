package java8DateTimeAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDatesAndTimes {

	public static void main(String[] args) {

		// ****** Creating a Local time ******
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime custom = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
		LocalDateTime custom2 = LocalDateTime.parse("2015-02-20T06:30:00");


		// ****** Creating a Local time +/- a certain time ******
		LocalDateTime addDay = LocalDateTime.now().plusDays(1);
		LocalDateTime minusHour = LocalDateTime.now().minusHours(2);
		
		
		// ****** Getting data from a date ******
		int month = LocalDateTime.now().getMonthValue();
		Month monthobject = LocalDateTime.now().getMonth();

		
		
		// ****** Relationships between two dates ******
		boolean isbefore = LocalDateTime.parse("2015-02-20T06:30:00").isBefore(LocalDateTime.parse("2015-02-20T06:30:00"));

	}

}
