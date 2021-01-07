class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            sum += pile;
            max = Math.max(max, pile);
        }
        int start = Math.max(1, sum / H);
        int end = max;
        // find the first speed that can finish
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (canFinish(mid, piles, H)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    private boolean canFinish(int k, int[] piles, int H) {
        for (int pile : piles) 
        {
            if (pile <= k) 
            {
                H--;
            } 
            else 
            {
                H -=(int)Math.ceil(pile*1.0 / k*1.0) ;
            }
            if (H < 0) break;
        }
        return H >= 0;
    }
}
