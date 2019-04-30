
public class ep4 
{
	public static void main(String [] args)
	{
		
		boolean isTrue = false;
		//!isTure;
		// < > == <= => ! != .equals
		int x = 90;
		
			/*
		if(x == 90)
		{
			System.out.println("You made an A");
		}
		*/
	
		/*
		if(x >= 90)
		{
			System.out.println("You made an A");
		}
		else
		{
			System.out.println("You didnt make an A");
		}
		*/
		
		
		
		if(x >= 90)
		{
			System.out.println("You made an A");
		}
		else if(x == 70)
		{
			System.out.println("You passed"); 
		}
		else
		{
			System.out.println("You Failed"); 
		}
		
		
		
		  x = 100;
		switch(x)
		{
			case 90:
				System.out.println("90 was the input");
				break;
			case 10:
				System.out.println("10 was the input");
				break;
			default:
				System.out.println("Couldnt find the input");
				break;
		}
		
		//while loop
		while(x>10)
		{
			x--;
			System.out.println(x);
		}
		
		/*
		//do while loop
		do
		{
			//some logic
		}
		while(x<10);*/
		
		//for(varible; condtion ; increment/dec)
		for(int i =0; i <=10;i++) 
		{
			System.out.println(i);
		}
		
		int[] array = {1,2,3};
		int[] arry2 = new int[10];//
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		for(int i:array)
		{
			System.out.println(i);
		}
		
		//System.out.println(array[2]);
		
	}
	
	

	
}
