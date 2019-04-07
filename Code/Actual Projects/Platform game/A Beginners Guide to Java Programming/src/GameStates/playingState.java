package GameStates;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Entity.Player;
import Level.levelLoader;

public class playingState extends gameStates
{

	BufferedImage playBG;
	levelLoader level;
	Player p;
	
	public playingState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
	}

	public void init() 
	{
	
		try
		{
			playBG = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
			playBG = ImageIO.read(getClass().getResourceAsStream("/playStateBackground.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		level = new levelLoader("Level1.txt");
		//p = new player ();
	}

	public void update() 
	{
	
		
	}

	public void draw(Graphics2D g) 
	{
		g.drawImage(playBG,0,0,800,600,null);
		level.drawLevel(g);
	}

	public void handleInput() 
	{
		
	}

}
