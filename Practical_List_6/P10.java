import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P10{
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "myData.csv";
        
        // Update the age of "David Lee" to 21
        updateAge(fileName, "David Lee", 21);
        
        System.out.println("Age of David Lee updated successfully.");
    }
    
    // Method to update the age of a person in the CSV file
    private static void updateAge(String fileName, String name, int newAge) {
        // Read the contents of the CSV file into a list
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[0].trim().equals(name)) {
                    parts[1] = String.valueOf(newAge); // Update the age
                    line = String.join(",", parts);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        // Write the updated data back to the CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
