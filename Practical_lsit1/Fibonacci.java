import java.util.*;
class Fibonacci
{
	public static void main(String[] args)
	{
		int n,a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			a = b;
			b = c;
			c = a+b;
			System.out.print(" "+a);
		}
	}
}