package Factory_Pattern_Simple;

/**
 * PizzaStore is our abstract Creator class. NYStore and ChicagoStyleStore are
 * the concrete creators createPizza() is the factory method.
 * 
 * Factories produce products. Pizza is the product. NYStyleCheese and Chicago
 * style are the concrete products The creator is a class tht contains the
 * implementation for all the methods to manipulate products (like bake, box,
 * cut) except for the factory method
 * 
 * @author Kushal
 * 
 * 
 *         There is also abstract Factory pattern which uses composition in
 *         contrast to inheritance. It is used to instantiate a family of
 *         products as contrast to single product
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String item) {
		Pizza pizza;
		pizza = createPizza(item);

		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String item);
}
