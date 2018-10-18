package mt05_thread_synchronization;

/**
 * Without the thread.join() method, the Count will print before the new thread
 * (or even the second new thread) is finished executing. Hence the count will
 * most likely be wrong
 * 
 * The Count will be wrong because one thread will access Count and try to
 * increment it ie. Reads it as 100 In the time thread1 is trying to increment
 * it, thread2 has successfully incremented it twice (102). Hence thread1 ends
 * up rewriting the 102 as 101 skipping a number.
 * 
 * 
 * 
 */

public class App {

	private int count = 0;

	public static void main(String[] args) {

		App app = new App();
		app.doWork();

	}

	private void doWork() {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}
		});
		// end of method declaration

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Count is : " + count);

	}
}
