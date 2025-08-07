import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.Arrays;
public class kkarr3_Reversing_Array{
    public static void main(String[] args) {
        int[] arr = {6,8,3,7,18,9,16, 20,3};
        reverse(arr);
         System.out.println(Arrays.toString(arr));
        }
        static int reverse(int[] arr){
        if (arr == null) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        // while(start <= end) { 
        //Changes and Explanation: Condition start < end:
        // The while loop should run as long as start < end, not start <= end. When start == end, the indices meet at the middle, and swapping is unnecessary because the element is already in its correct position.

        while(start < end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return 0;
        }

    
    }