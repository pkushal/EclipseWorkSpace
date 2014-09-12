package Decorator_Pattern;

/**
 * This is the abstract Component class. HouseBlend, DarkRoast, Espresso and
 * Decaf are the concrete implementation of this abstract beverage class. While
 * CondimentDecorator is the abstract decorator class while Milk, Mocha, Soy,
 * and Whip are the concrete decorator classes.
 * 
 * Runtime ma nai decorator haru add garna milcha...compile time ma define garnu
 * pardina...Avoids Class explosion Without decorator pattern, there would have
 * been class explosion like HouseBlend with Milk, HouseBlend with Mocha,
 * HouseBlend with Milk and Mocha and so on.
 * 
 * @author Kushal
 * 
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
