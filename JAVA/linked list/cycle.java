public class cycle {

    // Node class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Linked List class
    static class LinkedList {
        Node head;

        // Insert a new node at the end
        public void insert(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Create a cycle (connect last node to node at given position)
        public void createCycle(int pos) {
            if (head == null || pos < 1) return;

            Node temp = head;
            Node cycleNode = null;
            int count = 1;

            while (temp.next != null) {
                if (count == pos)
                    cycleNode = temp;
                temp = temp.next;
                count++;
            }

            if (cycleNode != null)
                temp.next = cycleNode; // create cycle
        }

        // Detect cycle using Floyd's (Tortoise–Hare) algorithm
        public boolean detectCycle() {
            Node slow = head;  // tortoise
            Node fast = head;  // hare

            while (fast != null && fast.next != null) {
                slow = slow.next;          // move 1 step
                fast = fast.next.next;     // move 2 steps

                if (slow == fast) {        // collision point → cycle exists
                    System.out.println("Cycle detected!");
                    return true;
                }
            }

            System.out.println("No cycle detected.");
            return false;
        }

        // Display (only safe for non-cyclic lists)
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked List created:");
        list.display();

        // Create a cycle (connect last node to node at position 2)
        list.createCycle(2);

        // Detect cycle using Tortoise–Hare method
        list.detectCycle();
    }
}
