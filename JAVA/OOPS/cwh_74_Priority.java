// Java Thread Priorities
// In a Multithreading environment, all the threads which are ready and waiting to be executed are present in the Ready queue. The thread scheduler is responsible for assigning the processor to a thread. But the question is on what basis the thread scheduler decides that a particular thread will run before other threads. Here comes the concept of priority in the picture.

// Every single thread created in Java has some priority associated with it.
// The programmer can explicitly assign the priority to the thread. Otherwise, JVM automatically assigns priority while creating the thread.
// In Java, we can specify the priority of each thread relative to other threads. Those threads having higher priorities get greater access to the available resources than lower priorities threads.
// Thread scheduler will use priorities while allocating processor.
// The valid range of thread priorities is 1 to 10 (but not 0 to 10), where 1 is the least priority, and 10 is the higher priority.
// If there is more than one thread of the same priority in the queue, then the thread scheduler picks any one of them to execute.
// The following static final integer constants are defined in the Thread class:
// MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
// NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer does not explicitly set the priority of that thread. Value is 5.
// MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.
// Priority Methods In Java :
// setPriority():
// This method is used to set the priority of a thread. IllegalArgumentException is thrown if the priority given by the user is out of the range [1,10].
// getPriority():
// This method is used to display the priority of a given thread.

class thrd extends Thread{
    public void run(){
        System.out.println("I'm thread : "+Thread.currentThread());  
        System.out.println("I'm thread : "+Thread.currentThread().getName());  
        System.out.println("I'm thread : "+Thread.currentThread().getPriority());  
       
    }
}
public class cwh_74_Priority {
    public static void main(String args[]){  
        thrd t1 = new thrd();  
        thrd t2 = new thrd(); 
        t1.getPriority(); // Will return the priortity of the t1 thread. 
        t1.setPriority(3); // x is the priority [1,10] that is to be set for the thread.
        t1.setPriority(Thread.MAX_PRIORITY);  // setting priority of t1 thread to MAX_  PRIORITY (10)
        t2.setPriority(Thread.MIN_PRIORITY);  // setting priority of t2 thread to MIN_PRIORITY (1)
        t1.start();  
        t2.start();
}
}