public class count_subarray_sum_with_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum =3;
        System.out.println(countmax(arr,sum));
    }
   public static int countmax(int[] arr, int k){
    int cnt=0;
    int sum=0;
    int pov=0;

    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];

        if(sum>k){
        sum-=arr[pov];
        pov++;}

        if(sum==k)
        cnt++;

    }
    return cnt;
   }
}
