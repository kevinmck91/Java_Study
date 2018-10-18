package mt01_starting_threads;

/**
 * The runner class extends the Java Thread Class 
 *	We are overwriting the run method of the Thread Class
 */

class Runner extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class App {

	public static void main(String[] args) {

		/*	We use start() instead of run().
		 * 	runner1.run() runs the parent method. 
		 * 	runner1.start() runs our overriding method.
		 * 	Both threads run at the same time.
		 */
		
		Runner runner1 = new Runner();
		runner1.start();

		Runner runner2 = new Runner();
		runner2.start();

	}

}
