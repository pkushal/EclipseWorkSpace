package startingAThread;

/*
 * Here we have instantiated the Thread class and passed the instance of the Runnable in the constructor.
 * To make the instance of the Runnable we have use the anonymous class as Runnable is a interface.
 * Finally start the thread
 */
public class App3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

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

		});
		t1.start();
	}
}
