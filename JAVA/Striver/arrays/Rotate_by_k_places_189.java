package arrays;
//optimal rotate right by k places

import java.util.Arrays;

public class Rotate_by_k_places_189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] temp = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(arr, k)));
        System.out.println(Arrays.toString(brrotate1(temp, k)));

    }
        public static int[] rotate(int[] nums, int k) {
           int n = nums.length;
           k = k%n;
           reverse(nums, n-k, n-1);
           reverse(nums,0, n-k-1);
           reverse(nums,0, n-1);
           return nums;
    
        }
        public static void reverse(int[] nums, int s , int e){
            while(s < e){
             int temp = nums[s];
             nums[s++] = nums[e];
             nums[e--] = temp;
        }
    } 

    public static int[] brrotate1(int[] nums , int k){
        if(k==0||k==nums.length)
        return nums;
        else
        {   k = k%nums.length;
            for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];

            for ( int j =nums.length-2; j >=0 ; j--) {
                nums[j+1]= nums[j]; 
            }
             nums[0]= temp;
           }
        }
        return nums;
    }
}
