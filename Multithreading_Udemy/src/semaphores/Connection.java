package semaphores;

import java.util.concurrent.Semaphore;

public class Connection {
	private static Connection instance = new Connection();
	private Semaphore sem = new Semaphore(10, true);
	// If I set the boolean fair to true, then which ever thread called acquire
	// first will be the first one to get the permit when a permit becomes
	// available
	private int connections = 0;

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			doconnect();
		} finally {
			sem.release();
		}

	}

	public void doconnect() {
		synchronized (this) {
			connections++;
			System.out.println("Current Connections: " + connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
		}
	}
}
