package GameStates;

import java.awt.Graphics2D;

public class gameStatesManager 
{
	private gameStates[] gs;
	private int curState;
	
	
	public static final int MENU = 0;
	public static final int HELP = 1;
	public static final int PLAY = 2;
	public static final int GAMEOVER = 3;
	
	public static final int NUMOFSTATES = 4;
	
	
	public gameStatesManager()
	{
		gs = new gameStates[NUMOFSTATES];
		setState(MENU);
	}
	
	public void setState(int state)
	{
		curState = state;
		
		switch(state)
		{
			case MENU:
				gs[state] = new mainMenuState(this);
				break;
			case HELP:
				gs[state] = new helpState(this);
				break;
			case PLAY:
				gs[state] = new playingState(this);
				break;
			case GAMEOVER:
				gs[state] = new gameOverState(this);
				break;
			default:
				break;
		}
	}
	
	public void update()
	{
		gs[curState].update();
	}
	
	public void draw(Graphics2D g)
	{
		gs[curState].draw(g);
	}
}
