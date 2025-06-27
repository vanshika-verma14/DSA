import java.util.ArrayList;

public class arrays2 {
    public static void main(String[] args) {
         int[] arr = {1,3,5,7,8,7,9,3,7,8,7};
          int n = 7;

         System.out.println( linearSearchboth(arr, n , 0));
         ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 7, 0, list));
    }
    public static boolean linearSearchkk(int[] arr, int tar, int n ){
      if(n==arr.length)
      return false;
      else
      return tar==arr[n] || linearSearchkk(arr, tar,n+1 );
    }
    public static int linearSearch(int[] arr, int tar, int n ){
      if(n==arr.length)
      return -1;
      else
      {   
        if(arr[n]!=tar)
         return linearSearch(arr,tar, n+1);
         else 
         return n;
        }
    }
       
    public static int linearSearchlast(int[] arr, int tar, int n ){
      if(n==0)
      return -1;
      else
      {   
        if(arr[n]!=tar)
         return linearSearchlast(arr,tar, n-1);
         else 
         return n;
        }
    }
     static ArrayList<Integer> list = new ArrayList<>(); //making list static and retrurning list
     public static ArrayList<Integer> linearSearchboth(int[] arr, int tar, int n ){
      if(n==arr.length)
      return list;//whatever final value u have just return weather empty or filled with tar index
      else
      {   
        if(arr[n]==tar)
        list.add(n);
        return linearSearchboth(arr,tar, n+1);

    }
  }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) { //without using staic list but then list element won't store so 
    //we have to pass the list with each pass to maintain previous index track in it as variables declared inside the func call remains till 1 func call and in next new fresh is 
    //created and do not hold previous value so we cannot declare a arraylist inside this func and call it again and again
        if (index == arr.length) {
            return list; //whatever final value u have just return weather empty or filled with tar index
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

}

