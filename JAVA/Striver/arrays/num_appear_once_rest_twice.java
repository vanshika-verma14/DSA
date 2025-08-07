
//Find the number that appears once, and other numbers twice 
import java.util.HashMap;
public class num_appear_once_rest_twice {
    public static void main(String[] args) {  
    int[] arr = {4,1,2,1,2};
    System.out.println(check2(arr));
    }
    //brute force - double loop check each number

    //hashing
    public static int check(int[] arr){
        int ans = 0;
        HashMap<Integer, Integer> fr = new HashMap<>();
        for (int num : arr) {
            fr.put(num, fr.getOrDefault(num,0 )+1);
        }
        for (int num : arr) {
            if(fr.get(num)==1)
            ans= num;
            break;
        }
        
    return ans;
    }

    //optimal using xor
        public static int check2(int[] arr){
            int ans = 0;
        for (int num : arr) {
            ans^=num;
        }
         return ans;
    }
}
