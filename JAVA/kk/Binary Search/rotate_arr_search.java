public class rotate_arr_search {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2} ;
        int tar = 0 ;
       System.out.println("ans- "+search(arr,  tar));
    }
        public static int search(int[] nums, int target) {
            int piv = findpiv(nums);
            System.out.println(piv);
            if(piv==-1)
            return bs(nums,target,0, nums.length-1);
            if(nums[piv]==target)
            return piv;
            else if(target>= nums[0] )
            return bs(nums,target,0,piv-1);
            else
            return bs(nums,target,piv+1, nums.length-1);
    
        }
        public static int findpiv(int[] nums){  //[4,5,6,6,7,0,1,2,4,4]
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
              int mid = start +(end-start)/2;
              if(mid < end && nums[mid] > nums[mid+1])
                return mid;
              if(mid > start && nums[mid-1] > nums[mid])
                return mid-1;
              if(nums[mid] <= nums[mid+1])
              end = mid -1;          
              else                
                start = mid+1;
            }
           
            return -1;
        }
        public static int findpivinduplicate(int[] nums){  //[4,5,6,6,7,0,1,2,4,4]
          int start = 0;
          int end = nums.length-1;
          while(start<=end){
            int mid = start +(end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1])
              return mid;
            if(mid > start && nums[mid-1] > nums[mid])
              return mid-1;
            if(nums[mid] <= nums[mid+1])
            end = mid -1;          
            else                
              start = mid+1;
          }
         
          return -1;
      }
        public static int bs(int[] nums,int tar, int start , int end) { 
                while(start <= end) {
                 int mid  = start + (end-start)/2;
                  if(tar < nums[mid])
                  end = mid -1;
               else if (tar > nums[mid])
                  start = mid +1;
                  else 
                    return mid ;
                  
                }
                return -1;
            
        }
    }

