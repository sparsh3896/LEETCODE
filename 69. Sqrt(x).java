class Solution {
    public int mySqrt(int x) 
{
    if(x==0)
        return 0;
        int ans=-1;
    
        int high=x,low=1,mid;
        
        while(high>=low)
        {
            mid= low + (high- low)/2;
            
            long n= mid*1l*mid;
            
             if(x==n)
                return mid;
             else if(n>x)
                high=mid-1;
             else
            {
                low=mid+1;
                ans=mid;
            }
           
        }
        
        return ans;
    }
    
}

//we will be using binary search for computing square root of x here
