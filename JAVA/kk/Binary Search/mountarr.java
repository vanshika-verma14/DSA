public class mountarr {
    public static void main(String[] args) {
        int[] arr = {0,2,4,5,6,10,5,2,1,0};
        int ans = check(arr);
        System.out.println(ans);
    }
    public static int check(int[] arr){
       int start = 0;
       int end = arr.length-1;
       while(start <= end){
       int mid = start + (end-start)/2;
       if(arr[mid] >  arr[mid+1])
       end = mid; 
       else 
       start = mid+1;         
    }
    return start;
}
}
 