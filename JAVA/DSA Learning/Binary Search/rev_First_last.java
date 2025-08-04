import java.util.Arrays;

public class rev_First_last {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,7,8,8,10};
        int tar =7;
        System.out.println(Arrays.toString(chech(arr , tar)));
    }  
    public static int[] chech(int[] arr,int tar){
        int[] res = {-1,-1};
        res[0]=bs(arr, tar, true);
        if(res[0]!=-1){
        res[1]=bs(arr,tar,false);
        }
        return res;
    }
     public static int bs(int[] arr,int tar, boolean pos1){
        int res = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start+ (end- start)/2;
            if(arr[mid]>tar)
            end = mid - 1;
             else if(arr[mid]<tar)
             start = mid + 1;
             else{
                res = mid;
                if(pos1){
                    end= mid-1;
                // System.out.println("first "+res);
            }
                else  {
                  start= mid+1;
                //   System.out.println("last "+res);
            }

             }

             }
             return res;
     }

    }
   
