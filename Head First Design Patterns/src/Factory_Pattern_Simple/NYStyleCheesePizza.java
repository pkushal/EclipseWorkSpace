package Factory_Pattern_Simple;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NewYork Style Cheese Pizza";
		dough = " thin crust";
		sause = " thick tomato sause";
		toppings.add("with extra cheese and chicken slices...Umm");
		toppings.add("Mushrooms");
		toppings.add("spinach");
	}
}
