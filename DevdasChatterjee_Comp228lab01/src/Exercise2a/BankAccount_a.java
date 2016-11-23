package Exercise2a;

import javax.swing.JOptionPane;
public  class BankAccount_a {
	private String AccountNumber;
	private String AccountName;
	double Balance;
	// constructor
	public BankAccount_a(String accountNumber,String accountName)
	{
		this.Balance=1000;
		this.AccountNumber=accountNumber;
		this.AccountName=accountName;
		
	}
	//properties
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
	// method for withdraw option
	public void Withdraw(double amount){

			if(amount<=Balance){
				Balance=Balance-amount;
			}
			else
			{
			JOptionPane.showMessageDialog(null, "Transaction Cancelled due to Insufficient Fund !","Error", JOptionPane.ERROR_MESSAGE);
			}
		
	}
	// method for deposit option
	public void Deposit(double amount){
		Balance=Balance+amount;
	}
		// Override formatter
	public String getAccountInfo()
	{
		String accountInfo="Account Number: "+this.AccountNumber+"\nAccount Name: "+this.AccountName+"\nBalance: "+Balance;
		return accountInfo;
	}
	

}


