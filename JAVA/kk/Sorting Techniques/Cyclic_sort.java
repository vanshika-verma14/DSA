import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
        int correct_index = arr[i] - 1; // corrrect index of any element at arr[i] is found by this formula, eg-arr[0] is 4 thus corr_ind= 5-1=4
        if(arr[i] != arr[correct_index]){ // we check if element at arr[i] is in place at its correct index or not, eg- 5 is not at correct   
                                           // value 4 where there is arr[correct_index] = 1 , therefore we need to swap values at these index
        swap(arr , i , correct_index); // we send index so that in swap func value at idex in array is changes therefore changing the array also

        }
        else 
        i++;
    }
}
 public static void swap(int[] arr, int index_a , int index_b) {  // sendind index whose value needs to be swapped
    int temp = arr[index_a]; 
    arr[index_a] = arr[index_b];
    arr[index_b] = temp;
    
 }
}