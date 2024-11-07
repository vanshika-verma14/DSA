import java.util.Scanner;
import java.util.Arrays;
public class Arrayskk
{
public static void main(String[] args) {
    
    //syntax
    // datatype[] variable_name = new datatype[size];
    int[] arr0 = new int[5];
    
    //or directly
    int[] arr2 = {1, 2, 3, 4, 5};
    
    //string
    String[] arr3 = new String[4];
    System.out.println(arr3[0]);   //null
    //null - is not like a keyword but a special literal of null type which we can assign to any reference type(non-primitive data types) but we cannot use to declare it like
    //int a = null;   // errror
    // any reference variable will automatically have null value
    //we cannot write null as NULL or 0 as in C programming because null is a literal and keywords are case-sensitive in Java.

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr4 = new int[n];
    //method 1 to initialize
    System.out.println("Enter elements");
    for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
    }
     //method 1 to print
     for(int i =0; i < n; i++) {
        System.out.println("Array is - " + arr1[i] + " ");
    }

    //method 2  to initialize
          // System.out.println("Enter elements");
          // for(int i : arr4) {
          //     arr4[i] = sc.nextInt();
          // }
          //THIS IS WRONG WAY ABOVE USING ENHANCED FOR LOOP

    System.out.println("Enter elements");
    for (int i = 0; i < n; i++) {
        arr4[i] = sc.nextInt();
    }
     //method 2 to print
    for(int i :arr4) {
        System.out.println("Arr is - " + i + " "); // here i represents element of the array (do not write arr4[i])
    }
     //method 3 to print   
     System.out.println(Arrays.toString(arr1)) ;
}
}
