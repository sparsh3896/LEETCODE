class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
      int max=0,max1=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max= Math.max(max1,max);
                max1=0;
            }
            else if(nums[i]==1)
            {
                max1++;
            }
        }
        return Math.max(max,max1);
    }
}
