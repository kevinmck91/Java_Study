package stopwatch;

import java.util.Scanner;

public class App {
	

	
	public static void main(String[] args) {
		
		String start;
		String stop;
		
		Stopwatch myStopwatch = new Stopwatch();
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter 0 to start");
		start = myScan.nextLine();
		
		while(!start.equals("0")){
			System.out.println("Enter 0 to start");
			start = myScan.nextLine();
		}
		
		myStopwatch.startTimer();
		
		System.out.println("Enter 1 to end");
		stop = myScan.nextLine();
		
		while(!stop.equals("1")){
			System.out.println("Enter 1 to end");
			stop = myScan.nextLine();
		}
		
		myStopwatch.endTimer();
		
		System.out.println(myStopwatch.getElapsedTime());
		myStopwatch.makePretty();
	}

}
