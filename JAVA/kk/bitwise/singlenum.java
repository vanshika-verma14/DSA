import java.util.HashSet;

public class singlenum {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,2,4,1,3,5};
        System.out.println(check(arr));
            }
        
            static int check(int[] arr) {
                HashSet<Integer> set = new HashSet<>();
                for (int i : arr) {
                    if(set.add(i))
                }
            }
            
}
