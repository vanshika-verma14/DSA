import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
        int correct_index = arr[i] - 1;
        if(arr[i] != arr[correct_index]){
            swap(arr , i , correct_index);
        }
        else 
        i++;
    }
}
 public static void swap(int[] arr, int index_a , int index_b) {
    int temp = arr[index_a]; 
    arr[index_a] = arr[index_b];
    arr[index_b] = temp;
    
 }
}