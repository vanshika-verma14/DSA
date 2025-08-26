package JAVA.leetcode;

public class leet_27_remove_element {
  public static void main(String[] args) {
    //call func
  }
    public int removeElement(int[] nums, int val) {
       int k = 0; //keep track o array index with non similar value
       for(int i = 0; i<nums.length; i++){
        if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
        }
       }
     return k;
    }
}


