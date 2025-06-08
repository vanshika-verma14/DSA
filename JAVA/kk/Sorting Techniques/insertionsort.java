
import java.util.Arrays;

public class insertionsort {
     public static void main(String[] args) {
        int[] nums = {1,2,3,6,5,6};
        // ins(nums);
        System.out.println(Arrays.toString( ins(nums)));
    }
    public static int[] ins(int[] nums) {
        
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >=0; j--) {
                //System.out.println(i +" " + j);
                if(nums[j] < nums[j-1]){
                   swap(nums, j, j-1);
                }
                 else
                    {break;}
                }  
                // System.out.println(i +" " + j);

            }
            // System.out.println(i );
            return nums;
        }

public static void swap(int[] nums, int i, int j) {
     int temp = nums[i];
     nums[i] = nums[j];
     nums[j] = temp;

}
}