import java.util.ArrayList;
import java.util.Arrays;

public class sort_bubble_selection {
    
    public static void main(String[] args) {
         int[] arr = {5,4,3,2,1};
         //System.out.println(helper(arr, arr.length-1, 0));
          System.out.println(Arrays.toString(selec( arr, arr.length)));
    }

    public static int[] selec(int[] arr, int n) {
        if(n== 0)
        return arr;

        int max = helper(arr, n-1, 0);
        //swap
        int temp = arr[n-1];
        arr[n-1] = arr[max];
        arr[max]= temp;
        System.out.println(arr[n-1]);
         return selec( arr,  n-1);

    }

    public static int helper(int[] arr, int n,int c) {
       if(n==0)
       return c;
       else
       {
        if(arr[c]< arr[n])
        c= n;
       return helper( arr,  n-1, c);}

    }
    
}
