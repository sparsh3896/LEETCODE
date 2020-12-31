class Solution {
    public String intToRoman(int num) 
    {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        
        int [] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String s="";
        while(num!=0)
        {
            int diff=Integer.MAX_VALUE,no=0;
            for(int i=0;i<arr.length;i++)
            {
                int sub=num-arr[i];
                if((sub<diff) && (sub>=0))
                {
                    diff=sub;
                    no=arr[i];
                }
            
            }
            
            s+=map.get(no);
            num=num-no;
        }
        return s;
       
    }
}

//The approach is simple we keep on subtracting the nearest value from the no that we have in our array 
//and for that no we keep appending the string we get from hashmap
