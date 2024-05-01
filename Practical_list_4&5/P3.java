// Define the custom exception class
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class P3 {
    public static void main(String args[]) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Check if the denominator is zero
            if (denominator == 0) {
                throw new DivideByZeroException("Error: Cannot divide a number by zero.");
            }

            // Perform the division
            int answer = numerator / denominator;
            System.out.println("Result: " + answer);
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
}