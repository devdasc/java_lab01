package Exercise2;

import javax.swing.JOptionPane;
// driver class
public class BankAccountTester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// prompting and accepting user input
		String accountID=JOptionPane.showInputDialog("Enter account ID");
		String accountName=JOptionPane.showInputDialog("Enter account name");
		String balancestr=JOptionPane.showInputDialog("Enter balance");
		double balance=Double.parseDouble(balancestr);
		// instantiating object 
		BankAccount BA =new BankAccount(accountID,accountName,balance);
				
		String option=JOptionPane.showInputDialog("Enter 'D' for deposit or 'W' for withdraw");
		
			switch(option.toUpperCase()){
			case "D":
				String depositStr=JOptionPane.showInputDialog("Enter Deposit amount");
				double deposit=Double.parseDouble(depositStr);
				BA.Deposit(deposit);
				JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				break;	
			case "W":
				String withdrawStr=JOptionPane.showInputDialog("Enter Withdraw amount");
				double withdraw=Double.parseDouble(withdrawStr);
				BA.Withdraw(withdraw);
				JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				break;
			default:
				JOptionPane.showMessageDialog(null,"Wrong entry !");
				break;
				
			}
	
		}
	
	}


