// Find the largest three distinct elements in an array
import java.util.Arrays;
import java.util.Scanner;
class gfgeasy1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] =  new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n;){
             a[i] = sc.nextInt();
        }
        int lg[]= new int[3];
        lg[]= largestthreeno(a);
    }
    public static int largestthreeno(int a[])
    {
    int n = a.length;
    
    }
}