import java.util.Arrays;

public class r3_union {
     public static void main(String[] args) {
         int[] arr = {1,1,2,3,4,5};
         int[] brr = {2,3,5,6,7,8,9,10};
        System.out.println(Arrays.toString(union(arr,brr)));
    }
     public static int[] union(int[] arr , int[] brr){
        int i =0;
        int j = 0;
        int k = 0;
        int un[] = new int[arr.length+ brr.length];
        while(i < arr.length && j < brr.length){
            int val =0;
            if(arr[i]< brr[j]){
                val = arr[i];
                 i++;
            }
            else if(arr[i]> brr[j] ){
                val = brr[j];
                 j++;
            }
            else{
                val = arr[i];
                i++;
                j++;
  
            }
             if(k==0|| un[k-1]!=val){
                un[k]= val;
                k++;     
             }
        }
        
         while(i < arr.length){
           if(k == 0 || un[k-1]!=arr[i]) {
                un[k] = arr[i]; 
                k++;
           }
                i++;
         }
        while(j < brr.length){
            if(k == 0 || un[k-1]!=brr[j]) {
                un[k] = brr[j]; 
                k++;
            }
                j++;
         }

 return Arrays.copyOf(un, k);
     }   
}
