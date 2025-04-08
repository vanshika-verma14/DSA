class thrd1 extends Thread{
    public void run(){
        while (true){
            System.out.println("HELLOOOO");
        }
    }
}
class thrd2 extends Thread{
    public void run(){
        while (true){
            System.out.println("THANK YOUUU");
        }
    }
}
public class thread4 {
    public static void main(String[] args) {
        thrd1 t1 = new thrd1();
        thrd1 t2 = new thrd1();
        t1.start();
        t2.start();

        }
}
