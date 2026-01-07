import java.util.Arrays;

public class r7_majority_ele_1 {
     public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,5,3,6,4,4,4,3,3,3,5,3,3,3,3};
        System.out.println(Arrays.toString(majority(arr)));
        }
    public static int majority(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
            else
                map.value
            
        }
    }
}
