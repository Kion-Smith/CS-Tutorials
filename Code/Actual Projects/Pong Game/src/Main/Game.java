package Main;

import javax.swing.JFrame;

public class Game 
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		
		frame.setTitle("PONG");
		frame.add(new gamePanel());
		frame.setResizable(true);
	
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
