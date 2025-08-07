package arrays;
import java.util.Arrays;

public class v1_duplicate_in_sorted_arr {
    public static void main(String[] args) {
    int[] arr = {1,2,4,7,9,10,10,10,10};
    System.out.println(Arrays.toString(check(arr)));
}
 public static int[] check(int[] arr){
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
        if(arr[j] != arr[i]){
             j++;  
            arr[j] = arr[i];
            // System.out.println(j);       
        }
    }
    return arr;
 }
 
}