class DivisibleByThree implements Runnable{
    public void run(){
        for(int i=0;i<=50;i++)
        {
            if(i%3==0)
            {
                System.out.println("Thread - 1 : ) "+i);
            }
        }
    }
}
/**
 *  Print
 */
class  DivisibleByFive  implements Runnable{
    public void run(){
        for(int i=0;i<=50;i++)
        {
            if(i%5==0)
            {
                System.out.println("Thread - 2 : ) "+i);
            }
        }
    }
}

public class P4 {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new DivisibleByThree());
        Thread thread2 = new Thread(new DivisibleByFive());
        thread1.start();
        thread2.start();
    }
}
