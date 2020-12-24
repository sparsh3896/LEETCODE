class temp{
    int freq;
    int initial;
    int last;
}
class Solution {
    public int findShortestSubArray(int[] nums)
    {
        HashMap <Integer, temp> ans = new HashMap<>(); //its like { element: [frequency, index1, index2.......]}
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            if(!ans.containsKey(nums[i]))
            {   
                temp ob=new temp();
                ob.freq=1;
                ob.initial=i;
                ob.last=i;
                ans.put(nums[i],ob);
            }
            else
            {
                temp ob1=ans.get(nums[i]);
                ob1.freq++;;
                ob1.last=i;
                //ans.put(nums[i],ob1);
                if(max<ob1.freq)
                    max=ob1.freq;
            }
        }
        
        int min=Integer.MAX_VALUE;
        
        for(Map.Entry<Integer ,temp> i:ans.entrySet())
        {
            //i.getValue();
            if(i.getValue().freq==max)
            {   
                int len=i.getValue().last-i.getValue().initial+1;
                if(min>len)
                    min=len;
                if(min==max)
                    return min;
            }
        }
        return min;
    }
}
