package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Controls.keyHandler;

public class mainMenuState extends gameStates
{
	private BufferedImage background;
	private int selectedItem =0;
	private String[] options = {"START","HELP","QUIT"};
	
	public mainMenuState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
		// TODO Auto-generated constructor stub
	}

	public void init() 
	{
		try
		{
			background = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
			background = ImageIO.read(getClass().getResourceAsStream("/tempBackground.png"));
		}
		catch(Exception e)
		{
			System.out.println("a");
		}
		
	}

	public void update() 
	{
		handleInput();
		
	}

	public void draw(Graphics2D g) 
	{
		g.drawImage(background,0,0,800,600,null);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.PLAIN,48));
		
		g.drawString("Platform Game", 240, 100);
		
		for(int i =0;i<options.length;i++)
		{
			g.drawString(options[i], 340, 300+(i*70));
		}
		
		switch(selectedItem)
		{
			case 0:
				g.drawString(">", 300, 300);
				break;
			case 1:
				g.drawString(">", 300, 370);
				break;
			case 2:
				g.drawString(">", 300, 440);
				break;
			default:
				break;
		}
		
	}

	public void handleInput() 
	{
		
		if(keyHandler.isPressed(keyHandler.DOWN)) 
		{
			if(selectedItem>=2)
			{
				selectedItem =2;
			}
			else
			{
				selectedItem++;
			}
		}
		if(keyHandler.isPressed(keyHandler.UP)) 
		{
			if(selectedItem<=0)
			{
				selectedItem =0;
			}
			else
			{
				selectedItem--;
			}
		}
		if(keyHandler.isPressed(keyHandler.POWER)) 
		{
			selectOption();
		}
	}
	private void selectOption()
	{
		switch(selectedItem)
		{
			case 0:
				gsm.setState(gameStatesManager.PLAY);
				break;
			case 1:
				gsm.setState(gameStatesManager.HELP);
				break;
			case 2:
				System.exit(0);
				break;
			default:
				break;
		}

	}
}
