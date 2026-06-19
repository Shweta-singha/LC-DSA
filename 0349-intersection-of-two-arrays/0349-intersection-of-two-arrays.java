import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();

        // Store nums1 elements in HashSet
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        HashSet<Integer> result = new HashSet<>();

        // Check nums2 elements
        for (int i = 0; i < nums2.length; i++) {

            if (set1.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] ans = new int[result.size()];

        int index = 0;

        for (Integer num : result) {
            ans[index] = num;
            index++;
        }

        return ans;
    }
}