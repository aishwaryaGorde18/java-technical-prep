
import java.io.*;

public class FileIOMultilinesExample
{
    public static void main(String[] args) {
        String filename = "example.txt";

        // Writing 10 lines to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("This is line number " + i);
                writer.newLine();
            }
            System.out.println(" Successfully written 10 lines to the file.");
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }

        // Reading lines from the file
        System.out.println("\n Reading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(" Error while reading from file: " + e.getMessage());
        }
}
}