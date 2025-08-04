
import java.util.Arrays;

public class Arr4MultiDi_ColNoFixed {
    public static void main(String[] args) {
    // in multidimension array or matrix when column lenght is not fixed as we dynamically allocate items in row or array is initiallised by non equal column lenght of each row of matrix

    int[][] arr = { {1,2,3,4}, 
                    {5,6},
                    {7,8,9}};

    for(int row = 0; row < arr.length ; row ++){
        for(int col =0 ; col < arr[row].length; col++){
           System.out.println(arr[row][col] + " ");
        }
    }


    }
}