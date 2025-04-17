// Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
import java.util.ArrayList;
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
        System.out.println("Contains Banana? " + list.contains("banana")); 
        // Output: Contains Banana? false
    }
    
}
