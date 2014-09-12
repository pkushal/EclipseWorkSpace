package bank;

public abstract class BankAccount {
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract double balance();

	public abstract String getName();

	public abstract void setName(String name);

	public abstract void setTelephone(int telephone);

	public abstract void setAccountNumber(int acc);

	public abstract int getAccountNumber();

	public abstract void transfer(double amount);

}
