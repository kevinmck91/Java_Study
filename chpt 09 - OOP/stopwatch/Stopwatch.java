package stopwatch;

public class Stopwatch {
	
	private long startTime;
	private long endTime;
	private long elapsedTime;
	
	
	public void startTimer(){
		setStartTime(System.currentTimeMillis());
		System.out.println("Timer has started at : " + System.currentTimeMillis());
	}
	
	public void endTimer(){
		setEndTime(System.currentTimeMillis());
		System.out.println("Timer has ended  : " + System.currentTimeMillis());
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
