package mt04_thread_synchronization;

import java.util.Scanner;

/**
 * Processor extends the thread class and will run indefinitely until stopped by
 * Scanner(System.in)
 * 
 * On some systems, the boolean may cache and the scanner will not update the
 * boolean and it wont stop the thread.
 * 
 * This is because we actually have two threads. Main program and second thread.
 * The second thread is created from the first. Both threads are reading/writing
 * the same boolean variable.
 * 
 * One thread doesn't expect a different thread to modify its data. To prevent
 * this you use the volatile Keyword. This prevent threads caching when using
 * multiple threads (you could also look into thread Synchronization)
 *
 */

class Processor extends Thread {

	private volatile boolean running = true;

	public void run() {

		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void shutdown() {
		running = false;
	}
}

public class App {

	public static void main(String[] args) {

		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press Return to stop");
		Scanner scn = new Scanner(System.in);
		scn.nextLine();

		proc1.shutdown();

		System.out.println("Shutdown");

	}

}
