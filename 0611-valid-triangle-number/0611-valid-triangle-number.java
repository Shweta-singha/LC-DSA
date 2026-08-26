import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        // Step 1: Sort the array (Crucial for the two-pointer logic!)
        Arrays.sort(nums);
        
        int count = 0;
        int n = nums.length;
        
        // Step 2: Fix the longest side starting from the end down to index 2
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            
            // Step 3: Two-pointer search for the smaller sides
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    // All elements from left to right-1 are valid
                    count += (right - left);
                    right--; // Move right pointer to check smaller pairs
                } else {
                    // Sum is too small, move left pointer to increase it
                    left++; 
                }
            }
        }
        
        return count;
    }
}