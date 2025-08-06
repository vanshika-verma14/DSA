public class basic {
    public static void main(String[] args) {
        //find frequency of each number without hasg map
        int[] arr = {2,3,4,5,2,3,6,4,4,4,7,2};
        freq(arr);
    }

    public static void freq(int[] arr) {

        int[] fcn = new int[10];

        for (int i = 0; i < arr.length; i++) {
            fcn[arr[i]] += 1;
        }


        for (int i = 0; i < fcn.length; i++) {
            if(fcn[i]>0){
                System.out.println(i+ " = " + fcn[i] );
            }
        }
    }
}
