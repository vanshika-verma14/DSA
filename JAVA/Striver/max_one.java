public class max_one {
    public static void main(String[] args) {
        
    int[] arr = {1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1};
    System.out.println(max1(arr));
    }
    public static int max1(int[] nums){
        int c= 0;
        int max =0;
        int i =0;
   s
    while(i<nums.length){
            if(nums[i]==1){
                c++;
                i++;
            }
            else{
               c=0;
               i++;
            }
            if(c>max)
                max=c;
        }
        return max;
    
}
}

//  while(i<nums.length){
//     if(nums[i]==1){
//         c++;
//         i++;
//     }
//     else{
//        if(c>max){
//         max=c;
//         System.out.println(max);
//        }
//        c=0;
//        i++;
//     }
// }