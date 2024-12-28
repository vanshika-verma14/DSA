public class BS4_Floor_of_Number {
        public static void main(String[] args) {
                    int[] arr = {2, 3, 5, 9, 14, 16, 18 };
                    int target = 1;
                    int ans = floor(arr, target);
                    System.out.println(ans);
                }
                static int  floor(int[] arr , int n){

                    if(n < arr[0]){
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
                    return arr[end]; // instead we can also write - return arr[start - 1] ... becoz when no. still not found and when all condition is checked that is start <= end then in its last check, end and start criss cross that is start becomes  greater than end which is violated condition which loops reject but the pointers already took that position therefore end becomes- end = start - 1 (due to criss cross - (end , start))  or just the previous largest integer less than or equal to the given number element that is end is the floor.
                }
}

//Explanation: This is a binary search approach. In this case, the array is sorted in ascending order. If the target number is less than the first element in the array, it means the target number does not exist in the array. In such cases, we return -1. Otherwise, we perform binary search to find the floor of the target number. The floor of a number is the largest integer less than or equal to the given number.
