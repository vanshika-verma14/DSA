//node next - I am declaring a variable named next, and it will hold an object of type Node
// So:
// ✅ Node → class name
// ✅ next → variable (reference to another object of the same type)
 public class LL1 {
     Node head;
     Node tail;
     int size;

    public LL1(){ //constructor of LL1
        this.size=0;
    }

     private class Node{
        int val;
        Node next;

        public Node(int val, Node next){//next as a parameter is best when you're building chains quickly or recursively.
            this.val = val;
            this.next = next;
        }

        public Node(int val) { //next = null is best when you create nodes one by one.
        this.val = val;
        this.next = null; // even if we write this line or not it will take next as null itself
        }
    }
    
    //INSERT
    //insert from start
    public void insertfirst(int val){
        Node node = new Node(val);
           node.next = head;
           head = node; 
           
           if(tail==null){
             tail=head;
           }

        size+=1;
    }

    //insert from end if nothing mention use end insertion
     public void insertlast(int val){      
           if(tail==null){
            insertfirst(val);
            return; // return isliye karre hn taki neeche ki condition na run ho is step ke baad vrna same value 2 baar list m jaegi ek baar yahan or ek baar neeche compulsory steps m se but return krne pr vo neech ke steps ni execute karega
           }
        Node node = new Node(val);
        tail.next = node;
        tail=node;

        size+=1;
    }

    //insert in middle
     public void insertmid(int n , int val){
        int i=1;
        Node temp= head;
       while(i<n){
        temp = temp.next;
        i++;
       }
       Node node = new Node(val, temp.next);// calling the public Node(int val, Node next) constructor
       temp.next= node;
    //    node.next = temp.next; // if we use Node node = new Node(val); then only val constructor is caleld and we have to do these 2 steps below 
    //    temp.next = node;
       size+=1;
    }
    //display
     public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //DELETE
    //delete from start
     public int del(){ 
        int v = head.val;
        head = head.next;
        if(head== tail){
            tail =null;
        }
        size-=1; 
       return v;
    }

   public static void main(String[] args) {
    LL1 first = new LL1();
    // first.insertfirst(2);
    // first.insertfirst(3);
    // first.insertfirst(4);

    first.insertlast(2);
    // first.insertlast(3);
    //  first.insertfirst(1);
    //  first.insertlast(5);
    // first.insertmid(3,4);
    // first.insertmid(4,9);
        first.display();

    System.out.println(first.del());

    first.display();
   }
}
