package mt02_starting_threads;

/**
 * The runner class implements the Runnable interface
 * 	We pass the implemented interface to the to the constructor of the thread class
 */

class Runner implements Runnable{

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
		
		Thread thread1 = new Thread(new Runner());
		Thread thread2 = new Thread(new Runner());
		
		thread1.start();
		thread2.start();
		
		/*
		Threads will not run concurrently :
		thread1.run();
		thread2.start();
		*/
		
	}

}
