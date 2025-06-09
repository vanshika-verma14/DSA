import java.util.Arrays;

public class rotate_arr {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int k =3;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
    public static int[] rotate(int[] nums , int k){
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
             System.out.println(Arrays.toString(nums));
           }
        }
        return nums;
    }
    }

