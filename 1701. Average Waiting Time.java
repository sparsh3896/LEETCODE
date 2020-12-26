class Solution {
    public double averageWaitingTime(int[][] customers) 
    {
      double prep= customers[0][0]+customers[0][1];double sum=customers[0][1], diff=0;
        double ans=0;
          
        for(int i=1;i<customers.length;i++)
          {
            
                  if(prep>customers[i][0])
                  {
                      diff= prep-customers[i][0];
                      prep=prep+customers[i][1];
                      sum+=diff+customers[i][1];
                  }
                  
                  if(prep<=customers[i][0])
                  {
                 diff= prep-customers[i][0];
                      prep=customers[i][0]+customers[i][1];
                      sum+=customers[i][1];
                  }
              
              
          }
           ans=sum/customers.length;
        return ans;
    }
}
