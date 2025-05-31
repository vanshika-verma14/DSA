import java.util.Arrays;

public class rev_ceiling {
    public static void main(String[] args) {
        int[]  arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(Arrays.toString(check(arr, target)));
    }

    public static int[] check(int[] arr , int tar){

        if(tar < arr[0])
        return new int[]{Integer.MIN_VALUE,arr[0]};
        if (tar > arr[0])
        return new int[]{arr[arr.length-1], Integer.MAX_VALUE};
        int start = 0;
        int end = arr.length-1;
         while(start<=end){
            int mid = start + (end-start)/2;

            if(tar < arr[mid])
            end = mid -1;
            else if(tar> arr[mid])
            start = mid +1;

            else 
            return new int[]{arr[mid],arr[mid]};

         }



        return new int[]{arr[end],arr[start]};
    }
}
