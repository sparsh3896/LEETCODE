class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int sum=0,max=Integer.MIN_VALUE;
      for(int i=0;i<k;i++)
      {
          sum+=nums[i];
      }
        int high=k,low=0;
        while(high<=nums.length)
        {
            max=Math.max(sum,max);
            if(high==nums.length)
                break;
            sum+=nums[high];
            sum-=nums[low];
            high++;
            low++;
        }
       
        return (double)max/(k*1.0);
    }
}

//We use sliding window technique here to calculate the max sum for subarray of length k
