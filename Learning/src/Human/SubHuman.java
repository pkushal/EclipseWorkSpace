package Human;

public class SubHuman extends Human {

	private double height;

	public SubHuman() {

		height = 5.9;
		System.out
				.println("This is display from the SubHuman class constructor");
		System.out.println("Your Height is " + height);
	}

	public static void main(String[] args) {
		SubHuman kushal = new SubHuman();// super() gare pani nagare pani Human
											// Constructor ko default empty
											// constructor affai lincha; but
											// Human constructor ma empty
											// constructor chaina bhane, error
											// aaucha; non- empty constructor
											// cha bahne super something garnu
											// parcha
		// Human kpp = new Human();
		// kpp.display();
		kushal.display();
	}

	// methods haru ma chai super garnu parcha, natra bhane SubHuman class ko
	// display matra call garcha, but super.display() gare par Human class ko
	// display call garcha

	public void display() {
		super.display();
		System.out
				.println("This is display from display method of the SubHuman class");
	}
}
