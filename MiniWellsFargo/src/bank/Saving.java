package bank;

public class Saving extends BankAccount {

	String name;
	int telephone;
	int accountnumber;
	double balance;
	double interest;
	double time;

	public Saving() {
		name = null;
		telephone = 0;
		accountnumber = 0;
		balance = 0;
		interest = 0.1;
		time = 0;
	}

	public void welcome() {
		System.out.println("Welcome to Savings Account");
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance) {
			balance = balance - amount;
		} else
			System.out.println("Insufficient Amount");
		// TODO Auto-generated method stub

	}

	@Override
	public double balance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return accountnumber;
	}

	@Override
	public void transfer(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTelephone(int telephone) {
		// TODO Auto-generated method stub
		this.telephone = telephone;

	}

	@Override
	public void setAccountNumber(int acc) {
		accountnumber = acc;
		// TODO Auto-generated method stub
		
	}
}

// TODO
// need to make a constructor