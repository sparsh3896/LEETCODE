class Solution {
    public boolean isUgly(int n) 
    {
       if(n<1)
           return false;
        else if(n==1)
            return true;
        while(n%2==0)
            n=n>>1;
        while(n%3==0)
            n=n/3;
       while(n%5==0)
           n=n/5;
        if(n>1)
            return false;
        else
            return true;
    }
}

// we just check that after removing all factors opf 2,3 and 5 if there still exists a no. greater than one then its not ugly no elsewise its an ugly no.
