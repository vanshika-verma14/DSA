import java.util.Scanner;
class pattern2
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter odd no.");
  int n = sc.nextInt();
 if (n%2==0)
 System.out.println("Pattern not possible");
 else
 { 
     int a = (n/2) +1;
    for (int i = 1; i <= n; i++)
    {
       if ( i == a )
       {
        for (int j = 1; j <= n; j++)
            System.out.print("*");
        
       }
       else
       {
       for(int j = 1; j <= a; j++)
       {
       if (j < a) 
        System.out.print(" ");
       else 
       System.out.print("* ");
       }
      
    }
    System.out.println();
}
 }
}}