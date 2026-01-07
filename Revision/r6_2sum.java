import java.util.Arrays;
import java.util.HashMap;

public class r6_2sum {
     public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int sum = 9;
        System.out.println(Arrays.toString(opsum(arr, sum)));
        }

        public static int[] btsum(int[] arr , int sum) {

            HashMap<Integer,Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int rem = sum - arr[i];

                if(map.containsKey(rem)){
                     return new int[]{i,map.get(rem)};
                }
                map.put(arr[i], i);
            }
            return new int[]{-1,-1};
        }
        public static int[] opsum(int[] arr , int sum) {

            Arrays.sort(arr);
            int start =0;
            int end = arr.length-1;

            while( start< end){
                int ss =arr[start]+ arr[end];
                if(ss== sum)
                    return new int[]{arr[start],arr[end]};
                else if(ss> sum)
                    end--;
                else 
                    start++;
            }
            return new int[]{-1,-1};
        }
}
