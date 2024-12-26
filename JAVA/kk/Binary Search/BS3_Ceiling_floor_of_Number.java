public class BS3_Ceiling_floor_of_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int n = 10;
        System.out.println(ceiling(arr, n));
        System.out.println(floor(arr, n));

}
static int ceiling(int[] arr, int n){
    // int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == n || arr[i] > n)  
        return arr[i];
    }
    return -1;
}

static int floor(int[] arr, int n){
    // int min = Integer.MAX_VALUE;
    for (int i = arr.length -1; i >= 0; i--) {
        if(arr[i] == n || arr[i] < n)  
        return arr[i];
    }
    return -1;
}
}
