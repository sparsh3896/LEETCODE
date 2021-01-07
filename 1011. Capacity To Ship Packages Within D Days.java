class Solution {
    public int shipWithinDays(int[] weights, int D) 
    {
        int tw=0,max=0;
        int n=weights.length;
       for(int i=0;i<n;i++)
       {
           tw+=weights[i];
           if(weights[i]>max)
           {
               max=weights[i];
           }
       }
       
      int  low= max,high=tw;
        
       while(high>=low)
       {
          int mid = (low+high)/2;
           int curr=0,days=1;
           
           for(int i: weights)
           {
               if(curr+i>mid)
               {
                   days+=1;
                   curr= i;
               }
               else
                   curr+= i;
           }
           if(days>D)
               low=mid+1;
               else
                   high=mid-1;
       }
        return low;
        
    }
 }


//This is one of the classic problem of binsry search where we can directly use binary search
//In this approach we put high pointer as total weight of the array ie total sum of the array
//we put low as the maximum of the array;
//now we calculate mid i.e wt we asuume we should take to deliver in D days
//now we enter our predicate function and check if we can deliver that muchof wt in d days
//if no tthen we shift our search towards right
//if yes we should find the minimum weights so we search towards left if there is still any les wt which we can use. 
