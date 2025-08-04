public class leet744 {
    public static void main(String[] args) {
        char[] arr = {'c' , 'f', 'j'};
        char target = 'm';
        char ans = ceil(arr, target);
        System.out.println(ans);
    }
    // return the index of greatest number <= target.
    static char ceil(char[] arr, char target) {

        // if (target >= arr[arr.length-1]) {
        //     return arr[0];
        // }

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        // return arr[start];
        System.out.println(start);
        System.out.println(arr.length);
        System.out.println(start % arr.length);
        return arr[start % arr.length];
         // element not found.
    }
}