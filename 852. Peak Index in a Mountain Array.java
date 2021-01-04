class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int mid,high=arr.length-1,low=0;
        
            while(high>=low)
              {
                mid=(high+low)/2;
                 
                if(mid==0)
                    low=low+1;
                
                else if(mid==arr.length-1)
                    mid=high-1;
                
                else if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
                    return mid;
                
                else if(arr[mid-1]>arr[mid])
                    high=mid-1;
                
                else
                    low=mid+1;
              }
        return -1;
    }
}

//Binary search technique is used
