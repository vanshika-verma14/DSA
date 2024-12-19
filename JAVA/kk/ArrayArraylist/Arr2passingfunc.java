import java.util.Arrays;
public class Arr2passingfunc {

        public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7};
        String[] arr2 = {"a","s","d","f","g"};
        String s = "hello";
        System.out.println("Original Array: " + Arrays.toString(arr));
        change(arr , arr2 ,s);
        System.out.println("Changed Array: " + Arrays.toString(arr));
        System.out.println("Changed Array: " + Arrays.toString(arr2));

        System.out.println("NOT Changed String even after function calling: " + s  );// in general strings are immutable , primitive datatype
        System.out.println("Changed String: " + change(arr , arr2 ,s)  );
        // Yes, primitive types in Java are immutable. This means that once you assign a value to a primitive variable, you cannot change the value itself.
        // Here's why:
        // Value-based: Primitive types store the actual value directly, not a reference to an object. When you modify a primitive variable, you're actually creating a new value and assigning it to the variable.
        // Contrast with Objects:
        // Objects in Java are mutable, meaning you can change their state (the values of their instance variables).
        // If you pass an object to a function and modify its state within the function, those changes will be reflected outside the function as well.
        }
        static String change(int[] nums , String[] arr  , String ss) {
            nums[3]= 99;
            arr[2] = "zoo";
           return ss = "bye";

        }
    

}