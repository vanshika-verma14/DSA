import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int sum = 9;
        System.out.println(Arrays.toString(op2sum(arr, sum)));
        }
        
        public static int[] br2sum(int[] arr , int tar){
            //brute

            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] + arr[j]== tar)
                     return new int[]{i,j};
                }
            }
            return null;
        }
        public static int[] bt2sum(int[] arr , int tar){
           //better - hashmap   //{2,7,11,15};
           HashMap<Integer, Integer> map = new HashMap<>();
           for (int i = 0; i < arr.length; i++) {
              
            int rem = tar - arr[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(arr[i], i);
           }
        return new int[]{-1, -1};
}

         public static int[] op2sum(int[] arr , int tar){
            // optimal if array is sorted else NOT  //{2,7,11,15};
            int start = 0;
            int end = arr.length-1;
            while(start<end) {
                int sum = arr[start]+ arr[end];
                if(sum>tar)
                    end--;
                else if(sum<tar)
                    start++;
                else
                 return new int[]{start, end};
            }
             return new int[]{-1, -1};
         }

}