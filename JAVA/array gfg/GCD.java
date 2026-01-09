public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(20,28));
    }
    public static int gcd(int a, int b) {
        int g = Math.max(a,b);
        int s = Math.min(a,b);
        while (s != 0){ 

            int r = g%s;
            g=s;
            s=r;
            
        }
        return g;
    }
}
