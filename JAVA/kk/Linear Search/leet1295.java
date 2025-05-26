
public class leet1295 {

    public static void main(String[] args) {
        int[] arr ={12,345,2,6,7896};
        int c = 0;
      for(int i = 0 ; i < arr.length;i++ )
    { 
        c+=check(arr[i]);
    }
      System.out.println(c);
    }  

    public static int check(int num){
        // System.out.println(num);
        int cnt = 0 ;
     while(num!=0){
        num /=10;
        cnt++;
     }
    // System.out.println(num);
     if (cnt%2==0)
     return 1;
     else return 0;
    }
}
