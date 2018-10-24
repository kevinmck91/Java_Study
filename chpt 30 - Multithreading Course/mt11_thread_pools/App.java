package mt11_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// A class that impliments runnable - This can be passed to a Thread.

/**
 * Create a Threadpool with any number of 'workers' (threads). The workers will split the
 * amount of tasks up, complete them and move onto the next available task.
 * 
 * In this case the tasks are created via a loop and the tasks are to be split up between 
 *
 */

class Processor implements Runnable {

	private int id;

	public Processor(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Starting : " + id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Completed : " + id);
	}

}

public class App {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor(i));
		}
		
		executor.shutdown();

		System.out.println("All tasks submitted");

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All Tasks Completed");
	}
}
