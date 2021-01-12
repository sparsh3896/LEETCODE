class Solution {
     public int dayOfYear(String S) 
     {
       String[] s= S.split("-");
         int year= Integer.parseInt(s[0]);
         int month= Integer.parseInt(s[1]);
         int date= Integer.parseInt(s[2]);
         boolean isLeap= checkYear(year);
         
         int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
         
         int i=0,ans=0;
         while(i!=month-1)
         {
             if(isLeap && i==1)
             {
                 ans+= days[1]+1;
                 i++;
                 continue;
             }
             ans+=days[i];
             i++;
         }
         return ans+date;
    }
    boolean checkYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}

//we make an arrar of days 
//we check if the year is leap or not if the year is leap then we add 1 to the 2nd month
//we keep adding days from the array and then when we reach the given month we stop and add date to the ans and return it
