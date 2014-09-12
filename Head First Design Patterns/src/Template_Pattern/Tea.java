package Template_Pattern;

public class Tea extends CaffineBeverageTemplate {

	@Override
	void brew() {
		System.out.println("Steeping the tea...");

	}

	@Override
	void addCondiment() {
		System.out.println("Adding lemon and sugar...");
	}

}
