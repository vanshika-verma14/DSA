import java.util.Scanner;
import java.util.Arrays;
public class kkarr1_Swaping_Values_in_Array {
    public static void main(String[] args) {
        int[] arr = {6,33,7,18,9};
        swap(arr , 1 , 3 );
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr , int a , int b){
       int temp = arr[a];
       arr[a]= arr[b];
       arr[b] = temp;
        }

}