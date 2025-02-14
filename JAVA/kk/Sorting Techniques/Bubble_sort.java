import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for (int j = 1; j <= arr.length - i -1; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr , j , j-1);
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
        return arr;
}
public static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;

}}