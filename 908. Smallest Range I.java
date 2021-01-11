class Solution {
    public int smallestRangeI(int[] A, int K) 
    {
       int min= Integer.MAX_VALUE;
       int max= Integer.MIN_VALUE;
       for(int i=0;i<A.length;i++)
       {
           if(A[i]<min)
           min= A[i];
           if(A[i]>max)
           max= A[i];
       }
        
        
        return Math.max(0, max - min - 2 * K);
        
        
        
    }
}

// The idea is pretty simple we calculate max and min of the array
// Then we check if k+min is gretaer than or equal to a-max if yes the the diff acn be made zero therefore we return 0
//else we add k to min and subtract k from max therfore making the diff btw max and min less by 2*k; 
//we return diff- 2*k
