class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max=Integer.MIN_VALUE,sum=0;
      for(int i=0;i<nums.length;i++)
      {
          for(int j=i;j<nums.length;j++)
          {
              sum=sum+nums[j];
              if(sum>max)
              {
                  max=sum;
                  
              }
              
          }
          
          sum=0;
       }
        return max;
    }
}

// this is approach one where we are using brute force 
// Time complexity of this code is O(n*n)

class Solution {
    public int maxSubArray(int[] nums) 
    {
       int maxcurr= nums[0], maxglobal=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            maxcurr= Math.max(nums[i], nums[i]+maxcurr);
                if(maxcurr>maxglobal)
                    maxglobal=maxcurr;
        }
        return maxglobal;
    }
}

//This is approach 2 We are  using kadanes algorithm here
// Time complexity of this code is O(n);
