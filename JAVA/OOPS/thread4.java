class thrd1 extends Thread{
    public void run(){
        int i =0;
        while (i <1000){
            System.out.println("HELLOOOO");
            i++;
        }
    }
}
class thrd2 extends Thread{
    public void run(){
        int i =0;
        while (i <1000){
            System.out.println("THANK YOUU");
            i++;
        }
    }
}
public class thread4 {
    public static void main(String[] args) {
        thrd1 t1 = new thrd1();
        thrd2 t2 = new thrd2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        t2.start();

        }
}
