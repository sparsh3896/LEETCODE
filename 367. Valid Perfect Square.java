class Solution {
    public boolean isPerfectSquare(int num) 
    {
       int high=num,low=1,mid;
        while(high>=low)
        {
            mid= low+(high-low)/2;
            long n= mid*1l*mid;
            if(n<num)
                low=mid+1;
            else if(n>num)
                high=mid-1;
            else
                return true;
        }
        return false;
    }
}
