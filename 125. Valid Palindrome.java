class Solution {
    public boolean isPalindrome(String s) 
    {
        s= s.toLowerCase();
        char [] ch= s.toCharArray();
        
        int start=0,e=ch.length-1;
        String c="abcdefghijklmnopqrstuvwxyz1234567890";
        
        while(start<e)
        {
            if(!c.contains(ch[start]+"") && !c.contains(ch[e]+""))
            {
                start++;
                e--;
            }
            
            else if(!c.contains(ch[start]+"") && c.contains(ch[e]+""))
                    start++;
            
            else if((c.contains(ch[start]+"") && !c.contains(ch[e]+"")))
                e--;
            
            else
            {
                if(ch[start]!=ch[e])
                    return false;
                start++;
                e--;
            }             
        }
        
        
       return true; 
    }
}

//we have used 2 pointer technique here 
//pointer 1 starts from the beginning if the string
//pointer 2 starts from the last position
//Time complexity is O(n);
