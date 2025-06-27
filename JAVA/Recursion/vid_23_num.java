
public class vid_23_num {
    public static void main(String[] args) {
        int n = 14;
       System.out.println(leet(n));
    }
    public static void func(int n){
       if(n==0)
       return;
      System.out.println(n);

       func(n-1);
    }
     public static void funcrev(int n){
       if(n==0)
       return;
       funcrev(n-1);
       System.out.println(n);
    }
     public static void funcboth(int n){
       if(n==0)
       return;
       System.out.println(n);
       funcboth(n-1);
       System.out.println(n);
    }
    public static int fact(int n){
       if(n== 1)
       return 1;
       else
       System.out.println(n);
       return n * fact(n-1);
     
    }
    
    public static int sum(int n){
       if(n== 0)
       return 0;
       else
       return n%10 + sum(n/10);
    }
    public static int rnum(int n){
      if(n%10==n)
      return n;
      else
      { int sum = (n%10)*10;
         return   sum + rnum( n/10);
    }
    }
    public static int czero(int n){ //208004
      if(n%10==n)
      return n;
      else
      { int sum = (n%10)*10;
         return   sum + czero( n/10);
    }
    }
public static int leet(int n){
    int c = 0;
      return helper(n,c);
     
   }
   public static int helper(int n, int c){
      if(n==0)
      return c;
      else{
        if(n%2 == 1)
        return helper(n-1 , c+1);
        else
        return helper(n/2 , c+1);
      }
     
   }
}