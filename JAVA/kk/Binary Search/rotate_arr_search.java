public class rotate_arr_search {
    public static void main(String[] args) {
        int[] arr = {1} ;
        int tar = 0 ;
       System.out.println(search(arr,  tar));
    }
        public static int search(int[] nums, int target) {
            int piv = findpiv(nums);
            if(nums[piv]==target)
            return piv;
            else if(target> nums[0] &&target< nums[piv] )
            return bs(nums,target,0,piv);
            else
            return bs(nums,target,piv, nums.length-1);
    
        }
        public static int findpiv(int[] nums){
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
              int mid = start +(end-start)/2;
              if(mid < end && nums[mid] > nums[mid+1])
              return mid;
              else if(mid > start && nums[mid-1] > nums[mid])
              return mid-1;
              else if(nums[mid] >= nums[start])
              start = mid+1;
              else 
              end = mid -1;
            }
            System.out.println(start);
            return start;
        }
        public static int bs(int[] nums,int tar, int start , int end) { 
                while(start <= end) {
                 int mid  = start + (end-start)/2;
                  if(tar < nums[mid])
                  end = mid -1;
               else if (tar > nums[mid])
                  start = mid +1;
                  else 
                 { 
                    System.out.println(mid);
                    return mid ;
                  }
                }
                return -1;
            
        }
    }

