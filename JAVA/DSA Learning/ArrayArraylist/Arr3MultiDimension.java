
import java.util.Arrays;
import java.util.Scanner;

public class Arr3MultiDimension {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int[][] arr = new int[3][];

    // int[][] arr = {
    //                {1, 2, 3}, // 0th index
    //                {4, 5}, // 1st index
    //                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
    //                };     

    int[][] arr = new int[3][2];
    System.out.println(arr.length); //arr1.length tells the number of rows in arr1

    //input:-

    for(int row= 0 ; row < arr.length ; row++) //arr.length is equal to total no. of rows in matrix, here it is 3
    {
       //now to go access each col in each row
       for(int col = 0 ; col < arr[row].length ; col++) //arr[row].length telss lenght of each row that is total columns in each row, here it is 2
       {
         arr[row][col] = sc.nextInt();
       }
    }
   
    //output :-

    //method 1-
    System.out.println("method 1");

    for(int row= 0 ; row < arr.length ; row++){
        for(int col = 0 ; col < arr[row].length ; col++){  // for each col in every row
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
    }
    
    //method 2-
    System.out.println("method 2");
    for(int row = 0; row < arr.length ; row ++){
        System.out.println( Arrays.toString(arr[row])); //prints each full row of matrix 
    }

    //method 3-
    System.out.println("method 3");

    for(int[] a : arr){
        System.out.println( Arrays.toString(a)); // we write a not arr[a]
    }
   
    

    }}