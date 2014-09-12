package Factory_Pattern_Simple;

/**
 * this is like a factory which controls which kind of NY style pizza is to be
 * ordered. For now it has only Cheese kind of pizza...I can add more type of NY
 * Style pizza like pepporoni, sausage etc..
 * 
 * @author Kushal
 * 
 */
public class NYStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("Cheese")) {
			return new NYStyleCheesePizza();
		} else
			System.out.println("No such pizza found....");
		return null;
	}

}
