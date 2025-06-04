import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] selection(int[] arr) {
        int max ;
        for (int i = arr.length-1; i >=0; i--) {
           max = maxval(arr , i);
           System.out.println("max no- "+arr[max]);
           swap(arr, max, i);
           System.out.println(Arrays.toString(arr));
         } 
             return arr;   
    }
           
    public static int maxval(int[] arr, int len){
        int max = arr[0];
        int c =0;
        for (int i = 0; i <=len; i++) {
            if(arr[i]>max)
            {  //System.out.println(arr[i] +" " + max + " i- " + i) ; //{3,4,5,1,2};
                max = arr[i];
                c = i;
            // System.out.println(arr[c]);
        }
        }
        
     return c;
    }
    
    public static void swap(int[] arr, int max, int j) {
     int temp = arr[max];
     arr[max] = arr[j];
     arr[j] = temp;

}
}