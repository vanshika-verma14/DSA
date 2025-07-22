import java.util.ArrayList;
import java.util.Arrays;

public class sort_bubble_selection {
    
    public static void main(String[] args) {
         int[] arr = {4,3,5,2,1};
         //System.out.println(helper(arr, arr.length-1, 0));
          //System.out.println(Arrays.toString(selec( arr, arr.length)));
          KKselec( arr, arr.length,0,0 );
         System.out.println(Arrays.toString(arr));

    }

     public static void KKselec(int[] arr, int r, int c, int max) { //4,3,5,2,1
       if(r==0)
       return;

      if(c<r){
        if(arr[c]>arr[max])
        KKselec(arr, r, c+1, c);
        else
        KKselec(arr, r, c+1, max);
      }
       else{
        int temp = arr[max];
         arr[max] =arr[r-1];
        arr[r-1]= temp; 
        KKselec(arr, r-1, 0, 0);
        }
     }


    public static int[] selec(int[] arr, int n) {
        if(n== 0)
        return arr;

        int max = helper(arr, n-1, 0);
        //swap
        int temp = arr[n-1];
        arr[n-1] = arr[max];
        arr[max]= temp;
        // System.out.println(arr[n-1]);
         return selec( arr,  n-1);

    }

    public static int helper(int[] arr, int n,int c) {
       if(n<0) //n==0 -> This breaks if max is at index 0. A better way:
       return c;
       else
       {
        if(arr[c]< arr[n])
        c= n;
       return helper( arr,  n-1, c);}

    }
        //better version of helper according to gpt
      public static int findMaxIndex(int[] arr, int i, int maxIdx) {// Use clearer variable names ..n → size or end (more descriptive).. c → maxIdx (makes intention obvious)
        if (i < 0) return maxIdx;

        if (arr[i] > arr[maxIdx])
            maxIdx = i;

        return findMaxIndex(arr, i - 1, maxIdx);
    }
    
}
