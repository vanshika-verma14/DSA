import java.util.Scanner;
import java.util.ArrayList;
public class Arr6ArrlistMultiDi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // initialise
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
            
        }

        for (int i = 0; i < 3; i++) {
            for(int j = 0 ; j < 3; j++ ){
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr); //[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
    
}
