package GameStates;

import java.awt.Color;
import java.awt.Graphics2D;

public class playState extends gameStates
{

	public playState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init()
	{
		// TODO Auto-generated method stub
		
	}

	public void update() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		
	}

	@Override
	public void handleInput() 
	{
		// TODO Player controls, when up then move down if I can
		
	}

}
