package Adaptor_Pattern;

/**
 * Decorator Pattern doesn't alter the interface but adds responsibility.
 * Adaptor Pattern converts one interface to another. Facade Pattern makes
 * interface simpler
 * 
 * @author Kushal
 * 
 */

public class AdaptorTester {
	public static void main(String[] args) {
		DuckBehaviour duck = new Duck();
		TurkeyBehaviour turkey = new Turkey();

		duck.quack();
		duck.fly();
		System.out.println("\n");
		turkey.gooble();
		turkey.fly();

		System.out.println("\nNow using the adaptor pattern..");
		System.out
				.println("\nDuckAdaptor first....Target is Turkey, Adaptee is Duck and Adapator is DuckAdaptor");

		/**
		 * DuckAdaptor implements TurkeyBehaviour which is basically Turkey and
		 * we are invoking the methods of Turkey like gooble() and fly(). But
		 * what it actually does is it adapts the adaptee(Duck) to handle those
		 * method calls
		 */
		DuckAdaptor da = new DuckAdaptor(duck);
		da.gooble();
		da.fly();

		System.out.println("\n");
		System.out
				.println("\nNow the TurkeyAdaptor..Target is Duck, Adaptee is Turkey");
		TurkeyAdaptor ta = new TurkeyAdaptor(turkey);
		ta.quack();
		ta.fly();
	}
}
