import java.util.Arrays;
public class Ls4_2Dimensional {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
  static int[] search(int[][] arr, int target){
   
        for(int row = 0 ; row < arr.length; row++){
            for(int col =0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                return new int[]{row+1, col+1};
            }
        }  
    }
        return new int[]{-1, -1};
  }

  static int max(int[][] arr){
   int max = Integer.MIN_VALUE;
   for(int[] row :arr){
    for(int col : row){
     if(col > max){
        max = col;
     }
    }
   }
return max;
}
    
}