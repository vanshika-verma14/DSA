public class BS2_Order_Agnostic {
    public static void main(String[] args) {
        int[] arr = {99, 88, 34,33, 27 ,22, 10 , 9};
        int target = 1;
        int ans = binSearch(arr, target);
        System.out.println(ans);
    }

    static int  binSearch(int[] arr , int n){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean isAce = arr[start] < arr[end];
         //ascending order 
        while(start <= end) {
            mid  = start + (end-start)/2; 
            if (mid == n)
            return mid;

             if(isAce)    //acending order
            { 
             if(n < arr[mid])
             end = mid -1;            
             else if (n > arr[mid])
             start = mid +1;
            }
            else          // decending order{99. 88.  ,34,33, 27 ,22, 10 , 9}
           {  
             if(n < arr[mid])
             start = mid +1;  
             else if (n > arr[mid])
             end = mid -1; 
             else return mid;
           }
        }
          
        return mid; 
}}