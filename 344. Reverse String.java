class Solution {
    public void reverseString(char[] s) 
    {
        int start=0,end=s.length-1;
        char c;
        
      while(start<end)
      {
       c=s[start];
          s[start]=s[end];
          s[end]=c;
          start++;
          end--;
          
      }
      
        
    }
}

// Hwere we are using 2 pointer technique to reverse the string 
//Time complexity is O(n).
