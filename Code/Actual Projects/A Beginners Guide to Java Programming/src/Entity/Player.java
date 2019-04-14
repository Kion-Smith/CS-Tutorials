package Entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Player 
{
	private final int SMALL =0;
	private final int BIG = 1;
	private final int POWER =2;
	
	private boolean isAlive;
	private boolean canUsePower;
	private int curState;
	private int moveSpeed;
	
	private int x;
	private int y;
	
	
	
	//temp until I get animation
	BufferedImage playerSprite;
	
	
	public Player(int x, int y)
	{
		
	}
	
	public void update()
	{
		handleInput();
	}
	public void draw(Graphics2D g)
	{
		
	}
	
	public void handleInput()
	{
		
	}
	
}
