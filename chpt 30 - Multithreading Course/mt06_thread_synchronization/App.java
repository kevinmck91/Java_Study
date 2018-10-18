package mt06_thread_synchronization;

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
 * We can remove the join() method and make the count++ operator synchronized
 * instead.
 * 
 * Rather than putting count++ in the run() method, have the run() method call a
 * method designed to increment and add the synchronized keyword.
 * 
 * A synchronized method can only be called by one thread at a time.
 * 
 */

public class App {

	private int count = 0;

	public static void main(String[] args) {

		App app = new App();
		app.doWork();

	}

	private synchronized void increment() {
		count++;
	}

	private void doWork() {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		// end of method declaration

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count is : " + count);

	}
}
