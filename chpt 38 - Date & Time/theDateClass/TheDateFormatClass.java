package theDateClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class TheDateFormatClass {

	public static void main(String[] args) {
		
		/**
		 *  DateFormat allows only formatting of Date() objects only. Use SimpleDateFormat for strings
		 *  
		 *  The date is represented as a Date object or as the milliseconds since January 1, 1970, 00:00:00
		 *  
		 *  DateFormat is used for formatting a date into String based on specific locale that is provided as input.
		 *  
		 *  DateFormat is used with Date() for simple things. Printing out a certain date or time in a preset format
		 *  
		 */
		
	//***** Working with a Date *****

		System.out.println(" ***** Working with a Date *****\n ");
		
		DateFormat df1 = DateFormat.getDateInstance();		// Be default this is created using UTC
		
		System.out.println(df1);		
		System.out.println(df1.toString());
		
		System.out.println(" ");
		
		Date d1 = new Date();				// Creates a date object with todays date calculated via epoch time.
		Date d2 = new Date(0);				// Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
		Date d3 = new Date(15000000);		// Creates a date object for 15000000 miliseconds since January 1, 1970, 00:00:00 GMT.
		
		System.out.println(d1);
		System.out.println(d1.toString());
		
		System.out.println(df1.format(d1));		// Formats the Date part of the Date() object
		System.out.println(df1.format(d2));	
		System.out.println(df1.format(d3));	
		
		System.out.println(" ");
		
		
		
	//***** Working with a Time *****
		
		System.out.println(" ***** Working with a Time *****\n ");
		
		DateFormat df3 = DateFormat.getTimeInstance();
			
		System.out.println(d1);
		System.out.println(df3.format(d1));	 	// Formats the Time part of the Date() object
		System.out.println(df3.format(d2));	
		System.out.println(df3.format(d3));
		
		System.out.println(" ");
		
		
	//***** Working with a non-UTC Time/Date *****
		
		System.out.println(" ***** Working with a Locale  *****\n ");
		
		Locale loc = new Locale("en", "US");
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.DEFAULT, loc);
		
		
		System.out.println(df2.format(d1));		// Prints out AM or PM
		System.out.println(df2.format(d2));
		System.out.println(df2.format(d3));
		
		System.out.println(" ");
		
		
		
	//***** Other uses *****
		
		System.out.println(" ***** Other uses *****\n ");
				
		System.out.println(DateFormat.getDateInstance().format(new Date()));
		System.out.println("SHORT : " + DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
		System.out.println("MEDIUM : " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
		System.out.println("LONG : " + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));
		
		System.out.println(" ");
		
		System.out.println(DateFormat.getTimeInstance().format(new Date()));
		System.out.println("SHORT : " + DateFormat.getTimeInstance(DateFormat.SHORT).format(new Date()));
		System.out.println("MEDIUM : " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date()));
		System.out.println("LONG : " + DateFormat.getTimeInstance(DateFormat.LONG).format(new Date()));
		
		System.out.println(" ");
		
		
	//***** Using DateFormat to Parse a String *****
		
		/**
		 * 	Awkward way to parse a string, the string must be in the 
		 *  You can only parse a String that is in the DateFormat.SHORT, DateFormat.MEDIUM or DateFormat.LONG format
		 *  The parse method throws an exception if a date matching the format cannot be parsed.
		 *  The default parser is somewhat flexible
		 */
		
		System.out.println(" ***** Using DateFormat to Parse a String *****\n ");
		
		// MEDIUM date format and SHORT time format.
		String dateString = "02 January 2020 8:14 PM"; 	
		
		// Get the default LONG/SHORT Date/Time Format
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		
		 // Parse the date. if dateString is wrong, an error will throw
        try {
            Date date = format.parse(dateString);
            System.out.println("Original string: " + dateString);
            System.out.println("Parsed date    : " + date);
        }
        catch(ParseException pe) {
            System.out.println("ERROR: could not parse date in string \"" + dateString + "\"");
        }
	}

}
