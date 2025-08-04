
public class leet1672 {

    public static void main(String[] args) {
        int[][] arr ={{2,8,7},{7,1,3} ,{1,9,5}};
        int max = Integer.MIN_VALUE;
      for(int[] i : arr )
    { 
        int c = check(i);
        if(c>max)
        max = c;
    }
      System.out.println(max);
    }  

    public static int check(int[] num){
      int sum = 0;
      for(int ele: num)
      {
        sum+=ele;
      }
        return sum;
    }
}
