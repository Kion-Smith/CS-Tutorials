package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import Controls.keyHandler;
import GameStates.gameStatesManager;

//Most of this main game loop type stuff is inspired heavilly from a guy called foreignguymike on youtube, I have only made slight adapations. 
//And he got most of his infromation from the book Killer Game Programming in Java, can be bought on amazon

public class gamePanel extends JPanel implements Runnable, KeyListener
{

	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	private Thread gameThread;
	private boolean isRunning;
	
	private final int FPS = 30;
	private int targetTime = 1000/FPS;
	
	private BufferedImage image;
	private Graphics2D g;
	
	private gameStatesManager gsm;
	
	public gamePanel()
	{
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void init()
	{
		isRunning = true;
		image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		gsm = new gameStatesManager();
		
	}
	
	//Need to use add notify when using Jpanel, if using canvas I could use synchronized start and stop.
	public void addNotify()
	{
		super.addNotify();
		if(gameThread ==null)
		{
			gameThread = new Thread(this);
			addKeyListener(this);
			gameThread.start();
		}
		
	}
	
	public void run()
	{
		init();
	
		long startTime,elapsedTime,waitTime;
		while(isRunning)
		{
			startTime = System.nanoTime();
			
			update();
			render();
			
			elapsedTime = System.nanoTime()-startTime;
			
			waitTime = targetTime - elapsedTime /1000000;
			
			if(waitTime <= 0)
			{
				waitTime = 5;
			}
			
			try
			{
				gameThread.sleep(waitTime);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		stop();
	}
	
	public void stop()
	{
		try
		{
			gameThread.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		isRunning = false;
		System.exit(0);
	}
	
	public void update()
	{
		
		gsm.update();
		keyHandler.update();
	}
	
	public void render()
	{

		
		Graphics g2 = getGraphics();
		gsm.draw(g);
		g2.drawImage(image,0,0,WIDTH,HEIGHT,null);
		g2.dispose();
	}
	
	
	public void keyPressed(KeyEvent k) 
	{
		keyHandler.keySet(k.getKeyCode(), true);
		//System.out.println("Key pressed");
	}

	public void keyReleased(KeyEvent k) 
	{
		keyHandler.keySet(k.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent k) 
	{
		//do nothing
	}


}
