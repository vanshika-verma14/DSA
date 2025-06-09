public class Power_of_Three_326 {
    public static void main(String[] args) {
        int n = -3;
        System.out.println(isPowerOfThree( n));
    }
    public static boolean isPowerOfThree(int n) {
       while(n>1){
        if(n%3 != 0)
        { System.out.println("mod "+n%3);
            return false;}
         else

          { System.out.println(n/3);
             n/=3;}
        }
        if(n==1)
        return true;
        else
        return false;
     }
}
