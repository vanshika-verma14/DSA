import java.util.Scanner;
public class string
{
public static void main(String[] args) {
    
    //syntax
    // datatype[] variable_name = new datatype[size];
    int[] arr1 = new int[5];

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
    String a = sc.next();
    System.out.println(a);
    int nSS = sc.nextInt();
        String abc = sc.nextLine();
    System.out.println(abc);
}
}