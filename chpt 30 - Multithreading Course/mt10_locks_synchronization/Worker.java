package mt10_locks_synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Currently this program runs one thread (the main one) Since the programs
 * loops 1000 times twice, and pauses for a millisecond each loop, the total
 * time to run the program is just over two seconds.
 * 
 * You should be able to create multiple threads to to run the process() method
 * and therefore work quicker
 * 
 * Multiple data are trying to access shared data - error (in this case they are
 * using the same iteriating loop to access the two lists.
 * 
 * We can try and make the two Stage() methods Synchronized - This will always
 * run the loops the correct number of time but the time takes twice as long.
 * For the worker object, there is only one intrinsic log. Hence the second
 * method cannot run until the first method is finished. (even thought they are
 * called from two different threads)
 * 
 * Create two Lock objects and instead of synchronized methods, we have two
 * synchronized code blocks within those method. Now two threads can run these
 * two methods at the same time. If one thread has entered the synchronized code
 * block, the second thread has to wait until the first unlocks it (as we have
 * two locks both work in sync)
 */

public class Worker {

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void main() {

		System.out.println("Starting...");

		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				process();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				process();
			}

		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long stop = System.currentTimeMillis();

		System.out.println("Time taken = " + (stop - start));
		System.out.println("Listy 1 size = " + list1.size()
				+ "; List 2 size = " + list2.size());

	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void stageOne() {

		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			list1.add(random.nextInt(10000));
		}

	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(10000));
		}
	}

}
