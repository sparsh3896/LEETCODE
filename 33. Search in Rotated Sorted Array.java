class Solution {
    public int search(int[] nums, int target) 
    {
       int high=nums.length-1,low=0,mid=0;
        
        while(high>=low)
        {
            mid=low+(high-low)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[0])
            {
                if(nums[0]<=target && nums[mid]>=target)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(nums[mid]<=target && nums[nums.length-1]>=target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}

//Since the array is sorted and rotated therefore we know that only one half of the array is sorted 
// we find the sorted parts of the array by comparing the mid value with first and last index
//now if right is sorted and target value lies between that range we move our search towards right else move towards left
//we do exactly same with left part;
//after the loop is finished and we dont get any value equal to target then return -1
