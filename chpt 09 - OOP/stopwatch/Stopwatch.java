package stopwatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stopwatch {
	
	private long startTime;
	private long endTime;
	private long elapsedTime;
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
	
	public void startTimer(){
		Date date = new Date();
		setStartTime(System.currentTimeMillis());
		System.out.println("Timer has started at : " + simpleDateFormat.format(date));
	}
	
	public void endTimer(){
		Date date = new Date();
		setEndTime(System.currentTimeMillis());
		System.out.println("Timer has ended  : " + simpleDateFormat.format(date));
		setElapsedTime(endTime - startTime);
	}
	
	
	
	public void makePretty(){
		double seconds = elapsedTime / 1000.0;
		System.out.println("seconds : " + seconds);
	}
	
	
	
	
	
	
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public long getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
		
}
