import java.io.*;

public class FilterInputStreamSkipExample {
    public static void main(String[] args) {
        // Input string that includes 'e' characters
        String data = "Example input stream where 'e' characters are skipped.";

        // Convert the string into a byte array
        byte[] byteArray = data.getBytes();

        try {
            // Create a ByteArrayInputStream from byte array
            ByteArrayInputStream bAIS = new ByteArrayInputStream(byteArray);

            // Wrap it with a custom FilterInputStream that overrides the read() method
            FilterInputStream fIS = new FilterInputStream(bAIS) {
                @Override
                public int read() throws IOException {
                    int byteRead;
                    // Keep reading until a byte that is NOT 'e' is found
                    while ((byteRead = super.read()) != -1) {
                        if (byteRead == 'e') {
                            continue; // Skip 'e' characters
                        }
                        return byteRead; // Return non-'e' characters
                    }
                    return -1; // End of stream
                }
            }
            ;

            int byteRead;
            // Read from the filtered input stream and print characters one by one
            while ((byteRead = fIS.read()) != -1) {
                System.out.print((char) byteRead);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Print any I/O errors
        }
    }
}
