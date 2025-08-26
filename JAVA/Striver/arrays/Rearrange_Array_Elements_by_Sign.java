import java.util.Arrays;

public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int[]  arr = {2,3,-1,7,4,-5,-8,-3};
        int[]  crr = {2,3,-1,7,4,-5,-8,-3,4,5,7,-2,4};
        System.out.println(Arrays.toString( arrange(arr))); // when No. of +ve numbers == No. of -ve numbers
        System.out.println(Arrays.toString( nearrange(crr))); // when No. of +ve numbers != No. of -ve numbers
        
    }

    public static int[] arrange(int[] arr){  // when No. of +ve numbers == No. of -ve numbers
        int[] brr = new int[arr.length];
        int pos=0;
        int neg=0;
       for (int i = 0; i < brr.length; i++) {
            if(arr[i]>0){
             brr[2*pos]= arr[i];
             pos++;
            }
            else{
             brr[2*neg+1]= arr[i];
             neg++;
            }
         //System.out.println(Arrays.toString( brr));
        }
        return brr;
    }
   
    public static int[] nearrange(int[] arr){ 
        int[] brr = new int[arr.length];
        int pos=0;
        int neg=0;
}
}