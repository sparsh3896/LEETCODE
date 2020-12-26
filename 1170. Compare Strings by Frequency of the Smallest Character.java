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
// naive approach
//in this approach we picked the frequencies of all smallest character in a word and placed at a position of word or queries
//therefore we get 2 array which contains all the frequencies of the smallest letter for words and queries
//now check the given condition if it satisfies increase the counte and at last put that counter in answer array
//return the answer array

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) 
    {
        
        int [] q= new int[queries.length];
        int [] w= new int[11];
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
        w[c-1]++;
    }
       
        
        int c=0;
        for(int i=0;i<q.length;i++)
        { 
            c=0;
           for(int j=q[i];j<w.length;j++)
               c+=w[j];
            ans[i]=c;
        }
        
        return ans;
    }
}

//approach 2
//We got the observation that length of a words in the array cannot be more than 10
//Therefore for the Array of words we created a Array of length 10
//we computed the frequency of smallest letter in each word and then we increamented a value at index of the array whose length is 10
//so finally we got how many f(s) we have at length 1 to length 10
//now we will take the freq of the words in queries array and will will run the loop from that point +1 till 10 and add all the words that have length greater than that of freq of queries word
