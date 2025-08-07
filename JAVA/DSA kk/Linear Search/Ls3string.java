import java.util.Arrays;

public class Ls3string {
    public static void main(String[] args) {

        //method 1
        String str = "vanshika";
        char tar = 'n';
        char[] arr = str.toCharArray();
        System.out.println(LinSear(arr, tar));

        System.out.println(Arrays.toString(str.toCharArray())); //[v, a, n, s, h, i, k, a]

        //method 2
        String strg = "vanshika";
        char targ = 's';
        System.out.println(LinSear2(strg , targ));
        System.out.println(LinSear3( strg,  targ));

    }

    //method 1
    static int  LinSear(char[] arr, char tar){
     for (int i = 0; i < arr.length; i++) {
        if (tar == arr[i])
        return i; 
     }
     return -1;
    }
     
    //method 2
    static int  LinSear2(String strg, char targ){
        if (strg.length() == 0) {
            return -1;
        }

        int len = strg.length();
        for (int i = 0; i < len; i++) {
            if(targ == strg.charAt(i))
            return i;
        }
        return -1;
}
 
     //method 3
     static boolean  LinSear3(String strg, char targ){
        if (strg.length() == 0) {
            return false;
        }
        
        for(char ch : strg.toCharArray()){
            if(ch == targ)
             return true;
        }
        return false;
  }
}