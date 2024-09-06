import java.util.Scanner;
class pattern5
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter no.");
  int n = sc.nextInt();
  int a = 1;
 for (int i = 1; i <= n; i++) {
       if (a%2 != 0) 
        {
          for(int j = 1 ; j <= i; j++)
          {
          System.out.print(a);
           a+=2; }
          }
       else
         ++a;
            
System.out.println();
        }
}}