package Exercise3;
import javax.swing.JOptionPane;
public class GameObjectTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xCoordinate=Double.parseDouble(JOptionPane.showInputDialog("Enter X Coordinate value"));
		double yCoordinate=Double.parseDouble(JOptionPane.showInputDialog("Enter Y Coordinate value"));
		double velocity=Double.parseDouble(JOptionPane.showInputDialog("Enter velocity"));
		String objectState=JOptionPane.showInputDialog("Enter State of Object 'Alive' or 'Dead'");
		int rotation=Integer.parseInt(JOptionPane.showInputDialog("Enter rotation angle"));
		
		GameObject Game= new GameObject(xCoordinate, yCoordinate, velocity, objectState, rotation);
		
		JOptionPane.showMessageDialog(null, Game.getGameObjectInfo());

	}

}
