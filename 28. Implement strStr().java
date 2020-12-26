class Solution {
    public int strStr(String haystack, String needle) 
    {
        char [] ch1= haystack.toCharArray();
        char [] ch2= needle.toCharArray();
        int s1=0,s2=0;
        
        if(needle.length()==0)
            return 0;
        
        while(s1<=ch1.length-ch2.length)
        {
            int c=0;
            int fakes1=s1;
            
            if(ch1[s1]==ch2[s2])
            {
                while(s2<ch2.length)
                {
                    if(ch1[s1]==ch2[s2])
                        c++;
                    else
                        break;
                    s1++;
                    s2++;
                }
                
                if(c==ch2.length)
                    return s1-c;
                else
                {
                    s2=0;
                    s1=fakes1+1;
                }
                    
            }
            else
                s1++;
        }
        return -1;
    }
}


//we have used 2 pointer here pointer 1 points at haystack and pointer 2 points at needle
//Time complexity O(n*m)
