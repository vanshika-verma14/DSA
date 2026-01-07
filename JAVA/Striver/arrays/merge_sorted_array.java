import java.util.Arrays;
public class merge_sorted_array {
    public static void main(String[] args) {
       int n = 3;
       int m = 3;
       int[] arr = {1,2,3,0,0,0};
       int[] brr = {0,5,6};
       merge(arr, m, brr, n);
       System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int m, int[] brr, int n) {
        int i = m-1;
        int j = n-1;
        int idx = n+m-1;
        while(i>=0 && j>=0){
            if(arr[i]> brr[j]){
               arr[idx]= arr[i];
               i--;
            }
            else {
               arr[idx]= brr[j];
               j--;
            }
               idx--;            
            }
         if(j>=0){
           while(j>=0){
            arr[idx] = brr[j];
            j--;
            idx--;
           }
         }
        }
    }
