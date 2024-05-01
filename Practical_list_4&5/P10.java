import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File successfully opened: " + fileName);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
            e.printStackTrace(); 
        } finally {
            scanner.close();
        }
    }
}
