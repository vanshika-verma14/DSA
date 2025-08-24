
public class Longest_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,2,3,3,1,1,1,1,1,1};
        int k =  6;
        System.out.println(opsubarray(arr , k));
    }
    public static int brsubarray(int[] arr , int k){  

     //brute force 
     int max= 0;
     for(int i = 0 ; i < arr.length; i++){
        int sum = 0;
        for(int j = i ; j < arr.length; j++){
            sum+=arr[j];
            if(sum == k){
            max = Math.max(j-i+1, max);
            }
        }
     }
     return max;
    }
    public static int btsubarray(int[] arr , int k){  

     //better - hashmap
     int max= 0;
     return max;
     
    }
    
    public static int opsubarray(int[] arr , int k){  
     //optimal - sliding window, but it works only for positive num not even for 0 

     int maxl=0;
     int c=0; // to find total no. of subarrays
     int start=0;
     int sum =0;
     int end=0;
     while(end<arr.length){
        sum+=arr[end];
      
        while(sum >k && start<= end){
          sum-=arr[start];
          start++;
        }
        if(sum == k){
            c++;
            maxl= Math.max(maxl, end-start+1);
        }
          end++;
     }
     System.out.println(c);
     return maxl;
    }
}
