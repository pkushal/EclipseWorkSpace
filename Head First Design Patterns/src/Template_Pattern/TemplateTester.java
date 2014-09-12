package Template_Pattern;

/**
 * The template pattern defines the skeleton of an algorithm in an operation
 * deferring some steps to the subclass. Gives us an important technique for
 * code reuse
 * 
 * @author Kushal
 * 
 */
public class TemplateTester {
	public static void main(String[] args) {
		CaffineBeverageTemplate tea = new Tea();
		CaffineBeverageTemplate coffee = new Coffee();
		tea.prepare();
		System.out.println("\n");
		coffee.prepare();
	}
}
