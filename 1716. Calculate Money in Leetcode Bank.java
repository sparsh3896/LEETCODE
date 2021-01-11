class Solution {
    public int totalMoney(int n) 
    {
       int num=n/7 , m=n%7,sum=0;
        
        
        for(int i=0;i<num;i++)
        {
            sum+=28+i*7;
        }
        for(int i=num+1;i<num+m+1;i++)
            sum+=i;
        
        return sum;
    }
}
