package deadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	/*
	 * Here note the sequence of lock in the first and second thread. Deadlock
	 * will happen when lock1 is locked by the first thread and lock2 is lock2
	 * is locked by the second thread. Then there will be deadlock as first
	 * thread cannot proceed further without locking the lock2 which is locked
	 * by second thread and vice versa. Neither of the thread can proceed as
	 * each of the thread has got the lock that the other one had got.
	 * 
	 * 
	 * Solution: 1. Always lock your lock in same order 2. Use a method to
	 * acquire locks in any order as below:
	 */

	private void acquireLocks(Lock firstLock, Lock secondLock)
			throws InterruptedException {
		while (true) {
			// Acquire the lock
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			try {
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			} finally {
				if (gotFirstLock && gotSecondLock) {
					// If both locks are there, I will just return to the
					// method, else wait while both locks are free using
					// Thread.sleep() method.
					return;
				}
				if (gotFirstLock) {
					// Else unlock it because I want the other thread to get a
					// chance to get those locks
					firstLock.unlock();
				}
				if (gotSecondLock) {
					// Else unlock it because I want the other thread to get a
					// chance to get those locks
					secondLock.unlock();
				}
			}

			// Lock not acquired
			Thread.sleep(1);
		}
	}

	public void firstThread() throws InterruptedException {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {

			acquireLocks(lock1, lock2);
			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			acquireLocks(lock2, lock1);
			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account Balalce in account 1 is: "
				+ acc1.getBalance());
		System.out.println("Account Balalce in account 2 is: "
				+ acc2.getBalance());
		System.out.println("Total Balalce in both accounts is: "
				+ (acc1.getBalance() + acc2.getBalance()));
	}
}
