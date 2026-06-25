class Solution {
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        // Check all adjacent pairs
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // Check the circular pair (last and first)
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}