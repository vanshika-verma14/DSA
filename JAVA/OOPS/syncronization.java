class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
        System.out.println(count);

    }

    synchronized void decrement() {
        count--;
        System.out.println(count);

    }
}

public class syncronization {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) 
            c.increment();
        }
        );

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) 
            c.decrement();

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
