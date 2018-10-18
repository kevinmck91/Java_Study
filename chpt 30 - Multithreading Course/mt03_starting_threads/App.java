package mt03_starting_threads;



/**
 * This is how to create a thread without having to create a new class
 * We are passing the Runnable class and method directly to the Thread Class constructor
 * 
 * Interview Answer : What are the two ways of implementing a thread in Java.
 * -	1. Extend the Thread class 
 * - 	2. Implement runnable and pass it to the constructor of the thread class
 *
 */

public class App {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

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

		});

		thread1.start();
		
	}

}
