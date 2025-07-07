import java.io.*;

public class FileIOExample1
{
    public static void main(String[] args)
    {
        String filename = "java.txt";
        File file = new File(filename);

        // 0. Creating the file if it doesn't exist
        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            } else
            {
                System.out.println("File already exists.");
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

        // 1. Writing to the file
        try
        {
            FileWriter writer = new FileWriter(file); // uses the File object
            writer.write("Hello, this is a sample text file.\n");
            writer.write("File I/O in Java is easy to understand.");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e)
        {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // 2. Reading from the file
        try
        {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("\nReading data from the file:");
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred during reading: " + e.getMessage());
 }
        
}
}
