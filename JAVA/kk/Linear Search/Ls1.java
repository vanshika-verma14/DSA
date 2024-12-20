


public class Ls1 {
    public static void main(String[] args) {
        int[] arr = {22,4,6,42,81,37,42};
        int target = 42;
        System.out.println(LinearSer3(arr, target));
        System.out.println(LinearSer(arr, target));
        System.out.println(LinearSer2(arr, target));
        System.out.println(LinearSer4(arr, target , 2 , 5));


    }
    static int LinearSer(int[] arr , int target){ //linear search to return index
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int LinearSer4(int[] arr , int target , int start , int end){ //linear search in a range
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {  //<= both used
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    static int LinearSer2(int[] arr , int target){ //linear search to return element
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int i : arr){
            if(target == i){
                return i;
        }
    }
    // this line will execute if none of the return statements above have executed
    // hence the target not found
        return Integer.MAX_VALUE;
    
}
static boolean LinearSer3(int[] arr , int target){ //linear search to check if element is present or not
    if (arr.length == 0){
        return false;
    }
    for(int i : arr){
        if(target == i){
            return true;
    }
}
// this line will execute if none of the return statements above have executed
// hence the target not found
    return false;

}
}