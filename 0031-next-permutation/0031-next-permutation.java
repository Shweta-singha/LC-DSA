class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Step 1: Scan right to left to find the first "drop"
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If we found a drop (i didn't fall off the left edge)
        if (i >= 0) {
            int j = nums.length - 1;
            // Find the first number from the right that is strictly greater than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap them to make the prefix just slightly larger
            swap(nums, i, j);
        }
        
        // Step 3: Reverse the remaining right side to make it as small as possible
        // If i == -1 (no drop found), this reverses the whole array!
        reverse(nums, i + 1);
    }
    
    // Helper method to swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper method to reverse a section of the array using two pointers
    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}