class Solution {
    public int trailingZeroes(int n) 
    {
        int c=0;
      for(int i=5;i<=n;i=i*5)
      {
          c=c+(n/i);
      }
        return c;
    }
}

// we want to find trailing zeroes therefore we know that a no gives trailing zero if its is multiplied by 10
//eg; 24*10 =240 one trailing zero
//240*10=2400 two trailing zero
//therefore no of tens is equal to no of trailing zeroes
//and we get 10 by 5*2;
//so basically we just have to find the no. of pairs of 2 and 5
//to be precise we just have to find out no of 5s because no of 2 is always less than no of 5 therefore no of 5s will determine the no of 5 and 2 pairs;
//but 25 has 2 fives and 125 has 3 fives and 625 has 4 fives therefore we also keep adding these fives to get total no of 5 in a no
