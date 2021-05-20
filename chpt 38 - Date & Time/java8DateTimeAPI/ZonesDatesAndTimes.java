package java8DateTimeAPI;

import java.time.ZoneId;
import java.util.Set;

public class ZonesDatesAndTimes {

	public static void main(String[] args) {


		// Find all the available zones
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		
		for (String string : allZoneIds) {
			System.out.println(string);
		}

	}

}
