class SuperKeyword
{
	String color="White";
	public static void main(String args[])
	{
		Animal sc = new Animal();
		sc.printcolor();
	}
}
class Animal extends SuperKeyword
{
	String color = "Balck";
	void printcolor(){	
		System.out.println("Color : "+color);
		System.out.println("Color : "+super.color);
	}
}
	

