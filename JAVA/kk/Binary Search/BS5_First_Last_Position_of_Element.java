public class BS5_First_Last_Position_of_Element{
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int ans = check(arr, target);
        System.out.println(ans);
    
    }
    static int  check(int[] arr , int n){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
         int mid  = start + (end-start)/2;

          if(n < arr[mid])
          end = mid -1;

          else if (n > arr[mid])
          start = mid +1;
          
          else 
          return arr[mid];

        }
        return -1;
    }

}