class Solution {
    public void duplicateZeros(int[] arr) 
    {
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==0)
          {
              for(int j=arr.length-1;j>i;j--)
              {
                  if(j==i+1)
                  {
                      arr[j]=0;
                      break;
                  }   
                  else
                  {
                      arr[j]=arr[j-1];
                      
                  }
              }
              i=i+1;
        
          }
      }
    }
}

// This is approach 1 which bis workin in O(n*n) time complexity here we are iterating forward with i and as sooon as we get 0 we start iterating backward with j in 2nd loop till i 
// while iterating backward we keep on changing values of the array accordingly.


class Solution {
    public void duplicateZeros(int[] arr) 
    {
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==0)
          {
              for(int j=arr.length-1;j>i;j--)
              {
                  if(j==i+1)
                  {
                      arr[j]=0;
                      break;
                  }   
                  else
                  {
                      arr[j]=arr[j-1];
                      
                  }
              }
              i=i+1;
        
          }
      }
    }
}


//This is approach 2 time complexity is O(n) 
//we are using 2 pointer approach here
//We initially count no of zeroes in the array
//we take first pointer at length of the array and 2nd pointer at length of array + no.of zeroes-1 
//then we iterate in backward direction changing the values of the Array
