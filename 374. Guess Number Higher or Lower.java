/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) 
    {
       int high=n,low=0,mid;
        
        while(high>=low)
        {
          mid= low+(high-low)/2;
            int a= guess(mid);
            
            if(a==1)
                low=mid+1;
            else if(a==-1)
                high=mid-1;
            else
                return mid;
                
        }
        return -1;
    }
}

//we WILL SIMPLY USE BINARY SEARCH WHERE LOW ILL BE 0 AND HIGH WILL BE N
// THEN WE CHECK MID AND PASS THIS RETURN IN THE PREDEFINED FUNCTIOON GUESS 
//IF GUESS IS -1 CHANGE HIGH TO MID+1 AND IF GUESS IS 1 CHANGE LOW TO MID+1;
//IF GUESS IS ZERO JUST RETURN THE MID THEREFORE NO. IS FOUND
