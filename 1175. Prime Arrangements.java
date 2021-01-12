class Solution {
    public int numPrimeArrangements(int n) 
    {
        int c=0,MOD=1000000007;
        for(int i=1;i<=n;i++)
            if(isprime(i))
                c++;
        System.out.print(c);
        long ans=1;
        for(int i=n-c;i>=2;i--)
            ans=(ans*i)% MOD;
        for(int i=c;i>=2;i--)
            ans=(ans*i)% MOD;
        return (int)ans%MOD;
    }
    
    Boolean isprime(int n)
    {
        if(n==1)
            return false;
        else if(n==2||n==3)
            return true;
        else if(n%2==0 || n%3==0)
            return false;
        else
        {
            for(int i=5;i*i<=n;i=i+6)
                if(n%i==0 || n%(i+2)==0)
                    return false;
            return true;
        }
    }
}

