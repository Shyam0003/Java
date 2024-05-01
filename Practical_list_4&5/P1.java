// package com.example1;

class Demothread1 extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		for(int i =0;i<5;i++)
		{
			  System.out.println("Hello World :  ) ");
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println("Error : "+e.getMessage());
			}
		}
	}
}
  class Demothread2 extends Thread { 
	  public void run() {
		  // TODO Auto-generated
		  for(int i =0;i<5;i++)
			{
			  System.out.println("Hello World : 2 ) ");
				try {
					Thread.sleep(500);
				}
				catch(Exception e){
					System.out.println("Error : "+e.getMessage());
				}
			}
  }
}

public class P1 {
	public static void main(String args[])
	{
		Demothread1 t1 = new Demothread1();
		Demothread2 t2 = new Demothread2();
		t1.start();
		try {
			Thread.sleep(5);
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		t2.start();
	}
}
