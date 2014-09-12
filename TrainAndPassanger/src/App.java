public class App {
	// static Train train = new Train(); ....yo gare pani huncha...main bhanne
	// static method le only static reference lai matra access garna milcha...so
	// need to define as static
	
	Train train = new Train();

	public static void main(String[] args) {

		// Let's add some passangers in array
		Passanger passanger1 = new Passanger("John", 'm', 68, 25);
		Passanger passanger2 = new Passanger("Bob", 'm', 60, 26);
		Passanger passanger3 = new Passanger("Sean", 'm', 49, 45);
		Passanger passanger4 = new Passanger("David", 'm', 56, 32);
		Passanger passanger5 = new Passanger("Jeff", 'm', 12, 8);
		Passanger passanger6 = new Passanger("Jan", 'f', 23, 11);
		Passanger passanger7 = new Passanger("Tracy", 'f', 75, 55);
		Passanger passanger8 = new Passanger("Ceryl", 'f', 52, 34);

		// Passanger array
		Passanger[] passangers = new Passanger[] { passanger1, passanger2,
				passanger3, passanger4, passanger5, passanger6, passanger7,
				passanger8 };
		App app  = new App();
		app.jpt(passangers);

	}

	
	public void jpt(Passanger[] passangers) {
		System.out.println("The total weight of the Passangers is: "
				+ train.getTotalWeight(passangers));
		System.out.println("Total number of children below the age of 12 is : "
				+ train.countChildren(passangers));
		System.out.println("The total number of male in the Train is: "
				+ train.countGender(passangers, true));
		System.out.println("The total number of female in the Train is: "
				+ train.countGender(passangers, false));
		System.out.println();
		train.showPassanger(passangers);
	}

}



/*
 * public class App {
	// static Train train = new Train(); ....       yo gare pani huncha...main bhanne
													// static method le only static reference lai matra access garna milcha...so
													// need to define as static
	
	

	public static void main(String[] args) {

		Train train = new Train();
	
		// Let's add some passangers in array
		Passanger passanger1 = new Passanger("John", 'm', 68, 25);
		Passanger passanger2 = new Passanger("Bob", 'm', 60, 26);
		Passanger passanger3 = new Passanger("Sean", 'm', 49, 45);
		Passanger passanger4 = new Passanger("David", 'm', 56, 32);
		Passanger passanger5 = new Passanger("Jeff", 'm', 12, 8);
		Passanger passanger6 = new Passanger("Jan", 'f', 23, 11);
		Passanger passanger7 = new Passanger("Tracy", 'f', 75, 55);
		Passanger passanger8 = new Passanger("Ceryl", 'f', 52, 34);

		// Passanger array
		Passanger[] passangers = new Passanger[] { passanger1, passanger2,
				passanger3, passanger4, passanger5, passanger6, passanger7,
				passanger8 };
		
		
		System.out.println("The total weight of the Passangers is: "
				+ train.getTotalWeight(passangers));
		System.out.println("Total number of children below the age of 12 is : "
				+ train.countChildren(passangers));
		System.out.println("The total number of male in the Train is: "
				+ train.countGender(passangers, true));
		System.out.println("The total number of female in the Train is: "
				+ train.countGender(passangers, false));
		System.out.println();
		train.showPassanger(passangers);

	}

}

*/
