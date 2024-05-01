import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P11{
    public static void main(String[] args) {
        String fileName = "myData.csv";
        readDataFromFile(fileName);
    }

    private static void readDataFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Data from file " + fileName + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
