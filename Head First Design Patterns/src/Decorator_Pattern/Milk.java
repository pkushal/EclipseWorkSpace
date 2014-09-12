package Decorator_Pattern;

public class Milk extends CondimentDecorator {
	Beverage beverage; // An instance variable to hold the beverage we are
						// wrapping

	/**
	 * A way to set this instance variable to the object we wrapping. We are
	 * going to pass the beverage and wrapping to decorator constructor
	 * 
	 * @param beverage
	 */
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}

}
