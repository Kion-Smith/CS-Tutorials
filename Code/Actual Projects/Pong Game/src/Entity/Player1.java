package Entity;

import java.awt.Color;
import java.awt.Graphics2D;

import Controls.keyHandler;

public class Player1 extends playerBase
{
	
	public Player1()
	{
		super();
	}
	
	public Player1(int x, int y)
	{
		curX =x;
		curY = y;
	}
	
	public void update() 
	{
		handleInput();
	}

	
	public void render(Graphics2D g) 
	{
		g.setColor(Color.WHITE);
		g.fillRect(this.curX,this.curY,P_WIDTH,P_HEIGHT);
	}

	public void handleInput()
	{
		if(keyHandler.isHeld(keyHandler.UP) && curY > 0)
		{
			curY-=moveSpeed;
		}
		if(keyHandler.isHeld(keyHandler.DOWN) && curY<600 - P_HEIGHT)
		{
			curY+=moveSpeed;
		}
	}
	
	public int getX()
	{
		return curX;
	}
	
	public int getY()
	{
		return curY;
	}
}
