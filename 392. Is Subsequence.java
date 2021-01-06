class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        char [] ch1= s.toCharArray();
        char [] ch2= t.toCharArray();
        int check=0,c=0;
        
        for(int i=0;i<ch1.length;i++)
        {
            for(int j=check;j<ch2.length;j++)
            {
                if(ch1[i]==ch2[j])
                {
                  
                    c++;
                    check=j+1;
                    
                        break;
                   
                }
            }
        }
        return (c==ch1.length);
    }
}
