package bank2;

public abstract class BankDetails {
	String name;
	int accountNumber;
	double balance;
		
	BankDetails(String n, int acc, double bal)
	{
		name = n;
		accountNumber = acc;
		balance = bal;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public double getBalance()
	{
		return balance= balance * getInterestRate();
	}
	
	public abstract double getInterestRate();
	public abstract void setInterestRate(double interestRate);
	public abstract void withDraw(double amount);
	public abstract void transfer(double amount, BankDetails acc);
	
	
}
