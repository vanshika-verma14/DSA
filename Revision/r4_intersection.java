import java.util.Arrays;
public class r4_intersection {
     public static void main(String[] args) {
         int[] arr = {4,9,5};
         int[] brr = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersec(arr,brr)));
    }
    //Given two integer arrays nums1 and nums2, return an array of their intersection. 
    //Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
    //Duplicates allowed
    public static int[] intersec(int[]arr,int[]brr){
        Arrays.sort(arr);//{4,5,9}
        Arrays.sort(brr); //{4,4,8,9,9}
        int i = 0;
        int j = 0;
        int k = 0;
        int[] un =new int [Math.min(arr.length, brr.length)];
        
        while(i< arr.length && j< brr.length){
            
             if (arr[i]>brr[j]){
              j++;
            }
            else if (arr[i]<brr[j]){
              i++;
            }
            else {
                un[k++] =arr[i];
                i++;
                j++;
            }
            
        }
        return Arrays.copyOf(un, k);
    }

    //unique output
     public static int[] intersec2(int[]arr,int[]brr){
        Arrays.sort(arr);//{4,5,9}
        Arrays.sort(brr); //{4,4,8,9,9}
        int i = 0;
        int j = 0;
        int k = 0;
        int[] un =new int [Math.min(arr.length, brr.length)];
        
        while(i< arr.length && j< brr.length){
             if (arr[i]>brr[j]){
              j++;
            }
            else if (arr[i]<brr[j]){
              i++;
            }
            else {
                if(k==0 || un[k-1]!=arr[i]){
                un[k++] =arr[i];}
                i++;
                j++;
            }
            
        }
        return Arrays.copyOf(un, k);
    }
}


 