class Solution {
    public boolean isPowerOfTwo(int n) 
    { int c=0;
     if(n<=0)
         return false;
        
     n=  (n&(n-1));
        return n==0;
    
    }
}

//we know if a no is  a power of two then there will be exactly one digit equal to 1 in binary form other all will be zero and that one will be the last digit
//we also know a no 1 less than a power of no which is power of 2 contains all 1s in the binary form
//therefore if we and, n and n-1 and we get 0 therefore it is power of 2;
