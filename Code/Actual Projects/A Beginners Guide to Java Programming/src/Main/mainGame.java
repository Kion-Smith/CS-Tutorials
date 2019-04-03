package Main;

import javax.swing.JFrame;

public class mainGame 
{
	
	public static final String TITLE = "Platform game";
	
	public static void main(String [] args)
	{
		JFrame window = new JFrame(TITLE);
		
		window.add(new gamePanel());
		window.setResizable(true);
	
		window.pack();
		window.setLocationRelativeTo(null);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
