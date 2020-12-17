class Solution {
    public int minPartitions(String n) 
    {
      char [] ch= n.toCharArray();
       int max=0; 
        for(char i: ch)
            max= Math.max(max, i-48);
            return max;
    }
}

\\the max digit we see in the string is the highest deci binary no. of that input
