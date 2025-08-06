import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //find frequency of each number with hashmap
        int[] arr = {2,3,4,5,2,3,6,4,4,4,7,2};
        freq(arr);
    }

    public static void freq(int[] arr) {

        HashMap<Integer,Integer > freq = new HashMap<>();
        
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        System.out.println("Frequencies of each number:");
        for(int i : freq.keySet()){
            System.out.println(i + " = " + freq.get(i)); //put(key, value) Stores a key-value pair in the map
        }
    }
}
