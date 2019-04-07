package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Controls.keyHandler;

public class helpState extends gameStates 
{
	private BufferedImage background;
	
	public helpState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
	}

	public void init() 
	{
		try
		{
			background = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
			background = ImageIO.read(getClass().getResourceAsStream("/helpTemp.png"));
		}
		catch(Exception e)
		{
			
		}
	}

	public void update() 
	{
		handleInput();
	}

	public void draw(Graphics2D g) 
	{
		g.drawImage(background,0,0,800,600,null);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		
		g.drawString("HELP", 330, 100);
		
		g.setFont(new Font("Arial",Font.PLAIN,20));
		
		g.drawString("-Use the Arrow keys to move", 20, 200);
		g.drawString("-Use the Enter keys to use an ability", 20, 250);
		g.drawString("Press enter to go back", 20, 450);
	}

	public void handleInput() 
	{
		if(keyHandler.isPressed(keyHandler.POWER)) 
		{
			gsm.setState(gameStatesManager.MENU);
		}
	}

}
