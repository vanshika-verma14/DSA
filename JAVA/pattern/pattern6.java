import java.util.Scanner;
class pattern6
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter no. ");
  
  int n = sc.nextInt();
  for(int i = 1; i <= n; i++){
    char c = 'A';
    for(int j = 1; j <= n; j++){
      if(i+j+1 > n+1 )
      {System.out.print(c);
      ++c;}
      else
      System.out.print(" ");
  }
  System.out.println();

  }
}     
 }
