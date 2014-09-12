package Decorator_Pattern;

/**
 * Here I have implemented a decorator pattern. Base component Espresso(b) ma I
 * have added decorators like Mocha and Soy.
 * 
 * @author Kushal
 * 
 */
public class StarBucks {
	public static void main(String[] args) {
		Beverage b = new Espresso();
		b = new Mocha(b);
		b = new Soy(b);
		System.out.println("Your Coffee is : " + b.getDescription()
				+ " and your total is $ " + b.cost() + " only.");

		Beverage b1 = new DarkRoast();
		System.out.println("Your Coffee is : " + b1.getDescription()
				+ " and your total is $ " + b1.cost() + " only.");

		Beverage b2 = new HouseBlend();
		b2 = new Milk(b2);
		// b2 = new DarkRoast(b2); Cannot do this because DarkRoast ma testo
		// constructor define gaerko chaina so.
		System.out.println("Your Coffee is : " + b2.getDescription()
				+ " and your total is $ " + b2.cost() + " only.");
	}
}
