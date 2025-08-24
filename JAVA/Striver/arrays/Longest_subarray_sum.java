
public class Longest_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k =  5;
        System.out.println(brsubarray(arr , k));
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

     //optimal
     int max= 0;
     return max;
     
    }
}
