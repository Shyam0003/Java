import java.util.InputMismatchException;
import java.util.Scanner;
public class P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double num1 = 0, num2 = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    validInput = true; // Input is valid, exit the loop
                } catch (InputMismatchException e) {
                    System.out.println("Error: Non-numeric characters entered. Please enter numbers again.");
                    scanner.nextLine(); // Consume the invalid input
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            double result = num1 / num2;
            System.out.println("Result of division: " + num1 + " / " + num2 + " = " + result);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}