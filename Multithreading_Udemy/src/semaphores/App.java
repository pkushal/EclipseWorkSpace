package semaphores;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Connection.getInstance().connect();
		// before we did newFixedThreadPool(int value);
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
	}
}

/*
 * Semaphore is a object that maintains a count and we refer to the counts as
 * available permits of the semaphore
 * 
 * Semaphore sem = new Semaphore(1);
 * 
 * sem.release(); // this will increment the permits. sem.acquire();// this will
 * decrement the permits... it will wait if // there is no permit to acquire
 * 
 * With permits equal to 1, the release and acquire is like lock and unlock. The
 * difference between lock and semaphore is that the lock has to be released
 * from the same thread while the semaphore can be unlocked from any thread.
 * 
 * It is used to control the access to some resource.
 * 
 * System.out.println("Available permits: " + sem.availablePermits());
 */


