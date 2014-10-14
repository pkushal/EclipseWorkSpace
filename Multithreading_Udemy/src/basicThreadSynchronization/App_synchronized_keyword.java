package basicThreadSynchronization;

/*
 * Every object in java has a intrinsic lock and it can be access by one thread at one time. After the thread is done processing, it will release the
 * intrinsic lock so that others can use it. The method with synchronized keyword needs to have that intrinsic lock to process further. This will solve the 
 * problem as only one thread can increment at once and there will be no interleaving.
 * This intrinsic lock is aka mutex. 
 */
public class App_synchronized_keyword {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}

			}
		});

		t1.start();
		t2.start();
		/*
		 * here the problem is that all the run will run simultaneously and the
		 * thread that runs the main method of the program will also be
		 * executing simultaneously. so when I do syso, the it will display the
		 * current value of the count It will not wait for the threads t1 and t2
		 * to complete their task. To address this problem we need to invoke the
		 * join method on the thread t1 and t2. The join method will pause the
		 * thread that has called the t1 thread, i.e., main thread until the
		 * thread t1 finishes what it needs to do.
		 */
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * Now the interleaving problem: To address the interleaving problem, we
		 * can make that integer atomic. Atomic Integer is a specialized class
		 * that has a method which can make the increment in one step insted of
		 * 3 steps like in count++(count= count+1... step 1: load the value of
		 * count, step 2: increment the count, step 3: load the value of count)
		 */

		System.out
				.println("Expected count value is 20000, the count value is: "
						+ count);
	}

	public static void main(String[] args) {
		App_synchronized_keyword app = new App_synchronized_keyword();
		app.doWork();
	}
}
