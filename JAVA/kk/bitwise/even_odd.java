

public class even_odd {
   public static void main(String[] args) {
    int a = 68;
    System.out.println(isodd(a));
       }
    
       public static boolean isodd(int n) {
        return (n & 1) == 1; //in binary form we just check 2 power 0  that is first place from right to see if num is even or odd rest all other 2 power towards left give only even number . Anding anything to 0 gives 0 only and anding anything to 1 gives that number only, there we and 1 to the rightmost binary number of n to see if rightmost digit of binary is 1 or 0 . 
        // Anding-    1000011
        //            0000001
        //            0000001 = odd now if (n&1)==1 chech =>    n&1 = 1 which is ==  1 thats why return true else false
       } 
}
