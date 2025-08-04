public class Example {
    int x = 10; // Instance variable
    static int y = 1;
    static void staticMethod() {
        Example obj = new Example(); // ✅ Creating an object inside a static method
        System.out.println("Instance Variable x: " + obj.x);
        System.out.println("class Variable y : " + y);

    }

    public static void main(String[] args) {
        staticMethod(); // Call the static method
        System.out.println(y);
    }
}
