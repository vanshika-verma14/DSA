class test{ // not always necesarry for the class have to be generic like class <T> test{} we can also just implement generic constructor in below format
    public <T> test (T value){ 
       System.out.println(value);
    }
}

class test2{

    public <T> void prntarr(T[] arr){
        for (T i : arr) {
            System.out.println("Elements are " + i);
        }
        System.out.println();
    }
   
    //overriding property of generic method if we want to specify a datatype on are own
    public static <T> void display(T item){
        System.out.println(item);
    }
    public static void display(Integer item){
        System.out.println(item);
    }
}

public class generic3 {
    public static void main(String[] args) {
        test t = new test("vanshika");
        test t1 = new test(123);

        Integer[] arr = {1,2,3,4};  //not int use Interger
        String[] arr1 = {"vasnhika", "verma"};
        test2 ob = new test2();
        ob.prntarr(arr);
        ob.prntarr(arr1);

        test2.display(22);
        test2.display("hello");
    }
}
