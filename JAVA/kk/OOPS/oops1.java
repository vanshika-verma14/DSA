import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
public class oops1 {
  
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
 
        Student[] stndss = new Student[5]; //Declares an array to store five Student objects. Initially, all elements in this array are null
        System.out.println(Arrays.toString(stndss)); //[null, null, null, null, null]
        // Why Student[] Works?
        // Student[] is not a primitive data type but a valid reference type:
        
        // When you create a class (class Student), it automatically becomes a valid type that can be used for:
        // Declaring variables (Student s;).
        // Creating arrays (Student[] students).
        // In this case, Student[] is an array of references to Student objects.
        // This works similarly to how you would declare and initialize an array of primitive types like int[].
        stndss[0]  = new Student(1, "Alice", 80.0f);
        stndss[1] = new Student(2, "Bob", 90.0f);
        System.out.println(Arrays.toString(stndss));
        // ... and so on for all elements
        // Student[] is a valid reference type because arrays can hold objects in Java.
        // The array itself is created, but it contains null references until Student objects are assigned.
        // Arrays.toString() is used to visualize the current state of the array.
        
        
        Student stu1; // just declaring reference to an object, it means that stu1 is creted in stack memory of Student
         //System.out.println(stu1); //since stu1 is not initialised yet it will give error message
        stu1 = new Student();  // initialising object
        System.out.println("stu1- "+ stu1);
        // Student stu1; - Declares a reference variable stu1 for the Student object. This does not allocate memory for an object yet.
        // stu1 = new Student(); - Allocates memory and initializes the stu1 object using the no-argument constructor.



        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f); 
        //Two Student objects (kunal and rahul) are created using the parameterized constructor above.

    //    kunal.rno = 13;
    //    kunal.name = "Kunal Kushwaha";
    //    kunal.marks = 88.5f;
    //    kunal.changeName("Shoe lover");
    //    kunal.greeting();
    //IF ABOVE NOT COMMENTED THIS WILL BE THE OUTPUT
    //    PRINT 1- 13
    //    PRINT 2- Shoe lover
    //    PRINT 3- 88.5
    //    PRINT 4- Shoe lover
    //    PRINT 5- default person
    //    PRINT 6- Something something

        System.out.println("PRINT 1- " +kunal.rno);
        System.out.println("PRINT 2- " +kunal.name);
        System.out.println("PRINT 3- " +kunal.marks);

        Student random = new Student(kunal);
        System.out.println("PRINT 4- " +random.name);

        Student random2 = new Student();
        System.out.println("PRINT 5- " +random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println("PRINT 6- " +two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;
    // we need a way to add the values of the above
    // properties object by object
    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
    void changeName(String name) {
        this.name = name;
    }
    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student () {
        // this is how you call a constructor from another constructor , we are calling the below parameterised constructor here 
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f); //now this has become default constructor (see random2 output)
    }
    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
