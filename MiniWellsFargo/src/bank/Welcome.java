package bank;

import java.util.Scanner;

public class Welcome {

	private static int choice;
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		System.out
				.println("\n\n~~~ Welcome to the MiniWellsFargo Demonstration ~~~ ");
		System.out
				.println("\n Press 1 for NEW USER SETUP: \n Press 2 for SAVING ACCOUNT USERS: \n Press 3 for CHECKING ACCOUNT USERS: \n Press 4 for SPECIAL ACCOUNT USERS:  \n Press 5 for EXIT :  ");
		NewAccount user = new NewAccount();
		while (in.hasNextInt()) {
			choice = in.nextInt();
			System.out.println("You entered : " + choice);
			if (choice == 1) {

				user.welcome();

			} else if (choice == 2) {
				Saving user1 = new Saving();
				user.welcome();
			} else if (choice == 3) {
				Checking user2 = new Checking();
				user.welcome();
			}

			else if (choice == 4) {
				Special user3 = new Special();
				user.welcome();
			} else if (choice == 5) {
				System.out.println("Thank you for using the Demo");
			} else {
				System.out
						.println("~~~~ Damn it....Invalid INPUT....Re-run the program to proceed again  ~~~~");
			}
		}

	}
}
