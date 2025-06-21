import java.util.Arrays;

public class check_duplicates {
    public static void main(String[] args) {
    int[] a = {1};
    System.out.println(check(a));
}
    public static int check(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
System.out.println(Arrays.toString(nums));
        return k;
    }
}
