
import java.util.Arrays;

public class insertionsort {
     public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,6};
        ins(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] ins(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >=0; j--) {
                //System.out.println(i +" " + j);
                if(arr[j] < arr[j-1]){
                   swap(arr, j, j-1);
                }
                 else
                    {break;}
                }  
                // System.out.println(i +" " + j);

            }
            // System.out.println(i );
            return arr;
        }

public static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;

}
}