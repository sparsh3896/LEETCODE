class Solution {
    public int maxProfit(int[] prices) 
    {
       
        int maxCur = 0, maxSoFar = 0;
        
        for(int i = 1; i < prices.length; i++) 
        {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    
    }
}

//We are using kadens algorithm here
//maxcur is teh current max and maxsofar is the maximum value till now.
