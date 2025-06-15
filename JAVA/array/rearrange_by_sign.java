import java.util.Arrays;

public class rearrange_by_sign {
    public static void main(String[] args) {
        int[] arr = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray( arr)));
    }
        public static int[] rearrangeArray(int[] nums) {
            if(nums.length==1 )
            return nums;
            else 
            {
                int[] pos = new int[nums.length/2];
                int[] neg = new int[nums.length/2];
                int j=0,k=0;
                for(int i = 0; i<nums.length;i++){
                    if(nums[i]<0)
                    { neg[j]=nums[i];
                        j++;}
                     else
                     {pos[k]=nums[i];
                     k++;}
    
                }
                 j=0;
                 k=0;
                for(int i = 0; i<nums.length;i++){
                    if(i%2==0)
                    {nums[i]= pos[k];
                    k++;}
                    else
                   { nums[i]= neg[j];
                   j++;}
                }
            }
            return nums;
        }
    }
