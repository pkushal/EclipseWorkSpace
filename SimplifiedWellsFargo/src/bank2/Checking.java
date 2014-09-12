package bank2;

public class Checking extends BankDetails {

	double interestRate;

	Checking(String n, int acc, double bal) {
		super(n, acc, bal);
		interestRate = 1;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void withDraw(double amount) {
		//this part of code looks similar in both the cases
		// make this function in BankDetails and use super.withDraw inside yrs>=3 of Saving 
		// i think same is the case for transfer
		if (amount <= balance) {
			balance = balance - amount;
			System.out
					.println("You have withdrawed " + amount
							+ " and you have remaining balance of " + balance
							+ "only.");
		} else
			System.out.println("You have insufficient balance.");
	}

	@Override
	public void transfer(double amount, BankDetails acc) {
		if (amount <= balance) {
			balance = balance - amount;
			acc.deposit(amount);
			System.out.println("You have transfered " + amount
					+ " to bank account " + acc.getAccountNumber()
					+ ". You have remaining balance of " + balance + " only.");
		} else
			System.out.println("You have insufficient balance to transfer.");
	}

}
