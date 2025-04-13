//if class contain any one abstract methd then class is declared as abstract 
// you cannot creae object of an abstract class
// Abstract classes: Classes that cannot be instantiated and are intended to be extended.
// Abstract methods: Methods that do not have a body and must be implemented by subclasses.

// Do's:
// Declare abstract methods in abstract classes or interfaces.
// Define the method signature (name, return type, parameters).
// Abstract methods can throw exceptions.
// Abstract methods can be overloaded.

// Don'ts:
// Do not provide a method body for abstract methods.
// Do not make abstract methods static, final, or private.
// Do not instantiate an abstract class directly.

abstract class parent{
    int age;
    final double radius = 3.14 ;

    public parent(int age){
        this.age  = age;   
    }
    static void hello()
    {
        System.out.println("hello");
    }
     
    void normal(){
        int a = 1;
        System.out.println("this is a normal, non abstract method" +  a);
    }

    abstract void career();
    abstract int sal(String name);
    abstract void partner();

}

class son extends parent{

    public son(int age) {
        super(age);  //  Must call parent constructor
    }
    @Override
    void career(){
    System.out.println("My job is doctor");
    }

    @Override
    int sal(String name){
    String nm = name;
    System.out.print("salary is - ");
    return 299;
    }
    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }

}

public class kkabstract{
    public static void main(String[] args) {
        son ob = new son(20);
        ob.career();
        System.out.println(ob.sal("dr"));

        parent.hello();
        
        parent ob2 = new son(45);
        ob2.partner();

    }
}
