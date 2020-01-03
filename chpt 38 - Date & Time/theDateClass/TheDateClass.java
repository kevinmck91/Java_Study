package theDateClass;

import java.util.Date;

public class TheDateClass {

	public static void main(String[] args) {

		/**
		 * The class Date represents a specific instant in time, with
		 * millisecond precision. The Date class of java.util package implements
		 * Serializable, Cloneable and Comparable interface. It provides
		 * constructors and methods to deal with date and time with java.
		 * 
		 */
		
		// System.currentTimeMillis() returns the number of Miliseconds past since January 1, 1970, 00:00:00 GMT.
		System.currentTimeMillis();		 	
		System.out.println("System.currentTimeMillis() : " + System.currentTimeMillis());
		
		System.out.println("");
		
		Date d1 = new Date(); 									// Creates date object representing current date and time.
		System.out.println("d1 : " + d1);						// Todays Date is constructed using a combination of epoch time and System.currentTimeMillis() 
        System.out.println("d1.getTime : " + d1.getTime());		// Date().getTime returns the number of Miliseconds past since January 1, 1970, 00:00:00 GMT.
        
        System.out.println("");
        
        Date d2 = new Date(0);				// Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
        System.out.println("d2 : " + d2);
        System.out.println("d2.getTime : " + d2.getTime());
        
        System.out.println("");
        
        Date d3 = new Date(15000000);		// Creates a date object for 15000000 miliseconds since January 1, 1970, 00:00:00 GMT.
        System.out.println("d3 : " + d3);
        System.out.println("d3.getTime : " + d3.getTime());
		
        System.out.println("");
        
        System.out.println("d1.after(d2) : " + d1.after(d2));
        System.out.println("d2.after(d1) : " + d2.after(d1));
        
        System.out.println("d1.before(d2) : " + d1.before(d2));
        System.out.println("d2.before(d1) : " + d2.before(d1));
       
        System.out.println("");
        
        
        // Depreciated Methods of the Date Object
		
        try{
	        Date d7 = new Date("15000000");		
	        System.out.println("d7 : " + d7);
			
		} catch(Exception e){
			System.out.println("d7 : " + e);
		}
        
        try{
        	// Date(int year, int month, int date)
        	Date d8 = new Date(2009, 03, 1);		
	        System.out.println("d8 : " + d8);
	        System.out.println("d8.getYear : " + d8.getYear());
			
		} catch(Exception e){
			System.out.println("d8 : " + e);
		}

	}

}
