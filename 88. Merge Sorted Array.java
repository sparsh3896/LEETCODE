class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
       for(int i=m,c=0;i<m+n;i++,c++)
           nums1[i]=nums2[c];
        Arrays.sort(nums1);
    }
}
