public class sta_nonsta_main {
    class Example {
        int instanceVar = 10;  // Non-static variable (belongs to an object)
        static int staticVar = 20;  // Static variable (belongs to the class)
    
        // Static method
        static void staticMethod() {
            // System.out.println(instanceVar);  ❌ ERROR: Cannot access non-static variable directly
            Example obj = new Example(); // ✅ Create an object to access instance variable
            System.out.println("Instance Variable: " + obj.instanceVar);
    
            System.out.println("Static Variable: " + staticVar);  // ✅ Static variable can be accessed directly
        }
    
        // Non-static method
        void nonStaticMethod() {
            System.out.println("Instance Variable: " + instanceVar);  // ✅ Direct access
            System.out.println("Static Variable: " + staticVar);  // ✅ Static variable can be accessed directly
        }
    
        public static void main(String[] args) {
            staticMethod();  // Calling static method
    
            Example obj = new Example();
            obj.nonStaticMethod();  // Calling non-static method
        }
    }
    
}
