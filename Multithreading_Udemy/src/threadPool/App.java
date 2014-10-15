package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;
	public Processor(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Starting the id: " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed: " + id);
	}
}

public class App {
	public static void main(String[] args) {
		/*Instead of using the thread class we are using the executorService class
		Thread pool is like having number of workers in a factory.
		When the thread complete one task they start the new task from the bunch of tasks given*/
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor(i));
		}
		
		// Managerial method of the executor; stops accepting new task after completing what all the thread  are doing.
		executor.shutdown();

		System.out.println("All task submitted to the Executor and I am not accepting any more task");

		try {
			// time I want to wait for the executor to complete the given task, if not completed, it will leave the task
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All tasks completed");
	}
}
