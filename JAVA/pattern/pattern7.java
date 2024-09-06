import java.util.Scanner;
class pattern7
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter no. ");
  
  int n = sc.nextInt();
  for(int i = 0; i < n; i++){
    for(int j = 0; j <= n+i; j++){
      if(i+j+1 > n  )
      {System.out.print("*");
      }
      else
      System.out.print(" ");
  }
  System.out.println();

  }
//   method 2
// for (int i = 1; i <= rows; i++) {
//     for (int j = rows - i; j > 0; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k <= (2 * i - 1); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
}
}     
 
