class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) 
    {
        
        int [] q= new int[queries.length];
        int [] w= new int[words.length];
        int [] ans= new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++)
        {
            int c=0;
            String s= queries[i];
            char[] ch= s.toCharArray();
            int min= Integer.MAX_VALUE;
        
            for(int j=0;j<ch.length;j++)
            {
            
                if(min>ch[j])
                {
                    min=ch[j];
                    c=1;
                }
                else if(min==ch[j])
                    c++;
             
            }
            q[i]=c;
        }
        
        
        for(int i=0;i<words.length;i++)
        {
            int c=0;
            String s= words[i];
            char[] ch= s.toCharArray();
            int min= Integer.MAX_VALUE;
             
            for(int j=0;j<ch.length;j++)
            {
            
                if(min>ch[j])
                {
                    min=ch[j];
                    c=1;
                }
                else if(min==ch[j])
                    c++;
               
            }
             w[i]=c;
        }
       
        int c=0;
        
        for(int i=0;i<q.length;i++)
        {
            for(int j=0;j<w.length;j++)
            {
             if(q[i]<w[j])
                 c++;
            }
            ans[i]=c;
            c=0;
        }
        
        return ans;
    }
}

//in this approach we picked the frequencies of all smallest character in a word and placed at a position of word or queries
//therefore we get 2 array which contains all the frequencies of the smallest letter for words and queries
//now check the given condition if it satisfies increase the counte and at last put that counter in answer array
//return the answer array
