//2 pointer

import java.util.Arrays;

public class r2_duplicate_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 9};
        System.out.println(Arrays.toString(duplicate(arr)));

    }
    public static int[] duplicate(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                 i++;
                 arr[i]= arr[j];
            }
        }
        return arr;
    }
}
