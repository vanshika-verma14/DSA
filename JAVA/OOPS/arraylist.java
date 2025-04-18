// Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 1. add(element)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");   // list = [Apple, Banana, Cherry]

        // 2. add(index, element)
        list.add(1,"Blueberry");
        // list = [Apple, Blueberry, Banana, Cherry]

        // 3. get(index)
        System.out.println("Element at index 2: " + list.get(2)); 
        // Output: Element at index 2: Banana

        // 4. set(index, element)
        list.set(0,"Apricot");
        System.out.println(list);
        // list = [Apricot, Blueberry, Banana, Cherry]

        // 5. remove(index)
        list.remove(2); 
        System.out.println(list);
        // Removes "Banana", list = [Apricot, Blueberry, Cherry]
     
        // 6. remove(Object)
        list.remove("Blueberry");
        System.out.println(list);
        // list = [Apricot, Cherry]

       // 7. contains(element)
        System.out.println("Contains Banana? " + list.contains("Banana")); 
        // Output: Contains Banana? false

        // 8. size()
        System.out.println("Size: " + list.size()); 
        // Output: Size: 2

        // 9. isEmpty()
        System.out.println("Is empty? " + list.isEmpty()); 
        // Output: Is empty? false

        // 10. indexOf(element)
        list.add("Banana");
        // list = [Apricot, Cherry, Banana]
        System.out.println("Index of Banana: " + list.indexOf("Banana")); 
        // Output: Index of Banana: 2

        // 11. lastIndexOf(element)
        list.add("Banana");
        // list = [Apricot, Cherry, Banana, Banana]
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana")); 
        // Output: Last index of Banana: 3

        // 12. clear()
        // list.clear(); // Uncomment to clear list

        // 13. toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr)); 
        // Output: Array: [Apricot, Cherry, Banana, Banana]

        // 14. sort (Collections.sort)
        Collections.sort(list);
        System.out.println("Sorted: " + list); 
        // Output: Sorted: [Apricot, Banana, Banana, Cherry]

        // 15. forEach
        System.out.print("forEach: ");
        list.forEach(e -> System.out.print(e + " "));
        // Output: forEach: Apricot Banana Banana Cherry 

        // 16. iterator
        System.out.print("\nIterator: ");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        // Output: Iterator: Apricot Banana Banana Cherry 

        // 17. subList(start, end)
        List<String> sub = list.subList(0, 2);
        System.out.println("\nSublist: " + sub); 
        // Output: Sublist: [Apricot, Banana]

        // 18. equals()
        ArrayList<String> anotherList = new ArrayList<>(list);
        System.out.println("Lists equal? " + list.equals(anotherList)); 
        // Output: Lists equal? true
    }
    
}
