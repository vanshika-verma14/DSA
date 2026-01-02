import java.util.Arrays;

public class r2_move_zero_to_end {
    public static void main(String[] args) {
         int[] arr = {1,0,2,3,0,0,5,6};
        System.out.println(Arrays.toString(zero1(arr)));
    }
     public static int[] zero(int[] arr){    
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == 0)
                {
                j = k;
                break;
                }
        }
        int i = j+1;
        while (j< arr.length-1 && i < arr.length) {
         if( arr[i]!= 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
         }
          else
            i++; 
        }
        return arr;
     }
     public static int[] zero1(int[] arr){ 
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] == 0)
                {
                j = k;
                break;
                }
        } 
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                int t = arr[j];
                 arr[j] = arr[i];
                 arr[i] = t;
                j++;
            }
        }
        return arr;
     }
}
