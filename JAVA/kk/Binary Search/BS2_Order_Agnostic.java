public class BS2_Order_Agnostic {
    public static void main(String[] args) {
        int[] arr = {99, 88, 34,33, 27 ,22, 10 , 9};
        int target = 22;
        int ans = binSearch(arr, target);
        System.out.println(ans);
    }
    static int  binSearch2(int[] arr , int n){


}
    static int  binSearch(int[] arr , int n){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
         //ascending order
        if(arr[start] < arr[end])
        { 
            while(start <= end) {
             mid  = start + (end-start)/2; 
             if(n < arr[mid])
             end = mid -1;            
             else if (n > arr[mid])
             start = mid +1;
             else return arr[mid];
           }
        }
         else 
         { 
            while(arr[end] < arr[start]) {         // decending order{99. 88.  ,34,33, 27 ,22, 10 , 9}
             mid  = start + (end-start)/2; 
             if(n < arr[mid])
             start = mid +1;  
             else if (n > arr[mid])
             end = mid -1; 
             else return mid;
           }
           }
          return mid; 
}
}