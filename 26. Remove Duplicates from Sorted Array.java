class Solution {
    public int removeDuplicates(int[] nums) 
    {
      int s=0,m=1,count=0;
        
        while(m<nums.length)
        {
            
            if(nums[m]!=nums[m-1])
            {
                nums[s]=nums[m-1];
                s++;
                count+=1;
            }
            if(m==nums.length-1)
            {
                nums[s]=nums[m];
                s++;
                count+=1;
            }
            
            m++;
        }
        if(count==0)
                return nums.length;
        return s;
    }
}

//We are using 2 pointer approach here
//Time complexity is O(n)
