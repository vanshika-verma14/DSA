import java.util.*;

public class HashMapIterationDemo {
    public static void main(String[] args) {
        
        // Create a HashMap (Student name -> map)
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 75);
        map.put("Charlie", 85);

        // 1. Iterating over KEYS only
        System.out.println("Iterating over keys:");

        for (String key : map.keySet()) { // keySet() gives all keys
            System.out.println("Key = " + key);
        }

        // 2. Iterating over VALUES only
        System.out.println("\nIterating over values:");

        for (Integer value : map.values()) { // values() gives all values
            System.out.println("Value = " + value);
        }

        // 3. Iterating over ENTRIES (Key + Value together)
        System.out.println("\nIterating over key-value pairs:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // entrySet() gives key=value pairs
            String key = entry.getKey();      // get the key
            Integer value = entry.getValue(); // get the value
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
