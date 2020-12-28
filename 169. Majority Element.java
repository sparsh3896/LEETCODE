class Solution {
    public int majorityElement(int[] nums) 
    {
       int res=0,count=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[res]==nums[i])
                count++;
            else
                count--;
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        return nums[res];
    }
}


//we have used here moores voting algorithm
//Time complexity here is O(n);
//we havent checked if the ans we get is a majority element because it is stated in the ques that there has to be one element who is majority.
