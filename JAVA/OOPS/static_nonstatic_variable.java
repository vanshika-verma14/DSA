
class Counter {
    int sold = 0;  // Tickets sold at this counter (instance variable)
    static int total = 0;  // Total tickets sold across all counters (static variable)
    void sell() {
        sold++;  // Increase ticket count for this counter
        total++; // Increase overall ticket count
    }
}
public class static_nonstatic_variable  {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // Selling tickets
        c1.sell();
        c1.sell();  // Counter 1 sells 2 tickets
        c2.sell();  // Counter 2 sells 1 ticket
        c3.sell();
        c3.sell();
        c3.sell();  // Counter 3 sells 3 tickets

        // Displaying individual counter sales
        System.out.println("Counter 1 Sold: " + c1.sold);
        System.out.println("Counter 2 Sold: " + c2.sold);
        System.out.println("Counter 3 Sold: " + c3.sold);

        // Displaying total customer count
        System.out.println("Total Customers: " + Counter.total); // here since total is in another class counter we are calling it using class name 
    }
}