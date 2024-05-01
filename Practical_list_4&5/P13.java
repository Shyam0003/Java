import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class P13 {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);
        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.start();
        Thread consumerThread = new Thread(new Consumer(buffer));
        consumerThread.start();
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producerThread.interrupt();
        consumerThread.interrupt();
    }
}
class Producer implements Runnable {
    private final BlockingQueue<Integer> buffer;
    private final Random random;
    public Producer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
        this.random = new Random();
    }
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                int num = random.nextInt(100); // Generate a random number
                buffer.put(num); // Add the number to the buffer
                System.out.println("Produced: " + num);
                Thread.sleep(random.nextInt(1000)); // Sleep for a random interval
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer implements Runnable {
    private final BlockingQueue<Integer> buffer;
    public Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                int num = buffer.take(); // Remove a number from the buffer
                double squareRoot = Math.sqrt(num); // Calculate the square root
                System.out.println("Consumed: " + num + ", Square Root: " + squareRoot);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            // Restore the interrupted status
            Thread.currentThread().interrupt();
        }
    }
}