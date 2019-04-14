package Level;

import java.awt.Graphics2D;
import java.io.File;

public class levelLoader 
{
	
	private File level;
	
	public levelLoader(String l)
	{
		try
		{
			level = new File(getClass().getResourceAsStream("/"+l).toString());
		}
		catch(Exception e)
		{
			System.out.println("There is an error in loading level" + l);
		}
		
		
	}
	
	public void updateLevel(int x, int y)
	{
		
	}
	
	public void drawLevel(Graphics2D g)
	{
		
	}
	
}
