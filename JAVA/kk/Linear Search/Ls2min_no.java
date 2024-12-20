import java.util.Arrays;

public class Ls2min_no {
    public static void main(String[] args) {
        int[] arr = {-22,4,6,-42,-81,37,42};
    
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int minval = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minval)
            minval= arr[i];          
        }
        return minval;
    }
}
