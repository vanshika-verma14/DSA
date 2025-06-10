import java.util.Arrays;

public class union_of_arr {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,4,7,9,10};
    int[] b = {1,32,34,37,39,130};
    System.out.println(Arrays.toString(union(a, b))); 

    }
   public static int[] union(int[]a , int[]b){
    int[] c = new int[a.length+b.length];
    int i=0;
    int j = 0;
    while(c.length-1>=0) {
        if(a[i]== b[j]){
        c[i]= a[i];
        i++;
        j++;
        System.out.println(Arrays.toString(c));
    }
        else if(a[i]<b[j]){
         c[i]= a[i];
          i++;
          System.out.println(Arrays.toString(c));

        }
        else 
        {c[i]= b[j];
          j++;
          System.out.println(Arrays.toString(c));
}
    }
    return c;
   }
    

}
