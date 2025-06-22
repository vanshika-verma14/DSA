
public class vid_23_num {
    public static void main(String[] args) {
        int n = 13545;
       System.out.println(sum(n));
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
    }
