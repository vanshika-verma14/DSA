public class patterns {
    public static void main(String[] args) {
    pattern(5,0);
    pyramid(0,80,0,0);
    int n = 5;           // total number of rows
        row(1, n);//pyramid optimal soln
    }
    public static void pattern(int r, int c){
        if(r==0)
        return;

        if(c<r){
          System.out.print("* ");
          pattern(r,c+1);}
        else{
          System.out.println();
          pattern(r-1,0);
        }
    }
      public static void pyramid(int s, int r, int c , int i){
        if(r==0)
        return;

        if(s<r){
          System.out.print(" ");
          pyramid(s+1,r,c,i);
        }
        else if(c<=i){
          System.out.print("* ");
          pyramid(s,r,c+1,i);
          
        }
        else{
          System.out.println();
          pyramid(0,r-1,0,i+1);
            

        }
    }

    static void row(int r, int n) {
        if (r > n) return;

        space(n - r);        // print spaces before stars
        star(r);             // print stars in this row
        System.out.println();

        row(r + 1, n);       // move to next row
    }

    static void space(int s) {
        if (s == 0) return;
        System.out.print(" ");
        space(s - 1);
    }

    static void star(int s) {
        if (s == 0) return;
        System.out.print("*");
        if (s > 1) System.out.print(" ");
        star(s - 1);
    }
}

}

//    *
//   * *
//  * * *
// * * * *
//* * * * *