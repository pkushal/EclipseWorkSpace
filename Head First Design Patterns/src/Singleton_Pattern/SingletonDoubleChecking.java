package Singleton_Pattern;

/**
 * The volatile keyword ensures that multiple threads handle the uniqueInstance
 * variable correctly
 * 
 * @author Kushal 
 * This method is a overkill if the application is not resource
 * sensitive
 */
public class SingletonDoubleChecking {
	private volatile static SingletonDoubleChecking UniqueInstance;

	private SingletonDoubleChecking() {
	}

	public static SingletonDoubleChecking getInstance() {
		if (UniqueInstance == null) {
			synchronized (SingletonDoubleChecking.class) {
				// Checks again if there is a instance of
				// SingletonDoubleChecking class is created or not.
				if (UniqueInstance == null) {
					UniqueInstance = new SingletonDoubleChecking();
				}
			}
		}
		return UniqueInstance;
	}
}
