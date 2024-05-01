import java.io.*;

public class P5 {
    public static void main(String args[]) {
        try {
            FileInputStream fl = new FileInputStream("myFile.txt");
            int data;
            while ((data = fl.read()) != -1) {
                System.out.print((char) data);
            }
            fl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
