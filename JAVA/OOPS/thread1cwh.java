//cwh 70
 class threads1 extends Thread {
    @Override     // we override the thread class in java and to create a thread we extends the Thread class and override run() method
    public void run(){ 
        int i = 0;
        while (i<100){
     System.out.println(" hi i am thread 1");
     System.out.println(" I love cooookingggggggggggggg");
      i++;
        }
    }
}
class threads2 extends Thread {
@Override
    public void run(){
        int i = 0;
        while (i<100){
     System.out.println(" hi i am thread 2");
     System.out.println(" I love dancing");
      i++;
        }
    }
}
public class thread1cwh {
    public static void main(String[] args) {
        threads1 t1 = new threads1();
        threads2 t2 = new threads2();
        t1.start(); // we only use start() to call run methid of the thread whose object you created
        t2.start();
    }
}
