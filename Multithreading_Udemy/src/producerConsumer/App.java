package producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	// this is thread safe and we do not need to worry about the thread synchronization
	// This is like a thread safe queue with good taken() and put() methods.
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

	private static void producer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			// this will generate the random number between 0 and 99
			queue.put(random.nextInt(100));// if the queue is full, it will wait
											// until there is some deletion.
		}
	}

	private static void consumer() throws InterruptedException {
		Random random = new Random();

		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take(); // take will wait if the queue is
												// empty.
				System.out.println("Taken value: " + value
						+ " and Queue size is : " + queue.size());
			}
		}
	}
}
