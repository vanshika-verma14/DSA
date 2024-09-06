import java.util.Scanner;
class pattern5
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter no.");
  int n = sc.nextInt();
  for (int i = 1; i <= n; i++) {
    for(int j =1 ; j <= i; j++){
      if((i+j)%2 == 0 )
      System.out.print("1");
      else 
      System.out.print("0");
    }
    System.out.println();
       }
//  Method 1
//  for (int i = 1; i <= n; i++) {
//       if(i%2!=0)
//        c = 1;
//       else
//         c = 0;
//       for(int j =1 ; j <= i; j++){
//         System.out.print(c);
//         if (c==1)
//         c = 0;
//         else
//         c =1 ;
//       }
//       System.out.println();
      // }

      }
 }
