package waitAndNotify;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		// synchronized on the processor Object i.e. intrinsic lock of the
		// processor
		synchronized (this) {
			System.out.println("Producer Thread Running");
			/*
			 * This wait will wait s.t it will not consume lot of resource After
			 * encountering the wait() method, it relinquishes the lock object
			 * and only regain it when some other tells it to wakeup via a
			 * notify method or notifyAll method. It can be called only in the
			 * synchronized block
			 */
			wait();
			System.out.println("Producer Resumed after the wait() method");
		}
	}

	public void consume() throws InterruptedException {
		System.out.println("Hi I am thread 2 running simultaneously with Thread 1");
		Scanner scanner = new Scanner(System.in);
		// this sleep will make sure that the produce will start first.
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for the enter key...");
			scanner.nextLine();
			System.out.println("Enter key pressed...");
			// this will notify the threads locked on the same object, here the processor object
			//but doesn't yet relinquish the control yet so after notify is called close the synchronized block
			// no codes after that.
			notify();
			
		}
	}
}
