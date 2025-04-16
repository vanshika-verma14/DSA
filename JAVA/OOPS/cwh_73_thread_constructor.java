// Below are the commonly used constructors of the thread class: 
// Thread ( ) 
// Thread ( string ) 
// Thread ( Runnable r )
// Thread ( Runnable r, String name ) 

class thrd extends Thread{
    public thrd(String name){
        super(name); 
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        thrd t1  = new thrd("vanshika");
        thrd t2  = new thrd("verma");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
    }
}
