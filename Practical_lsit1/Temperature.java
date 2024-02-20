import java.util.*;
class Temperature
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double fah,cel;
		System.out.print("Enter the Celsius : ");
		cel = sc.nextDouble();
		fah = (cel*9/5)+32;
		System.out.print("Fahernhit is  : "+fah);
	}
}	