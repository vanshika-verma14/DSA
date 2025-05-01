import java.util.*;

public class Arrylist1 {
    public static void main(String[] args) {

        // 1. Creating an ArrayList to store names of students
        ArrayList<String> stud = new ArrayList<>();  //stud means student
        System.out.println("Created new ArrayList: " + stud);

        // 2. Adding students using add()
        stud.add("Vanshika");
        stud.add("Aryan");
        stud.add("Riya");
        stud.add("Kunal");
        System.out.println("Added students: " + stud);

        // 3. Inserting a student at a specific index using add(index, element)
        stud.add(1, "Neha");
        System.out.println("After inserting Neha at index 1: " + stud);

        // 4. Accessing a student at a particular index using get(index)
        System.out.println("Student at index 3 is: " + stud.get(3));

        // 5. Updating a name using set(index, element)
        stud.set(2, "Priya");
        System.out.println("After updating index 2 to Priya: " + stud);

        // 6. Checking if a student is in the list using contains()
        System.out.println("Does the list contain 'Vanshika'? " + stud.contains("Vanshika"));

        // 7. Removing a student by value using remove(Object)
        stud.remove("Neha");
        System.out.println("After removing Neha: " + stud);

        // 8. Removing a student by index using remove(index)
        stud.remove(0);
        System.out.println("After removing element at index 0: " + stud);

        // 9. Finding index of an element using indexOf()
        System.out.println("Index of 'Priya': " + stud.indexOf("Priya"));

        // 10. Finding last index using lastIndexOf()
        stud.add("Aryan"); // Adding duplicate for test
        System.out.println("Last index of 'Aryan': " + stud.lastIndexOf("Aryan"));

        // 11. Checking if the list is empty using isEmpty()
        System.out.println("Is the list empty? " + stud.isEmpty());

        // 12. Getting the number of students using size()
        System.out.println("Number of students: " + stud.size());

        // 13. Iterating through list using for-each loop
        System.out.println("Students in the list:");
        for (String student : stud) {
            System.out.println(student);
        }

        // 14. Adding all students from another list using addAll()
        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Tanvi");
        newStudents.add("Ankit");
        stud.addAll(newStudents);
        System.out.println("After adding all from new list: " + stud);

        // 15. Sorting the list using Collections.sort()
        Collections.sort(stud);
        System.out.println("After sorting the list: " + stud);

        // 16. Creating a sublist using subList()
        List<String> pairList = stud.subList(0, 2);
        System.out.println("Sublist (0 to 2): " + pairList);

        // 17. Cloning the list using clone()
        ArrayList<String> clonedList = (ArrayList<String>) stud.clone();
        System.out.println("Cloned list: " + clonedList);

        // 18. Converting ArrayList to array using toArray()
        Object[] studentArray = stud.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : studentArray) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 19. Keeping only common elements using retainAll()
        ArrayList<String> filterList = new ArrayList<>();
        filterList.add("Tanvi");
        filterList.add("Riya");
        stud.retainAll(filterList);
        System.out.println("After keeping only common with [Tanvi, Riya]: " + stud);

        // 20. Removing all elements that exist in another list using removeAll()
        stud.removeAll(filterList);
        System.out.println("After removing all elements from filterList: " + stud);

        // 21. Ensuring capacity using ensureCapacity()
        stud.ensureCapacity(20); // Ensures space, no visible change
        System.out.println("Ensured capacity to hold 20 elements.");

        // 22. Trimming unused space using trimToSize()
        stud.trimToSize(); // Again, no visible change but optimizes memory
        System.out.println("Trimmed to size to optimize memory.");

        // 23. Clearing the entire list using clear()
        stud.clear();
        System.out.println("After clearing all students: " + stud);

        // 24. Final check if list is empty
        System.out.println("Is the list empty now? " + stud.isEmpty());
    }
}
