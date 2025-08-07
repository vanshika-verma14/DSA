public class oops2_static_func {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal", 10000, false);
//        Human rahul = new Human(34, "Rahul", 15000, true);
//        Human arpit = new Human(34, "arpit", 15000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

oops2_static_func funn = new oops2_static_func();
        funn.fun2();

    }

    // this is not dependent on objects
    static void fun() {
        // greeting(); // you cant use this because it requires an instance that is you cannot access non static stuff in staticwithout making an object
        //  the function you are using it in does not depend on instances that is static

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        oops2_static_func obj = new oops2_static_func();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
     //    fun(); // it can be called in non static method
        System.out.println("Hello world");
    }
}


