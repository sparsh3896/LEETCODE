public class Solution extends VersionControl {
    public int firstBadVersion(int n) 
    {
        int high=n,low=1,mid=0;
        
        while(high>=low)
        {
         mid=low+(high-low)/2;
            
            if(isBadVersion(mid)==false)
            {
                low=mid+1;
            }
            else if(isBadVersion(mid)==true)
            {
                if(mid==1|| (isBadVersion(mid)==true && isBadVersion(mid-1)==false))
                    return mid;
                else
                    high=mid-1;
            }
        }
        return mid;
    }
}

// Here we are using binary search techinque
//we call the predefined function is bad version if it returns true we make our saerch towarsd left of the array because we want to get the fisrt bad version
//if we get false we move our search to the right half of the array
