class Solution {
    public int minOperations(int n) 
    {
        int max=0,sum=0;
      
        
         max= (2*(n-1)+1);
    
         for(int i=max-n;i>=(((max-n)&1)==0?2:1);i=i-2)
         {
             sum+=i;
         }
        return sum;
        
        
    }
}

//we know the min value in the array is 1
//therefore it is n-1 steps away from being equal to all
//because we know that in the array formed every no has to be n to make the whole array equal
//now  n-1 or maximum no from arry - n is equal therefore n-1 steps is required to change those two to n
//now if n-1 is odd we compute sum of all odd nos till n-1 to get the total steps
//if n-1 is even we compute sum of all even nos fron 2 to n-1
