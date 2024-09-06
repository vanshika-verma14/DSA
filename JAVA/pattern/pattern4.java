import java.util.Scanner;
class pattern4
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter odd no.");
  int n = sc.nextInt();
  int a = n+1;
 for (int i = 1; i <= n; i++) {
    for(int j = 1 ; j <= n; j++) {
        if(i==j || i+j == a){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    
 }
 System.out.println();
}
 }
}