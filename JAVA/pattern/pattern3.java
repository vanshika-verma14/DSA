import java.util.Scanner;
class pattern3
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter length.");
  int l = sc.nextInt();
  System.out.print("Enter width.");
  int b = sc.nextInt();
 for(int i = 1; i <= b; i++){
    for(int j = 1; j <= l; j++){
        if(i == 1 || i == b|| j == 1|| j == l){
            System.out.print("*");}
            else
            System.out.print(" ");
    }
    System.out.println();

 }
}}