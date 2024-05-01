import java.io.*;

public class P4{
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String data = "Hello World!";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
