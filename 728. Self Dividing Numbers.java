class Solution {
    public List<Integer> selfDividingNumbers(int left, int right)
    {
        List<Integer> list= new ArrayList<Integer>();
      for(int i=left;i<=right;i++)
      {
          int n=i;
          int flag=1;
          while(n!=0)
          {
              int f= n%10;
              
              if(f==0)
              {
                  flag=0;
                  break;
              }
              if((i%f)!=0)
              {
                  flag=0;
                  break;
              }
              n=n/10;
          }
          if(flag==1)
              list.add(i);
      }
        return list;
    }
}

//We are just iterating through all the numbers and checking if its self dividing or not if yes add to list.
//after the loop terminates return list;
