package Exercise2;

public class BankAccount {
	// instance variables
	 private String AccountNumber;
	 private String AccountName;
	 private double Balance;
	// constructor
	public BankAccount(String accountNumber,String accountName,double balance)
	{
		this.AccountNumber=accountNumber;
		this.AccountName=accountName;
		this.Balance=balance;
	}
	// getter setter
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public void Withdraw(double amount){
		Balance=Balance-amount;
	}
	public void Deposit(double amount){
		Balance=Balance+amount;
	}
	
	// override string
	public String getAccountInfo()
	{
		String accountInfo="Account Number: "+this.AccountNumber+"\nAccount Name: "+this.AccountName+"\nBalance: "+this.Balance;
		return accountInfo;
	}
	

}
