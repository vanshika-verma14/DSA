//Sort an array of 0's 1's & 2's , 
//leet = sort color

import java.util.Arrays;

public class Dutch_national_flag_sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        opsort(arr);
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
        //[low and mid will point at 0, low marks position of first position of 1 basically keep track of all 0 ; mid is responsible for unsorted part 2,0,1 ; high point at last unsorted element of mid not starting of 2 basically it keeps track of 2 and once filled with 2 it reduces -- so it is nver on 2, it is always 1 before 2 that is at end of mid (last unsorted elemnt of mid)]
        //here basically we keep low and high freeze and as check point of starting and end of unsorted part mid while mid handles the fllow, start is one element after 0 that is start of mid and bfore that is all 0 while high is th end unsorted element of mid and beyond that is 2 but it do not point at 2 it is put one step before 2 after swap tp mark last unsorted element of mid
        
        int low =0, mid=0, high = arr.length-1;
        while(mid<=high){  // <= becoz element at high is still unsorted
          if(arr[mid]==0){
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
          }
         else if(arr[mid]==1){
            mid++;
          }
          else {
            int temp =arr[mid];
             arr[mid] = arr[high];
             arr[high]=temp;
            high--;
          }
        }
    }
}