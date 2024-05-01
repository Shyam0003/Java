public class ProgressBarDemo {
    public static void main(String[] args) {
        // Create a thread to perform the long-running task
        Thread taskThread = new Thread(new LongRunningTask());
        // Create a thread to display the progress bar
        Thread progressBarThread = new Thread(new ProgressBar());

        // Start both threads
        taskThread.start();
        progressBarThread.start();
    }
}

// Runnable implementation for the long-running task
class LongRunningTask implements Runnable {
    @Override
    public void run() {
        // Simulate a long-running task (sorting a large list)
        int[] arrayToSort = createLargeArrayToSort();
        // Arrays.sort(arrayToSort);
        System.out.println("Task completed successfully!");
    }

    // Method to create a large array to sort
    private int[] createLargeArrayToSort() {
        // Simulating creation of a large array (e.g., 10,000 elements)
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        return array;
    }
}

// Runnable implementation for the progress bar
class ProgressBar implements Runnable {
    @Override
    public void run() {
        try {
            // Display a progress bar updating every second
            for (int i = 0; i <= 100; i++) {
                System.out.print("\rProgress: [" + getProgressBar(i) + "] " + i + "%");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to generate the progress bar string
    private String getProgressBar(int percent) {
        int numOfBars = percent / 2;
        StringBuilder progressBar = new StringBuilder();
        for (int i = 0; i < numOfBars; i++) {
            progressBar.append("=");
        }
        for (int i = numOfBars; i < 50; i++) {
            progressBar.append(" ");
        }
        return progressBar.toString();
    }
}
