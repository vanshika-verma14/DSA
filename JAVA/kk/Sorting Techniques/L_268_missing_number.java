import java.util.Arrays;

public class L_268_missing_number {
    
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,8,7,0,1};
        check(arr);
         System.out.println(Arrays.toString(arr));

         System.out.println( check(arr));
    }
    static int check(int[] nums) {
        int i = 0;
        while(i < nums.length){
        int correct_index = nums[i]; 
         if(nums[i] != nums[correct_index]  ){ 
        swap(nums , i , correct_index); 
         System.out.println(Arrays.toString(nums));
        }  
        else 
        i++;
    }
      int mn = missingnum(nums);
     return mn;
 }
public static void swap(int[] arr, int index_a , int index_b) {  // sendind index whose value needs to be swapped
   int temp = arr[index_a]; 
   arr[index_a] = arr[index_b];
   arr[index_b] = temp;
   
}   
 static int missingnum(int[] arr) {
    int ans = arr.length;
 for (int i = 0; i < arr.length; i++) {
    if(i != arr[i])
    return i;
}
 return ans;
}
}