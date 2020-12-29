class Solution {
    public boolean canThreePartsEqualSum(int[] arr) 
    {
    int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int avg= sum/3,c=0;
        sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
            if(sum==avg)
            {
                sum=0;
                c++;
            }
            
            if((c==2)&&(i!=arr.length-1))
                return true;
        }
        return false;
    }
}

//here we calculate the sum and get the avg sum of the array;
//now we iterate through the array annd keep adding the nos in the sum till it becomes equal to average
//when sum equals average we increase the counter by 1
//we check if counter has reached 2 and i hasnt reached the last no in array 
//we return true;
//and for all other cases we return false.
