class Solution {
    public int romanToInt(String s) 
    {
       HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        char [] ch= s.toCharArray();
        int sum=0,add=0;
        
        for(int i=0;i<ch.length;i++)
        {
            if(i!=ch.length-1)
            {
                if(map.get(ch[i])<map.get(ch[i+1]))
                {
                    add=map.get(ch[i+1])-map.get(ch[i]);
                    i++;
                }
                
                else
                add=map.get(ch[i]);
            }
            else
               add=map.get(ch[i]); 
            
            sum+=add;
                                      
        }
        return sum;
        
    }
}

//THE approach is very simple we created a hash map and put the value of every key character to its decimal no.
//Now we just iterate through the string given
//we keep on checking if the next elemnt have a greater value than the current element then we subtract the value of next element to this elemnt and add that value to result
//if the next element dont have a highesr value then we just have to add the value of the character to our result;
//
