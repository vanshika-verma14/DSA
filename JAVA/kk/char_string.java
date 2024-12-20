import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
public class char_string {
  
    public static void main(String[] args) {   
        // Declare and initialize a String
        String s = "Java";     
        // Extract the first character from the String using charAt() method
        char c = s.charAt(0); // Get the character at index 0
        System.out.println("Character at index 0: " + c);

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);


        // Java Program to convert a String to a char using toCharArray()
        String str = "Java";  // Defining a string
        char[] arr = str.toCharArray(); // Converting the string to a char array
        System.out.println(Arrays.toString(arr));



        //Using substring() Method
        //We can use the substring() method to extract a single character as a string. Then we can convert it to a char using charAt(0).
         String st = "Java";// Defining a string
                            // Extracting the character at index 1 using substring()
         char cc = st.substring(1, 2).charAt(0); // Extract character at index 1 -char c = s.substring(1, 2).charAt(0);
 
         System.out.println("Character at index 1: " + cc);
    }
    
}
