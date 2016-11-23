package Exercise1;

import javax.swing.JOptionPane;

public class PatientTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				String patientID=JOptionPane.showInputDialog("Enter Patient ID");
				String firstName=JOptionPane.showInputDialog("Enter First Name");
				String lastName=JOptionPane.showInputDialog("Enter Last Name");
				String address=JOptionPane.showInputDialog("Enter address");
				String city=JOptionPane.showInputDialog("Enter city");
				String province=JOptionPane.showInputDialog("Enter province");
				String postCode=JOptionPane.showInputDialog("Enter post Code");
				// instantiating object
				Patient patient=new Patient(patientID, firstName, lastName, address, city,  province, postCode);
			
				JOptionPane.showMessageDialog(null, patient.getPatientInfo());

	}

}
