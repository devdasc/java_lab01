package Exercise2b_GUI;

import java.awt.*;
import javax.swing.*;


public class BankDemo 
{
	public static void main(String Args){
	// setting up frame	
	JFrame frame= new JFrame("Account");// instantiate of frame object
	frame.setVisible(true);// set the frame visible
	frame.setSize(300,200);// set the size of the frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// frame will close on EXIT
	//setting up panel
	JPanel panel=new JPanel();
	frame.add(panel);// adding panel to the frame
	panel.setBackground(Color.ORANGE);// setting panel color to ORANGE
	frame.setResizable(false);// frame is set to non-resizable
	// to get frame in the center of screen
	Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();//get the screen width
	int x=(int)((dimension.getWidth()-frame.getWidth())/2);// setting x value as center of the screen
	int y=(int)((dimension.getHeight()-frame.getHeight())/2);// setting y value as center of the screen
	frame.setLocation(x,y);
	
	}
}
