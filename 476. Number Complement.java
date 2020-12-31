class Solution {
    public int findComplement(int n) 
    {
        ArrayList<Integer> arr= new ArrayList<>();
        int ans=0,f=0,x=1,z=0;
       while(n!=0)
       {
           
           arr.add(n%2);
               n=n/2;
       }
        System.out.println(arr);
        ArrayList<Integer> arr1= new ArrayList<>();
        
        for(int i=0;i<arr.size();i++)
        {
         if(arr.get(i)==0)
             arr1.add(1);
             else
                 arr1.add(0);
            
        }
        for(int i: arr1)
        {
            ans+=i*x;
            x=x*2;
        }
        System.out.println(arr1);
        return ans;
    }
}

// we store every digit of a inverted binary in an arraylist
//now wwe traverse the list and change every bit to binary
//finally getting the inverted of the binary into decimal
