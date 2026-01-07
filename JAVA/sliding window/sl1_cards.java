
public class sl1_cards {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(check(arr, k));
    }
    public static int check(int[] arr , int k)
    {  
        int rs = 0;
        int ls = 0;
        int sum  = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ls = sum;
        max = sum;
        int rindex = arr.length-1;
        for (int i = k-1; i >=0; i--) {
            ls = ls - arr[i];
            rs = rs + arr[rindex];
            rindex--;
            max = Math.max(max, rs+ls);
        }
         return max;
        }
}
