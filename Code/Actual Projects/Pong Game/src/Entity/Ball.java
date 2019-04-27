package Entity;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball 
{
	public int curX;
	public int curY;
	public int speedX = 5;
	public int speedY = 5;
	private final int B_SIZE = 20;
	
	
	public Ball()
	{
		
	}
	
	public Ball(int x, int y)
	{
		curX = x;
		curY = y;
	}
	
	public void render(Graphics2D g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(curX,curY,B_SIZE,B_SIZE);
	}
	
	public void resetBall(int x,int y)
	{
		curX = x;
		curY = y;
	}
	
	
}
