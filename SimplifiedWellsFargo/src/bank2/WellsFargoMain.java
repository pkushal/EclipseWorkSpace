package bank2;

import java.util.Scanner;

public class WellsFargoMain {

	private static Scanner choice;
	private static BankDetails[] bankAccount; //this array is never initialized
	

	public static void main(String[] args) {
		//lets assume your application can only handle 100 accounts
		//first you should say java that you need space for 100 accounts
		//Lesson of the day : Dont forget to initialize array :):)
		
		bankAccount = new BankDetails[100];
		
		choice = new Scanner(System.in);
		System.out
				.println("```````````````Welcome to the Simplified WellsFargo Demo``````````````````");

		for (int i = 1; i < 5; i++) {
			System.out.println("Enter a name: ");
			String name = choice.next();
			if (i<3){
			bankAccount[i] = new Checking(name, 10000 + i, 1000); //also you need to do new here in each index - saying this is correct what you have done
			}
			else
			{
				bankAccount[i] = new Saving(name, 10000 + i, 1000);
			}
		}
		
		for (int i = 1; i < 5; i++) {
			System.out.println(	bankAccount[i].getName());
			System.out.println(	bankAccount[i].getAccountNumber());
			System.out.println(	bankAccount[i].getBalance()); 
			bankAccount[i].transfer(20, bankAccount[2]);
			
		}

	}
}
