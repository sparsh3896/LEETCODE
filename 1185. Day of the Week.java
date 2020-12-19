class Solution {
    public String dayOfTheWeek(int day, int month, int year)
    {
       String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (month < 3) 
        {
            month += 12;
            year -= 1;
        }
        
        int c = year / 100;
        
        year = year % 100;
        
int w = (c / 4 - 2 * c + year + year / 4 + 13 * (month + 1) / 5 + day - 1) % 7;
        return days[(w + 7) % 7];
    
    
    
    }
}

//Here we are using zeller,s formula to determine the week day.
//In zellers formula march is the first month and february is the last month of the year.
