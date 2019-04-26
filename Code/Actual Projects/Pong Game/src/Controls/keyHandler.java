package Controls;

import java.awt.event.KeyEvent;

public class keyHandler 
{
	public static int UP = 0;
	public static int DOWN = 1;
	//public static int LEFT = 2;
	//public static int RIGHT = 3;
	public static int ENTER = 2;
	
	public static final int NUMOFKEYS = 3;
	
	public static boolean keyStates[] = new boolean[NUMOFKEYS];
	public static boolean prevKeyStates[] = new boolean[NUMOFKEYS];
	
	public static void keySet(int i, boolean b)
	{
		switch(i)
		{
			case KeyEvent.VK_UP:
				keyStates[UP] = b;
				break;
			case KeyEvent.VK_DOWN:
				keyStates[DOWN] = b;
				break;
				/*
			case KeyEvent.VK_LEFT:
				keyStates[LEFT] = b;
				break;
			case KeyEvent.VK_RIGHT:
				keyStates[RIGHT] = b;
				break; */
			case KeyEvent.VK_ENTER:
				keyStates[ENTER] = b;
				break;
			default:
				break;
				
		}
	}
	
	public static void update()
	{
		for(int i =0;i<NUMOFKEYS;i++)
		{
			prevKeyStates[i] = keyStates[i];
		}
	}
	
	public static boolean isPressed(int i)
	{
		if(keyStates[i] && !prevKeyStates[i])
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isHeld(int i)
	{
		if(keyStates[i] && prevKeyStates[i])
		{
			return true;
		}
		
		return false;
	}
	
}