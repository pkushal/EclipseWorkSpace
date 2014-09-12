package bank;

import java.util.Scanner;

public class NewAccount {
	private String name;
	private int telephone;
	private static Scanner in;
	private int choice;
	private int count = 1000;

	// Constructor
	public NewAccount() {
		name = null;
		telephone = 0;
		}

	public void welcome() {

		in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = in.nextLine();

		if (name != null) {
			System.out.println(name + " , enter your telephone: ");
			telephone = in.nextInt();
		}

		if (telephone != 0) {
			System.out.println(name
					+ " , what type of account do you want to open ?\n");
			System.out
					.println("    Press 1 for Saving account  \n    Press 2 for Checking account  \n    Press 3 for checking:");
			choice = in.nextInt();
			count = count + 1;
			System.out.println("Congratulations !!!  Your account number is "
					+ count);
		}

		switch (choice) {
		case 1:
			Saving sav = new Saving();
			sav.setName(name);
			sav.setTelephone(telephone);
			sav.setAccountNumber(count);
			break;
		case 2:
			Checking che = new Checking();
			che.setName(name);
			che.setTelephone(telephone);
			break;
		case 3:
			Special spe = new Special();
			spe.setName(name);
			spe.setTelephone(telephone);
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

	}

	// TODO
	// welcome screen
	// get all the user info like name, telephone
}