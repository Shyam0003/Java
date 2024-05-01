import java.io.File;
import java.io.IOException;
public class P13{
    public static void main(String[] args) {
        String directoryName = "myDirectory";
        String fileName = "myFile.txt";
        File directory = new File(directoryName);
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
                return;
            }
        }
        try {
            File fileToMove = new File(fileName);
            File newLocation = new File(directory, fileName);
            if (fileToMove.renameTo(newLocation)) {
                System.out.println("File moved successfully.");
            } else {
                System.out.println("Failed to move file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}