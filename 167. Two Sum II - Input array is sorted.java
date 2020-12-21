class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
      int start=0,end=arr.length-1,sum=0;
      int [] ans= new int[2];  
        
        while(start<end)
        {
            sum= arr[start]+arr[end];
            
            if(sum==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(sum>target)
                end--;
            else
                start++;
        }
        return ans;
    }
}

//We are using 2 pointer technique here to be precise using opposite direction 2 pointer technique.
//time complexity of this problem is O(n);
