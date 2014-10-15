package callableAndFuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * With the call and future classes we can have access to the return from the threads. 
 * Before this we were just running the thread and we couldn't do anything from the return
 * of the thread.
 * Instead of Runnable we call, callable interface and override the method called call. 
 * This method is parameterized so we need to give the return type in the parameter; Integer 
 * in this case and also the return type from the call method also be the same.
 * To get the value from the callable, we need an object of future class called future which 
 * will have the values stored. To access the value from there we need the method called get(). 
 */
public class App {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				// this is for throwing exception from call..just arbitrarily
				// for now
				if (duration > 2000) {
					throw new IOException("Sleeping for too long..");
				}

				System.out.println("Starting...");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished...");
				return duration;
			}
		});
		executor.shutdown();
		try {
			System.out.println("Result is : " + future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * The future method has very useful methods that can be used. If I want
		 * to use those methods without using the return then do the following:
		 * 
		 * 
		 * Future<?> future = executor.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				// this is for throwing exception from call..just arbitrarily
				// for now
				if (duration > 2000) {
					throw new IOException("Sleeping for too long..");
				}

				System.out.println("Starting...");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished...");
				return null;
			}
		});
		executor.shutdown();
		 * 
		 */
	}

}
