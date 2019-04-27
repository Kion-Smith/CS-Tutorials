package Entity;

import java.awt.Graphics2D;

public abstract class playerBase 
{
	protected int curX;
	protected int curY;
	protected int moveSpeed = 10;
	
	protected final int P_WIDTH = 10;
	protected final int P_HEIGHT = 130;
	
	public playerBase() 
	{
		curX = 0;
		curY =0;
	}
	
	public abstract void update();
	public abstract void render(Graphics2D g);

}
