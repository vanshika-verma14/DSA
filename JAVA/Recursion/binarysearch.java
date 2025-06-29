import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
         int[] a = {1,3,5,7,8,9,11};

         //binary search 
         System.out.println(bs(a,111, 0, a.length-1));

         int[] crr = {8,9,11,1,3,5,7};
         System.out.println(rbs(a,11, 0, a.length-1));

         //binary search all index
          int[] arr = {1,3,5,7,8,9,11,11,11,11,11};
         int[]  brr = new int[2];
         brr[0]= bsall(arr,11, 0, arr.length-1,true,-1);
         if(brr[0]!=-1)
          brr[1]= bsall(arr,11, 0, arr.length-1,false,-1);
          else brr[1]=-1;
        System.out.println(Arrays.toString(brr));
       
    }
    public static char[] rbs(int[] a, int i, int j, int k) {


    }
    
    public static int bs(int[] arr, int tar, int s, int e) {
      if(s>e)
      return -1;

      int mid = s + (e-s)/2;

      if(arr[mid]== tar)
        return mid;
      else if(arr[mid]> tar)
        return  bs( arr,  tar , s, mid-1);
      else 
        return  bs( arr,  tar , mid+1, e);
      
    }
    public static int bsall(int[] arr, int tar, int s, int e, boolean fl, int ans) {
      if(s>e)
      return ans;

      int mid = s + (e-s)/2;

      if(arr[mid]> tar)
        return  bsall( arr,  tar , s, mid-1,fl,ans);
      else if (arr[mid]< tar)
        return  bsall( arr,  tar , mid+1, e,fl,ans);

      else
        {ans = mid;
         if(fl==true)
         return  bsall( arr,  tar , s, mid-1,fl,ans);
         else
         return  bsall( arr,  tar , mid+1, e,fl,ans);

        }
    } 
    
    public static int rbs(int[] arr, int tar, int s, int e) {
    

}
