import java.util.Arrays;

public class dub {
   public static void main(String[] args) {
        int[] arr = {4,4,4,4,4};
        check(arr);
         System.out.println(Arrays.toString(arr));
         System.out.println( check(arr));
    } 

    public static int check(int[]arr){
      int sum1 =0;
      int sum2=0;
      int n = arr.length;
      for (int i = 0; i < arr.length; i++) {
        sum1+=arr[i];
        sum2+= i;
      }
    return sum1-sum2;
    }
}
