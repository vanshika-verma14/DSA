public class BS3_Ceiling_of_Number {
    public static void main(String[] args) {
                int[] arr = {2, 3, 5, 9, 14, 16, 18 };
                int target = 10;
                int ans = binSearch(arr, target);
                System.out.println(ans);
            }
            static int  binSearch(int[] arr , int n){
                if(n > arr[arr.length-1]){
                    return -1;
                }
                int start = 0;
                int end = arr.length - 1;
                while(start <= end) {
                 int mid  = start + (end-start)/2;
        
                  if(n < arr[mid])
                  end = mid -1;
        
                  else if (n > arr[mid])
                  start = mid +1;
                  
                  else 
                  return arr[mid];
                }
                return arr[start]; // instead we can also write - return arr[end + 1] ... becoz when no. still not found and when all condition is checked that is start <= end then in its last check, end and start criss cross that is start becomes  greater than end which is violated condition which loops reject but the pointers already took that position therefore start becomes- start = end+1 (due to criss cross - (end , start))  or just the next greater than or equal to the given number element that is start is the ceil.
            }
        }
        
 
//Explanation: This code implements a binary search to find the ceiling of a given number in an array. The ceiling of a number is the smallest element in the array that is greater than or equal to the given number.