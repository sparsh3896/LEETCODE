class Solution {
    public int findMinFibonacciNumbers(int k) 
    {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        int f1=1,f2=1,f=0;
        
        while(true)
        {
            f= f1+f2;
            f1=f2;
            f2=f;
            if(f<=k)
                list.add(f);
            else
                break;
        }
        int sum=0,c=0;
        
        for(int i=list.size()-1;i>=0;i--)
        {
            if(sum+list.get(i)<=k)
            {
                sum+=list.get(i);
                c++;
            }
            if(sum==k)
                break;
        }
        return c;
        
    }
}

//The idea is to get all the fiboonacci no. till k or less than k in alist
//then we iterate through the list and pick the biggest no. that is less than or equal to k;
// we keep adding those no to the sum where total sum is less than or equal to k and every time we add a no we increase our counter by 1;
// if the total sum goes over k we will pass that no.
//at one time we will get sum equal to k then we return our counter and that will be the ans;
