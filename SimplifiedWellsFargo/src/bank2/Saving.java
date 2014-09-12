package bank2;

import java.util.Scanner;

public class Saving extends BankDetails {

	double interestRate;

	Saving(String n, int acc, double bal) {
		super(n, acc, bal);
		interestRate = .2;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public void setInterestRate(double interestRate) {
		//yeshma chai interest rate set na garne banako ho jani jani ?
		System.out.println("You have interest rate of " + interestRate
				+ " . We cannot give you more than that.");
	}
	// Aba I will talk software enginereing ko perspective bata
	/*
	 * Never put input output functionality inside your back end code (yesto classes haru lai normally
	 * back end code bhancha ) .. because your withdraw method should be irrespective of whether input 
	 * comes from keyboard or file or http request
	 * so find a way to take the scanner input in main and pass that variable to  withdraw method
	 * [this is not critical in interview questions but an important aspect in writing clean code]
	 *  
	 */
	@Override
	public void withDraw(double amount) {
		Scanner inp;
		int yrs;
		System.out.println("How old is you account?");
		inp = new Scanner(System.in);
		yrs = inp.nextInt();
		if (yrs >= 3) {
			if (amount <= balance) {
				balance = balance - amount;
				System.out.println("You have withdrawed " + amount
						+ " and you have remaining balance of " + balance
						+ "only.");
			} else {
				System.out.println("You have insufficient balance.");
			}
		} else {
			System.out
					.println("Your account is younger than 3 years and you cannot withdraw the money from the Savings account. Please come back after "
							+ (3 - yrs) + " years.");
		}
		inp.close();
	}

	@Override
	public void transfer(double amount, BankDetails acc) {
		if (amount <= balance) {
			balance = balance - amount;
			acc.deposit(amount);
			System.out.println("You have transfered " + amount
					+ " to bank account " + acc.getAccountNumber()
					+ ". You have remaining balance of " + balance + "only.");
		} else
			System.out.println("You have insufficient balance to transfer.");
	}

}