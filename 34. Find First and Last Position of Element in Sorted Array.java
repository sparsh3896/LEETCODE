class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
       int high= nums.length-1,low=0,ans=-1; 
        int [] arr= new int[2];
        arr[0]=-1;
        arr[1]=-1;
        
        while(high>=low)
        {
            int mid= low+(high-low)/2;
            if(nums[mid]==target)
            {
              high=mid-1;
                ans=mid;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        arr[0]=ans;
         high= nums.length-1;low=0;ans=-1; 
        
        while(high>=low)
        {
            int mid= low+(high-low)/2;
            if(nums[mid]==target)
            {
              low=mid+1;
                ans=mid;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        arr[1]=ans;
        return arr;
        
    }
}

//The approach is quite simple we ar using binary search 2 times 1st to calculate the first index
//and second to calculate the last index;
