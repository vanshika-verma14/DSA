import java.util.Arrays;
public class Selection_sort {
     public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        int k = 5;
        System.out.println(kelement(arr , k));
        // selection(arr);
        // System.out.println(Arrays.toString(arr));
    }
    public static int  kelement(int[] arr, int k) {
      int index=0;
      int i ;
      for (i = 0 ; i < k; i++) {
         index = maximum(arr , 0 ,arr.length-i );
         System.out.println(index);
         swap(arr, index, arr.length-i-1);
      }
      return arr[arr.length-i];
}

    public static int[] selection(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
         int index = maximum(arr , 0 ,arr.length-i );
         swap(arr, index, arr.length-i-1);
       }
       return arr;
}

public static int  maximum(int[] arr , int start , int end) {
    int max = arr[0];
    int index = 0;
    for (int i = 0; i < end; i++) {
        if(arr[i] > max)
        {max = arr[i];
        index = i;}
    }
 return index;
}
public static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;

}
}

