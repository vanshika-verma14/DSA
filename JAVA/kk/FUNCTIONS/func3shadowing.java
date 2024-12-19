public class func3shadowing {
    static int x = 100; //this value will be shadowed at line 7 by 20
    public static void main(String[] args) { 
    System.out.println(x); //10
    int x ; //class variable at line 2 is shadowed by this
    // System.out.println(x); //error message , since x is again initialized therefore it will wait for its value to be assignend  
    x = 20;
    System.out.println(x); //20
    fun();
}
static void fun() {
    System.out.println(x); //100
}
}
