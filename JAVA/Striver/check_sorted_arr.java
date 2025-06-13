import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class check_sorted_arr {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,4,7,9,10};
    System.out.println(check(a));
}
 public static boolean check(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        if(!set.add(num))
        return true;
    }
    return false;
    // If num is already in the set: set.add(num) → false, so !false → true
    // If num is not in the set: set.add(num) → true, so !true → false
    }
 }


//  Always prefer HashSet when:

//  You only care about existence (like duplicates),

//  And don’t need sorting or order preservation.

// Use TreeSet only when you need elements to be:

//  Sorted, or

//  Do range queries