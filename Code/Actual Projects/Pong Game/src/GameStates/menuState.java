package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Controls.keyHandler;

public class menuState extends gameStates
{
	private String[] menuItems = {"Play","Help", "Quit"};
	private int curSelection = 0;
	
	public menuState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
	}

	public void init() 
	{
		
	}

	public void update() 
	{
		handleInput();
	}

	public void draw(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		g.drawString("Pong Game", 260, 100);
		
		g.setFont(new Font("Arial",Font.PLAIN,24));
		for(int i =0;i<menuItems.length;i++)
		{
			g.drawString(menuItems[i], 360, 300+(i*70));
		}
		
		switch(curSelection)
		{
			case 0:
				g.drawString(">", 340, 300);
				break;
			case 1:
				g.drawString(">", 340, 370);
				break;
			case 2:
				g.drawString(">", 340, 440);
				break;
			default:
				break;
		}
	}

	public void handleInput() 
	{
		if(keyHandler.isPressed(keyHandler.DOWN)) 
		{
			if(curSelection>=2)
			{
				curSelection =2;
			}
			else
			{
				curSelection++;
			}
		}
		else if(keyHandler.isPressed(keyHandler.UP)) 
		{
			if(curSelection<=0)
			{
				curSelection =0;
			}
			else
			{
				curSelection--;
			}
		}
		else if(keyHandler.isPressed(keyHandler.ENTER))
		{
			makeSelection();
		}
		
	}
	
	public void makeSelection()
	{
		switch(curSelection)
		{
			case 0:
				gsm.setState(gameStatesManager.PLAY);
				break;
			case 1:
				gsm.setState(gameStatesManager.HELP);
				break;
			case 2:
				System.exit(0);
				break;
			default:
				break;
		}
	}

}
