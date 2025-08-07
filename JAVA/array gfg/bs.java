public class bs {
   public static void main(String[] args) {
    int[] arr = {1,1,2,3,3};
    System.out.println(check(arr));
   } 
   public static int check(int[] arr){
      
    int start =0;
    int end = arr.length -1;
    int mid =-1;
    while(start<= end){
         mid = start + (end-start)/2;
        System.out.println("mid " +mid);
        if(mid!= end && (mid%2==0 ) && (arr[mid]==arr[mid+1])){
            start = mid +1;
            System.out.println("even " + arr[mid]);
            }
        else if ((mid%2==1  ) &&  (arr[mid]==arr[mid-1])){
             start = mid +1;
             System.out.println("odd " + arr[mid]);
            }
        else{
            end = mid -1;
            System.out.println("else  " + arr[mid]);
            }
    }
  return arr[start];
   }
}
