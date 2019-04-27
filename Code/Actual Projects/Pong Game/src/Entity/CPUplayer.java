package Entity;

import java.awt.Color;
import java.awt.Graphics2D;

import Controls.keyHandler;

public class CPUplayer extends playerBase
{
	public CPUplayer()
	{
		super();
	}

	public CPUplayer(int x, int y)
	{
		curX = x;
		curY = y;
	}
	
	@Override
	public void update() 
	{
		calcNextPostion();
	}

	@Override
	public void render(Graphics2D g) 
	{
		g.setColor(Color.WHITE);
		g.fillRect(this.curX,this.curY,P_WIDTH,P_HEIGHT);
		
	}
	
	
	public void calcNextPostion()
	{
		
	}
	

	public void  setX(int x)
	{
		curX = x;
	}
	
	public void setY(int y)
	{
		curY = y;
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
