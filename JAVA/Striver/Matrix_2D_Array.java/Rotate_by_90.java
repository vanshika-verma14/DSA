import java.util.Arrays;

public class Rotate_by_90 {
   public static void main(String[] args) {
    int[][] arr = {{1,2,3},
                  {4,5,6},
                  {7,8,9},
                  // {10,11,12},
                  // {13,14,15}
               };
    int[][] brr = rotate(arr);
    for (int i = 0; i < brr.length; i++) {
        System.out.println(Arrays.toString(brr[i]));
    }
   } 
   public static int[][] rotate(int[][] arr){
      int[][] brr = new int[arr[0].length][arr.length];
      int c = arr.length-1; //  total no. of rows withh give total no. of colums here
   for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
                                                  // System.out.println(j +""+ (c-i) +" "+ i+""+j);
         brr[j][c-i] = arr[i][j];
                                                   //System.out.println(brr[j][c-1]+ " "+arr[i][j] );
      }
   }
  return brr;
   }
}

// put this after- brr[j][c-i] = arr[i][j]; line to check how the number are put in array
// for (int k = 0; k < brr.length; k++) {
//         System.out.println(Arrays.toString(brr[k]));
//     }
//             System.out.println();