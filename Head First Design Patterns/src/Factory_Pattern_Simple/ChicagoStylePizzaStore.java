package Factory_Pattern_Simple;

/**
 * this is also a separate factory for creating the Chicago style pizza
 * 
 * @author Kushal
 */
public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("Cheese")) {
			return new ChicagoStyleCheesePizza();
		} else
			System.out.println("No such pizza found....");
		return null;
	}

}
