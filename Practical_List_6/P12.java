import java.io.File;

public class P12 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File '" + fileName + "' deleted successfully.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("File '" + fileName + "' does not exist.");
        }
    }
}
