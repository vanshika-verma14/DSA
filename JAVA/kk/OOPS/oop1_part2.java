
public class oop1_part2 {
  
    public static void main(String[] args) {
        Student stu1; // just declaring reference to an object, it means that stu1 is creted in stack memory of Student
         //System.out.println(stu1); //since stu1 is not initialised yet it will give error message
        stu1 = new Student();  // initialising object
        System.out.println("stu1- "+ stu1);
        // Student stu1; - Declares a reference variable stu1 for the Student object. This does not allocate memory for an object yet.
        // stu1 = new Student(); - Allocates memory and initializes the stu1 object using the no-argument constructor.

        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(); 

        System.out.println("PRINT 1- " +kunal.rno);
        System.out.println("PRINT 2- " +kunal.name);
        System.out.println("PRINT 3- " +kunal.marks); 
        // PRINT 1- 0
        // PRINT 2- null
        // PRINT 3- 90.0
        // this is the defualt value when variables declared in the class in the starting , when we do not use 'this' in the parameterised constructor
        //Student (int rno, String name, float marks) {
        // rno = rno;
        // name = name;
        // marks = marks;}
    
        System.out.println("PRINT 1a- " +rahul.rno);
        System.out.println("PRINT 2a- " +rahul.name);
        System.out.println("PRINT 3a- " +rahul.marks);

        kunal.changeName("kiansh"); //object can call a method
        kunal.name = "kk"; //object can directly call the variable to assign the value
        kunal.greeting();
    }}
class Student {
    int rno;
    String name;
    float marks = 90;
    void greeting() {
        System.out.println("Hello! My name is " + name);
    }
    void changeName(String newname) {
        this.name = newname;
    }

    Student  () {
        this.name = "vv";
        this.rno = 5;
        this.marks = 77;
    }

    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        // when we use 'this' keyword then this is the output
        // PRINT 1- 15
        // PRINT 2- Kunal Kushwaha
        // PRINT 3- 85.4
    }

}


