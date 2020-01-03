package theDateClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TheCalendarcClass {

	public static void main(String[] args) {
		
		/**
		 * Calander is best used when adding or subtracting dates
		 * 
		 * January (0) is the first month
		 * Sunday (1) is the first day of the week
		 * 
		 */


		// creating Calendar object 
        Calendar calendar = Calendar.getInstance(); 
          
        // Demonstrate Calendar's get()method 
        System.out.println(calendar.getTime());  // Returns a Date Object
        
        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH); 
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);
        
        
        
        // The default is created with todays date as the 
        Calendar calendar2 = new GregorianCalendar();

        // Setting the year will automatically update the Day
        // Setters have to be in the correct order or the date wont be set properly 
        calendar2.set(Calendar.YEAR, 2009);
        calendar2.set(Calendar.MONTH, 11); 
        calendar2.set(Calendar.DAY_OF_MONTH, 31); // new years eve
        
        System.out.println(calendar2.getTime());
        
        //add one and half days (36 hours)
        calendar2.add(Calendar.DAY_OF_MONTH, 1);
        calendar2.add(Calendar.HOUR, 12);
        
        System.out.println(calendar2.getTime());
        
        
        // subtracting time
        calendar.add(Calendar.DAY_OF_MONTH, -1);

	}

}
