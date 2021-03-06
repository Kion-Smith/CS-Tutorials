package GameStates;

import java.awt.Graphics2D;

public abstract class gameStates 
{
	protected gameStatesManager gsm;
	
	public gameStates(gameStatesManager gsm)
	{
		this.gsm = gsm;
	}

	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void handleInput(); 
}
