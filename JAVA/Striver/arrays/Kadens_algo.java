//find the subarray that gives the max sum
//53. Maximum Subarray
// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

import java.util.Arrays;
public class Kadens_algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-6,-1};
        System.out.println(maxSubArray(arr));

    }
    public static int kadane(int[] arr){ // here we are keeping track of longest subarray as well
        int max= Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int starti = -1;
        int endi = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0)
            start= i; //to print subarray if 0 comes we start the marking of subaaray again
            sum+=arr[i];
            if(sum>max){
                max=sum;
                starti = start; endi =i; // keep a track of index at start and end of subarray
            }
             //System.out.println(sum);
            if(sum<0){
                sum=0;
                start = i;
            }

        }
        System.out.println(starti + " " + endi);
        return max;
    }

    //leetcode paste , justthe max sum of the longest subarray
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<nums.length; i++){
            sum+=nums[i];
            max = Math.max(sum,max);  // check max before setting sum zero so that in case of negative no. only in subarray that max of that no. can be printed else sum will give 0 if done before

            if(sum<0)
            sum=0;
        }
        return max;
    }
}

//tc = O(N)
//SC = O(1)