class Solution {
    public int minDays(int[] bloomday, int m, int k) 
    {
        int high=0,low=1;
        for(int i: bloomday)
        {
            high=Math.max(i,high);
        }
        int ans=-1;
        while(high>=low)
        {
           int  mid=low+(high-low)/2;
            
            
            if(canmake(mid,m,k,bloomday)==true)
            {
                high=mid-1;
                ans=mid;
            }
            else
                low=mid+1;
            
        }
        return ans;
    }
    boolean canmake(int mid,int m, int k, int [] bloomday)
    {
        for(int i=0;i<=bloomday.length-k;i++)
        {
            int c=0;
            
            for(int j=i;j<i+k&&j<bloomday.length;j++)
            {
                
                if(bloomday[j]<=mid)
                    c++;
                else
                {
                    i=j;
                    break;
                }
                
                
            }
            if(c==k)
            {
                m--;
                i=i+k-1;
            }
        }
        if(m<=0)
            return true;
        else
            return false;
    }
}

//We are making a predicate function and then conducting a binary seaarch.
// the predicate function is designed in such a way that it gives boolean value and returns true if with n no of days we can make the no of bouquets rewuired
//It returns false if it is not possible to make required no of bouquets in n days
//we set high as the max of given bloomday and low as 1
//if predicate function returns true we check if there is any other less no of days in which we can make required no of bouquets so we go searching the left half of the range
// if predicate function returns falsse e go to check the right half of the range
//we return -1 if it is impossible to make bouquet in given no of days.
