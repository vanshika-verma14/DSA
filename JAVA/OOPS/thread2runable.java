//cwh71
class runnable1 implements Runnable{
    public void run(){ 
        int i = 0;
        while (i<100){
     System.out.println(" hi i am thread 1");
     System.out.println(" I love cooookingggggggggggggg");
      i++;
        }
    }
}
class runnable2 implements Runnable{
    public void run(){ 
        int i = 0;
        while (i<100){
     System.out.println(" hi i am thread 2");
     System.out.println(" I love dancciinnggggg");
      i++;
        }
    }
}
 public class thread2runable {
   public static void main(String[] args) {
    runnable1 bullet1 = new runnable1();
    Thread gun1 = new Thread(bullet1);

    runnable2 bullet2 = new runnable2();
    Thread gun2 = new Thread(bullet2);
    gun1.start();
    gun2.start();

   }
}
