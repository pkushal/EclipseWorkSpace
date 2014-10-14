package startingAThread;

/*
 * This is the second way of implementing the threads in java. Here we implement the interface Runnable instead of extending the Thread class. 
 * Then we put our code in the run method which is the only method in that interface.
 * Finally we instantiate the instances of the Thread class and pass the instance of the Runner1 class in the constructor.
 * 
 */
class Runner1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello " + i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class App2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner1());
		t1.start();
		t2.start();
	}
}
