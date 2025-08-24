//Sort an array of 0's 1's & 2's , 
//leet = sort color

import java.util.Arrays;

public class Dutch_national_flag_sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int a=00,b=0, c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            a++;
            else if(arr[i]==1)
            b++;
            else
            c++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(a>0){
                arr[i]=0;
                a--;
            }
            else if(b>0){
                arr[i]=1;
                b--;
            }
            else 
            arr[i]=2;
        }
        //  for (int i = 0; i < a; i++) {
        //     arr[i] = 0;
        // }
        // for (int i = 0; i < b; i++) {
        //     arr[i+a] = 1;
        // }
        // for (int i = 0; i < c; i++) {
        //     arr[i+a+b] = 2;
        // }


    }

    public static void opsort(int[] arr){
        //optimal or Dutch national flag
        
}
}