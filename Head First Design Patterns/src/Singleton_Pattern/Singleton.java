package Singleton_Pattern;

/**
 * This is the lazy instantiation of the Singleton class because the
 * uniqueInstance is only instantiated only when required. The constructor is
 * private and the instance, uniqueInstance is static and can be globally
 * accessed. getInstance() is a static method so it is a class method and is
 * called as Singleton.getInstance();
 * 
 * Flaw: It can have more than one instance of the singleton class because when
 * two thread call the getInstance method they will both find no created
 * instance variable and they both will create instance for each.
 * 
 * Solution: Make the getInstance method synchronized by using the keyword
 * synchronized. However synchronized is an expensive operation
 * 
 * public static synchronized Singleton getInstance(){...}
 * 
 * One more method to avoid the multi-threading problem in the singleton class
 * is to use "double checking locking"
 * 
 * @author Kushal
 * 
 */
public class Singleton {
	public static Singleton uniqueInstance;

	private Singleton() {

	}

	private static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
