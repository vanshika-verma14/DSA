import java.util.Scanner;
import java.util.Arrays;
public class kkarr2_Maximum_Value_of_Array{
    public static void main(String[] args) {
        int[] arr = {6,8,3,7,18,9,16, 20};
         System.out.println(maxRange(arr , 1 , 6));
        }
        static int maxRange(int[] arr , int a , int b){
        int maxval = Integer.MIN_VALUE;
        
        if (a > b) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        for (int i = a; i <= b; i++) {
           if(maxval< arr[i]){
            maxval = arr[i];
           }
        }
        return maxval;
        }

    
    }