import java.util.Scanner;
class r1_seclargest{

public static void main(String[] args) {
    int[] arr = {1, 3, 2, 4, 4, 6, 5, 6 ,6 };
    int[] brr = {2,2,3 ,3, 1,1};
    System.out.println( seclarge(arr));
    System.out.println(secondSmallest(brr));
}
  public static int seclarge(int[] arr){
    int first = Integer.MIN_VALUE;
    int sec = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
        if(arr[i]> first)
        {
            sec = first;
            first = arr[i];  
    }
        else if(arr[i]> sec && arr[i]<first){
          sec = arr[i];
        }
  }
   return sec;
}
public static int secondSmallest(int[] a) {
    int smallest = Integer.MAX_VALUE;
    int ssmallest = Integer.MAX_VALUE;

    for (int i = 0; i < a.length; i++) {
        if (a[i] < smallest) {
            ssmallest = smallest;
            smallest = a[i];
        } 
        else if (  smallest < a[i]  && a[i] < ssmallest) {
            ssmallest = a[i];

        }
    }
    return ssmallest;
}

}