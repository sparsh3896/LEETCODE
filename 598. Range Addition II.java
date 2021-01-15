class Solution {
    public int maxCount(int m, int n, int[][] ops) 
    {
        int min=Integer.MAX_VALUE,min1=Integer.MAX_VALUE;
        if (ops.length==0)
            return m*n;
        
        for(int i=0;i<ops.length;i++)
        {
          
            min= Math.min(min,ops[i][0]);
            min1=Math.min(min1,ops[i][1]);
                                 
        }
        return min*min1;
    }
}

//we just have to find out what is the smallest row and smallest column that has been mentioned in the ops array
//this is because that smallest part of the main arrray have incremented every time therefore the max value holds is the smallest row *coln elements
