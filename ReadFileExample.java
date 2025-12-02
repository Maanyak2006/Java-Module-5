import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "example.txt"; 
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String firstLine = reader.readLine();
            System.out.println("First line of the file: " + firstLine);
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
