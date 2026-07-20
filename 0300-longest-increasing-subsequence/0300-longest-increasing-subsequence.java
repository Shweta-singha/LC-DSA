class Solution {
    public int lengthOfLIS(int[] nums) {

        List<Integer> tails = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            int left = 0;
            int right = tails.size();

            // Binary Search: Find first element >= num
            while (left < right) {

                int mid = left + (right - left) / 2;

                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            // If num is greater than all elements, append it
            if (left == tails.size()) {
                tails.add(num);
            }
            // Otherwise replace the existing tail
            else {
                tails.set(left, num);
            }
        }

        return tails.size();
    }
}