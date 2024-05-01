import java.io.*;

public class P3 {
    public static void main(String[] args) {
        // Create a text file
        String fileName = "sample.txt";

        // Write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample text file.");
            writer.close();
            System.out.println("Content has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Modify the file
        try {
            FileWriter writer = new FileWriter(fileName, true); // Append mode
            writer.write("\nThis is not user to change anything :  ) .");
            writer.close();
            System.out.println("Content has been modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }

        // Read from the file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
