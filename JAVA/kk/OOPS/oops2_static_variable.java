class Human {
    int age;
    String name;
   
    static long population;

    static void message() {
        System.out.println("Hello world");  //static method
        //System.out.println(this.age); // cant use this over here , in static we cannot use non static stuff
        // System.out.println(Human.age); //cant use this over here , in static we cannot use non static instances
   //No, a static method cannot directly access instance variables because static methods belong to the class, not to any specific instance (object).
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population += 1; // since it is a static variable conventially it will go with class name that is human not this.population
    }
}
public class oops2_static_variable {
    public static void main(String[] args) {
        Human o1 = new Human(14,"ava") ;
        Human o2 = new Human(12,"ana") ;
        Human o3 = new Human(12,"ana") ;
        System.out.println(o1.population); // coventionally use class name that is Human stil using any object will give 3 no matter which obj is used
        
        System.out.println(Human.population); //even if we comment out above all oject it will show population as it is static and not instance of an object

    }
}

// a static method can be accessed by class name , dont need a object , cannot refer to this or super keyword
