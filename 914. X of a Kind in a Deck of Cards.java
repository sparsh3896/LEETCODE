class Solution {
    public int gcd(int a,int b)
    {
        return(b>0?gcd(b,a%b):a);
    }
    public boolean hasGroupsSizeX(int[] deck) 
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        int min=0;
        
       for(int i:deck)
           map.put(i,map.getOrDefault(i,0)+1);
        
        for(int i:deck)
        {
            min= gcd(map.get(i),min);
        }
        return min>1;   
    }
}

//here we use gcd to compute the answer
//we create a hash map and assign the values and their occurence in the map
//and we run a loop where we get the ocuurence of a no and then we compute the gcd btw the occurence and the variable min whose intitial value is zero
//this gcd is stored in the variable min
//after computing all the gcd with occurences and min we finally reach toh the greatest common divisor which can divide all the occurences 
//therefore it is the ans
