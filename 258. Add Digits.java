public class Solution {
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}

//Since we are dealing with decimal no.
// the maximum single didgit sum cant be greater than 9;
//so by the use of modulo arithmatic we got the no just by doing mod by 9
//Two conditions are handled explicitly 
//1st one is if num is equal to zero then we return 0 itslef
//2nd when no mod 9 is equal to zero here we return 9;
//rest all the cases we return number mod 9;
