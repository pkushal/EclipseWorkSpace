package reentrantLocks;

/*
 * This reentrant lock is alternative for the synchronized block
 */
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();

	private Condition cond = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("Waiting......");
		// await() works same as wait in the synchronized block
		cond.await();
		System.out.println("Cond waken up by the signal method");
		/*
		 * If there is exception in the increment() method, then it will never
		 * be able to unlock the lock so better to surround it with try and
		 * finally block which is confirmed to be called.
		 */
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void SecondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the enter key...");
		new Scanner(System.in).nextLine();
		System.out.println("Got the enter key..");
		
		cond.signal();
		
		try {
			increment();
		} finally {
			//very important to unlock the lock, if not the thread in the firstThread will not get the control to the lock
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Count is: " + count);
	}

}
