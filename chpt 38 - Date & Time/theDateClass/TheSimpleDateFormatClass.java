package theDateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheSimpleDateFormatClass {

	public static void main(String[] args) {
		
		/**
		 * This is a subclass of the DateFormat class
		 * 
		 * SimpleDateFormat is used with Date() when formatting complicated dates.
		 * The SimpleDateFormat lets you build custom formats.
		 * It is much more flexible than DateFormat when parsing.
		 * 
		 * 
		 * SimpleDateFormat converts a String (in any format) to a Date Object
		 * or it converts a Date Object to a String (in any format)
		 * 
		 */
		
	//***** Using SimpleDateFormat to Parse a String *****
		
		Date d1 = new Date();
		System.out.println(d1.toString());		// Thu Jan 02 16:01:44 GMT 2020
		
		SimpleDateFormat simpleDateFormatter = 	new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");	// Matches the above format
		
		// Now we can can pass any Date object into the SimpleDateFormat object
		System.out.println(simpleDateFormatter.format(new Date()));
		
	
		
		// we can also pass any relevent string into the SimpleDateFormat object
		String dateInStringFormat = "Fri Feb 02 16:01:44 CET 1025";
		
		Date d2 = new Date(0);
			
		try {
			d2 = simpleDateFormatter.parse(dateInStringFormat);
		} catch (ParseException e) {
			System.out.println("ERROR: Cannot parse \"" + dateInStringFormat + "\"");
		}
		
		System.out.println(d2.toString());
		
		System.out.println("");
		
		
		
		
	//***** Changing a Date String from one format to another  *****
		
		SimpleDateFormat inputFormatter = 	new SimpleDateFormat("dd MMM yyyy");
		SimpleDateFormat outputFormatter = 	new SimpleDateFormat("yyyy MM dd");
		
		String dateString = "13 Mar 1975";
		System.out.println(dateString);
		
		//Convert the String to a date Object
		Date inputDate = new Date();
		
		try {
			inputDate = inputFormatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Convert the Date Object to my prefered String format
		String outputDate = outputFormatter.format(inputDate);
		
		System.out.println(outputDate);

	}

}
