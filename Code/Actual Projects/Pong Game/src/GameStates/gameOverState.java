package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Controls.keyHandler;

public class gameOverState extends gameStates
{

	public gameOverState(gameStatesManager gsm) 
	{
		super(gsm);
		// TODO Auto-generated constructor stub
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
		g.setColor(Color.RED);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.BLACK);

		g.setFont(new Font("Arial",Font.PLAIN,32));
		g.drawString("You lose", 280, 100);
		
		g.setFont(new Font("Arial",Font.PLAIN,24));
		g.drawString("-Press up enter to go back to the main menu", 200, 250);
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
