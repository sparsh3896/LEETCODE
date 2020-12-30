class Solution {
    public int[] diStringMatch(String S) 
    {
      int c=0,d=S.length();
        char [] ch= S.toCharArray();
        int [] arr= new int[d+1];
        
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='D')
                arr[i]=d--;
            else if(ch[i]=='I')
                arr[i]=c++;
        }
        if(ch[ch.length-1]=='D')
                arr[ch.length]=c;
        else
            arr[ch.length]=d;
        return arr;
    }
}

//The idea is simple we take 2 counters one from 0 and second from length of string one in increasing fashion and second in decreasing fashion.
//Wherever we see 'D' we put the value of decreasing counter
Whenever we see 'I' we put the conter value of increasing one
//At last we check id last is 'D or I' and put the value accordingly in last place left in an array
