import java.util.*;
class Forloop
{
	public static void main(String[] args)
	{
		int n,sum=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");		
		n =sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the Array Element : ");
		for( i=0;i<n;i++)
		{	
			arr[i] = sc.nextInt();	
		}
		for( i=0;i<n;i++)
		{	
			System.out.println(" Index arr[" +i+ "] Array Element "+arr[i]);	
			sum = sum+arr[i];
		}	
		System.out.print(" Sum of Array : "+sum);
	}		
}