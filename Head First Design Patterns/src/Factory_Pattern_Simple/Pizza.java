package Factory_Pattern_Simple;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sause;
	public ArrayList<String> toppings = new ArrayList<>();

	public void bake() {
		System.out.println("Baking Pizza at 350 for 10 mins...");
	}

	public void cut() {
		System.out.println("Making radial slices of the pizza...");
	}

	public void box() {
		System.out.println("Pizza boxed in the PapaJohns custom box...");
	}

	public void getDescription() {
		System.out.println("This is " + name + " with " + dough + " and "
				+ sause);

		System.out.println("\t Added toppings are: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("\t \t" + toppings.get(i));
		}
	}
}
