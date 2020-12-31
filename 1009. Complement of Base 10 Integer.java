class Solution {
    public int bitwiseComplement(int N) 
    {
        ArrayList<Integer> list= new ArrayList<>();
        if(N==0)
            return 1;
        while(N!=0)
        {
            if((N&1)==0)
            list.add(1);
            else
                list.add(0);
            N=(N>>1);
        }
        int sum=0,c=0;
        for(int i:list)
        {
            sum+=i*(int)Math.pow(2,c++);
        }
        return sum;
    }
}

//here we create an array list where we store all the invertions of the binary of the given no;
//now traversing through the loop we change that no to decimal agagin
//and we get the inverted binary of the no.
