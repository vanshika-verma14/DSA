// static block will run first even before main but static method will run in main when called
// Static Block vs. Static Method Execution Order
// 1️⃣ Static Block → Runs once when the class is loaded into memory (before main executes). It runs only once when the class is first loaded into memory by the JVM. It does not run again even if you create multiple objects of the class or call static methods.
// 2️⃣ Static Method → Runs only when explicitly called in main or another method.
// this is a demo to show initialisation of static variables

public class ops2_staticblock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
    // Static method
    static void display() {
        System.out.println("I am in static display method");
        System.out.println("Static method called: " + a + " " + b);
    }

    public static void main(String[] args) { // even if we do not write anything in main static will run and print I am in static block
       
        System.out.println("I am in main block");
        display();// calling static method
        ops2_staticblock obj = new ops2_staticblock();
        System.out.println(ops2_staticblock.a + " " + ops2_staticblock.b);

        ops2_staticblock.b += 3; //b is changed
        System.out.println(ops2_staticblock.a + " " + ops2_staticblock.b);
        

        ops2_staticblock obj2 = new ops2_staticblock();
        System.out.println(ops2_staticblock.a + " " + ops2_staticblock.b); // value of a - 4 and b = 23
        display();// calling static method
    }

}
// 🔹 Answer: Why Create an Object in main()?
// Technically, the object (obj) is NOT needed because:
// a and b are static, meaning they can be accessed using StaticBlock.a and StaticBlock.b without any object.
// There are no instance variables or instance methods in StaticBlock.
// However, if the class contained non-static fields or methods, we would need an object to access them.

// class StaticBlock {
//     static int a = 4;
//     static int b;

//     static {
//         System.out.println("I am in static block");
//         b = a * 5;
//     }

//     public static void main(String[] args) {
//         System.out.println(StaticBlock.a + " " + StaticBlock.b);

//         StaticBlock.b += 3;

//         System.out.println(StaticBlock.a + " " + StaticBlock.b);

//         // No need to create obj!
//         System.out.println(StaticBlock.a + " " + StaticBlock.b);
//     }
// }