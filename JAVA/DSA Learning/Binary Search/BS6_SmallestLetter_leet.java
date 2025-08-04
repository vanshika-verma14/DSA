public class BS6_SmallestLetter_leet{
    public static void main(String[] args) {
        char[] arr = {'c','f','j' };
        char target = 'e';
        // System.out.println("1");
         System.out.println( binSearch(arr, target));
    }
    static char  binSearch(char[] arr , char n){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
         int mid  = start + (end-start)/2;

          if(n < arr[mid])
          end = mid -1;
          else
          start = mid +1; 
        }
        return arr[start % arr.length];
    }
}