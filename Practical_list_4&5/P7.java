class GoodMorning extends Thread {
   synchronized public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(2500);
				System.out.println("Good morning ");
				i++;
			}
		} catch (Exception e) {
		}
	}
}
class Hello extends Thread {
	synchronized public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(5000);
				System.out.println("hello");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class Welcome extends Thread {
	synchronized public void run() {
		try {
			int i=0;
			while (i<5) {
				sleep(7500);
				System.out.println("welcome");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class P7 {
	public static void main(String args[]) {
		GoodMorning t1 = new GoodMorning();
		Hello t2 = new Hello();
		Welcome t3 = new Welcome();
		t1.start();
        try {
			Thread.sleep(5);
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		t2.start();
        try {
			Thread.sleep(5);
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		t3.start();
	
	}
}