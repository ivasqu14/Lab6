
public class SavingsAccount extends BankAccount{
	double rate = 0.025;
	int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double balance)
	{
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-10" + savingsNumber;
	}
	
	public void postInterest()
	{
		double interest;
		interest = (super.getBalance() * rate) / 12;
		super.deposit(interest);
	}
	
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
}
