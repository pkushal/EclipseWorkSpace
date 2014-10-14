package basicThreadSynchronization;

import java.util.Scanner;

/*
 * Volatile keyword prevents caching the variables when they are not changed by that thread.
 */
class Processor extends Thread {
	private volatile boolean running = true;

	public void run() {
		while (running) {
			for (int i = 0; i < 10; i++) {
				System.out.println("hello " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		running = false;
	}
}

public class App_Volatile_KeyWord {
	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press Enter to stop: ");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		proc1.shutDown();
	}
}
