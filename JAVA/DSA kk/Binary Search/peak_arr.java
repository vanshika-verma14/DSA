public class peak_arr {
    public static void main(String[] args) {
        int[] arr = {5,6,5};
        int ans = binSearch(arr);
        System.out.println(ans);
    }

    static int  binSearch(int[] arr ){
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
         int mid  = start + (end-start)/2;
          if(arr[mid] < arr[mid+1])
         { System.out.println("sss " + mid);
            start = mid+1 ;}
       else 
          {
            System.out.println("iii " + mid);
            end = mid ;
        }
        //   else if(arr[start]== arr[end])
        //   {
        //     System.out.println("hhh " + arr[mid]);
        //   return start ;]
        // }
        }
        return arr[start];
    }
}
