package Main;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class gamePanel extends JPanel implements Runnable, KeyListener
{
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	private Thread gameThread;
	private boolean isRunning;
	
	private final int FPS = 60;
	private int targetTime = 1000/60;
	
	private BufferedImage image;
	private Graphics2D g;
	

	public gamePanel()
	{
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify()
	{
		super.addNotify();
		if(gameThread == null)
		{
			gameThread = new Thread(this);
			//keylistner here
			gameThread.start();
		}
	}
	
	public void init()
	{
		isRunning = true;
		image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();

	}
	public void run() 
	{
		init();
		
		//Chernos method
		double ns = 1000000000/FPS;
		double delta =0;
		
		int frames =0;
		int updates = 0;
		
		long lastTime  = System.nanoTime();
		long timer = System.currentTimeMillis();
	
		
		while(isRunning)
		{
			long curTime = System.nanoTime();
			
			delta += (curTime - lastTime)/ns;
			lastTime = curTime;
			
			while(delta >= 1)
			{
				update();
				updates++;
				delta--;
			}
			
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer >= 1000)
			{
	        	//System.out.println("Game" + "  |  " + updates + " ups, " + frames + " fps");
	        	timer += 1000;
	        	frames = 0;
	        	updates = 0;	
			}
			
			if(targetTime > delta)
			{
				try
				{
					Thread.sleep(targetTime - (long)delta);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		stop();
	}
	
	public void stop()
	{
		try
		{
			gameThread.join();
			isRunning = false;
			System.exit(0);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}
	
	public void keyPressed(KeyEvent k) 
	{
		// TODO Auto-generated method stub
		
	}


	public void keyReleased(KeyEvent k) 
	{
		// TODO Auto-generated method stub
		
	}


	public void keyTyped(KeyEvent k)
	{
		// TODO Auto-generated method stub
		
	}


}
