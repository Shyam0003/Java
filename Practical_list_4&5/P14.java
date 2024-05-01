import java.util.Scanner;
public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result of division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}