import java.io.*;
public class P7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));
            String line;
            System.out.println("Contents of the file after appending the new line:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
