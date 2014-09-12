package Factory_Pattern_Simple;

public class PizzaTestRun {
	public static void main(String[] args) {
		PizzaStore ny = new NYStylePizzaStore();
		Pizza pizza = ny.orderPizza("Cheese");
		pizza.getDescription();
		System.out.println("\n");
		PizzaStore chi = new ChicagoStylePizzaStore();
		Pizza pizzz = chi.orderPizza("Cheese");
		pizzz.getDescription();

	}
}
