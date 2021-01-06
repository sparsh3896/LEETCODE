class Solution {
    public int arrangeCoins(int n) 
    {
       int high=n,low=0,mid=0;
        
        while(high>=low)
        {
            mid= low+ (high-low)/2;
             long a = (mid*1l*(mid+1))/2;
            if(a>n)
            {
                high=mid-1;
                 if(high<low)
                    return mid-1;
            }   
            else if(a<n)
            {
                low=mid+1;
               
            }
            else
                return mid;
            
        }
        return mid;
    }
}

// here we are using binary search techinue
//we appoint high as n and low as 0;
//the we make a loop which will run till the time high is greater or equal to low;
//we calcute mid of high and low and at mid we compute the total sum of nos till mid;
//if no is greater than n we shift our pointers to left that is high becomes mid-1 and if and if no is small we shift towards right
//and at last we get the no equal to n and if we dont we return the last mid we operated on;
