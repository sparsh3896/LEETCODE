// We will do this question using 2 different approach 
// Approach 1 = we will use 2 pointer approach. Time complexity O(n log n)
// Approach 2= we will use Hashing Time complexity O(n)


//Approach 1

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
        ArrayList<Integer> arr= new ArrayList<>();
        int start1=0,start2=0;
        
        while(start1<nums1.length && start2<nums2.length)
        {
            if(nums1[start1]==nums2[start2])
            {
                arr.add(nums1[start1]);
                start1++;
                start2++;
            }
            
            else if(nums1[start1]>nums2[start2])
                start2++;
            
            else
                start1++;
        }
        
        int [] ans= new int[arr.size()];
        
        for(int i=0;i<arr.size();i++)
            ans[i]=arr.get(i);
       
        return ans;
    }
}


//Approach 2

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map1= new HashMap<>();
        HashMap<Integer, Integer> map2= new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();
        
        
        for(int i: nums1)
        {
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        
        for(int i: nums2)
        {
            map2.put(i, map2.getOrDefault(i, 0)+1);
        }
        
        for(int i: map1.keySet())
        {
            int min=0;
            if(map2.containsKey(i))
            {
               min= Math.min(map1.get(i), map2.get(i));
                
                for(int j=0;j<min;j++)
                    arr.add(i);
            }
        }
        
        int [] ans= new int[arr.size()];
           
        for(int i=0;i<ans.length;i++)
            ans[i]=arr.get(i);
        
        return ans;
        
    }
}
