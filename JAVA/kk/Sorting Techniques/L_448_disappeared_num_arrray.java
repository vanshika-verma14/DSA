import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_448_disappeared_num_arrray {
        public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
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
 static int missingnum(int[] arr) {
     ArrayList<Integer> miss = new ArrayList<>();
    int ans = arr.length;
 for (int i = 0; i < arr.length; i++) {
    if(i != arr[i])
    return i;
}
 return ans;
}
}
