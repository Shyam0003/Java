import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter a non-numeric value to stop):");

            try {
                // Attempt to read an integer from the user
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
            } catch (java.util.InputMismatchException e) {
                // Catch the InputMismatchException if the input is not an integer
                System.out.println("Error: Input must be an integer. Exiting...");
                // break; // Exit the loop
            }
        }
        // scanner.close();
    }
