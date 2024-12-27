public class BS1_Binary_search {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binSearch(arr, target);
        System.out.println(ans);
    }

    static int  binSearch(int[] arr , int n){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
         int mid  = start + (end-start)/2;

          if(n < arr[mid])
          end = mid -1;
           
          else if (n > arr[mid])
          start = mid +1;
          
          else 
          return mid;
        }
        return -1;
    }
}
