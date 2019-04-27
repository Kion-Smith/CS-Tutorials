package GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Entity.Ball;
import Entity.CPUplayer;
import Entity.Player1;

public class playState extends gameStates
{

	private Player1 p1;
	private CPUplayer cpu;
	private Ball ball;
	
	private int pScore = 0;
	private int cpuScore = 0;
	
	public playState(gameStatesManager gsm) 
	{
		super(gsm);
		init();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init()
	{
		ball = new Ball (385,290);
		p1 = new Player1(10,250);
		cpu = new CPUplayer(780,250);
		
	}

	public void update() 
	{

		
		p1.update();
		
		if((int)(Math.random()*2) == 1)
		{
			if(cpu.getY()<ball.curY && cpu.getY() < 480 )
			{
				System.out.println(cpu.getY());
				cpu.setY(cpu.getY()+5);
			}
			
			if(cpu.getY()>ball.curY && cpu.getY() > 0)
			{
				
				cpu.setY(cpu.getY()-5);
			}
		}

		int locSpeed = 0;
		//checking horizontally
		if(ball.curX>800-40)
		{
			System.out.println(ball.curX);
			if(cpu.getY() < ball.curY && cpu.getY()+110 >= ball.curY)
			{
				locSpeed = calcSpeed(ball.curY,cpu.getY(),cpu.getY()+110);
				ball.speedY = locSpeed;
				ball.speedX*=-1;
				
			}
			else
			{
				ball.speedX*=-1;
				pScore++;
				ball.speedY = 5;
				ball.resetBall(385,290);
			}

		}
		else if(ball.curX<20)
		{
			if(p1.getY() < ball.curY && p1.getY()+110 >= ball.curY)
			{
				
				locSpeed = calcSpeed(ball.curY,p1.getY(),p1.getY()+110);
				ball.speedY = locSpeed;
				ball.speedX*=-1;
			}
			else
			{
				ball.speedX*=-1;
				cpuScore++;
				ball.speedY = 5;
				ball.resetBall(385,290);
			}

		}

		//checking vertical
		if(ball.curY>600-20 || ball.curY<0 )
		{
				ball.speedY *=-1;
		}

		ball.curX+=ball.speedX;
		ball.curY+=ball.speedY;
		locSpeed =0;
		

	
		
		
		if(cpuScore >= 10 )
		{
			gsm.setState(gsm.GAMEOVER);
		}
		
		if(pScore >= 10)
		{
			gsm.setState(gsm.WIN);
		}

		
		
	}
	
	public int calcSpeed(int value, int low, int high)
	{
		int speed = 5;
		int temp =0;
		if(Math.abs(value - low) > Math.abs(value- high))
		{
			temp = Math.abs(value - low);
			System.out.println("L"+temp);
		}
		else
		{
			temp = Math.abs(value- high);
			System.out.println("H"+temp);
		}
		
		if(temp>=80)
		{
			speed = 12;
		}
		else if(temp>=70)
		{
			speed = 8;
		}
		else
		{
			speed = 5;
		}

	
		return  speed;
	}

	@Override
	public void draw(Graphics2D g) 
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.WHITE);
		
		g.setFont(new Font("Dialog",Font.PLAIN,48));
		g.drawString(pScore+"", 260, 100);
		g.drawString(cpuScore+"", 500, 100);
		
		for(int i =0;i<7;i++)
		{
			g.fillRect(390, 110*i, 10, 50);
		}
		
		p1.render(g);
		cpu.render(g);
		
		ball.render(g);
		
		
		
	}

	@Override
	public void handleInput() 
	{
		// TODO Player controls, when up then move down if I can
		
	}

}
