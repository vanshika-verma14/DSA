import java.lang.Math;
public class infinite_arr {
    public static void main(String[] args) {
    //  int[] arr = {-170,-160,-140,-130,-100,-90,-10,-9,-7,-4,-3};
    int[] arr = {3,4,7,9,10,90,100,130,140,160,170}; //,190,191,191,192,193,194,195,196,196,197,199,200}
    int start = 0, end= 1 , c= -1;
    int tar = 90;
    while(tar> arr[end])
     {   //System.out.println("1....start is " + start +" end is " + end + " enddd " + arr[end] );     
        int temp= end +1 ; 
        end = end +((end-start)+1)*2;
        start = temp;
        // System.out.println("start is " + start +" end is " + end + " enddd " + arr[end] );     
    } 
    c= check(arr, start, end, tar);  
    System.out.println(c);
    }
    static int  check(int[] arr , int start, int end, int tar){

        while(start <= end) {
         int mid  = start + (end-start)/2;
          if(tar < arr[mid])
          end = mid -1;
          else if (tar > arr[mid])
          start = mid +1;
          else 
          return mid ;
        }
        return -1;
    }

}
