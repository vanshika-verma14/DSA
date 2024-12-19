import java.util.Arrays;
public class func4varargs {
    public static void main(String[] args) {
        fun(); //empty array  []
        fun (2,3,4,5,33,65,8,99); //[2, 3, 4, 5, 33, 65, 8, 99]
         mixarguments(2 , 3 , "vanshika");
         //demo(); // due to overloading there is error as function won't recognise which func to call of demo either demo func with int vararg or demo func with string vararg
         demo(2,3,45,6); // calls int vararg func of demo 
         demo("we" , "wrwr","rwr");
    }
    static void fun(int ...v) //Basically when we do not know how many variables we are passing to a func we use varargs. Can be string or anything
    {
        System.out.println(Arrays.toString(v));
    }
    static void mixarguments(int a , int b , String ...v) // error if order is mismatched, varagr should be at end , not in middle or start
    {
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v)
     {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}

