public class func5overloading { // when 2 functions with same names but different parameters arae called
    public static void main(String[] args) {
               fun(67);
               fun("VANSHIKA VERMA");
              // fun(); //empty function in overloading will give error as it will not be able to recognise which function to execute
                System.out.println(sum(3, 4, 78));
            }
            static int sum(int a, int b) {
                return a + b;
            }
        
            static int sum(int a, int b, int c) {
                return a + b + c;
            }
            static void fun(int a) {
                System.out.println("first one");
                System.out.println(a);
            }
        
            static void fun(String name) {
                System.out.println("Second one");
                System.out.println(name);
            }
}
