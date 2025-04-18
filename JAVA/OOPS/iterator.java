// An Iterator in Java is an interface used to traverse elements in a Collection sequentially. It provides methods like hasNext(), next(), and remove() to loop through collections and perform manipulation. An Iterator is a part of the Java Collection Framework, and we can use it with collections like ArrayList, LinkedList, and other classes that implement the Collection interface.

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(1);
        // for (int i : list) {
        //     // System.out.println(list.get(i)); //error
        //     System.out.println(i);
        // }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<Integer> itrr = list.iterator();
        while(itrr.hasNext()){
            Integer num = itr.next();
            if(num%2 == 0){
                itrr.remove();
            }
        }
        System.out.println(list);

        

    }
    
}
