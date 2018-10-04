package multithreadingDemo;


//Main Class
class MultithreadingDemo {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {
			Thread object = new Thread(new Multithread());
			object.start();
		}
	}
}

//Java code for thread creation by implementing 
//the Runnable Interface 
class Multithread implements Runnable {
	public void run() {
		try {
			
			System.out.println("\n *********************");
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()
					+ " is running");
			
			System.out.println("Thread Name " + Thread.currentThread().getName()
					+ " is running");
			
			System.out.println("Thread priority " + Thread.currentThread().getPriority()
					+ " is running");
			
			System.out.println("Thread state " + Thread.currentThread().getState()
					+ " is running");
			
			System.out.println("Thread IsDaemon " + Thread.currentThread().isDaemon()
					+ " is running");
			
			System.out.println("\n ---------------------");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

