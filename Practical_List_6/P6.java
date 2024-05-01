import java.io.*;
public class P6 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("myFile.txt", true);
            fw.write("\nJava Programming is awesome!");
            fw.close();
            System.out.println("New line appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
