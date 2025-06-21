public class move_zero {
    public static void main(String[] args) {
        int[] arr = {9,9,5,9,6,0,3,0,0,2};
        System.out.println(zz);
    }
        public void moveZeroes(int[] nums) {
            int c = -1;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==0){
                    c=i;
                    break;
                }    
            }
            if(c==-1)
            return ;
              else {
               int j =c;
               for(int i = j+1; i<nums.length; i++){
               if(nums[i]!=0){
                nums[j++] =nums[i];
                nums[i]=0;
               }}
            }
            }
    }
