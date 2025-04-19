// ByteArrayInputStream is a special type of InputStream that reads bytes from an in-memory byte array, instead of from a file or network.
// So rather than reading data from a file (like FileInputStream), it reads from a byte array you already have in your program.

import java.io.*;

public class ByteArrayInputExample {
    public static void main(String[] args) throws IOException {
        // Step 1: Create a byte array (normally you get this from a file or network)
        byte[] data = "Hello, Vanshika!".getBytes();

        // Step 2: Wrap it in ByteArrayInputStream
        ByteArrayInputStream bais = new ByteArrayInputStream(data);

        int b;
        // Step 3: Read the bytes one by one
        while ((b = bais.read()) != -1) {
            System.out.print((char) b); // cast byte to char
        }

        // Example: Use offset and length
        byte[] data2 = "SecuritySystem".getBytes();

        // Only read from index 8 (i.e., 'S') to index 13 (i.e., "System")
        ByteArrayInputStream bais2 = new ByteArrayInputStream(data2, 8, 6);
        
        int ch;
        while ((ch = bais2.read()) != -1) {
            System.out.print((char) ch);
        }

        // System
        
        bais.close();
    }
}
