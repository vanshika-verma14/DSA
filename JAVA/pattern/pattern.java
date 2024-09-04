import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
    int c = 1;
 for (int i = 1; i <= 6; i++) 
 {
     
     if (i%2 != 0)
     {
    for (int j = 1; j <= i ; j++) 
    {
        System.out.print(" "+c);
        
        c++;
    }
     }
    else 
    {
        int temp = c ;

        for (int j = c +i -1 ; j >= temp ; --j) 
        {
            System.out.print(" "+j);
            
            ++c;
     }
     
 }
 System.out.print("\n");
}
}

}
// //   if(i % 2 != 0)
// {
//     for (int k = i; k > i; --k) 
//     {
//         System.out.print(i);
//     }
// }
//     else if(i % 2 == 0)
//     {
//         for (int k = i; k > i; --k) 
//     {
//         System.out.print(i);
//     }
//     }
//     System.out.println();