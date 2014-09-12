package Template_Pattern;

public class Coffee extends CaffineBeverageTemplate {

	@Override
	void brew() {
		System.out.println("Dripping the coffee through the filter...");
	}

	@Override
	void addCondiment() {
		System.out.println("Adding milk and sugar...");
	}

}
