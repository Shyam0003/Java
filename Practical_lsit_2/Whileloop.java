import java.util.*;
class Whileloop
{
	public static void main(String[] args)
	{
		int n,i,product;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the Element of Array : ");
		i = 0;
		while(i<n)
		{
			arr[i] = sc.nextInt();
			i++;
		}
		i = 0;
		while(i<n)
		{
			System.out.println("Elements  : "+arr[i]);		
			i++;
		}
		product = 1;
        		i = 0;
        		while (i<n)
		 {
           			product *= arr[i];
            			i++;
        		}
		System.out.println("Product of Array Element : "+product);

	}
}