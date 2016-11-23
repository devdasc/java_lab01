package Exercise2a;

import javax.swing.*;
import java.util.regex.*;
;

public class BankAccount_a_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountID=JOptionPane.showInputDialog("Enter account ID");
		String accountName=JOptionPane.showInputDialog("Enter account name");
		
		BankAccount_a BA =new BankAccount_a(accountID,accountName);
		
		String option=JOptionPane.showInputDialog(accountName+"'s Account Balance: "+BA.Balance+"\nEnter 'D' for deposit or 'W' for withdraw");
		
			switch(option.toUpperCase()){
			case "D":
				String depositStr=JOptionPane.showInputDialog("Enter Deposit amount");
				Pattern p=Pattern.compile("^[0-9]*$");
				Matcher m=p.matcher(depositStr);
				if(!m.find()){
					//JOptionPane.showInputDialog("Enter a number");
					double deposit=Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid Entry \nPlease Enter a valid number",
							"Error",JOptionPane.ERROR_MESSAGE));
					BA.Deposit(deposit);
					JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				}else
				{
					double deposit=Double.parseDouble(depositStr);
					BA.Deposit(deposit);
					JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				}
				
				break;	
			case "W":
				String withdrawStr=JOptionPane.showInputDialog("Enter Withdraw amount");
				Pattern pattern=Pattern.compile("^[0-9]*$");
				Matcher match=pattern.matcher(withdrawStr);
				if(!match.find())
				{
				double withdraw=Double.parseDouble(JOptionPane.showInputDialog(null,"Invalid Entry \nPlease Enter a valid amount",
							"Error",JOptionPane.ERROR_MESSAGE));
				BA.Withdraw(withdraw);
				JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				}else
				{
					double withdraw=Double.parseDouble(withdrawStr);
					BA.Withdraw(withdraw);
					JOptionPane.showMessageDialog(null, BA.getAccountInfo());
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"Wrong Entry !");
				break;	
			}
		}
	}