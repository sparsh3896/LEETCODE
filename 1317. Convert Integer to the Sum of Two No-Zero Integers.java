class Solution {
    public int[] getNoZeroIntegers(int n) 
    {
        int arr[]= new int[2];
        for(int i=1;i<n;i++)
        {
            if(havenozero(i)&& havenozero(n-1))
            {
                arr[0]=i;
                arr[1]=n-1;
                return arr;
            }
            n--;
        }
        return arr;
    }


private boolean havenozero(int n)
{
    while(n!=0)
    {
        int c=n%10;
        if(c==0)
            return false;
        n=n/10;
    }
    return true;
}
}

//We madde a function to check if the no. contains any zero;
//Now we runn a loop from 1 to given no;
//Now with the help of the function we check if i and n-1 both have non zeroes element 
//if condition satifies we return the value;
