package arrays;
//tc = O(N)
public class second_largest_ele_in_array {
    public static void main(String[] args) {
        int[] arr = {-2147483648,1,1};
        // System.out.println(seclargest(arr)); 
        // System.out.println(secsmallest(arr)); 
        System.out.println(thirdMax(arr)); 

    }
    // public static int seclargest(int[] arr){
    //     int max = arr[0];
    //     int sec =  Integer.MIN_VALUE;
    //     if(arr== null || arr.length == 1)
    //     return -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]>max){
    //             sec = max;
    //             max = arr[i];
    //          } 
    //          else if (arr[i] > sec && arr[i] != max) { // suppose 30<50 ho gaya to sec = 40 update uper ni hoga coz 50 is max to vahan koi change nhi to sec m bhi koi change ni but sec should change to 40 to vo check yahan hoga and &&  agr dubplicate lasrge element hua to sec can become equal to largest therefore arr[i] != max.
    //              sec = arr[i];
    //          }
    //     }
    //     return sec;
        
    // }

    // public static int secsmallest(int[] arr){
    //     int min = arr[0];
    //     int sec =  Integer.MAX_VALUE;
    //     if(arr== null || arr.length == 1)
    //     return -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]<min){
    //             sec = min;
    //             min = arr[i];
    //          } 
    //          else if (arr[i] < sec && arr[i] != min) { 
    //              sec = arr[i];
    //          }
    //     }
    //     return sec; 
    // }


    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec =  Integer.MIN_VALUE;
        int thr =Integer.MIN_VALUE;
        if(nums== null )
        return -1;
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                thr= sec;
                sec = max;
                max = nums[i];
                System.out.println(nums[i]+"max " + max);
                System.out.println( Integer.MIN_VALUE+"sec " + sec);
                System.out.println("t " + thr);
             } 
             else if(nums[i] > sec && nums[i] != max ){
                thr= sec;
                sec= nums[i];
             }
             else if (nums[i] > thr && nums[i] != max && nums[i] != sec && nums[i]<sec) { 
                 thr = nums[i];
                 c=i;
                  System.out.println("t " + thr);

            }
        }
        if( nums[c]!=Integer.MIN_VALUE && thr ==  Integer.MIN_VALUE )
         return max;  
         else 
         return thr;
    }
}
// Dry Run Step-by-Step:
// i	arr[i]	largest before	secondLargest before	Action	largest after	secondLargest after
// 0	10	-∞	-∞	10 > largest → Update largest, secondLargest = previous largest (-∞)	10	-∞
// 1	20	10	-∞	20 > largest → Update largest, secondLargest = previous largest (10)	20	10
// 2	20	20	10	20 == largest → skip (no update)	20	10  // here 20==20 therefor else loop will run
// 3	5	20	10	5 < secondLargest → skip	20	10
// 4	3	20	10	3 < secondLargest → skip	20	10