import java.util.*;
class Argument
{
	Argument(int a, int b)
	{
		System.out.print("This Argument Constructor");
		System.out.print("Sum of A and B : "+(a+b));
	}
	public static void main(String args[])
	{
		Argument sc = new Argument(10,20);		
	}
	
}
