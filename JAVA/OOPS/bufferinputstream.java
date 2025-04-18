import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class bufferinputstream {
    public static void main(String[] args) {
        // Specify the full file path
        String filePath = "C:/Users/Vanshika/Desktop/data.txt";

        try {
            // Step 1: Create FileInputStream from file path
            FileInputStream fis = new FileInputStream(filePath);

            // Step 2: Wrap with BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

            // Step 3: Close streams
            bis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found at: " + filePath);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

       //second example
        try {
            // Create a FileInputStream to read from a file
            FileInputStream fileInput = new FileInputStream("example.txt");

            // Wrap it with BufferedInputStream
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int byteData;

            // Read byte-by-byte (BufferedInputStream makes it faster internally)
            while ((byteData = bufferedInput.read()) != -1) {
                System.out.print((char) byteData); // print as character
            }

            // Close the streams
            bufferedInput.close();
            fileInput.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
