class Solution {
    public int minimumDifference(int[] nums, int k) 
    {
        if (k == 1) return 0;
        
        // Sorts in increasing order: e.g., [1, 4, 7, 9]
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Loop up to nums.length - k
        for (int i = 0; i <= nums.length - k; i++) {
            // Since it's increasing, highest is at the end, lowest is at the start
            int highest = nums[i + k - 1];
            int lowest = nums[i];
            
            int currentDiff = highest - lowest;
            
            // Keep the smaller difference
            minDiff = Math.min(minDiff, currentDiff);
        }
        
        return minDiff;
    }
}
        