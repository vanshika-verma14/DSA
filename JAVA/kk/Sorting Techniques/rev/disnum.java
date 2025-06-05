import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disnum {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = cyclic(nums);
        System.out.println(list);
        }       
        public static List<Integer> cyclic(int[] nums) {
            int i=0; 
            int n = nums.length;
            while(i < n){
                int correct = nums[i]-1;
                 if(nums[i] != nums[correct])
                  {   
                    //System.out.println(arr[i] +" index " + correct);
                //  System.out.println("before "+Arrays.toString(arr));
                    swap(nums, i, correct);
                     // System.out.println("after "+Arrays.toString(arr));
                }
                
                else
                {i++;
                // System.out.println("i- "+i);
            }
            }  
            List<Integer> list = new ArrayList<>(); 
         for (int j = 1; j <= nums.length; j++) {
            if(nums[j-1]!= j){
                //System.out.println(arr[j] +" inex- " + j);
                list.add(j);
              }
         }
         return list;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

}
}
