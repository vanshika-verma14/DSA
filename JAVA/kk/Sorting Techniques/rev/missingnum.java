import java.util.Arrays;
public class missingnum {
        public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(cyclic(arr));
        }       
        public static int cyclic(int[] nums) {
            int i=0; 
            int n = nums.length;
            while(i < nums.length){
                int correct = nums[i];
                 if(nums[i] < n && nums[i] != nums[correct])
                 {   System.out.println(nums[i] +" " + correct);
                    swap(nums, i, correct);
                    // System.out.println(Arrays.toString(cyclic(arr)));
                }
                
                else
                i++;
            }  
         for (int j = 0; j < nums.length; j++) {
            if(nums[j]== n){
                return j;
              }
         }
         return n;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
}
