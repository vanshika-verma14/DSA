import java.util.ArrayList;
import java.util.Scanner;

public class Arr5Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
    //syntax
    ArrayList<Integer> listt = new ArrayList<>(5);  // can be Integer, String ( etc, ig chech)
    //manually initializing list
    listt.add(11);
    listt.add(23);
    listt.add(30);
    listt.add(434);
    listt.add(55);
    listt.add(65);
    listt.add(74); // in arraylist we can exceed beyound the assigned limit of arraylist like here we gave it lenght of 5 , arraylist basically when sees that half the lenght of the arraylist if filled it doubles it that is extends or grow its space and copy the previous list items to this new extended list, therefore we can add as many items as we wants, also refer kk notes

     System.out.println(listt.contains(576)); ///checks if this value is present or not ...here it is false
     System.out.println(listt); // [11, 23, 30, 434, 55, 65, 74]
     listt.set(0, 99); // set 0 index value as 99 ...[99, 23, 30, 434, 55, 65, 74]
     System.out.println(listt);

     listt.remove(2); //del value at index 2
     System.out.println(listt);

     ArrayList<Integer> arrlist = new ArrayList<>(5);
     //input
     for (int i = 0; i < 5; i++) {
        arrlist.add(sc.nextInt());        
     }

     //output method 2 specially if we want particular elements based on index or work on it rather than printing whole list
    for (int i = 0; i < 5; i++) {
        System.out.print(arrlist.get(i) + " ");
    }
    System.out.println();
    //output method 1
    System.out.println("method 2 - " + arrlist);
    
}
}