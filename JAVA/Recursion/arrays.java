public class arrays {
    public static void main(String[] args) {
         int[] arr = {1,3,5,7,8};
          int n = 17;
        System.out.println(linearSearch(arr, n , 0));
    }
    public static boolean isSorted(int[] arr, int n){
      if(n==arr.length-1)
      return true;
      else
      {
        if(arr[n] < arr[n+1])
         return isSorted(arr, n+1);
         else 
         return false;
      }
    }
    public static boolean isSortedkk(int[] arr, int n){
      if(n==arr.length-1)
      return true;
      else
         return (arr[n] < arr[n+1]) && isSorted(arr, n+1);   
    }
    public static int linearSearch(int[] arr, int tar, int n ){
      if(n==arr.length)
      return -1;
      else
      {   
        if(arr[n]!=tar)
         return linearSearch(arr,tar, n+1);
         else 
         return n;
        }
        
    }
}
