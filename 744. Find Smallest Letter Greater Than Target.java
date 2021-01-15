class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
       int low=0,high=letters.length-1,ans=0;
        
        while(high>=low)
        {
            int mid= low+(high-low)/2;
            
            if(letters[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return letters[ans];
    }
}

// We do a simple binary search and every time we get the character greater than target we store that in ans
//and then we shift our search towards left if we get another character which is greater than target we update ans
//at the end of binary search we will be having the ssmallest character greater than target
