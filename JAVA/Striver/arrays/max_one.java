package arrays;
public class max_one {
    public static void main(String[] args) {
        
    int[] arr = {1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1};
    System.out.println(max(arr));
    }
    public static int max(int[] nums){
        int c= 0;
        int max =0;
        int i =0;
  while(i<nums.length){
            if(nums[i]==1){
                c++;
                i++;
            }
            else{
               c=0;
               i++;
            }
            if(c>max) // yahan pr hr step m c ki value check hoke max m update hori h rather end m alltogether max check krne se 0 aane ke baad , is waja se uper jab 0 ata h else m to c ki value 0 hone se farak ni padta is comparisonn of max ko cox vapis jese c ki value bhadegi and max se uper jaegi to max update ho jaega and hr bhadte no. of 1 ke sath max ki value sath sath update hori h
                max=c;
        }
        return max;
    
}

 public static int max1(int[] nums) { //striver
        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }

        return maxi;
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