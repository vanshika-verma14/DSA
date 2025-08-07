import java.util.Arrays;
public class L_217_Contains_duplicate {
    public static void main(String[] args) {
    int[] arr = {1,2,4,1,3,4,7};
    System.out.println(Arrays.toString(check(arr)));
}
 public static int[] check(int[] arr){
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
        if(arr[j] != arr[i] ){
            swap(arr,i,j+1);
             j++;  
            // System.out.println(j);       
        }
    }
    return arr;
 }
 static void swap(int[] arr , int a , int b){
    int temp = arr[a];
    arr[a]= arr[b];
    arr[b] = temp;
     }

}

