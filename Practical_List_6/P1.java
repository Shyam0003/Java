import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        writeFile(fileName, "Hello, this is a test!");
        String content = readFile(fileName);
        System.out.println("Content read from the file:");
        System.out.println(content);
    }
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Content has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return content.toString();
    }
}
