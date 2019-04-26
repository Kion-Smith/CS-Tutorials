package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Controls.keyHandler;

public class helpState extends gameStates
{

	public helpState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
	}

	@Override
	public void init() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() 
	{
		handleInput();	
	}

	@Override
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.WHITE);
		
		g.setFont(new Font("Arial",Font.PLAIN,32));
		g.drawString("The Controls", 280, 100);
		
		g.setFont(new Font("Arial",Font.PLAIN,24));
		g.drawString("-Press up arrow key to move up", 200, 250);
		g.drawString("-Press down arrow key to move down", 200, 350);
		g.drawString("-Press enter to go back to the main menu", 200, 450);
	}

	@Override
	public void handleInput() 
	{
		if(keyHandler.isPressed(keyHandler.ENTER))
		{
			gsm.setState(gsm.MENU);
		}
		
	}

}
