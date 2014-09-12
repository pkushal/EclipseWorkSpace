package Factory_Pattern_Simple;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Cheese Pizza";
		dough = " thick crust";
		sause = "BBQ sause";
		toppings.add("with littel cheese and bacon slices and pineapple...Umm");
	}

	public void cut() {
		System.out
				.println("This Chicago style pizza has to be cut into Square slices..");
	}
}
