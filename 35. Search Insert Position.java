class Solution {
    public int searchInsert(int[] nums, int target) 
    {
      int high=nums.length-1,low=0,mid,ans=0;
        
        while(high>=low)
        {
            mid= low +(high-low)/2;
            
            if(nums[mid]>target)
            {
                high=mid-1;
                
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
                if(high<low)
                     return mid+1;
            }
            else
                return mid;
            ans=mid;
        }
       
        return ans;
    }
}
