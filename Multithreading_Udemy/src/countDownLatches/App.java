package countDownLatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	private CountDownLatch latch;

	public Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}

}

public class App {
	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			executor.submit(new Processor(latch));
			/*
			 * all the threads will execute the run method and call latch.countDown() after waiting 3
			 * seconds, which will decrement the count 3 defined in the new CountDown(3). Once the count reaches 0
			 * then the latch.await() will be released and then do the code defined afterwards, here it will display 
			 * completed...
			 * 
			 * the CountDownLatch is thread safe so we don't have to do the synchronized keyword.
			 */
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed....");
	}
}
