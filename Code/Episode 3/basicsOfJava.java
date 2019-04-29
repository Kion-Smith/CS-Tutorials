import java.util.Scanner;

public class basicsOfJava 
{
	//global vars
	String globalVar = "Hi im global";
	 public static void main(String [] args)
	 {
		 // <- this is a comment
		 
		 /* This 
		  * is 
		  * a
		  * multiline
		  * comment
		  */ 
		 
		 //print on same line
		 System.out.print("10");
		 System.out.print("x");
		 
		 
		 //prints a line
		 System.out.println("Hello world");
		 System.out.println("10");
		 System.out.println(10+10);
		 
		 //we cant do this syntax errors
		 //System.out.println(Hello world);
		 
		 //Concatenation
		 System.out.println("This is bytes max "+Byte.MAX_VALUE+", this is bytes min"+Byte.MIN_VALUE);
		 System.out.println("This is short max "+Short.MAX_VALUE+", this is short min"+Short.MIN_VALUE);
		 System.out.println("This is Integer max "+Integer.MAX_VALUE+", this is Integer min"+Integer.MIN_VALUE);
		 System.out.println("This is Long max "+Long.MAX_VALUE+", this is Long min"+Long.MIN_VALUE);
		 
		 //chars can be added or subtracted from
		 System.out.println( (char) ('A'-1));//@
		 System.out.println( (char) ('A'+1));//b
		 
		 //Data types
		 /*primitives 
		 
		 	/boolean: true or false 
		 
		 	chars: single letter like 'a' or 'b'; these characters  a number, 64 is A and 32 is a
		 
			- NUMBERS(Whole)
				 bytes small 
				 shorts 
				 ints
				 longs (large)
			 
			- NUMBERS(Decimals)
				 floats ieee floating point
				 doubles decimal places
		   
		  */
		 
		 //non primitives Strings and Arrays
		 
		 	//Array Basically a list of data types
		 
		 	//String can be thought of as an array of chars
		 
		 	//Local vars
		 
		 //datatype name = number/ 'char'/ true or false/ ""
		 int x = 10;
		 int X = 5;
		 char y = 'A';
		 boolean isRunning = false;
		 String name = "Hello";

		 
		 System.out.println(x+""+y+isRunning+""+name);
		 
		 //
		 Scanner kb = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String names  =  kb.nextLine();
		 
		 System.out.println("Hello "+ names);
		 
		 

	 }
}
