// The map interface in Java is a structure that holds a set of key-value pairs where each key is unique and points to one value only. It is a component of the java.util package and is being widely used in Java programming to structure and get data in an ordered manner. A Map is useful if you have to search, update or delete elements on the basis of a key.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(4, "vanshika");
        map1.put(2, "verma");
        map1.put(3, "vanshika");
        System.out.println(map1); //{1=vanshika, 2=verma, 3=vanshika}
         
        String s = map1.get(2);
        System.out.println(s);
        String s2 = map1.get(22);
        System.out.println(s2);
        
       System.out.println(map1.containsKey(2));
       System.out.println(map1.containsValue("verma"));
        

        // Creating a HashMap
        Map<String, String> mmap = new HashMap<>();

        // 1. put(K, V) - adds key-value pair
        mmap.put("India", "Delhi");
        mmap.put("USA", "Washington");
        mmap.put("UK", "London");
        mmap.put("Japan", "Tokyo");

        // 2. putIfAbsent(K, V) - only puts if key is absent
        mmap.putIfAbsent("India", "New Delhi");  // Won't overwrite
        mmap.putIfAbsent("Germany", "Berlin");

        // 3. get(Object key)
        System.out.println("Capital of India: " + mmap.get("India")); // Delhi

        // 4. getOrDefault(Object key, V defaultVal)
        System.out.println("Capital of France: " + mmap.getOrDefault("France", "Not Found")); // Not Found

        // 5. containsKey(Object key)
        System.out.println("Has UK? " + mmap.containsKey("UK")); // true

        // 6. containsValue(Object value)
        System.out.println("Has Tokyo as a capital? " + mmap.containsValue("Tokyo")); // true

        // 7. remove(Object key)
        mmap.remove("Japan");
        System.out.println("After removing Japan: " + mmap); // Japan removed

        // 8. remove(Object key, Object value)
        boolean removed = mmap.remove("USA", "Washington"); // true
        System.out.println(mmap);
        System.out.println("USA removed? " + removed);     // true

        // 9. replace(K key, V value)
        mmap.replace("UK", "Manchester");
        System.out.println("Replaced UK's capital: " + mmap.get("UK")); // Manchester

        // 10. replace(K key, V oldValue, V newValue)
        boolean replaced = mmap.replace("UK", "Manchester", "London");
        System.out.println("UK replaced conditionally? " + replaced); // true

        // 11. keySet() - returns all keys
        System.out.println("All countries: " + mmap.keySet()); // [India, UK, Germany]

        // 12. values() - returns all values
        System.out.println("All capitals: " + mmap.values()); // [Delhi, London, Berlin]

        // 13. entrySet() - returns Set of Map.Entry
        System.out.println("Country-Capital pairs:");
        for (Map.Entry<String, String> entry : mmap.entrySet()) {
            System.out.println(entry.getKey() + " -  " + entry.getValue());
        }

        Set<Map.Entry<String,String>> entry1 = mmap.entrySet();  //You're storing the result of map.entrySet() inside a Set of entries.
        for(Map.Entry<String,String> i : entry1){
            i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(mmap);
        // Set → It’s a collection that holds unique values.
        // Map.Entry<K, V> → This is a type that stores one key and one value.
        // For example, Map.Entry<String, String> stores something like "fruit" → "apple".
        

        // 14. size()
        System.out.println("Total entries: " + mmap.size()); // 3

        // 15. isEmpty()
        System.out.println("Is map empty? " + mmap.isEmpty()); // false

        // 16. clear()
        mmap.clear();
        System.out.println("After clear: " + mmap); // {}
        System.out.println("Is map now empty? " + mmap.isEmpty()); // true


        }

    }
    


// Full Method List Used
// Method	Description
// put()	Add key-value
// putIfAbsent()	Put if key is missing
// get()	Get value by key
// getOrDefault()	Get value or default
// containsKey()	Check key exists
// containsValue()	Check value exists
// remove(key)	Remove key
// remove(key, value)	Remove only if both match
// replace(key, value)	Replace value
// replace(key, old, new)	Conditional replace
// keySet()	All keys
// values()	All values
// entrySet()	All entries
// size()	Count of entries
// isEmpty()	Check if empty
// clear()	Remove all entries

// Entry is an object that holds:
// one key
// one value
// Together, this key-value pair forms a single mapping in the Map.
// Map.Entry<K, V> is an inner interface inside the Map interface in Java.
// It represents one key-value pair in the map
// Map.Entry is not a class — it’s an interface.
// You can’t directly create a new Map.Entry yourself.
// You get entries from entrySet().
//  Map.Entry = one pair of key and value.
//  map.entrySet() = a Set containing all the Map.Entry pairs in the map.
