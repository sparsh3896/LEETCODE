class Solution {
    public int countNegatives(int[][] grid) 
    {
        int c=0;
     for(int i=0; i<grid.length;i++)
     {
         int mid,high=grid[0].length-1,low=0;
         
         while(high>=low)
         {
            mid=(high+low)/2;
             if(grid[i][mid]>=0)
             {
                 low=mid+1;
             }
             else
             {
               if(mid==0 || grid[i][mid-1]>=0)
               {
                   c+=grid[0].length-mid;
                   
                   break;
               }   
                else
                    high=mid-1;
                     
             }
         }
     }
        return c;
    }
}


// we are using iterative binary search here;
