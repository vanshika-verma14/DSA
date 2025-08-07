public class Ls4_maxweight {
    public static void main(String[] args) {

       int arr[][] = {{2,8,7},{7,1,3},{1,9,5}};
       System.out.println(maximumWealth(arr));
       
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE; 
        int len = accounts.length;
        int sum;
         for (int i = 0; i < len; i++) {
              sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];  
            }
            if(sum > max)
            max = sum;
         }
        return max;   
}
}