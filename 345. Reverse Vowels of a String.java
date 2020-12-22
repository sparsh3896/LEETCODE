class Solution {
    public String reverseVowels(String s) 
    {
       char [] ch= s.toCharArray();
        
        int start=0,e=ch.length-1;
        String c="aeiouAEIOU";
        
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
                char cr=ch[start];
                ch[start]=ch[e];
                ch[e]=cr;
                start++;
                e--;
            }             
        }
        
        
        return new String(ch);
        
    }
}

//Two pointer approach is used here
//Time complexity is O(n)
