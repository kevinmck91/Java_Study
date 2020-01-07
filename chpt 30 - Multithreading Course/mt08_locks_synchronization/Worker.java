package mt08_locks_synchronization;

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
 * using the same iteriating loop to access the two lists
 * 
 */

public class Worker {

	private Random random = new Random();

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
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		list1.add(random.nextInt(10000));
	}

	public void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt(10000));
	}

}
