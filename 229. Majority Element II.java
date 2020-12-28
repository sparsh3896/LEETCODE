class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list= new ArrayList<>();
       
        int res1=0,res2=1,count1=0,count2=0,i,ans1=0,ans2=0,c=0;

        for( i=0;i<nums.length;i++)
        {
            if(nums[res1]==nums[i])
                count1++;
            else if(nums[res2]==nums[i])
                count2++;
           
            
           else if(count1==0)
            {
                res1=i;
                count1=1;
            }
          else  if(count2==0)
            {
                res2=i;
                count2=1;
            }
             else
            {
                count1--;
                count2--;
            }
            
        } 
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==nums[res1])
                ans1++;
            else if(nums[j]==nums[res2])
                ans2++;
        }
        
        if(ans1>nums.length/3)
            list.add(nums[res1]);
        if(ans2>nums.length/3)
            list.add(nums[res2]);
        
        return list;
    }
}

//We have used an Advanced version of moore's voting algorithm
//Here we have set 2 candidates and set 2 counter 
//We are updating both counter to find 2 nos that has the maximum occurence in an array
//then we check if the frequencies of the no. is greater than n/3 we return the no. 
