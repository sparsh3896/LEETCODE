class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
      Set<Integer> set= new HashSet<>();
       Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++)
        {
           int k=nums1[i],high=nums2.length-1,low=0;
            
            while(high>=low)
            {
                int mid=(low+high)/2;
                
                if(nums2[mid]==k)
                {
                    set.add(k);
                    break;
                }   
                else if(nums2[mid]<k)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        int [] arr= new int[set.size()];
        int c=0;
        for(int i: set)
            arr[c++]=i;
        return arr;
    }
}

//THis is approach 1 hwere we will be using binary search techinue to check for intersection
//since elements can be repeated we will save our element in a hash set

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
      HashSet<Integer> map= new HashSet<>();
      HashSet<Integer> arr= new HashSet<>();
        
        for(int i=0;i<nums1.length;i++)
            map.add(nums1[i]);
        
        for(int i=0;i<nums2.length;i++)
        {
            if(map.contains(nums2[i]))
                arr.add(nums2[i]);
        }
        
        int n= arr.size();
        int [] ans= new int[n];
        int c=0;
        
        for(int i: arr)
        {
            ans[c]=i;
            c++;
        }
        
        return ans;
        
        }
    }
    
    // This is approach 2 where we use 2 hash set to compute the intersection of the given arrays.
