//node next - I am declaring a variable named next, and it will hold an object of type Node
// So:
// ✅ Node → class name
// ✅ next → variable (reference to another object of the same type)

import org.w3c.dom.Node;

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

    // del from end
    public int delend(){
        int v = tail.val;
        if (size <= 1) {
            return del();
        }
    Node seclast = get(size - 2);
    seclast.next = null;
    tail = seclast;
    size--;
    return v;
    }
    // del from mid
    public int delmid(int index){
        if (index == 0) {
            return del();
        }
        if (index == size - 1) {
            return delend();
        }
        Node temp = get (size-2);
        int v = temp.next.val;
        temp.next = temp.next.next;

    size--;
    return v;
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


    public Node get(int n ){
        Node temp = head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //KK VID AMAZON GOOGLE QUES -
    //REMOVE DUPLICATES FROM SORTED LL
     public Node deleteDuplicates(Node head) {
        Node node = head;
        if(node ==null)
        return node;
        else{
            while(node.next!=null){
                if(node.val==node.next.val){
                    node.next = node.next.next;
                }
                else
                node = node.next; 
            }
        }
        return head;
    }
    
    //Linked list cycle leet -141
    public boolean hasCycle(Node head) {
        Node s = head;
        Node f = head;
        while(f!=null && f.next!=null){
            s= s.next;
            f= f.next.next;
            if(s==f)
            return true;
        }
        
        return false;
    }

      //Linked list cycle length 
      public int hasCycle(Node head) {
        Node s = head;
        Node f = head;
        int c = 0;
        while(f!=null && f.next!=null){
            s= s.next;
            f= f.next.next;
            if(s==f){
                do{
                    f= f.next;
                    c++;
                }while(f!=s);
                return c;
            }
            
        }
        return 0;
    }
   public static void main(String[] args) {
    LL1 firstll = new LL1();
    // first.insertfirst(2);
    // first.insertfirst(3);
    // first.insertfirst(4);
    // first.insertlast(3);
    //  first.insertfirst(1);
    //  first.insertlast(5);
    // first.insertmid(3,4);
    // first.insertmid(4,9);
    
    firstll.insertlast(1);
    firstll.insertlast(1);
    firstll.insertlast(2);
    firstll.insertlast(3);
    firstll.display();

    //System.out.println(first.del());
   firstll.head = firstll.deleteDuplicates(firstll.head);

    firstll.display();
   }
 }