//find the subarray that gives the max sum

import java.util.Arrays;

public class Kadens_algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-2,-7};
        System.out.println(kadane(arr));

    }
    public static int kadane(int[] arr){
        int max= Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int starti = -1;
        int endi = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0)
            start= i; //to print subarray if 0 comes we start the marking of subaaray again
            sum+=arr[i];
            //System.out.println(sum);
            if(sum<0){
                sum=0;
                start = i;
            }
            if(sum>max){
                max=sum;
                starti = start; endi =i; // keep a track of index at start and end of subarray
            }

        }
        System.out.println(starti + " " + endi);
        return max;
    }
}

//tc = O(N)
//SC = O(1)