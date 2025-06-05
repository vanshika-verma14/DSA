import java.util.Arrays;
public class missingnum {
        public static void main(String[] args) {
        int[] arr = {3,4,0,1,2};
        System.out.println(Arrays.toString(cyclic(arr)));
        }       
        public static int[] cyclic(int[] arr) {
            int i=0; 
            int n = arr.length;
            while(i < arr.length){
                int correct =arr[i];


                if(arr[i] != arr[correct])
                {   System.out.println(arr[i] +" " + correct);
                    swap(arr, i, correct);
                    System.out.println(Arrays.toString(cyclic(arr)));
                }
                else if (arr[i] == n) 
                    i++;
                else
                i++;
            }  

            
            return arr;   
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
}
