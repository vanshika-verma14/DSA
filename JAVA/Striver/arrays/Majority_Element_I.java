import java.util.HashMap;

public class Majority_Element_I {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(check(arr));
    }
    public static int check(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
           int cnt= map.getOrDefault(arr[i], 0) + 1;
           map.put(arr[i], cnt);
        }
        if()
        }
    }
}
