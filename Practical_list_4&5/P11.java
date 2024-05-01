public class P11 {
    public static void main(String args[]) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());
        evenThread.start();
        oddThread.start();
    }
}
class EvenPrinter implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class OddPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}