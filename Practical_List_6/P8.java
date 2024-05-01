import java.io.*;
public class P8 {
    public static void main(String[] args) {
                String data = "Name, Age, Gender\n" +
                      "John Doe, 25, Male\n" +
                      "John Smith, 30, Female\n" +
                      "David Lee, 20, Male";
                String fileName = "myData.csv";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}