import java.util.Arrays;

public class Log_N {
public static void main(String[] args) {
    int[][] arr = {
        {1,3,6,8},
        {2,4,9,19},
        {11,13,17,20},
        {21,22,25,28},
        {31,32,35,38},
        {41,42,45,48}
    };
        int tar = 22;
        System.out.println(Arrays.toString(check(arr, tar)));

}

public static int[] check(int[][] arr, int tar){
    int r = 0;
    int c = arr[0].length-1;
    while(r < arr.length && c>=0 ){

        if(arr[r][c]==tar)
        return new int[]{r,c};

        else if(tar > arr[r][c]) 
        {   //System.out.print(" before r - " + r +Arrays.toString(arr[r]));
            r++;
            //System.out.println(" After r - "+ r +Arrays.toString(arr[r]));
        // agr target row ke last element se hi bada h to since row sorted h and 8 uska greatest element h and 13 is greater than 8 therefore poori row ki checking is invalid so hum row++ karte hn ie move to next row below
    } 

        else
        {   
            //System.out.print(" before c - " +c + Arrays.toString(arr[r]));
            c--;
            //System.out.println(" After c - "+c + Arrays.toString(arr[r]));
            // agr second step mai last index row ka 19 h 19 > 13 there usse neeche ke elements bhi 19 se bade honge coz colm bhi sorted hn to usse neeche check krna is invalid to hum vo colm-- kr denge (ie move to left colm) or ek colm pehle se consider krna shuru karenge uske row ke last index se 
    }
}
  return new int[]{-1,-1};
}
}